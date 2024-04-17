package Galeria;

import java.util.List;

public class Escultura extends Pieza{
	protected double Alto;
	protected double Ancho;
	protected double Profundidad;
	protected  List<String> Materiales;
	protected double Peso;
	protected Boolean Instalacion;
	protected Boolean Electricidad;
	
	public Escultura(String ID, String Tecnica,String Autor,String Titulo,int Anio,String Lugar, String Estado, Boolean Disponibilidad, 
			String FechaLimite, double Valor, Boolean Consignacion, Boolean Devolucion, Boolean Subasta, Double ValorMinimoS, Double ValorInicialS,
			double Alto, double Ancho, double Profundidad,List<String> Materiales,double Peso, Boolean Instalacion, Boolean Electricidad) {
			super(ID,Tecnica,Autor,Titulo,Anio,Lugar,Estado,Disponibilidad,FechaLimite,Valor,Consignacion,Devolucion,Subasta,ValorMinimoS,ValorInicialS);
			this.ID=ID;
			this.Tecnica=Tecnica;
			this.Autor=Autor;
			this.Titulo=Titulo;
			this.Anio=Anio;
			this.Lugar=Lugar;
			this.Estado=Estado;
			this.Disponibilidad=Disponibilidad;
			this.FechaLimite=FechaLimite;
			this.Valor=Valor;
			this.Consignacion=Consignacion;
			this.Devolucion=Devolucion;
			this.Subasta=Subasta;
			this.ValorMinimoS=ValorMinimoS;
			this.ValorInicialS=ValorInicialS;
			
			this.Alto=Alto;
			this.Ancho=Ancho;
			this.Profundidad=Profundidad;
			this.Materiales=Materiales;
			this.Peso=Peso;
			this.Instalacion=Instalacion;
			this.Electricidad=Electricidad;
		}

	public double getAlto() {
		return Alto;
	}

	public double getAncho() {
		return Ancho;
	}

	public double getProfundidad() {
		return Profundidad;
	}

	public List<String> getMateriales() {
		return Materiales;
	}

	public double getPeso() {
		return Peso;
	}

	public Boolean getInstalacion() {
		return Instalacion;
	}

	public Boolean getElectricidad() {
		return Electricidad;
	}

}
