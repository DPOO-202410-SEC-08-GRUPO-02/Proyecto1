package Galeria;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class CargadorGaleria {
	
	public void cargarInventario(String archivo, Galeria galeria) throws IOException
	{
		/*Lee el archivo del inventario y genera el mapa de hash de inventario y subasta*/
		String jsonCompleto = new String( Files.readAllBytes( new File( archivo ).toPath( ) ) );
		JSONObject raiz = new JSONObject( jsonCompleto );
		JSONArray jInventario = raiz.getJSONArray( "Piezas" );
		
		int numPiezas = jInventario.length( );
		
		for( int i = 0; i < numPiezas; i++ )
        {
			JSONObject pieza = jInventario.getJSONObject(i);
			String tipo = pieza.getString("tipo");
			String id = pieza.getString("id");
			String tecnica = pieza.getString("tecnica");
			String autor = pieza.getString("autor");
			String titulo = pieza.getString("titulo");
			int anio = pieza.getInt("anio");
			String lugar = pieza.getString("lugar");
			String estado = pieza.getString("estado");
			boolean disponibilidad = pieza.getBoolean("disponibilidad");
			String fechaLimite = pieza.getString("fechaLimite");
			double valor = pieza.getDouble("valor");
			boolean consignacion = pieza.getBoolean("consignacion");
			boolean devolucion = pieza.getBoolean("devolucion");
			boolean subasta = pieza.getBoolean("subasta");
			double valorMinimoS = pieza.getDouble("valorMinimoS");
			double valorInicialS = pieza.getDouble("valorInicialS");
			
			
			Pieza nuevaPieza = null;
			
			if (tipo == "Pintura")
			{
				double alto = pieza.getDouble("alto");
				double ancho = pieza.getDouble("ancho");
				String movimientoArtistico = pieza.getString("movimientoArtistico");
				boolean instalacion = pieza.getBoolean("instalacion");
				nuevaPieza = new Pintura(id, tecnica, autor, titulo, anio, lugar, estado, 
						disponibilidad, fechaLimite,valor, consignacion, devolucion, subasta, valorMinimoS, valorInicialS,tipo,
						alto, ancho, movimientoArtistico, instalacion);
			
			}
			else if (tipo == "Escultura")
			{
				double alto = pieza.getDouble("alto");
				double ancho = pieza.getDouble("ancho");
				double profundidad = pieza.getDouble("profundidad");
				List<String> materiales = (List<String>) pieza.get("materiales");
				double peso = pieza.getDouble("peso");
				boolean instalacion = pieza.getBoolean("instalacion");
				boolean electricidad = pieza.getBoolean("electricidad");
				
				nuevaPieza = new Escultura (id, tecnica, autor, titulo, anio, lugar, estado, 
						disponibilidad, fechaLimite,valor, consignacion, devolucion, subasta, valorMinimoS, valorInicialS, tipo,
						alto, ancho, profundidad, materiales, peso, instalacion, electricidad);
			}
			
			else if (tipo == "Impresion")
			{
				double alto = pieza.getDouble("alto");
				double ancho = pieza.getDouble("ancho");
				String soporte = pieza.getString("soporte");
				boolean instalacion = pieza.getBoolean("instalacion");
				
				nuevaPieza = new Impresion (id, tecnica, autor, titulo, anio, lugar, estado, 
						disponibilidad, fechaLimite,valor, consignacion, devolucion, subasta, valorMinimoS, valorInicialS, tipo,
						alto, ancho, soporte, instalacion);
			}
			
			else if (tipo == "Fotografia")
			{
				double alto = pieza.getDouble("alto");
				double ancho = pieza.getDouble("ancho");
				boolean aColor = pieza.getBoolean("aColor");
				boolean instalacion = pieza.getBoolean("instalacion");
				
				nuevaPieza = new Fotografia (id, tecnica, autor, titulo, anio, lugar, estado, 
						disponibilidad, fechaLimite,valor, consignacion, devolucion, subasta, valorMinimoS, valorInicialS, tipo,
						alto, ancho, aColor, instalacion);
			}
			
			else if (tipo == "Video")
			{
				String duracion = pieza.getString("duracion");
				boolean electricidad = pieza.getBoolean("electricidad");
				
				nuevaPieza = new Video (id, tecnica, autor, titulo, anio, lugar, estado, 
						disponibilidad, fechaLimite,valor, consignacion, devolucion, subasta, valorMinimoS, valorInicialS, tipo,
						duracion, electricidad);
			}
			
			Galeria.agregarPiezaInventario(nuevaPieza);
			
			if (subasta == true)
			{
				Galeria.agregarPiezaSubasta(nuevaPieza);
			}
        }
		
	}
	
	public void salvarInventario(String archivo, Galeria galeria) throws IOException
	{
		/*Con la tabla de hash de Inventario modifica lo que este diferente en el archivo de inventario*/
		
		JSONObject jobject = new JSONObject( );
		JSONArray jInventario = new JSONArray( );
		
		for( Pieza pieza : Galeria.getInventarioValores() )
        {
			JSONObject jPieza = new JSONObject( );
			jPieza.put("id", pieza.getID());
			jPieza.put("tecnica", pieza.getTecnica());
			jPieza.put("autor", pieza.getAutor());
			jPieza.put("titulo", pieza.getTitulo());
			jPieza.put("anio", pieza.getAnio());
			jPieza.put("lugar", pieza.getLugar());
			jPieza.put("estado", pieza.getEstado());
			jPieza.put("disponibilidad", pieza.getDisponibilidad());
			jPieza.put("fechaLimite", pieza.getFechaLimite());
			jPieza.put("valor", pieza.getValor());
			jPieza.put("consignacion", pieza.getConsignacion());
			jPieza.put("devolucion", pieza.getDevolucion());
			jPieza.put("subasta", pieza.getSubasta());
			jPieza.put("valorMinimoS", pieza.getValorMinimoS());
			jPieza.put("valorInicialS", pieza.getValorInicialS());
			jPieza.put("tipo", pieza.getTipo());
			
			String tipo = pieza.getTipo();
			
			if (tipo == "Pintura")
			{
				Pintura pintura = (Pintura) pieza;
				
				jPieza.put("alto", pintura.getAlto());
				jPieza.put("ancho", pintura.getAncho());
				jPieza.put("movimientoArtistico", pintura.getMovimientoArtistico());
				jPieza.put("instalacion", pintura.getInstalacion());

			}
			else if (tipo == "Escultura")
			{
				Escultura escultura = (Escultura) pieza;
				
				jPieza.put("alto", escultura.getAlto());
				jPieza.put("ancho", escultura.getAncho());
				jPieza.put("profundidad", escultura.getProfundidad());
				jPieza.put("materiales", escultura.getMateriales());
				jPieza.put("peso", escultura.getPeso());
				jPieza.put("instalacion", escultura.getInstalacion());
				jPieza.put("electricidad", escultura.getElectricidad());

			}
			
			else if (tipo == "Impresion")
			{
				Impresion impresion = (Impresion) pieza;
				
				jPieza.put("alto", impresion.getAlto());
				jPieza.put("ancho", impresion.getAncho());
				jPieza.put("soporte", impresion.getSoporte());
				jPieza.put("instalacion", impresion.getInstalacion());
			}
			
			else if (tipo == "Fotografia")
			{
				Fotografia fotografia = (Fotografia) pieza;
				
				jPieza.put("alto", fotografia.getAlto());
				jPieza.put("ancho", fotografia.getAncho());
				jPieza.put("aColor", fotografia.getaColor());
				jPieza.put("instalacion", fotografia.getInstalacion());
			}
			
			else if (tipo == "Video")
			{
				Video video = (Video) pieza;
				
				jPieza.put("duracion", video.getDuracion());
				jPieza.put("electricidad", video.getElectricidad());
			}
        }
		
		jobject.put( "Piezas", jInventario );
		
		PrintWriter pw = new PrintWriter( archivo );
        jobject.write( pw, 2, 0 );
        pw.close( );
		
	}
	
	public void salvarUsuario(String archivo, Galeria galeria) throws IOException
	{
		/*Con la tabla de hash de Usuario modifica lo que este diferente en el archivo de Usuario*/
	}
	
	public void cargarUsuario(String archivo, Galeria galeria) throws IOException
	
	{
		/*Lee el archivo del Usuario y genera el mapa de hash de los Usuarios*/
		
		String jsonCompleto = new String( Files.readAllBytes( new File( archivo ).toPath( ) ) );
		JSONObject raiz = new JSONObject( jsonCompleto );
		JSONArray jUsuarios = raiz.getJSONArray( "Piezas" );
		
		int numUsuarios = jUsuarios.length( );
		
		for( int i = 0; i < numUsuarios; i++ )
        {
			JSONObject usuario = jUsuarios.getJSONObject(i);
			String tipo = usuario.getString("tipo");
			String login = usuario.getString("login");
			String contraseña = usuario.getString("contraseña");
			String id = usuario.getString("id");
			String nombre = usuario.getString("nombre");
			String correo = usuario.getString("correo");
			int numero = usuario.getInt("numero");
			
			Usuario nuevoUsuario = null;
			
			if (tipo == "Comprador")
			{
				boolean verificado = usuario.getBoolean("verificado");
				double dineroActual = usuario.getDouble("dineroActual");
				double limiteCompras = usuario.getDouble("limiteCompras");
				
				nuevoUsuario = new Comprador(login, contraseña, id, nombre, correo, numero, verificado,
						dineroActual,limiteCompras);
			}
			
			else if (tipo == "Propietario")
			{
				boolean verificado = usuario.getBoolean("verificado");
				List<String> estadoPieza = (List<String>) usuario.get("estadoPieza");
				Map<String,Pieza> historial = (Map<String, Pieza>) usuario.get("historial");
				
				nuevoUsuario = new Propietario(login, contraseña, id, nombre, correo, numero, 
						verificado, estadoPieza, historial);
			}
			else if (tipo == "Cajero")
			{
				boolean accesoGaleria = usuario.getBoolean("accesoGaleria");
				
				nuevoUsuario = new Cajero(login, contraseña, id, nombre, correo, numero,accesoGaleria);
			}
			else if (tipo == "Operador")
			{
				boolean accesoGaleria = usuario.getBoolean("accesoGaleria");
				int turnoAnterior = usuario.getInt("turnoAnterior");
				Map<String,Oferta> ofertas = (Map<String, Oferta>) usuario.get("ofertas");
				
				nuevoUsuario = new Operador(login, contraseña, id, nombre, correo, numero, 
						accesoGaleria, turnoAnterior, ofertas);
			}
			
			else if (tipo == "Administrador")
			{
				boolean accesoGaleria = usuario.getBoolean("accesoGaleria");
				
				nuevoUsuario = new Administrador(login, contraseña, id, nombre, correo, numero, accesoGaleria);
			}
			
			Galeria.agregarUsuario(nuevoUsuario);

        }
	}
}
