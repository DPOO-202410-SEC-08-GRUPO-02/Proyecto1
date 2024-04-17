package Galeria;

public class Oferta {
	protected int turno;
	protected double valorOferta;
	
	public Comprador Comprador;
	public Pieza Pieza;
	
	public int getTurno() {
		return turno;
	}
	public double getValorOferta() {
		return valorOferta;
	}
	
	public void getComprador() {
		/*Obtiene la informacion del comprador necesaria para realizar la subasta*/
	}
	
	public void getPieza() {
		/*Obtiene la informacion de la pieza necesaria para realizar la subasta*/
	}
}
