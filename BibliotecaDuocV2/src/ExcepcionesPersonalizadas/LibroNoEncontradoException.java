package ExcepcionesPersonalizadas;


public class LibroNoEncontradoException extends Exception {
    
    public LibroNoEncontradoException(){
    }
    
    public LibroNoEncontradoException (String msj_error) {
    super(msj_error);
    }
    
}
