package Galeria;

import java.util.Map;

public class Inventario {

	public static Pieza getPiezaInventario(String idPieza) {
		/*Obtiene la informacion de una pieza*/
		Pieza pieza = Galeria.getPiezaInventario(idPieza);
		return pieza;
	}
	public static void agregarPiezaInventario(Pieza pieza) {
		/*Obtiene la informacion de una pieza*/
		Galeria.agregarPiezaInventario(pieza);
	}
	
	public static Map<String,Pieza> getInventario()
	{
		Map<String,Pieza> inventario = Galeria.getInventario();
		return inventario;
	}
	
	public static void modificarDisponibilidad(Pieza pieza) {
		/*Modifica la Disponibilidad de una pieza*/
	}
	
	public static void modificarEstado(Pieza pieza) {
		/*Modifica el Estado de una pieza*/
	}

	public static void modificarConsignacion(String fechaLimite, Pieza pieza) {
		/*Modifica la consignacion de una pieza y elimina la fecha limite en caso de que se venda o devuelva al propietario*/
	}

	public static void modificarDevolucion(Pieza pieza) {
		/*Modifica la Devolucion de una pieza*/
	}
}
