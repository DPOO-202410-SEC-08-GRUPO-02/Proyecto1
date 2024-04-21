package Galeria;

public class Cajero extends Empleado{
	
	public Cajero(String Login, String Contraseña,String ID,String Nombre,String Correo,int Numero, boolean AccesoGaleria) {
		super(Login,Contraseña,ID,Nombre,Correo, Numero,AccesoGaleria);
		this.login=Login;
		this.contraseña=Contraseña;
		this.iD=ID;
		this.nombre=Nombre;
		this.correo=Correo;
		this.numero=Numero;
		this.accesoGaleria=AccesoGaleria;
	}
	
	public void realizarPago(double valorCompra, Comprador comprador, String metodoPago) {
		/* Descuenta el dinero de el dinero actual del comprador pero esto va de metodo de pago en metodo de pago*/
	}
	
	public boolean verificarSaldo(double valorCompra, Comprador comprador) {
		/*Verifica si el saldo del comprador es suficiente para comprar la obra*/
		return false;
	}
	
	public boolean verificarLimite(double valorCompra, Comprador comprador) {
		/*Verifica si el limite del comprador es suficiente para comprar la obra*/
		return false;
	}
}
