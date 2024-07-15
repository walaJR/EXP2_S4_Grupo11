package Vehiculo;

import Cliente.Cliente;
import InterfazPago.InterfazPago;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class VehiculoPasajeros extends Vehiculo implements InterfazPago{
    
    private String tipoDeVehiculo;
    private String marcaVehiculo;
    private String modeloVehiculo;
    private String duracionArriendo;
    public static final double VALOR_VEHICULO_PASAJEROS_15_DIAS = 140000;
    public static final double VALOR_VEHICULO_PASAJEROS_30_DIAS = 280000;

    public VehiculoPasajeros(String placaPatente, String tipoVehiculo, String estadoRenta, String tipoDeVehiculo, String marcaVehiculo, String modeloVehiculo) {
        super(placaPatente, tipoVehiculo, estadoRenta);
        this.tipoDeVehiculo = tipoDeVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.modeloVehiculo = modeloVehiculo;
    }
    
    public VehiculoPasajeros(String placaPatente, String tipoVehiculo, String estadoRenta, String duracionArriendo, String tipoDeVehiculo, String marcaVehiculo, String modeloVehiculo) {
        super(placaPatente, tipoVehiculo, estadoRenta);
        this.duracionArriendo = duracionArriendo;
        this.tipoDeVehiculo = tipoDeVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.modeloVehiculo = modeloVehiculo;
    }

    public VehiculoPasajeros() {
        super();
    }
    
    @Override
    public <T extends Vehiculo> void datosVehiculo(ArrayList<T> listaVehiculos) {
        boolean encontrado = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("------------------------- ========== VIOLETA'S RENT A CAR ========== -------------------------");
        System.out.println("Bienvenid@. Este es el mostrador de vehículos.");
        System.out.println("Presione [1] Para ver los datos de un vehículo de pasajeros específico, ingresando su Placa Patente.");
        System.out.println("Presione [2] Para ver los datos de todos los vehículos de pasajeros.");
        int opcionUsuario = teclado.nextInt();
        teclado.nextLine();
        System.out.println("");
        if(opcionUsuario == 1) {
            System.out.println("Por favor ingrese la Placa Patente del vehículo de pasajeros: ");
            String solicitudPatente = teclado.nextLine();
            for(T vehiculo : listaVehiculos) {
                if(vehiculo instanceof VehiculoPasajeros){
                    VehiculoPasajeros vehiculoPasajeros = (VehiculoPasajeros) vehiculo;
                if(solicitudPatente.equalsIgnoreCase(vehiculoPasajeros.getPlacaPatente())){
                    String patente = vehiculoPasajeros.getPlacaPatente();
                    String tipo = vehiculoPasajeros.getTipoVehiculo();
                    String estado = vehiculoPasajeros.getEstadoRenta();
                    String tipoVehiculo = vehiculoPasajeros.getTipoDeVehiculo();
                    String marca = vehiculoPasajeros.getMarcaVehiculo();
                    String modelo = vehiculoPasajeros.getModeloVehiculo();
                    System.out.println("Procesando... Por favor espere unos segundos.");
                    System.out.println("3...");
                        try {
                            Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
                    System.out.println("2...");
                        try {
                            Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
                    System.out.println("1...");
                        try {
                            Thread.sleep(1500);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
                    encontrado = true;
                    System.out.println("Vehículo encontrado con éxito. A continuación sus detalles: ");
                    System.out.println("====");
                    System.out.println("Patente Vehículo: " + patente);
                    System.out.println("Tipo de Vehículo: " + tipo);
                    System.out.println("Estado de Disponibilidad: " + estado);
                        if(estado.equals("No Disponible")){
                            String duracion = vehiculoPasajeros.getDuracionArriendo();
                            System.out.println("Duración del Arriendo: "+duracion);
                        }
                    System.out.println("Tipo de Vehículo de Pasajeros: " + tipoVehiculo);
                    System.out.println("Marca del Vehículo: " + marca);
                    System.out.println("Modelo del Vehículo: " + modelo);
                    System.out.println("====");
                }if(!encontrado){
                    System.out.println("Placa Patente NO encontrada. Por favor, inténtelo otra vez.");
                    return;
                }
                }
            } 
        }if(opcionUsuario == 2) {
            for(T vehiculo : listaVehiculos) {
                if(vehiculo instanceof VehiculoPasajeros){
                    VehiculoPasajeros vehiculoPasajeros = (VehiculoPasajeros) vehiculo;
            String patente = vehiculoPasajeros.getPlacaPatente();
            String tipo = vehiculoPasajeros.getTipoVehiculo();
            String estado = vehiculoPasajeros.getEstadoRenta();
            String tipoVehiculo = vehiculoPasajeros.getTipoDeVehiculo();
            String marca = vehiculoPasajeros.getMarcaVehiculo();
            String modelo = vehiculoPasajeros.getModeloVehiculo();
            System.out.println("Procesando... Por favor espere unos segundos.");
                    System.out.println("3...");
                        try {
                            Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
                    System.out.println("2...");
                        try {
                            Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
                    System.out.println("1...");
                        try {
                            Thread.sleep(1500);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
            System.out.println("Vehículos encontrados con éxito. A continuación todos los detalles: ");
            System.out.println("====");
            System.out.println("Patente Vehículo: " + patente);
            System.out.println("Tipo de Vehículo: " + tipo);
            System.out.println("Estado de Disponibilidad: " + estado);
            if(estado.equals("No Disponible")){
                    String duracion = vehiculoPasajeros.getDuracionArriendo();
                    System.out.println("Duración del Arriendo: "+duracion);
                }
            System.out.println("Tipo de Vehículo de Pasajeros: " + tipoVehiculo);
            System.out.println("Marca del Vehículo: " + marca);
            System.out.println("Modelo del Vehículo: " + modelo);
            System.out.println("====");
         }
        }
                } if(opcionUsuario != 1 && opcionUsuario != 2) {
                    System.out.println("Opción inválida. Intente otra vez. Ejemplo: 1");
        }
    }

    @Override
    public <T extends Vehiculo> void rentarVehiculo(ArrayList<T> listaVehiculos) {
        Scanner teclado = new Scanner(System.in);
        HashMap<Integer, VehiculoPasajeros> mapaArriendo = new HashMap<>();
        
        System.out.println("------------------------- ========== VIOLETA'S RENT A CAR ========== -------------------------");
        System.out.println("Bienvenid@. Este es el sistema de arrendamiento de Vehículos de pasajeros");
        System.out.println("Para iniciar el proceso de arriendo, por favor ingrese la Placa Patente del vehículo de pasajeros: ");
        String solicitudPatente = teclado.nextLine();
        for(T vehiculo : listaVehiculos) {
            if(vehiculo instanceof VehiculoPasajeros){
                VehiculoPasajeros vehiculoPasajeros = (VehiculoPasajeros) vehiculo;
                    if(solicitudPatente.equalsIgnoreCase(vehiculoPasajeros.getPlacaPatente())) {
            
                        System.out.println("Vehículo encontrado. Verificando estado de Disponibilidad...");
                        System.out.println("Procesando Disponibilidad... Por favor espere unos segundos.");
                        System.out.println("3...");
                            try {
                                Thread.sleep(1000);
                                    }catch(InterruptedException e){
                                        System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                            }
                    System.out.println("2...");
                        try {
                            Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
                    System.out.println("1...");
                        try {
                            Thread.sleep(1500);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
                if(vehiculoPasajeros.getEstadoRenta().equals("Disponible")) {
                    System.out.println("Vehículo disponible para su arriendo.");
                    vehiculoPasajeros.setEstadoRenta("No Disponible");
                    Cliente cliente = new Cliente();
                    System.out.println("Para continuar, por favor ingresar Nombre y Apellido del Cliente: ");
                    String nombreCliente = teclado.nextLine();
                    //teclado.nextLine();
                        if(!nombreCliente.isEmpty()){
                            cliente.setNombreCliente(nombreCliente);
                            System.out.println("Por favor, ingrese el RUT del cliente: ");
                            String rutCliente = teclado.nextLine();
                            //teclado.nextLine();
                                if(!rutCliente.isEmpty()) {
                                    cliente.setRutCliente(rutCliente);
                                    int codigo = (int) (Math.random() * 90000); 
                                    cliente.setCodigoVerificacion(codigo);
                                    System.out.println("Seleccione la duración del Arriendo del vehículo: ");
                                    System.out.println("Digite [1] Para Arrendar el vehículo 15 DÍAS");
                                    System.out.println("Digite [2] Para Arrendar el vehículo 30 DÍAS");
                                    int respuesta = teclado.nextInt();
                                    teclado.nextLine();
                                    if(respuesta == 1) {
                                        vehiculoPasajeros.setDuracionArriendo("15 DÍAS");
                                    }
                                    if(respuesta == 2){
                                    vehiculoPasajeros.setDuracionArriendo("30 DÍAS");
                                    }
                                    System.out.println("Usted ha elegido una duración de arriendo de: "+vehiculoPasajeros.getDuracionArriendo());
                                    mapaArriendo.put(cliente.getCodigoVerificacion(), vehiculoPasajeros); // HASHMAP
                                    System.out.println("El código de Verificación del Cliente: " + cliente.getCodigoVerificacion());
                                    System.out.println("Tenga en cuenta que el Código de Verificación será importante para trámites posteriores.");
                                    System.out.println(mapaArriendo.toString());
                                    if(vehiculoPasajeros.getDuracionArriendo().equals("15 DÍAS")){
                                    realizarPago(cliente, VehiculoPasajeros.VALOR_VEHICULO_PASAJEROS_15_DIAS, codigo);
                                    }
                                    if(vehiculoPasajeros.getDuracionArriendo().equals("30 DÍAS")){
                                    realizarPago(cliente, VehiculoPasajeros.VALOR_VEHICULO_PASAJEROS_30_DIAS, codigo);
                                    }                   
                                }else{
                                    System.out.println("RUT Inválido. Por favor ingrese el RUT del Usuario.");
                                    return;
                                }
                            
                            }else{
                                System.out.println("Nombre inválido. Por favor ingrese el nombre y apellido del Usuario. Ejemplo: Jorge Almirón");
                                return;
                            }
                    
                    }else{
                    System.out.println("Vehículo no disponible para su arriendo. El vehículo ya ha sido arrendado previamente.");
                    return;
                    }
                
            }else{
                System.out.println("La Placa Patente del vehículo ingresado no ha sido encontrada. Por favor intente nuevamente.");
                return;
            }
            }
        }
        
    }
    
    @Override
    public void realizarPago(Cliente cliente, double monto, int codigo) {
        String nombreCliente = cliente.getNombreCliente();
        String rut = cliente.getRutCliente();
        double montoo = monto;
        double total = montoo + (montoo * InterfazPago.IVA);
        double totalFinal = total - (total * InterfazPago.DESCUENTO_PASAJEROS);
        
        System.out.println("------------------------ ========== VIOLETA'S RENT A CAR ========== -------------------------");
        System.out.println("------------------ ¡GRACIAS POR ARRENDAR TU VEHÍCULO EN VIOLETA'S! ------------------ ");
        System.out.println("---------------------------- El resumen de tu compra ----------------------------");
        System.out.println("=============================================================================================");
        System.out.println("------------------- NOMBRE CLIENTE: " + nombreCliente + "-------------------");
        System.out.println("-------------------------- RUT CLIENTE: " + rut + "--------------------------");
        System.out.println("--------------------- CODIGO DE VERIFICACION: " + codigo + "---------------------");
        System.out.println("=============================================================================================");
        System.out.println("---------------------------- TOTAL SIN IVA: $ " + montoo + "----------------------------");
        System.out.println("---------------------------- TOTAL CON IVA: $ " + total + "----------------------------");
        System.out.println("--------------- TOTAL CON DESCUENTO VIOLETA'S CARGO : $ " + totalFinal + "---------------");
        System.out.println("=============================================================================================");
        System.out.println("-------------------------- TOTAL BOLETA: $ " + totalFinal + "--------------------------");
        System.out.println("=============================================================================================");
        System.out.println("-------------------------- ¡MUCHAS GRACIAS POR PREFERIRNOS --------------------------");
        System.out.println("------------------------ ========== VIOLETA'S RENT A CAR ========== -------------------------");
    }
    
    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public String getDuracionArriendo() {
        return duracionArriendo;
    }

    public void setDuracionArriendo(String duracionArriendo) {
        this.duracionArriendo = duracionArriendo;
    }

    
    
    @Override
    public String toString() {
        return "VehiculoPasajeros: " + "tipoDeVehiculo=" + tipoDeVehiculo + ", marcaVehiculo=" + marcaVehiculo + ", modeloVehiculo=" + modeloVehiculo;
    }

    
}
