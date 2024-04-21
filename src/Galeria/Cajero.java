package Galeria;

import java.util.HashMap;
import java.util.Map;

public class Cajero extends Empleado{
	
	public Cajero(String Login, String Contraseña,String ID,String Nombre,String Correo,int Numero, Boolean AccesoGaleria) {
		super(Login,Contraseña,ID,Nombre,Correo, Numero,AccesoGaleria);
		this.login=Login;
		this.contraseña=Contraseña;
		this.iD=ID;
		this.nombre=Nombre;
		this.correo=Correo;
		this.numero=Numero;
		this.accesoGaleria=AccesoGaleria;
	}
	
	public static void realizarPago(double valorCompra, Comprador comprador, HashMap<String, Double> metodoPago,double dineroActual,Pieza pieza) {
		/* Descuenta el dinero de el dinero actual del comprador pero esto va de metodo de pago en metodo de pago*/
		
		boolean Limite = verificarLimite(valorCompra, comprador);
		
		if (Limite != true){
		
			Compra.compraRechazada(comprador, pieza);
		}
		
		boolean Saldo =verificarSaldo(valorCompra, comprador, metodoPago,dineroActual );
		
		if (Saldo != true){
			Compra.compraRechazada(comprador, pieza);
		}
		
		double tarjetaCredito=metodoPago.get("Tarjeta de Credito");
		double transferenciaElectronica= metodoPago.get("Transferencia Electronica");
		double Efectivo= metodoPago.get("Efectivo");
		
		if (tarjetaCredito - valorCompra >= 0) {
			tarjetaCredito= tarjetaCredito - valorCompra;
			dineroActual= dineroActual- valorCompra;
			valorCompra=0;
		}else {
			dineroActual= dineroActual- tarjetaCredito;
			valorCompra= valorCompra - tarjetaCredito;
			tarjetaCredito= 0;
			
			if (transferenciaElectronica - valorCompra >= 0) {
				transferenciaElectronica= transferenciaElectronica - valorCompra;
				dineroActual= dineroActual- valorCompra;
				valorCompra=0;
			}else {
				dineroActual= dineroActual- transferenciaElectronica;
				valorCompra= valorCompra - transferenciaElectronica;
				transferenciaElectronica= 0;
				
				if (Efectivo - valorCompra >= 0) {
					Efectivo= Efectivo - valorCompra;
					dineroActual= dineroActual- valorCompra;
					valorCompra=0;
				}else {
					dineroActual= dineroActual- Efectivo;
					valorCompra= valorCompra - Efectivo;
					Efectivo= 0;
				}
			}
		}
		
		comprador.editarDineroActual(dineroActual, tarjetaCredito, transferenciaElectronica, Efectivo, metodoPago);
		
		
	}
	
	public static boolean verificarSaldo(double valorCompra, Comprador comprador, HashMap<String, Double> metodoPago, double dineroActual) {
		/*Verifica si el saldo del comprador es suficiente para comprar la obra*/
		
		double Total=  metodoPago.get("Tarjeta de Credito")+ metodoPago.get("Transferencia Electronica") + metodoPago.get("Efectivo");
		
		if (dineroActual != Total) {
			
			return true;
		}
		
		return false;
	}
	
	public static boolean verificarLimite(double valorCompra, Comprador comprador) {
		/*Verifica si el limite del comprador es suficiente para comprar la obra*/
		double limiteCompras = comprador.getLimiteCompras();
		
		if (valorCompra <= limiteCompras)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
