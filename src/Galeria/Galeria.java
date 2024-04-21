package Galeria;

import java.util.HashMap;
import java.util.Map;

public class Galeria {
	
	private static Map<String,Pieza> inventarioMap= new HashMap<String,Pieza>();
	private static Map<String,Pieza> subastaMap= new HashMap<String,Pieza>();
	private Map<String,Usuario> usuariosMap= new HashMap<String,Usuario>();
	/*Subasta sera mas pequeña que Inventario porque solo estaran los elementos que tengan subasta en True*/
	
	public static Pieza getPiezaInventario(String idPieza) {
		/*Obtiene la informacion de una pieza en el inventario*/
		Pieza pieza= inventarioMap.get(idPieza);
		return pieza;
	}
	
	public static Pieza getPiezaSubasta(String idPieza) {
		/*Obtiene la informacion de una pieza en el inventario*/
		Pieza pieza= subastaMap.get(idPieza);
		return pieza;
	}
	
	public static Usuario getUsuario(String idUsuario) {
		/*Obtiene la informacion de la informacion del Usuario*/
		return null;
	}
	
	public static Map<String, Pieza> getInventario() {
		return inventarioMap;
	}

	public static Map<String, Pieza> getSubasta() {
		return subastaMap;
	}

	public Map<String, Usuario> getUsuarios() {
		return usuariosMap;
	}

	public void agregarPiezaSubasta(Pieza pieza) {
		
		String id = pieza.getID();
		subastaMap.put(id, pieza);
	}
	
	public void agregarPiezaInventario(Pieza pieza) {
		/*Agrega una pieza al hash map de Inventario*/
		String id = pieza.getID();
		inventarioMap.put(id, pieza);
	}
	
	public void agregarUsuario(Usuario usuario) {
		/*Agrega un usuario al hash map de Usuario*/
		String id = usuario.getID();
		usuariosMap.put(id, usuario);
	}
}
