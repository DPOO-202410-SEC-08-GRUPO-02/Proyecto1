package Galeria;

import java.util.List;

public class Propietario extends Cliente{
	protected  List<String> EstadoPiezas;
	
	public Propietario (String Login, String Contraseña,String ID,String Nombre,String Correo,int Numero, Boolean Verificado, List<String> EstadoPiezas) {
		super(Login,Contraseña,ID,Nombre,Correo, Numero,Verificado);
		this.Login=Login;
		this.Contraseña=Contraseña;
		this.ID=ID;
		this.Nombre=Nombre;
		this.Correo=Correo;
		this.Numero=Numero;
		
		this.Verificado=Verificado;
		
		this.EstadoPiezas=EstadoPiezas;
	}

}
