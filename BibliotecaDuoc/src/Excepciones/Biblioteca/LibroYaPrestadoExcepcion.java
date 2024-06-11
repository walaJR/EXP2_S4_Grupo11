package Excepciones.Biblioteca;


public class LibroYaPrestadoExcepcion extends Exception{
    
    public LibroYaPrestadoExcepcion(){
    }
    
    public LibroYaPrestadoExcepcion(String msj_error) {
    super(msj_error);
    }
}
