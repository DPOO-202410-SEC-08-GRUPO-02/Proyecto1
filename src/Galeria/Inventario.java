package Galeria;

public class Inventario {

	public Pieza getPiezaInventario(String idPieza) {
		/*Obtiene la informacion de una pieza*/
		Pieza pieza = Galeria.getPiezaInventario(idPieza);
		return pieza;
	}
	
	public void modificarDisponibilidad(Pieza pieza) {
		/*Modifica la Disponibilidad de una pieza*/
	}
	
	public void modificarEstado(Pieza pieza) {
		/*Modifica el Estado de una pieza*/
	}

	public void modificarConsignacion(String fechaLimite, Pieza pieza) {
		/*Modifica la consignacion de una pieza y elimina la fecha limite en caso de que se venda o devuelva al propietario*/
	}

	public void modificarDevolucion(Pieza pieza) {
		/*Modifica la Devolucion de una pieza*/
	}
}
