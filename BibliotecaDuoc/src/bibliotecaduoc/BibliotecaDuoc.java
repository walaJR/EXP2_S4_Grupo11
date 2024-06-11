package bibliotecaduoc;

import Excepciones.Biblioteca.ExcepcionLibroNoEncontrado;
import Excepciones.Biblioteca.LibroYaPrestadoExcepcion;
import Libros.Biblioteca.Libros;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BibliotecaDuoc {

    static int codigoPrestamo;
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void prestamoLibro(List<Libros> bibliotecaDuoc) throws LibroYaPrestadoExcepcion { // EXCEPCION PERSONALIZADA
        teclado.nextLine();
        System.out.println("---------------------=== PRESTAMO DE LIBROS BIBLIOTECA DUOC UC ===---------------------");
        System.out.println("A continuación los Libros para prestamos: ");
        System.out.println(" ");
        for (Libros libro : bibliotecaDuoc) {
            System.out.println("----------------------------------------");
            System.out.println("Nombre Libro: "+libro.getNombreLibro());
            System.out.println("Autor: "+libro.getAutorLibro());
            System.out.println("Código: "+libro.getCodigoLibro());
            System.out.println("Disponibilidad: "+libro.getEstadoLibro());
             }
        System.out.println(" ");
        System.out.println("Si alguno de estos libros es de tu interés y deseas su préstamo, digita a continuación el Código del Libro que deseas:");
        try {
        codigoPrestamo = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("INVÁLIDO. Debes ingresar un número. Ejemplo: 1");
            System.out.println(e.getClass());
            teclado.nextLine();
        }
        boolean libroEncontrado = false;
        for (Libros libro : bibliotecaDuoc) {
        if (codigoPrestamo == libro.getCodigoLibro()) {
            libroEncontrado = true;
            if ("Ocupado".equalsIgnoreCase(libro.getEstadoLibro())) {
                throw new LibroYaPrestadoExcepcion(); // LANZAMIENTO EXCEPCION PERSONALIZADA
            } else {
            System.out.println("El Libro que has seleccionado para su prestamo: ");
            System.out.println("Nombre Libro: "+libro.getNombreLibro());
            System.out.println("Autor: "+libro.getAutorLibro());
            System.out.println("Código: "+libro.getCodigoLibro());
            System.out.println("3...");
            System.out.println("2...");
            System.out.println("1...");
            System.out.println("¡El Préstamo de tu Libro ha sido registrado exitosamente!");
            System.out.println("El prestamo del Libro tiene una duración de 1 mes. Finalizado el plazo, debes devolverlo a la Biblioteca de Duoc UC.");
            System.out.println("Gracias! Disfruta tu lectura y/o estudio.");
            libro.setEstadoLibro("Ocupado");
            break;
            }
        } 
        } 
        if (!libroEncontrado) {
            System.out.println("Libro no encontrado.");
        }
    }
    public static void main(String[] args) {
        
        int opcionUsuarioMain = 0;
        
        List<Libros> bibliotecaDuoc = new ArrayList<>();
        Libros biblioteca = new Libros();
        
        Libros libro1 = new Libros("La vida de un gato: Violeta miau", "Olavey", 2021, "Disponible");
        bibliotecaDuoc.add(libro1);
        Libros libro2 = new Libros("Violeta: Felina Salvaje", "Olavey", 20211994, "Disponible");
        bibliotecaDuoc.add(libro2);
        Libros libro3 = new Libros("Violeta recomienda: Churus", "Violeta Escritora", 20212021, "Disponible");
        bibliotecaDuoc.add(libro3);
        Libros libro4 = new Libros("Violeta recomienda: Atun en lata", "Violeta Escritora", 202120211, "Disponible");
        bibliotecaDuoc.add(libro4);
        Libros libro5 = new Libros("Violeta recomienda: Alimentos humedos", "Violeta Escritora", 20211, "Disponible");
        bibliotecaDuoc.add(libro5);
        Libros libro6 = new Libros("Violeta NO recomienda: Los Veterinarios", "Violeta Escritora", 2024, "Disponible");
        bibliotecaDuoc.add(libro6);
        Libros libro7 = new Libros("Violeta NO recomienda: Bañarse, miau", "Violeta Escritora", 20242021, "Disponible");
        bibliotecaDuoc.add(libro7);
        Libros libro8 = new Libros("Violeta y mi humano Sebastian", "Violeta Escritora", 20211994, "Disponible");
        bibliotecaDuoc.add(libro8);
        Libros libro9 = new Libros("Violeta te amare por siempre", "Olavey", 19942021, "Disponible");
        bibliotecaDuoc.add(libro9);
        
        do {
        
        System.out.println(" -----------------------=== BIBLIOTECA DUOC UC -----------------------===");
        System.out.println("Bienvenido a nuestra Biblioteca. Por favor, digite la opción deseada: ");
        System.out.println("[1] Para BUSCAR Libros en nuestra Biblioteca DUOC UC");
        System.out.println("[2] Para PEDIR PRESTADO Libros disponibles en nuestra Biblioteca DUOC UC");
        System.out.println("[3] Para SALIR");
        try {
        opcionUsuarioMain = teclado.nextInt();
        } catch (InputMismatchException e) { // MANEJO DE EXCEPCIÓN INPUTMISMATCHEXCEPTION
            System.out.println("INVÁLIDO. Debes ingresar un número. Ejemplo: 1");
            System.out.println(e.getClass());
            teclado.nextLine();
            continue;
        }
        switch (opcionUsuarioMain) {
        
            case 1: 
                try {
                biblioteca.buscarLibros(bibliotecaDuoc);
                } catch (ExcepcionLibroNoEncontrado ex) { // TRY CATCH MANEJO DE EXCEPCION PERSONALIZADA
                    System.out.println("El Libro buscado no ha sido encontrado en la Biblioteca de DuocUC.");
                    ex.printStackTrace();
                }
                break;
                
            case 2: 
                try {
                prestamoLibro(bibliotecaDuoc);
                } catch (LibroYaPrestadoExcepcion e) { // TRY CATCH MANEJO DE EXCEPCION PERSONALIZADA
                    System.out.println("Error. El libro que solicitas, ya ha sido solicitado previamente.");
                    e.printStackTrace();
                }
                break;
            
            case 3:
                System.out.println("Saliendo... Gracias por usar Biblioteca Duoc UC.");
        }
        } while (opcionUsuarioMain !=3);
        
       teclado.close(); 
    }
    
}
