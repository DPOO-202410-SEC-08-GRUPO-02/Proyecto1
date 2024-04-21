package Galeria;

public class Administrador extends Empleado{
	
	public Administrador(String Login, String Contraseña,String ID,String Nombre,String Correo,int Numero, Boolean AccesoGaleria) {
		super(Login,Contraseña,ID,Nombre,Correo, Numero,AccesoGaleria);
		this.login=Login;
		this.contraseña=Contraseña;
		this.iD=ID;
		this.nombre=Nombre;
		this.correo=Correo;
		this.numero=Numero;
		this.accesoGaleria=AccesoGaleria;
	}
	
	public static boolean verificarUsuario (Usuario usuario) {
		/* Verifica un usuario para que sea comprador o propietario*/
		return false;
	}
	
	public static boolean verificarCompra (Comprador comprador, Pieza pieza, double valor) {
		/* Verifica que todo este en orden para realizar una compra si es asi entonces la aprueba*/
		return false;
	}
	
	public static void verificarDevolucion (Usuario usuario, Pieza pieza) {
		/* Verifica que todo este en orden para realizar una devolucion si es asi entonces la aprueba*/
	}
	
	public static void cambiarEstadoObra (Pieza pieza, String llave, String valor) {
		/* Cambia el estado y disponibilidad de una obra*/
		if (llave == "disponibilidad")
		{
			pieza.setDisponibilidad(Boolean.parseBoolean(valor));
		}
		
		else if (llave == "estado")
		{
			pieza.setEstado(valor);
		}
	}
	
	public static boolean verificarLimite (Comprador comprador, double valor) {
		/* Verifica que todo este en orden segun el limite del comprador y el dinero actual*/
		return false;
	}
	
	public static void agregarPieza (Comprador comprador, Pieza pieza) {
		/* Agrega una pieza a el inventario del comprador y hace todos los procesos necesarios para sacarlo del inventario*/
	}
	
	public static void ingresarPieza (Pieza pieza) {
		/* Ingresa una pieza totalmente nueva al inventario de la galeria*/
	}
}
