package Galeria;

public class Compra {
	
	protected double ValorCompra;
	
	public Pieza Pieza;
	public Comprador Comprador;
	
	public void PasarCaja() {
		/*Se llama pasar a Caja para diferenciar que es proceso inicial de la compra, osea consultar todos 
		 * los datos necesarios y mandar a verificarlos al cajero o al administarador y dependiendo del caso pasara a compra rechazada o confirmar compra
		 */
	}
	
	public void ConfirmarCompra() {
		/* Hace todo el proceso necesario para realizar la compra, entregar la pieza al usuario, entre otros procesos*/
	}
	
	public void CompraRechazada () {
		/*Cuando algo en la verificacion de pasar a caja sale mal entonces devolvera todo a como estaba antes 
		 * de que el usuario eligiera una pieza para la compra y intenta resolvr el problema por el cual el comprador no es apto para comprar la pieza
		 */
	}
}
