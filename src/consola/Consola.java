package consola;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.IOException;


import Galeria.Administrador;
import Galeria.Cajero;
import Galeria.Compra;
import Galeria.Comprador;
import Galeria.Escultura;
import Galeria.Galeria;
import Galeria.Inventario;
import Galeria.Oferta;
import Galeria.Pieza;
import Galeria.Pintura;
import Galeria.Subasta;
import Galeria.Video;
import Galeria.CargadorGaleria;

public class Consola 
{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
    	Pintura nuevaPieza = new Pintura(
    	        "123", // ID único
    	        "Óleo sobre lienzo", // Técnica
    	        "Leonardo da Vinci", // Autor
    	        "La Mona Lisa", // Título
    	        1503, // Año
    	        "Verona", // Lugar
    	        "Exhibida", // Estado
    	        true, // Disponibilidad
    	        "2024-05-30", // Fecha límite de consignación
    	        55.0, // Valor
    	        true, // En consignación
    	        false, // Devolución
    	        false, // Subasta
    	        0.0, // Valor mínimo de subasta
    	        0.0, // Valor inicial de subasta
    	        "Pintura", //Tipo
    	         0,   // Alto
    	         0,   //Ancho
    	         "Renacimiento", //Movimiento artistico
    	         true //Instalacion
    	    );

    	    Galeria.agregarPiezaInventario(nuevaPieza);
    	    
    	    Video nuevaPieza2 = new Video(
        	        "124", // ID único
        	        "Animacion digital", // Técnica
        	        "Pixar Animation Studios", // Autor
        	        "Toy Story", // Título
        	        1995, // Año
        	        "Los angeles", // Lugar
        	        "Exhibida", // Estado
        	        true, // Disponibilidad
        	        "2024-06-10", // Fecha límite de consignación
        	        12.0, // Valor
        	        true, // En consignación
        	        false, // Devolución
        	        false, // Subasta
        	        0.0, // Valor mínimo de subasta
        	        0.0, // Valor inicial de subasta
        	        "Video", //Tipo
        	        "87 minutos", // Duracion
        	        false //Electricidad
        	    );

        	    Galeria.agregarPiezaInventario(nuevaPieza2);
        	    
        	    List<String> lista = new ArrayList<>();
                lista.add("Marmol");
        	    
        	    Escultura obraFicticia1 = new Escultura(
        				"b",
        				"Esculpido en marmol",
        				"Michelangelo",
        				"David",
        				1504,
        				"Florencia",
        				"Exhibida",
        				true,
        				"0",
        				25.0,
        				false,
        				false,
        				true,
        				24.0,
        				21.0,
        				"Escultura",
        				517.0,
        				199.0,
        				114.00,
        				lista,
        				5600.0,
        				true,
        				false
        	    	);

        	    	// Crear la segunda obra ficticia
        	    	Pieza obraFicticia2 = new Pieza(
        	    	    "OBRA002",
        	    	    "Óleo sobre lienzo",
        	    	    "Ana Creativa",
        	    	    "Reflejo Urbano",
        	    	    2023,
        	    	    "Galería Ficticia",
        	    	    "Disponible",
        	    	    true,
        	    	    "30/11/2024",
        	    	    30000.0,
        	    	    true,
        	    	    false,
        	    	    true,
        	    	    25000.0,
        	    	    20000.0,
        	    	    "Impresion"
        	    	);

        	    	// Crear la tercera obra ficticia
        	    	Pieza obraFicticia3 = new Pieza(
        	    	    "OBRA003",
        	    	    "Escultura de bronce",
        	    	    "Roberto Escultor",
        	    	    "El Pensador Moderno",
        	    	    2025,
        	    	    "Galería Ficticia",
        	    	    "Disponible",
        	    	    true,
        	    	    "01/01/2025",
        	    	    50000.0,
        	    	    true,
        	    	    false,
        	    	    true,
        	    	    40000.0,
        	    	    35000.0,
        	    	    "Fotografia"
        	    	);

