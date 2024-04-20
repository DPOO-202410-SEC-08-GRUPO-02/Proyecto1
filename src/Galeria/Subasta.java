package Galeria;

import java.util.Map;

public class Subasta {
	
	private Compra compra; 
	private Oferta ganador;
	
	public static void generarOferta(Comprador comprador, Pieza pieza, double valor) 
	{
		/* No se (┬┬﹏┬┬), Majo ayudaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*/
		
		/*Luego te ayudo q tengo sueño*/
		
		int turnoAnterior = Operador.getTurnoAnterior();
		String turno = Operador.generarTurno(turnoAnterior);
		
		Oferta oferta = new Oferta(turno, valor, comprador, pieza);
		boolean nuevaOferta = Operador.agregarOferta(oferta);
		
		return nuevaOferta;
	}
	
	public void verificarUsuario(Comprador comprador) 
	{
		/* En caso de que el usuario no este verificado al realizar una subasta hace el proceso para verificarlo y dejarlo participar en la subasta*/
	}

	public Map<String, Pieza> getSubasta() 
	{
		Map<String, Pieza> subasta= Galeria.getSubasta();
		return subasta;
	}
	
	public double ofertaAleatoria()
	{
		
	}
	
	public Oferta getGanador()
	{
		return ganador;
	}

	public Compra getCompra() 
	{
		return compra;
	}
	
	
}
