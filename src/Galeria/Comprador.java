package Galeria;

import java.util.List;

public class Comprador extends Cliente{
	protected  double DineroActual;
	protected double LimiteCompras;
	
	public Comprador (String Login, String Contraseña,String ID,String Nombre,String Correo,int Numero, Boolean Verificado, List<String> Estadopiezas,double DineroActual, double LimiteCompras ) {
		super(Login,Contraseña,ID,Nombre,Correo, Numero,Verificado);
		this.Login=Login;
		this.Contraseña=Contraseña;
		this.ID=ID;
		this.Nombre=Nombre;
		this.Correo=Correo;
		this.Numero=Numero;
		
		this.Verificado=Verificado;
		
		
		this.DineroActual=DineroActual;
		this.LimiteCompras=LimiteCompras;
	}

}