        	    	// Añadir las obras ficticias a la subasta
//        	    	Subasta.agregarPiezaInventario(obraFicticia1);
//        	    	Subasta.agregarPiezaInventario(obraFicticia2);
//        	    	Subasta.agregarPiezaInventario(obraFicticia3);
        mostrarMenuPrincipal();
    }

    private static void mostrarMenuPrincipal() 
    {
    	boolean continuar = true;
        while (continuar) 
        {
            System.out.println("*** BIENVENIDA A LA GALERÍA DE ARTE ***\n");
            System.out.println("1. Ver catálogo e iniciar proceso de compra");
            System.out.println("2. Participar en una subasta");
            System.out.println("3. Salir");
            System.out.print("Por favor, elige una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) 
            {
                iniciarProcesoCompra();
            } 
            else if (opcion == 2) 
            {
                iniciarProcesoSubasta();
            } 
            else if (opcion == 3) 
            {
                System.out.println("Gracias por visitar nuestra galería. ¡Hasta pronto!");
                continuar = false;
            } 
            else 
            {
                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }

            if (continuar==true) 
            {
                continuar = preguntarContinuar();
            }
        }
    }
    private static boolean preguntarContinuar() 
    {
    	System.out.println("\n1. Ver otro caso");
        System.out.println("2. terminar proceso");
        System.out.print("\n¿Deseas ver otro caso o terminar la operación? (1/2): ");
        int respuesta = scanner.nextInt();
        if (respuesta == 1) 
        {
            return true;
        } 
        else if (respuesta == 2) 
        {
            return false;
        } 
        else 
        {
            System.out.println("\nOpción no válida. Por favor, intenta de nuevo.");
            return preguntarContinuar();
        }
    } 
    private static void iniciarProcesoCompra() 
    {
    	
        Map<String, Pieza> catalogoCompleto = Inventario.getInventario();
        
        mostrarCatalogo();
        
        System.out.print("\nEscoge el id de la pieza que quieras(segun el catalogo mostrado): ");
        String idr = scanner.next();
        
        
        Pieza piezaSeleccionada = catalogoCompleto.get(idr);
        
        // Datos ficticios del comprador para efectos practicos :D
        
        Comprador compradorActual = new Comprador("usuario123", "contraseña", "ID123", "Usuario", "correo@ejemplo.com", 5551234, "Comprador", true, 23.0, 5.0);
        if (piezaSeleccionada != null && piezaSeleccionada.getDisponibilidad()) 
        {
            // Datos ficticios del Administrador para efectos practicos :D
        	
            Administrador admin = new Administrador("admin123", "adminpass", "ADM001", "Admin Nombre", "admin@ejemplo.com", 5554321, "Administrador", true);
            if (admin.verificarCompra(compradorActual, piezaSeleccionada, piezaSeleccionada.getValor())) 
            {
                Compra nuevaCompra = new Compra(piezaSeleccionada, compradorActual, piezaSeleccionada.getValor());
                nuevaCompra.pasarCaja(compradorActual, piezaSeleccionada, "normal");
                
                // Datos ficticios del Cajero para efectos practicos :D
                
                Cajero cajero = new Cajero("cajero123", "cajeropass", "CAJ001", "Cajero Nombre", "cajero@ejemplo.com", 5556789, "Cajero", true);
                if (cajero.verificarSaldo(piezaSeleccionada.getValor(), compradorActual, compradorActual.getMetodoPago(), compradorActual.getDineroActual()) && cajero.verificarLimite(piezaSeleccionada.getValor(), compradorActual)) 
                {
                    cajero.realizarPago(piezaSeleccionada.getValor(), compradorActual, compradorActual.getMetodoPago(),compradorActual.getDineroActual(), piezaSeleccionada);
                    admin.agregarPieza(compradorActual, piezaSeleccionada);
                    System.out.println("Compra realizada con éxito. Gracias por tu compra.");
                } 
                else 
                {
                    System.out.println("No se pudo realizar la compra. Verifica tu saldo o límite de compra.");
                }
            } 
            else 
            {
                System.out.println("La compra no ha sido aprobada por el administrador.");
            }
        } 
        else 
        {
            System.out.println("Lo sentimos, la pieza no está disponible o no existe.");
        }
    }

    private static void iniciarProcesoSubasta() 
    {
        // Datos ficticios para efectos practicos >:(
        Comprador compradorActual = new Comprador("usuario123", "contraseña123", "ID123", "Juan Perez", "juan.perez@example.com", 5551234, "Comprador", true, 100000.0, 50000.0);

        Map<String, Pieza> piezasSubasta = Subasta.getSubasta();
        mostrarPiezasSubasta(piezasSubasta);
        System.out.println(Subasta.getSubasta());

        String idPiezaSeleccionada = "PIEZA001";
        Pieza piezaSeleccionada = piezasSubasta.get(idPiezaSeleccionada);

        if (piezaSeleccionada != null && piezaSeleccionada.getSubasta()) 
        {
            double valorOferta = 30000.0;
            String resultadoOferta = Subasta.generarOferta(compradorActual, piezaSeleccionada, valorOferta);
            System.out.println(resultadoOferta);

            Oferta ofertaGanadora = Subasta.getGanador();
            if (ofertaGanadora != null && ofertaGanadora.getPieza().equals(piezaSeleccionada)) 
            {
                Compra compra = new Compra(piezaSeleccionada, ofertaGanadora.getComprador(), ofertaGanadora.getValorOferta());
                compra.pasarCaja(ofertaGanadora.getComprador(), piezaSeleccionada, "subasta");
                System.out.println("Compra realizada con éxito. La pieza ha sido adjudicada a: " + ofertaGanadora.getComprador().getNombre());
            } 
            else 
            {
                System.out.println("No se ha podido completar la subasta para la pieza seleccionada.");
            }
        } 
        else 
        {
            System.out.println("La pieza seleccionada no está disponible para subasta o no existe.");
        }
    }

    private static void mostrarPiezasSubasta(Map<String, Pieza> piezasSubasta) 
    {
        if (piezasSubasta.isEmpty()) {
            System.out.println("Actualmente no hay piezas disponibles para subasta.");
        } 
        else 
        {
            System.out.println("Piezas Disponibles para Subasta:");
            for (Pieza pieza : piezasSubasta.values())
            {
                System.out.println("ID: " + pieza.getID() + " - Título: " + pieza.getTitulo() +
                " - Autor: " + pieza.getAutor() + " - Valor Mínimo: $" + pieza.getValorMinimoS());
            }
        }
    }


    private static void mostrarCatalogo() 
    {
        Map<String, Pieza> catalogoCompleto = Inventario.getInventario();
        if (catalogoCompleto.isEmpty()) 
        {
            System.out.println("Actualmente no hay piezas disponibles en el catálogo.");
        } 
        else 
        {
            System.out.println("Catálogo de Piezas Disponibles:");
            for (Pieza pieza : catalogoCompleto.values()) 
            {
                System.out.println("ID: " + pieza.getID() + " - Título: " + pieza.getTitulo() +
                " - Autor: " + pieza.getAutor() + " - Año: " + pieza.getAnio() +
                " - Técnica: " + pieza.getTecnica() + " - Precio: $" + pieza.getValor());
            }
        }
    }

}
