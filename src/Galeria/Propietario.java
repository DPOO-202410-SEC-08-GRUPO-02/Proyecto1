package Galeria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Propietario extends Cliente{
	
	private  List<String> estadoPiezas= new ArrayList<String>( );
	private Map<String,Pieza> HistorialPiezas= new HashMap<String,Pieza>();
	private Comprador comprador;
	
	public Propietario (String Login, String Contraseña,String ID,String Nombre,String Correo,int Numero, Boolean Verificado, List<String> EstadoPiezas) {
		super(Login,Contraseña,ID,Nombre,Correo, Numero,Verificado);
		this.login=Login;
		this.contraseña=Contraseña;
		this.iD=ID;
		this.nombre=Nombre;
		this.correo=Correo;
		this.numero=Numero;
		this.verificado=Verificado;
		this.estadoPiezas=EstadoPiezas;
	}

	public List<String> consultarEstado() {
		/* Devuelve una lista de string con el ID/Nombre de la pieza y el estado en cada posicion*/
		return estadoPiezas;
	}

	 public void consignarPieza(Pieza pieza, String fechaLim) {
		 /* Da una pieza a la Galeria con el atributo consignacion TRUE y una fecha limite*/
	 }
	 
	 public Map<String,Pieza> consultarHistorial() {
		 /* Devuelve una lista con todas las piezas que fueron del Usuario y estan en consignacion o ya estan vendidas en cada posicion*/
		 return HistorialPiezas;
	}
}
