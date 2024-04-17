package Galeria;

public class Cajero extends Empleado{
	
	public Cajero(String Login, String Contraseña,String ID,String Nombre,String Correo,int Numero, Boolean AccesoGaleria) {
		super(Login,Contraseña,ID,Nombre,Correo, Numero,AccesoGaleria);
		this.Login=Login;
		this.Contraseña=Contraseña;
		this.ID=ID;
		this.Nombre=Nombre;
		this.Correo=Correo;
		this.Numero=Numero;
		this.AccesoGaleria=AccesoGaleria;
	}
	
	public void RealizarPago() {
		/* Descuenta el dinero de el dinero actual del comprador pero esto va de metodo de pago en metodo de pago*/
	}
	
	public void VerificarSaldo() {
		/*Verifica si el saldo del comprador es suficiente para comprar la obra*/
	}
	
	public void VerificarLimite() {
		/*Verifica si el limite del comprador es suficiente para comprar la obra*/
	}
}
