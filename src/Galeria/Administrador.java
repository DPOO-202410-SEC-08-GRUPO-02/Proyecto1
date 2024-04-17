package Galeria;

public class Administrador extends Empleado{
	
	public Administrador(String Login, String Contraseña,String ID,String Nombre,String Correo,int Numero, Boolean AccesoGaleria) {
		super(Login,Contraseña,ID,Nombre,Correo, Numero,AccesoGaleria);
		this.Login=Login;
		this.Contraseña=Contraseña;
		this.ID=ID;
		this.Nombre=Nombre;
		this.Correo=Correo;
		this.Numero=Numero;
		this.AccesoGaleria=AccesoGaleria;
	}
	
	public void VerificarUsuario () {
		/* Verifica un usuario para que sea comprador o propietario*/
	}
	
	public void VerificarCompra () {
		/* Verifica que todo este en orden para realizar una compra si es asi entonces la aprueba*/
	}
	
	public void VerificarDevolucion () {
		/* Verifica que todo este en orden para realizar una devolucion si es asi entonces la aprueba*/
	}
	
	public void CambiarEstadoObra () {
		/* Cambia el estado y disponibilidad de una obra*/
	}
	
	public void VerificarLimite () {
		/* Verifica que todo este en orden segun el limite del comprador y el dinero actual*/
	}
	
	public void AgregarPieza () {
		/* Agrega una pieza a el inventario del comprador y hace todos los procesos necesarios para sacarlo del inventario*/
	}
	
	public void IngresarPieza () {
		/* Ingresa una pieza totalmente nueva al inventario de la galeria*/
	}
}
