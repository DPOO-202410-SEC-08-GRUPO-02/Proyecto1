package Galeria;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.List;

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
						disponibilidad, fechaLimite,valor, consignacion, devolucion, subasta, valorMinimoS, valorInicialS,
						alto, ancho, movimientoArtistico, instalacion);
				
				Galeria.agregarPiezaInventario(nuevaPieza);
				
				if (subasta == true)
				{
					Galeria.agregarPiezaSubasta(nuevaPieza);
				}
			
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
						disponibilidad, fechaLimite,valor, consignacion, devolucion, subasta, valorMinimoS, valorInicialS,
						alto, ancho, profundidad, materiales, peso, instalacion, electricidad);
				
				Galeria.agregarPiezaInventario(nuevaPieza);
				
				if (subasta == true)
				{
					Galeria.agregarPiezaSubasta(nuevaPieza);
				}
			}
			
			else if (tipo == "Impresion")
			{
				double alto = pieza.getDouble("alto");
				double ancho = pieza.getDouble("ancho");
				String soporte = pieza.getString("soporte");
				boolean instalacion = pieza.getBoolean("instalacion");
				
				nuevaPieza = new Impresion (id, tecnica, autor, titulo, anio, lugar, estado, 
						disponibilidad, fechaLimite,valor, consignacion, devolucion, subasta, valorMinimoS, valorInicialS,
						alto, ancho, soporte, instalacion);
				
				Galeria.agregarPiezaInventario(nuevaPieza);
				
				if (subasta == true)
				{
					Galeria.agregarPiezaSubasta(nuevaPieza);
				}
			}
			
			else if (tipo == "Fotografia")
			{
				double alto = pieza.getDouble("alto");
				double ancho = pieza.getDouble("ancho");
				boolean aColor = pieza.getBoolean("aColor");
				boolean instalacion = pieza.getBoolean("instalacion");
				
				nuevaPieza = new Fotografia (id, tecnica, autor, titulo, anio, lugar, estado, 
						disponibilidad, fechaLimite,valor, consignacion, devolucion, subasta, valorMinimoS, valorInicialS,
						alto, ancho, aColor, instalacion);
				
				Galeria.agregarPiezaInventario(nuevaPieza);
				
				if (subasta == true)
				{
					Galeria.agregarPiezaSubasta(nuevaPieza);
				}
			}
			
			else if (tipo == "Video")
			{
				String duracion = pieza.getString("duracion");
				boolean electricidad = pieza.getBoolean("electricidad");
				
				nuevaPieza = new Video (id, tecnica, autor, titulo, anio, lugar, estado, 
						disponibilidad, fechaLimite,valor, consignacion, devolucion, subasta, valorMinimoS, valorInicialS,
						duracion, electricidad);
				
				Galeria.agregarPiezaInventario(nuevaPieza);
				
				if (subasta == true)
				{
					Galeria.agregarPiezaSubasta(nuevaPieza);
				}
			}
        }
		
	}
	
	public void cargarUsuario(String archivo, Galeria galeria) {
		/*Lee el archivo del Usuario y genera el mapa de hash de los Usuarios*/
	}
	
	public void salvarInventario(JSONArray jInventario, Galeria galeria) {
		/*Con la tabla de hash de Inventario modifica lo que este diferente en el archivo de inventario*/
	}
	
	public void salvarUsuario(JSONArray jUsuario, Galeria galeria) {
		/*Con la tabla de hash de Usuario modifica lo que este diferente en el archivo de Usuario*/
	}
}
