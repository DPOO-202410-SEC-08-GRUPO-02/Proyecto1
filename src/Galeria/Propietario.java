package Galeria;

import java.util.HashSet;
import java.util.List;

public class Propietario extends Cliente{
	
	protected  List<String> EstadoPiezas;
	
	public HashSet<Pieza> HistorialPiezas= new HashSet<Pieza>();
	public HashSet<Pieza> InfoCompras= new HashSet<Pieza>();
	public Comprador comprador;
	
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

	public List<String> getEstadoPiezas() {
		return EstadoPiezas;
	}

	 public void ConsignarPieza() {
		 /* Da una pieza a la Galeria con el atributo consignacion TRUE y una fecha limite*/
	 }
	 
	 public void ConsultarEstado() {
		 /* Devuelve una lista de string con el ID/Nombre de la pieza y el estado en cada posicion*/
	 }
	 
	 public void ConsultarHistorial() {
		 /* Devuelve una lista con todas las piezas que fueron del Usuario y estan en consignacion o ya estan vendidas en cada posicion*/
	 }
	 
}
