package Model;


public interface Command {
    
    public void ejecutar(int total, boolean[] booleanDescuento); // Aquí se encapsulan y aplican los descuentos de los decorators
    
}
