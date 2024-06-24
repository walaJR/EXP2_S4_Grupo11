package LibrosBiblioteca;

import ExcepcionesPersonalizadas.LibroNoEncontradoException;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


public class Libro implements Comparable<Libro> {
    
    private String nombreLibro;
    private String autorLibro;
    private int codigoLibro;
    private String estadoLibro;
    int opcionUsuario;
    Scanner teclado = new Scanner(System.in);
    
    public Libro() {
    }

    public Libro(String nombreLibro, String autorLibro, int codigoLibro) {
        this.nombreLibro = nombreLibro;
        this.autorLibro = autorLibro;
        this.codigoLibro = codigoLibro;
    }
    
    
    public Libro(String nombreLibro, String autorLibro, int codigoLibro, String estadoLibro) {
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

    @Override
    public int hashCode() { // SOBRE ESCRITURA DE HASHCODE Y EQUALS. PERMITIRÁ IGNORAR LOS OBJETOS DUPLICADOS DE LA COLECCION HASHSET GUIANDOSE POR SU CÓDIGO.
        int hash = 7;
        hash = 97 * hash + this.codigoLibro;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return this.codigoLibro == other.codigoLibro;
    }

    
    
    public void buscarLibros(List<Libro> librosDuoc) throws LibroNoEncontradoException{ // EXCEPCIÓN PERSONALIZADA 
    
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
                for (Libro libro : librosDuoc) {
                    if (libro.getAutorLibro().equalsIgnoreCase(autorBuscado)) {
                        System.out.println("Nombre Libro: " +libro.getNombreLibro()+ " Código Libro: " +libro.getCodigoLibro()+ " Disponibilidad: " + libro.getEstadoLibro());
                    }
                }   
                break;
            case 2:
                autorBuscado = "Olavey";
                for (Libro libro : librosDuoc) {
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
                for (Libro libro : librosDuoc) {
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
                throw new LibroNoEncontradoException(); // LANZAMIENTO EXCEPCION PERSONALIZADA
                }
                break;
            default:
                System.out.println("Opción no válida. Digite una opción correcta. Ejemplo: 2");
                break;
        }
        
    }
    
    public void ListaLibrosNoDuplicados(HashSet<Libro> librosNoDuplicados) {
    System.out.println("---------------------=== LISTA DE LIBROS BIBLIOTECA DUOC UC ===---------------------");
    System.out.println(" ");
    System.out.println("A continuación, una lista única con todos los libros de la biblioteca: ");
    System.out.println(" ");
        for(Libro libros : librosNoDuplicados) {
            System.out.println("Nombre Libro: "+libros.getNombreLibro());
            System.out.println("Autor Libro: "+libros.getAutorLibro());
            System.out.println("Código Libro: "+libros.getCodigoLibro());
            System.out.println("Disponibilidad: "+libros.getEstadoLibro());
            System.out.println(" ");
            System.out.println("--------------------------------------------------");
        }
    }
    
    public void ListaLibrosOrdenada(TreeSet<Libro> librosOrdenados) {
    System.out.println("---------------------=== LISTA DE LIBROS ORDENADOS POR CODIGO BIBLIOTECA DUOC UC ===---------------------");
    System.out.println(" ");
    System.out.println("A continuación, una lista con los Libros ordenados según su código: ");
    System.out.println(" ");
    for(Libro ordenados : librosOrdenados) {
        System.out.println("Nombre Libro: "+ordenados.getNombreLibro());
        System.out.println("Autor Libro: "+ordenados.getAutorLibro());
        System.out.println("Código Libro: "+ordenados.getCodigoLibro());
        System.out.println("Disponibilidad: "+ordenados.getEstadoLibro());
        System.out.println(" ");
        System.out.println("--------------------------------------------------");
    }
    }

    @Override // SOBRE ESCRIBIMOS EL METODO COMPARETO PARA PODER ORDENAR EL TREE SET MEDIANTE SU CÓDIGO DE LIBRO.
    public int compareTo(Libro o) {
        return codigoLibro - o.codigoLibro;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombreLibro=" + nombreLibro + ", autorLibro=" + autorLibro + ", codigoLibro=" + codigoLibro + ", estadoLibro=" + estadoLibro + '}';
    }
    
    
}
