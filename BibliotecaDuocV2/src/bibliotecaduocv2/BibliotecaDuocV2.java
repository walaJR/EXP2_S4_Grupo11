package bibliotecaduocv2;

import ExcepcionesPersonalizadas.LibroNoEncontradoException;
import ExcepcionesPersonalizadas.LibroYaPrestadoException;
import LibrosBiblioteca.Libro;
import UsuariosDuoc.Usuario;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import lecturaCSV.Lectura;

public class BibliotecaDuocV2 {

    
    public static void main(String[] args) {
        
        int opcionUsuarioMain = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        List<Libro> bibliotecaDuoc = new ArrayList<>();
        Libro biblioteca = new Libro();
        Usuario usuarioBiblioteca = new Usuario();
        HashSet<Libro> listaNoDuplicados = new HashSet<>();
        TreeSet<Libro> listaOrdenada = new TreeSet<>();
        
        Libro libro1 = new Libro("La vida de un gato: Violeta miau", "Olavey", 2021, "Disponible");
        bibliotecaDuoc.add(libro1);
        listaNoDuplicados.add(libro1);
        listaOrdenada.add(libro1);
        Libro libro2 = new Libro("Violeta: Felina Salvaje", "Olavey", 20211994, "Disponible");
        bibliotecaDuoc.add(libro2);
        listaNoDuplicados.add(libro2);
        listaOrdenada.add(libro2);
        Libro libro3 = new Libro("Violeta recomienda: Churus", "Violeta Escritora",20212021, "Disponible");
        bibliotecaDuoc.add(libro3);
        listaNoDuplicados.add(libro3);
        listaOrdenada.add(libro3);
        Libro libro4 = new Libro("Violeta recomienda: Atun en lata", "Violeta Escritora", 202120211, "Disponible");
        bibliotecaDuoc.add(libro4);
        listaNoDuplicados.add(libro4);
        listaOrdenada.add(libro4);
        Libro libro5 = new Libro("Violeta recomienda: Alimentos humedos", "Violeta Escritora", 20211, "Disponible");
        bibliotecaDuoc.add(libro5);
        listaNoDuplicados.add(libro5);
        listaOrdenada.add(libro5);
        Libro libro6 = new Libro("Violeta NO recomienda: Los Veterinarios", "Violeta Escritora", 2024, "Disponible");
        bibliotecaDuoc.add(libro6);
        listaNoDuplicados.add(libro6);
        listaOrdenada.add(libro6);
        Libro libro7 = new Libro("Violeta NO recomienda: Bañarse, miau", "Violeta Escritora", 20242021, "Disponible");
        bibliotecaDuoc.add(libro7);
        listaNoDuplicados.add(libro7);
        listaOrdenada.add(libro7);
        Libro libro8 = new Libro("Violeta y mi humano Sebastian", "Violeta Escritora", 20211994, "Disponible");
        bibliotecaDuoc.add(libro8);
        listaNoDuplicados.add(libro8);
        listaOrdenada.add(libro8);
        Libro libro9 = new Libro("Violeta te amare por siempre", "Olavey", 19942021, "Disponible");
        bibliotecaDuoc.add(libro9);
        listaNoDuplicados.add(libro9);
        listaOrdenada.add(libro9);
        
        do {
        
        System.out.println(" -----------------------=== BIBLIOTECA DUOC UC -----------------------===");
        System.out.println("Bienvenido a nuestra Biblioteca. Por favor, digite la opción deseada: ");
        System.out.println("[1] Para BUSCAR Libros en nuestra Biblioteca DUOC UC"); // ArrayList de Libros
        System.out.println("[2] Para VER la lista de Libros actualizada"); // HashSet - Libros No Duplicados
        System.out.println("[3] Para VER la lista de Libros ORDENADA por su Código."); // TreeSet Ordenado según Código de Libro
        System.out.println("[4] Para PEDIR PRESTADO Libros disponibles en nuestra Biblioteca DUOC UC"); // Creación del Usuario y del Archivo TXT
        System.out.println("[5] Para VER la lista de Usuarios que tienen préstamos de libros vigentes"); // HashMap de Usuarios
        System.out.println("[6] Para LEER Archivo CSV"); // Lectura archivos CSV y creación del objeto a partir del CSV
        System.out.println("[7] Para SALIR");
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
                } catch (LibroNoEncontradoException ex) { // TRY CATCH MANEJO DE EXCEPCION PERSONALIZADA
                    System.out.println("El Libro buscado no ha sido encontrado en la Biblioteca de DuocUC.");
                }
                break;
                
            case 2: 
                biblioteca.ListaLibrosNoDuplicados(listaNoDuplicados);
                break;
                
            case 3:
                biblioteca.ListaLibrosOrdenada(listaOrdenada);
                break;
                
            case 4: 
                try {
                usuarioBiblioteca.prestamoLibro(bibliotecaDuoc);
                } catch (LibroYaPrestadoException e) { // TRY CATCH MANEJO DE EXCEPCION PERSONALIZADA
                    System.out.println("Error. El libro que solicitas, ya ha sido solicitado previamente.");
                }
                break;
            
            case 5: 
                usuarioBiblioteca.listaUsuariosPrestamo(Usuario.listaUsuarios);
                break;
                
            case 6:
                Lectura.lecturaLibros("Libros.csv");
                break;
                
            case 7:
                System.out.println("Saliendo... Gracias por usar Biblioteca Duoc UC.");
                break;
            default:
                System.out.println("Opción inválida. Por favor digite una opción válida. Ejemplo: 1.");
                return;
        }
        } while (opcionUsuarioMain !=7);
        
       teclado.close();
    } 
     
}
