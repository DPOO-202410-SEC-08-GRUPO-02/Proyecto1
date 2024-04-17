package Galeria;

public class Pieza {
	protected String ID;
	protected String Tecnica;
	protected String Autor;
	protected String Titulo;
	protected int Anio;
	protected String Lugar;
	protected String Estado;
	protected Boolean Disponibilidad;
	protected String FechaLimite;
	protected double Valor;
	protected Boolean Consignacion;
	protected Boolean Devolucion;
	protected Boolean Subasta;
	protected Double ValorMinimoS;
	protected Double ValorInicialS;
	
	
public Pieza(String ID, String Tecnica,String Autor,String Titulo,int Anio,String Lugar, String Estado, Boolean Disponibilidad, 
		String FechaLimite, double Valor, Boolean Consignacion, Boolean Devolucion, Boolean Subasta, Double ValorMinimoS, Double ValorInicialS) {
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
	}


public String getID() {
	return ID;
}


public String getTecnica() {
	return Tecnica;
}


public String getAutor() {
	return Autor;
}


public String getTitulo() {
	return Titulo;
}


public int getAnio() {
	return Anio;
}


public String getLugar() {
	return Lugar;
}


public String getEstado() {
	return Estado;
}


public Boolean getDisponibilidad() {
	return Disponibilidad;
}


public String getFechaLimite() {
	return FechaLimite;
}


public double getValor() {
	return Valor;
}


public Boolean getConsignacion() {
	return Consignacion;
}


public Boolean getDevolucion() {
	return Devolucion;
}


public Boolean getSubasta() {
	return Subasta;
}


public Double getValorMinimoS() {
	return ValorMinimoS;
}


public Double getValorInicialS() {
	return ValorInicialS;
}

}
