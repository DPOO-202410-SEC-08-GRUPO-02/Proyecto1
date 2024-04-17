package Galeria;


public class Impresion extends Pieza{
	protected double Alto;
	protected double Ancho;
	protected String Soporte;
	protected Boolean Instalacion;
	
	public Impresion(String ID, String Tecnica,String Autor,String Titulo,int Anio,String Lugar, String Estado, Boolean Disponibilidad, 
			String FechaLimite, double Valor, Boolean Consignacion, Boolean Devolucion, Boolean Subasta, Double ValorMinimoS, Double ValorInicialS,
			double Alto, double Ancho, String Soporte,Boolean Instalacion) {
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
			this.Soporte=Soporte;
			this.Instalacion=Instalacion;
		}

	public double getAlto() {
		return Alto;
	}

	public double getAncho() {
		return Ancho;
	}

	public String getSoporte() {
		return Soporte;
	}

	public Boolean getInstalacion() {
		return Instalacion;
	}

}