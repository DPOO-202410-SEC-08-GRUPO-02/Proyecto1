package Galeria;

import java.util.HashSet;

public class Galeria {
	
	public HashSet<Pieza> Inventario= new HashSet<Pieza>();
	public HashSet<Pieza> Subasta= new HashSet<Pieza>();
	/*Subasta sera mas pequeña que Inventario porque solo estaran los elementos que tengan subasta en True*/
	public HashSet<Usuario> Usuarios= new HashSet<Usuario>();
	
	public void getPiezaInventario() {
		/*Obtiene la informacion de una pieza en el inventario*/
	}
	
	public void getUsuario() {
		/*Obtiene la informacion de la informacion del Usuario*/
	}
	
	public void AgregarPiezaSubasta() {
		/*Agrega una pieza al hash map de Subastas*/
	}
	
	public void AgregarPiezaInventario() {
		/*Agrega una pieza al hash map de Inventario*/
	}
	
	public void AgregarUsuario() {
		/*Agrega un usuario al hash map de Usuario*/
	}
}
