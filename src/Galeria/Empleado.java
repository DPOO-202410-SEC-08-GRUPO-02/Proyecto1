package Galeria;

public class Empleado extends Usuario{
	protected Boolean AccesoGaleria;
	
	public Empleado(String Login, String Contraseña,String ID,String Nombre,String Correo,int Numero, Boolean AccesoGaleria) {
		super(Login,Contraseña,ID,Nombre,Correo, Numero);
		this.Login=Login;
		this.Contraseña=Contraseña;
		this.ID=ID;
		this.Nombre=Nombre;
		this.Correo=Correo;
		this.Numero=Numero;
		this.AccesoGaleria=AccesoGaleria;
	}

	public Boolean getAccesoGaleria() {
		return AccesoGaleria;
	}

}
