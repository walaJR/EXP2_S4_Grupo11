package Vehiculo;

import java.util.ArrayList;


public abstract class Vehiculo extends Thread{
    
    private String placaPatente;
    private String tipoVehiculo;
    private String estadoRenta;

    public Vehiculo() {
    }

    public Vehiculo(String placaPatente, String tipoVehiculo, String estadoRenta) {
        this.placaPatente = placaPatente;
        this.tipoVehiculo = tipoVehiculo;
        this.estadoRenta = estadoRenta;
    }
    

    public String getPlacaPatente() {
        return placaPatente;
    }

    public void setPlacaPatente(String placaPatente) {
        this.placaPatente = placaPatente;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getEstadoRenta() {
        return estadoRenta;
    }

    public void setEstadoRenta(String estadoRenta) {
        this.estadoRenta = estadoRenta;
    }
    
    public abstract <T extends Vehiculo> void datosVehiculo(ArrayList<T> listaVehiculos);
    public abstract <T extends Vehiculo> void rentarVehiculo(ArrayList<T> listaVehiculos);
    
}
