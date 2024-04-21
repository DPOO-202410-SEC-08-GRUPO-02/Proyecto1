package Galeria;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Comprador extends Cliente{
	private static  double dineroActual;
	private double limiteCompras;
	private static HashMap<String,Pieza> infoCompras= new HashMap<String,Pieza>();
	private static HashMap<String,Double> metodoPago= new HashMap<String,Double>();
	private Propietario Propietario;
	
	public Comprador (String Login, String Contraseña,String ID,String Nombre,String Correo,int Numero, Boolean Verificado, List<String> Estadopiezas,double dineroActual, double LimiteCompras ) {
		super(Login,Contraseña,ID,Nombre,Correo, Numero,Verificado);
		this.login=Login;
		this.contraseña=Contraseña;
		this.iD=ID;
		this.nombre=Nombre;
		this.correo=Correo;
		this.numero=Numero;
		this.verificado=Verificado;
		this.dineroActual=dineroActual;
		this.limiteCompras=LimiteCompras;
	}

	public static double getDineroActual() {
		return dineroActual;
	}

	public double getLimiteCompras() {
		return limiteCompras;
	}
	
	public Map<String, Pieza> getInfoCompras() {
		return infoCompras;
	}
	
	public Map<String,Double> getMetodoPago() {
		return metodoPago;
	}

	public String generarOfertasSubasta(Pieza pieza, double valor) {
		/* En estado de oferta el usuario sera capaz de hacer una oferta.
		 * Posiles formas (pueden ser ambas):
		 * 1. El usuario generara una oferta y si es menor que el valor minimo entonces el programa generara un numero aleatorio entre la oferta de usuario y el valor minimo (pero nunca igual a el valor minimo).
		 * 2. Para dar mas sensacion de estar en una subasta, el usuario debe realizar minimo 3 ofertas antes de que se cierre la subasta.
		 */
		
		String mensajeOferta = Subasta.generarOferta(this, pieza, valor);
		return mensajeOferta;
		
	}
	
	public void comprarPieza(Pieza pieza) {
		/* El usuario podra elegir una pieza en el Catalogo para comprar*/
	}
	
	public void editarLimite(double nuevoLimite) {
		/* No se le presentara al comprador para que la use. el administrador es el que debe usarla.*/ 
	}
	
	public void agregarPieza(Pieza pieza) {
		/* No se le presentara al comprador para que la use. el administrador es el que debe usarla.*/
		
		this.infoCompras.put(pieza.getID(),pieza);
	}
	
	public  void editarDineroActual(double dineroActual, double tarjetaCredito, double transferenciaElectronica, double Efectivo, HashMap<String,Double> metodoPago) {
		/* No se le presentara al comprador para que la use. el cajero es el que debe usarla (para descontar el dinero en una compra por ejemplo).*/
		setDineroActual(dineroActual);
		metodoPago.put("Tarjeta de credito",tarjetaCredito);
		metodoPago.put("Transferencia Electronica",transferenciaElectronica);
		metodoPago.put("Efectivo",Efectivo);
		Comprador.setMetodoPago(metodoPago);
	}

	public static void setDineroActual(double dineroActual) {
		Comprador.dineroActual = dineroActual;
	}

	public void setLimiteCompras(double limiteCompras) {
		this.limiteCompras = limiteCompras;
	}

	public void setInfoCompras(HashMap<String, Pieza> infoCompras) {
		this.infoCompras = infoCompras;
	}

	public static void setMetodoPago(HashMap<String,Double> metodoPago) {
		Comprador.metodoPago= metodoPago ;
	}
	
}
