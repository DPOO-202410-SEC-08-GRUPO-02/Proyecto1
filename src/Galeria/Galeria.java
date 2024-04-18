package Galeria;

import java.util.HashMap;
import java.util.Map;

public class Galeria {
	
	private Map<String,Pieza> Inventario= new HashMap<String,Pieza>();
	private Map<String,Pieza> Subasta= new HashMap<String,Pieza>();
	private Map<String,Usuario> Usuarios= new HashMap<String,Usuario>();
	/*Subasta sera mas pequeña que Inventario porque solo estaran los elementos que tengan subasta en True*/
	
	public Pieza getPiezaInventario(String idPieza) {
		/*Obtiene la informacion de una pieza en el inventario*/
		return null;
	}
	
	public Usuario getUsuario(String idUsuario) {
		/*Obtiene la informacion de la informacion del Usuario*/
		return null;
	}
	
	public void AgregarPiezaSubasta(Pieza pieza) {
		/*Agrega una pieza al hash map de Subastas*/
	}
	
	public void AgregarPiezaInventario(Pieza pieza) {
		/*Agrega una pieza al hash map de Inventario*/
	}
	
	public void AgregarUsuario(Usuario usuario) {
		/*Agrega un usuario al hash map de Usuario*/

		/*AcabarEsto=False;
		if (AcabarEsto==True) {
			Hay que seguir trabajando pq esta largo*/
	}
}
