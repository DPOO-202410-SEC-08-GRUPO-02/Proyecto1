package Galeria;

public class Empleado extends Usuario{
	protected Boolean accesoGaleria;
	
	public Empleado(String Login, String Contraseña,String ID,String Nombre,String Correo,int Numero, Boolean AccesoGaleria) {
		super(Login,Contraseña,ID,Nombre,Correo, Numero);
		this.login=Login;
		this.contraseña=Contraseña;
		this.iD=ID;
		this.nombre=Nombre;
		this.correo=Correo;
		this.numero=Numero;
		this.accesoGaleria=AccesoGaleria;
	}

	public Boolean getAccesoGaleria() {
		return accesoGaleria;
	}

}
