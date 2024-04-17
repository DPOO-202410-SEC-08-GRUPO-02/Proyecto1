package Galeria;

public class Video extends Pieza{
	protected String Duracion;
	protected Boolean Electricidad;
	
	public Video(String ID, String Tecnica,String Autor,String Titulo,int Anio,String Lugar, String Estado, Boolean Disponibilidad, 
			String FechaLimite, double Valor, Boolean Consignacion, Boolean Devolucion, Boolean Subasta, Double ValorMinimoS, Double ValorInicialS,
			String Duracion,Boolean Electricidad) {
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
			
			this.Duracion=Duracion;
			this.Electricidad=Electricidad;
		}

	public String getDuracion() {
		return Duracion;
	}

	public Boolean getElectricidad() {
		return Electricidad;
	}

}
