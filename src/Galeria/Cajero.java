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

}
