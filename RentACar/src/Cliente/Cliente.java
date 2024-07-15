package Cliente;


public class Cliente {
    
    private String nombreCliente;
    private String rutCliente;
    private int codigoVerificacion;

    public Cliente() {
    }

    public Cliente(String nombreCliente, String rutCliente, int codigoVerificacion, String metodoPago) {
        this.nombreCliente = nombreCliente;
        this.rutCliente = rutCliente;
        this.codigoVerificacion = codigoVerificacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public int getCodigoVerificacion() {
        return codigoVerificacion;
    }

    public void setCodigoVerificacion(int codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }


    @Override
    public String toString() {
        return "Cliente:" + "nombreCliente=" + nombreCliente + ", rutCliente=" + rutCliente + ", codigoVerificacion=" + codigoVerificacion;
    }
    
    
    
}
