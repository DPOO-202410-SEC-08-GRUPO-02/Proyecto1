package Galeria;

public class Fotografia extends Pieza{
	private double alto;
	private double ancho;
	private Boolean aColor;
	private Boolean instalacion;
	
	public Fotografia(String ID, String Tecnica,String Autor,String Titulo,int Anio,String Lugar, String Estado, Boolean Disponibilidad, 
			String FechaLimite, double Valor, Boolean Consignacion, Boolean Devolucion, Boolean Subasta, Double ValorMinimoS, Double ValorInicialS,
			double Alto, double Ancho, Boolean aColor,Boolean Instalacion) {
			super(ID,Tecnica,Autor,Titulo,Anio,Lugar,Estado,Disponibilidad,FechaLimite,Valor,Consignacion,Devolucion,Subasta,ValorMinimoS,ValorInicialS);
			this.iD=ID;
			this.tecnica=Tecnica;
			this.autor=Autor;
			this.titulo=Titulo;
			this.anio=Anio;
			this.lugar=Lugar;
			this.estado=Estado;
			this.disponibilidad=Disponibilidad;
			this.fechaLimite=FechaLimite;
			this.valor=Valor;
			this.consignacion=Consignacion;
			this.devolucion=Devolucion;
			this.subasta=Subasta;
			this.valorMinimoS=ValorMinimoS;
			this.valorInicialS=ValorInicialS;
			
			this.alto=Alto;
			this.ancho=Ancho;
			this.aColor=aColor;
			this.instalacion=Instalacion;
		}

	public double getAlto() {
		return alto;
	}

	public double getAncho() {
		return ancho;
	}

	public Boolean getaColor() {
		return aColor;
	}

	public Boolean getInstalacion() {
		return instalacion;
	}

}
