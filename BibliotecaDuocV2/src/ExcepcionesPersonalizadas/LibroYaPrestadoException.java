package ExcepcionesPersonalizadas;


public class LibroYaPrestadoException extends Exception{
    
    public LibroYaPrestadoException(){
    }
    
    public LibroYaPrestadoException(String msj_error) {
    super(msj_error);
    }
}
