package Galeria;

import java.util.HashSet;

public class Inventario {
	
	public HashSet<Pieza> Pieza= new HashSet<Pieza>();

	public void getPiezaInventario() {
		/*Obtiene la informacion de una pieza*/
	}
	
	public void ModificarDisponibilidad() {
		/*Modifica la Disponibilidad de una pieza*/
	}
	
	public void ModificarEstado() {
		/*Modifica el Estado de una pieza*/
	}

	public void ModificarConsignacion() {
		/*Modifica la consignacion de una pieza y elimina la fecha limite en caso de que se venda o devuelva al propietario*/
	}

	public void ModificarDevolucion() {
		/*Modifica la Devolucion de una pieza*/
	}
}
