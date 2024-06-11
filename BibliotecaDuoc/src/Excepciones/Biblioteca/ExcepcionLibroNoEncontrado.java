package Excepciones.Biblioteca;

public class ExcepcionLibroNoEncontrado extends Exception {
    
    public ExcepcionLibroNoEncontrado(){
    }
    
    public ExcepcionLibroNoEncontrado (String msj_error) {
    super(msj_error);
    }
    
}
