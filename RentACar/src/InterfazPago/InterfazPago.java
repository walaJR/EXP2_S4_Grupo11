package InterfazPago;

import Cliente.Cliente;


public interface InterfazPago {
    
    public static final double IVA = 0.19;
    public static final double DESCUENTO_CARGA = 0.03;
    public static final double DESCUENTO_PASAJEROS = 0.07;
    
    public abstract void realizarPago(Cliente cliente, double monto, int codigo);
    
}
