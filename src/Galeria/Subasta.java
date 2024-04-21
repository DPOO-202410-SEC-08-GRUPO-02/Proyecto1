package Galeria;

import java.util.Map;

public class Subasta {
	
	private Compra compra; 
	private static Oferta ganador;
	
	public static String generarOferta(Comprador comprador, Pieza pieza, double valor) 
	{
		/* No se (┬┬﹏┬┬), Majo ayudaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*/
		
		/*Luego te ayudo q tengo sueño*/
		
		boolean verificado = comprador.getVerificado();
		
		if (verificado == true)
		{
			int turnoAnterior = Operador.getTurnoAnterior();
			String turno = Operador.generarTurno(turnoAnterior);
			
			Oferta oferta = new Oferta(turno, valor, comprador, pieza);
			Operador.agregarOferta(oferta);
			
			double valorM = pieza.getValorMinimoS();
			
			if (valor>= valorM)
			{
				ganador = Operador.elegirGanador(turno);
			}
			return "Oferta realizada con exito";
		}
		else
			return "Comprador no verificado";
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
		return -0.0;
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
