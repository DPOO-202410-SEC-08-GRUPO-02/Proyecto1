package Galeria;

public class Usuario {
			protected String Login;
			protected String Contraseña;
			protected String ID;
			protected String Nombre;
			protected String Correo;
			protected int Numero;
			
	public Usuario(String Login, String Contraseña,String ID,String Nombre,String Correo,int Numero) {
				this.Login=Login;
				this.Contraseña=Contraseña;
				this.ID=ID;
				this.Nombre=Nombre;
				this.Correo=Correo;
				this.Numero=Numero;
			}
}
