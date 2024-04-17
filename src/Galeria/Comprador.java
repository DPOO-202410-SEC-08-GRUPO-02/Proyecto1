package Galeria;

import java.util.HashSet;
import java.util.List;

public class Comprador extends Cliente{
	protected  double DineroActual;
	protected double LimiteCompras;
	
	public HashSet<Pieza> InfoCompras= new HashSet<Pieza>();
	public Propietario Propietario;
	
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

	public double getDineroActual() {
		return DineroActual;
	}

	public double getLimiteCompras() {
		return LimiteCompras;
	}
	
	public void GenerarOfertasSubasta() {
		/* En estado de oferta el usuario sera capaz de hacer una oferta.
		 * Posiles formas (pueden ser ambas):
		 * 1. El usuario generara una oferta y si es menor que el valor minimo entonces el programa generara un numero aleatorio entre la oferta de usuario y el valor minimo (pero nunca igual a el valor minimo).
		 * 2. Para dar mas sensacion de estar en una subasta que el usuario deba hacer minimo 3 ofertas antes de que se cierre esta.
		 */
	}
	
	public void ComprarPieza() {
		/* El usuario podra elegir una pieza en el Catalogo para comprar*/
	}
	
	public void EditarLimite() {
		/* No se le presentara al comprador para que la use. el administrador es el que debe usarla.*/ 
	}
	
	public void AgregarPieza() {
		/* No se le presentara al comprador para que la use. el administrador es el que debe usarla.*/
	}
	
	public void EditarDineroActual() {
		/* No se le presentara al comprador para que la use. el cajero es el que debe usarla (para descontar el dinero en una compra por ejemplo).*/
	}
}
