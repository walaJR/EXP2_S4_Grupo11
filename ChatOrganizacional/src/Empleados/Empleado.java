package Empleados;

import EncriptacionMensajes.Encriptacion;
import Mensajes.Mensaje;
import NumerosPrimos.GeneradorNumeroPrimo;
import NumerosPrimos.PrimeList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Empleado {
    
    private String nombreApellido;
    private String cargo;
    private int idEmpleado;
    private String mensaje;
    private String mensajeEncriptado;
    private String fechaActual;
    private int claveEncriptado;
    
    public static HashMap <Integer, Mensaje> listaMensajesEncriptados = new HashMap<>();
    
public void mensajeEmpleado(ArrayList<Empleado> listaEmpleados) {

    Scanner teclado = new Scanner(System.in);
    
    System.out.println("-------------------- CHAT ORGANIZACIONAL PRIME SECURE COMPANY --------------------");
    System.out.println(" ");
    System.out.println("Para Continuar, por favor ingrese su ID de Empleado.");
    int id = teclado.nextInt();
    teclado.nextLine();
    for(Empleado e : listaEmpleados) {
    if (id == e.getIdEmpleado()){
        setNombreApellido(e.getNombreApellido());
        setCargo(e.getCargo());
        setIdEmpleado(e.getIdEmpleado());
        System.out.println("¡Bienvenido, " + e.getNombreApellido()+" !");
        System.out.println("Este es el Sistema interno de Mensajería, destinado para todos los trabajadores inscritos.");
        System.out.println("La ENCRIPTACIÓN de tus mensajes está activada, para una óptima seguridad.");
        System.out.println("Por favor, deja tu mensaje: ");
        String message = teclado.nextLine();
        if (!message.isEmpty()) {
        setMensaje(message);
        String finalDate = fechaAct();
        setFechaActual(finalDate);
        PrimeList numeroPrimo = GeneradorNumeroPrimo.generadorPrimos(10000); // Creamos un Array Prime List con todos los numeros primos que hayan entre 2 y 9999
        int clave = numeroPrimo.get((int) (Math.random() * numeroPrimo.size())); // Creamos la clave de ENCRIPTACIÓN. La Clave está hecha a partir de un numero primo al azar del Prime List.
        setClaveEncriptado(clave);
        String mensajeEncriptadoo = Encriptacion.encriptacion(getMensaje(), getClaveEncriptado());
        setMensajeEncriptado(mensajeEncriptadoo);
        Mensaje nuevoMensaje = new Mensaje(e, mensajeEncriptadoo, getClaveEncriptado(), finalDate);
            System.out.println("Mensaje enviado con éxito.");
            System.out.println("Tu mensaje: "+getMensaje());
            System.out.println("Tu mensaje Encriptado: " + getMensajeEncriptado());
            System.out.println("Fecha: "+getFechaActual());
            System.out.println("------------------------------------------------------");
            System.out.println("Tu CLAVE de Encriptación: "+getClaveEncriptado());
            System.out.println("------------------------------------------------------");
            System.out.println("Recuerda que para Desencriptar un mensaje, necesitarás tu CLAVE de Encriptación.");
            System.out.println(" ");
            Empleado.listaMensajesEncriptados.put(getClaveEncriptado(), nuevoMensaje);
        } else {
            System.out.println("No puedes enviar un mensaje vacío. Por favor, ingresa un mensaje.");
        }
}
    }
}    
    

public void mensajesDesencriptados(HashMap <Integer, Mensaje> listaEncriptados) {

    Scanner teclado = new Scanner(System.in);
    
    System.out.println("-------------------- CHAT ORGANIZACIONAL PRIME SECURE COMPANY --------------------");
    System.out.println(" ");
    System.out.println("Para ver los mensajes Encriptados, por favor ingrese la CLAVE de Encriptación de dicho mensaje.");
    int verificacion = teclado.nextInt();
    teclado.nextLine();
    Mensaje mensaje = listaMensajesEncriptados.get(verificacion);
    if(mensaje != null) {
            Empleado empleado = mensaje.getEmpleado();
            String msjDesencriptado = Encriptacion.desencriptacion(mensaje.getMensajeEncriptado(), mensaje.getClaveEncriptado());
            System.out.println("Clave de Encriptación: " + mensaje.getClaveEncriptado());
            System.out.println("El Mensaje Encriptado: " + mensaje.getMensajeEncriptado());
            System.out.println("El Mensaje Desencriptado: "+msjDesencriptado);
            System.out.println("Fecha del Mensaje: " + mensaje.getFechaActual());
            System.out.println("El usuario que realizó el mensaje: " + empleado.getNombreApellido());
            System.out.println("El cargo: " + empleado.getCargo());
            System.out.println("El ID de Empleado Prime Secure: " + empleado.getIdEmpleado());
            System.out.println(" ");
    } else {
        System.out.println("Clave de Encriptación inválida.");
    }
        
}

public void todosLosMensajes(HashMap <Integer, Mensaje> listaEncriptados) {
    
    System.out.println("-------------------- CHAT ORGANIZACIONAL PRIME SECURE COMPANY --------------------");
    System.out.println(" ");
    System.out.println("Todos los mensajes Encriptados enviados en PrimeSecure: ");
    
    for (Map.Entry<Integer, Mensaje> entrada : Empleado.listaMensajesEncriptados.entrySet()) {
        Integer key = entrada.getKey();
        Mensaje mensaje = entrada.getValue();
        Empleado empleado = mensaje.getEmpleado();
            System.out.println("Clave de Encriptación: " + key);
            System.out.println("El Mensaje Encriptado: " + mensaje.getMensajeEncriptado());
            System.out.println("Fecha del Mensaje: " + mensaje.getFechaActual());
            System.out.println("El usuario que realizó el mensaje: " + empleado.getNombreApellido());
            System.out.println("El cargo: " + empleado.getCargo());
            System.out.println("El ID de Empleado Prime Secure: " + empleado.getIdEmpleado());
            System.out.println(" ");
        }
    System.out.println("Si deseas Desencriptar un mensaje en particular, deberás hacerlo con su respectiva Clave de Encriptación.");
    System.out.println(" ");
}

public String fechaAct() {

    LocalDateTime fecha  = LocalDateTime.now();
    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String fechaFinal = fecha.format(formatoFecha);
    return fechaFinal;
}
    
    public Empleado() {
    }

    public Empleado(String nombreApellido, String cargo, int idEmpleado) {
        this.nombreApellido = nombreApellido;
        this.cargo = cargo;
        this.idEmpleado = idEmpleado;
    }

    public int getClaveEncriptado() {
        return claveEncriptado;
    }

    public void setClaveEncriptado(int claveEncriptado) {
        this.claveEncriptado = claveEncriptado;
    }

    public String getMensajeEncriptado() {
        return mensajeEncriptado;
    }

    public void setMensajeEncriptado(String mensajeEncriptado) {
        this.mensajeEncriptado = mensajeEncriptado;
    }

    
    
    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(String fechaActual) {
        this.fechaActual = fechaActual;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    
    
}
