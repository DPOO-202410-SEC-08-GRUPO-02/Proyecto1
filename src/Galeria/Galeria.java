package Galeria;

import java.util.HashMap;
import java.util.Map;

public class Galeria {
	
	private static Map<String,Pieza> inventario= new HashMap<String,Pieza>();
	private static Map<String,Pieza> subasta= new HashMap<String,Pieza>();
	private Map<String,Usuario> usuarios= new HashMap<String,Usuario>();
	/*Subasta sera mas pequeña que Inventario porque solo estaran los elementos que tengan subasta en True*/
	
	public static Pieza getPiezaInventario(String idPieza) {
		/*Obtiene la informacion de una pieza en el inventario*/
		Pieza pieza= inventario.get(idPieza);
		return pieza;
	}
	
	public static Pieza getPiezaSubasta(String idPieza) {
		/*Obtiene la informacion de una pieza en el inventario*/
		Pieza pieza= subasta.get(idPieza);
		return pieza;
	}
	
	public static Usuario getUsuario(String idUsuario) {
		/*Obtiene la informacion de la informacion del Usuario*/
		return null;
	}
	
	public static Map<String, Pieza> getInventario() {
		return inventario;
	}

	public static Map<String, Pieza> getSubasta() {
		return subasta;
	}

	public Map<String, Usuario> getUsuarios() {
		return usuarios;
	}

	public void agregarPiezaSubasta(Pieza pieza) {
		/*Agrega una pieza al hash map de Subastas*/
	}
	
	public void agregarPiezaInventario(Pieza pieza) {
		/*Agrega una pieza al hash map de Inventario*/
	}
	
	public void agregarUsuario(Usuario usuario) {
		/*Agrega un usuario al hash map de Usuario*/
	}
}
