package Galeria;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

import org.json.JSONArray;
import org.json.JSONObject;

public class CargadorGaleria {

	public void cargarInventario(JSONArray jInventario, Galeria galeria) {
		/*Lee el archivo del inventario y genera el mapa de hash de inventario y subasta*/
	}
	
	public void cargarUsuario(JSONArray jUsuario, Galeria galeria) {
		/*Lee el archivo del Usuario y genera el mapa de hash de los Usuarios*/
	}
	
	public void salvarInventario(JSONArray jInventario, Galeria galeria) {
		/*Con la tabla de hash de Inventario modifica lo que este diferente en el archivo de inventario*/
	}
	
	public void salvarUsuario(JSONArray jUsuario, Galeria galeria) {
		/*Con la tabla de hash de Usuario modifica lo que este diferente en el archivo de Usuario*/
	}
}
