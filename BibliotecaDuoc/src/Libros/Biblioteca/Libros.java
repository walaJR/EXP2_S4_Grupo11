package Libros.Biblioteca;
import Excepciones.Biblioteca.ExcepcionLibroNoEncontrado;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Libros {
    
    private String nombreLibro;
    private String autorLibro;
    private int codigoLibro;
    private String estadoLibro;
    int opcionUsuario;
    Scanner teclado = new Scanner(System.in);
    
    public Libros() {
    }
    
    public Libros(String nombreLibro, String autorLibro, int codigoLibro, String estadoLibro) {
        this.nombreLibro = nombreLibro;
        this.autorLibro = autorLibro;
        this.codigoLibro = codigoLibro;
        this.estadoLibro = estadoLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public String getEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(String estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    
    public void buscarLibros(List<Libros> librosDuoc) throws ExcepcionLibroNoEncontrado{ // EXCEPCIÓN PERSONALIZADA 
    
        System.out.println("----------== Bienvenido al Buscador de Libros ==----------");
        System.out.println("Por favor DIGITE la opción deseada.");
        System.out.println("[1] Para BUSCAR los Libros del Autor: Violeta Escritora");
        System.out.println("[2] Para BUSCAR los Libros del Autor: Olavey");
        System.out.println("[3] Para BUSCAR OTROS Libros");
        try {
        opcionUsuario = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("INVÁLIDO. Debes ingresar un número. Ejemplo: 1");
            System.out.println(e.getClass());
            teclado.nextLine();
        }
        String autorBuscado = "";
        switch (opcionUsuario) {
            case 1:
                autorBuscado = "Violeta Escritora";
                for (Libros libro : librosDuoc) {
                    if (libro.getAutorLibro().equalsIgnoreCase(autorBuscado)) {
                        System.out.println("Nombre Libro: " +libro.getNombreLibro()+ " Código Libro: " +libro.getCodigoLibro()+ " Disponibilidad: " + libro.getEstadoLibro());
                    }
                }   
                break;
            case 2:
                autorBuscado = "Olavey";
                for (Libros libro : librosDuoc) {
                    if (libro.getAutorLibro().equalsIgnoreCase(autorBuscado)) {
                        System.out.println("Nombre Libro: " +libro.getNombreLibro()+ " Código Libro: " +libro.getCodigoLibro()+ " Disponibilidad: " + libro.getEstadoLibro());
                    }
                }   
                break;
            case 3:
                teclado.nextLine();
                boolean encontrado = false;
                System.out.println("Por favor ingrese el título del Libro que usted desea buscar: ");
                String busquedaUsuario = teclado.nextLine();
                for (Libros libro : librosDuoc) {
                    if (libro.getNombreLibro().equalsIgnoreCase(busquedaUsuario)) {
                        System.out.println("¡Libro Encontrado!");
                        System.out.println("Nombre Libro: "+libro.getNombreLibro());
                        System.out.println("Código Libro: "+libro.getCodigoLibro());
                        System.out.println("Disponibilidad: "+libro.getEstadoLibro());
                        encontrado = true;
                        break;
                    } 
                }
                if (!encontrado) {
                throw new ExcepcionLibroNoEncontrado(); // LANZAMIENTO EXCEPCION PERSONALIZADA
                }
                break;
            default:
                System.out.println("Opción no válida. Digite una opción correcta. Ejemplo: 2");
                break;
        }
        
    }
    
    
}
