package Galeria;

public class Cliente extends Usuario {
	protected Boolean Verificado;
	
	public Cliente(String Login, String Contraseña,String ID,String Nombre,String Correo,int Numero, Boolean Verificado) {
		super(Login,Contraseña,ID,Nombre,Correo, Numero);
		this.Login=Login;
		this.Contraseña=Contraseña;
		this.ID=ID;
		this.Nombre=Nombre;
		this.Correo=Correo;
		this.Numero=Numero;
		this.Verificado=Verificado;
	}

}
