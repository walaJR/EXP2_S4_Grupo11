package UsuariosDuoc;

import ExcepcionesPersonalizadas.LibroYaPrestadoException;
import LibrosBiblioteca.Libro;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Usuario {
    
    private String nombre_usuario;
    private static int codigo_prestamo;
    int codigoPrestamo;
    
    Scanner teclado = new Scanner(System.in);
    public static HashMap<Integer, Usuario> listaUsuarios = new HashMap<>();
    
    public Usuario() {
        
    }

    public Usuario(String nombre_usuario, int codigo_prestamo) {
        this.nombre_usuario = nombre_usuario;
        Usuario.codigo_prestamo = codigo_prestamo;
    }
    
    public void prestamoLibro(List<Libro> bibliotecaDuoc) throws LibroYaPrestadoException { // EXCEPCION PERSONALIZADA
        System.out.println("---------------------=== PRESTAMO DE LIBROS BIBLIOTECA DUOC UC ===---------------------");
        System.out.println("A continuación los Libros para prestamos: ");
        System.out.println(" ");
        for (Libro libro : bibliotecaDuoc) {
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
            System.out.println("INVÁLIDO. Debes ingresar un número. Ejemplo: 2024");
            System.out.println(e.getClass());
            teclado.nextLine();
        }
        boolean libroEncontrado = false;
        for (Libro libro : bibliotecaDuoc) {
        if (codigoPrestamo == libro.getCodigoLibro()) {
            libroEncontrado = true;
            if ("Ocupado".equalsIgnoreCase(libro.getEstadoLibro())) {
                throw new LibroYaPrestadoException(); // LANZAMIENTO EXCEPCION PERSONALIZADA
            } else {
            System.out.println("El Libro que has seleccionado para su prestamo: ");
            System.out.println("Nombre Libro: "+libro.getNombreLibro());
            System.out.println("Autor: "+libro.getAutorLibro());
            System.out.println("Código: "+libro.getCodigoLibro());
            System.out.println("Para finalizar el préstamo del Libro, por favor escribe tu Nombre y Apellido: ");
            teclado.nextLine();
            String nombreUsuario = teclado.nextLine();
                if (nombreUsuario != "") {
                    int codigoPrestamo2 = 100000 + (int) (Math.random() * 900000);
                    setCodigo_prestamo(codigoPrestamo2);
                    setNombre_usuario(nombreUsuario);
                    System.out.println("3...");
                    System.out.println("2...");
                    System.out.println("1...");
                    System.out.println("¡El Préstamo de tu Libro ha sido registrado exitosamente!");
                    System.out.println("Tu Código de Prestamo: " + getCodigo_prestamo());
                    System.out.println("El prestamo del Libro tiene una duración de 1 mes. Finalizado el plazo, debes devolverlo a la Biblioteca de Duoc UC.");
                    System.out.println("Gracias! Disfruta tu lectura y/o estudio.");
                    libro.setEstadoLibro("Ocupado");
                    Usuario.listaUsuarios.put(getCodigo_prestamo(), new Usuario(nombreUsuario, getCodigo_prestamo()));
                    try(BufferedWriter bw = new BufferedWriter(new FileWriter("DatosUsuarios.txt", true))) { // GUARDAMOS AL USUARIO EN EL ARCHIVO TXT
                    bw.newLine();
                    bw.write(toString());
                    bw.newLine();
                    bw.write("\nNombre del Libro solicitado: ");
                    bw.write(libro.getNombreLibro());
                    bw.newLine();
                    bw.write("\n========================================");
                    bw.newLine();
                    }catch(IOException excep) {
                    
                    }
                    break;
            } else {
                    System.out.println("Debes ingresar tu Nombre y Apellido");
                }
            }
        } 
        } 
        if (!libroEncontrado) {
            System.out.println("Libro no encontrado.");
        }
    }
    
    public void listaUsuariosPrestamo (HashMap<Integer, Usuario> listaDeUsuarios) {
        System.out.println("---------------------=== LISTA DE USUARIOS CON PRESTAMOS EN CURSO BIBLIOTECA DUOC UC ===---------------------");
        System.out.println(" ");
        System.out.println("A continuación, una lista con todos los usuarios los cuales mantienen prestamos activos en nuestra biblioteca: ");
        for (Map.Entry<Integer, Usuario> entrada : listaDeUsuarios.entrySet()) {
        Integer key = entrada.getKey();
        Usuario value = entrada.getValue();
        
            System.out.println("codigo de prestamo: "+key+" Nombre y Apellido Usuario: "+value.getNombre_usuario());
        
        }
    }
    
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getCodigo_prestamo() {
        return Usuario.codigo_prestamo;
    }

    public void setCodigo_prestamo(int codigo_prestamo) {
        Usuario.codigo_prestamo = codigo_prestamo;
    }

    @Override
    public String toString() {
        return "Nombre usuario prestamo: " + getNombre_usuario() + ", Codigo de prestamo: " + getCodigo_prestamo();
    }
    
    
    
}
