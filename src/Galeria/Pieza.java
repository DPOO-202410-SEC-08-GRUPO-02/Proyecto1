package Galeria;

public class Pieza {
		protected static String iD;
		protected String tecnica;
		protected String autor;
		protected String titulo;
		protected int anio;
		protected String lugar;
		protected String estado;
		protected Boolean disponibilidad;
		protected String fechaLimite;
		protected double valor;
		protected Boolean consignacion;
		protected Boolean devolucion;
		protected Boolean subasta;
		protected Double valorMinimoS;
		protected Double valorInicialS;
		
		
	public Pieza(String ID, String Tecnica,String Autor,String Titulo,int Anio,String Lugar, String Estado, Boolean Disponibilidad, 
			String FechaLimite, double Valor, Boolean Consignacion, Boolean Devolucion, Boolean Subasta, Double ValorMinimoS, Double ValorInicialS) {
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
		}
	
	
	public static String getID() {
		return iD;
	}
	
	
	public String getTecnica() {
		return tecnica;
	}
	
	
	public String getAutor() {
		return autor;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	
	
	public int getAnio() {
		return anio;
	}
	
	
	public String getLugar() {
		return lugar;
	}
	
	
	public String getEstado() {
		return estado;
	}
	
	
	public Boolean getDisponibilidad() {
		return disponibilidad;
	}
	
	
	public String getFechaLimite() {
		return fechaLimite;
	}
	
	
	public double getValor() {
		return valor;
	}
	
	
	public Boolean getConsignacion() {
		return consignacion;
	}
	
	
	public Boolean getDevolucion() {
		return devolucion;
	}
	
	
	public Boolean getSubasta() {
		return subasta;
	}
	
	
	public Double getValorMinimoS() {
		return valorMinimoS;
	}
	
	
	public Double getValorInicialS() {
		return valorInicialS;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public void setDevolucion(Boolean devolucion) {
		this.devolucion= devolucion;
	}

	public void setFechaLimite(String fechaLimite) {
		this.fechaLimite = fechaLimite;
	}


	public void setConsignacion(Boolean consignacion) {
		this.consignacion = consignacion;
	}


	public void setSubasta(Boolean subasta) {
		this.subasta = subasta;
	}


	public void setValorMinimoS(Double valorMinimoS) {
		this.valorMinimoS = valorMinimoS;
	}


	public void setValorInicialS(Double valorInicialS) {
		this.valorInicialS = valorInicialS;
	}
	

}
