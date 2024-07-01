package Mensajes;

import Empleados.Empleado;

public class Mensaje {
    
    private Empleado empleado;
    private String mensajeEncriptado;
    private int claveEncriptado;
    private String fechaActual;

    public Mensaje(Empleado empleado, String mensajeEncriptado, int claveEncriptado, String fechaActual) {
        this.empleado = empleado;
        this.mensajeEncriptado = mensajeEncriptado;
        this.claveEncriptado = claveEncriptado;
        this.fechaActual = fechaActual;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public String getMensajeEncriptado() {
        return mensajeEncriptado;
    }

    public int getClaveEncriptado() {
        return claveEncriptado;
    }

    public String getFechaActual() {
        return fechaActual;
    }
    
    
}
