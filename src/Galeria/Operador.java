package Galeria;

import java.util.HashMap;
import java.util.Map;

public class Operador extends Empleado {

	private static int turnoAnterior= 0;
	private static Map<String, Oferta> ofertas = new HashMap<String, Oferta>();;
	
	public Operador(String Login, String Contraseña,String ID,String Nombre,String Correo,int Numero, Boolean AccesoGaleria) {
		super(Login,Contraseña,ID,Nombre,Correo, Numero,AccesoGaleria);
		this.login=Login;
		this.contraseña=Contraseña;
		this.iD=ID;
		this.nombre=Nombre;
		this.correo=Correo;
		this.numero=Numero;
		this.accesoGaleria=AccesoGaleria;
	}

	public static int getTurnoAnterior() {
		return turnoAnterior;
	}
	
	public static String generarTurno(int turnoAnterior) {
		/*Genera otro turno (o inicia la subasta).
		 * Los turnos se miden por el input del usuario.*/
		turnoAnterior = turnoAnterior+1;
		return turnoAnterior + "";
	}
	
	public static Oferta elegirGanador(int turnoAnterior) {
		/*Decide quien fue el ganador por el ultimo turno y verifica si el ganador si se puede permitir comprar la pieza (con el saldo maximo y dinero actual)*/
		return null;
	}
	
	public static boolean agregarOferta(Oferta oferta) {
		/* No se (┬┬﹏┬┬), Majo ayudaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*/
		String turno = oferta.getTurno();
		int tamanioAntes = ofertas.size();
		ofertas.put(turno, oferta);
		int tamanioDespues = ofertas.size();
		
		if (tamanioDespues > tamanioAntes)
			return true;
		else
			return false;
	}
}
