package AgregarVehiculos;

import Vehiculo.VehiculoCarga;
import Vehiculo.VehiculoPasajeros;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class AgregarVehiculo extends Thread{
    
    private ArrayList<VehiculoCarga> listaVehiculosCarga;
    private ArrayList<VehiculoPasajeros> listaVehiculoPasajeros;

    public AgregarVehiculo(ArrayList<VehiculoCarga> listaVehiculosCarga, ArrayList<VehiculoPasajeros> listaVehiculoPasajeros) {
        this.listaVehiculosCarga = listaVehiculosCarga;
        this.listaVehiculoPasajeros = listaVehiculoPasajeros;
    }
    
    
    @Override
    public synchronized void run(){
        Scanner teclado = new Scanner(System.in);
        int opcionUsuario = 0;
                
        System.out.println("------------------------- ========== VIOLETA'S RENT A CAR ========== -------------------------");
        System.out.println("");
        System.out.println("Digite [1] Para agregar un vehículo a la división CARGA");
        System.out.println("Digite [2] Para agregar un vehículo a la división PASAJEROS");
        try{
        opcionUsuario = teclado.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Opción inválida. Por favor ingrese una opción válida. Ejemplo: 1");
            return;
        }
        teclado.nextLine();
        
        if(opcionUsuario == 1){
        System.out.println("Para agregar un vehículo, por favor ingrese su Placa Patente: ");
        String ingresoPatente = teclado.nextLine();
        boolean existe = false;
        synchronized (listaVehiculosCarga){
        for(VehiculoCarga vehiculoCarga : listaVehiculosCarga){
        if(ingresoPatente.equalsIgnoreCase(vehiculoCarga.getPlacaPatente())){
            existe = true;
            break;
        }
        }
        if(!existe){
            VehiculoCarga vCarga = new VehiculoCarga();
            vCarga.setEstadoRenta("Disponible");
            vCarga.setPlacaPatente(ingresoPatente);
            vCarga.setTipoVehiculo("Vehículo de Carga");
            System.out.println("Ingrese la MARCA del vehículo: ");
            String marca = teclado.nextLine();
            vCarga.setMarcaVehiculo(marca);
            System.out.println("Ingrese el MODELO del vehículo: ");
            String modelo = teclado.nextLine();
            vCarga.setModeloVehiculo(modelo);
            System.out.println("Ingrese la cantidad de KG de carga, y detalles adicionales. Ejemplo: 2500KG Doble Eje");
            String caracteristicas = teclado.nextLine();
            vCarga.setTipoDeCarga(caracteristicas);
            listaVehiculosCarga.add(vCarga);
            System.out.println("Añadiendo Vehículo... ...Procesando... Por favor espere unos segundos.");
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
                    System.out.println("Vehículo añadido con éxito. A continuación los detalles del vehículo agregado: ");
                    System.out.println("====");
                    System.out.println("Patente Vehículo: " + vCarga.getPlacaPatente());
                    System.out.println("Tipo de Vehículo: " + vCarga.getTipoVehiculo());
                    System.out.println("Estado de Disponibilidad: " + vCarga.getEstadoRenta());
                    System.out.println("Kilos de carga y tipo de vehículo: " + vCarga.getTipoDeCarga());
                    System.out.println("Marca del Vehículo: " + vCarga.getMarcaVehiculo());
                    System.out.println("Modelo del Vehículo: " + vCarga.getModeloVehiculo());
                    System.out.println("===="); 
        }
        else{
            System.out.println("El vehículo ingresado ya posee registros previos en nuestro Rent A Car (Placa Patente ya existe)");
            return;
        }
        
        }
        }
        
        if(opcionUsuario == 2) {
        System.out.println("Para agregar un vehículo, por favor ingrese su Placa Patente: ");
        String ingresoPatente2 = teclado.nextLine();
        boolean existe = false;
        synchronized (listaVehiculoPasajeros){
        for(VehiculoPasajeros vehiculoPasajeros : listaVehiculoPasajeros){
        if(ingresoPatente2.equalsIgnoreCase(vehiculoPasajeros.getPlacaPatente())){
            existe = true;
            break;
        }
        }
        if(!existe){
            VehiculoPasajeros vPasajeros = new VehiculoPasajeros();
            vPasajeros.setEstadoRenta("Disponible");
            vPasajeros.setPlacaPatente(ingresoPatente2);
            vPasajeros.setTipoVehiculo("Vehículo de Pasajeros");
            System.out.println("Ingrese la MARCA del vehículo: ");
            String marca = teclado.nextLine();
            vPasajeros.setMarcaVehiculo(marca);
            System.out.println("Ingrese el MODELO del vehículo: ");
            String modelo = teclado.nextLine();
            vPasajeros.setModeloVehiculo(modelo);
            System.out.println("Ingrese tipo de vehículo. Ejemplo: Sedán");
            String caracteristicas = teclado.nextLine();
            vPasajeros.setTipoDeVehiculo(caracteristicas);
            listaVehiculoPasajeros.add(vPasajeros);
            System.out.println("Añadiendo Vehículo... ...Procesando... Por favor espere unos segundos.");
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
                    System.out.println("Vehículo añadido con éxito. A continuación los detalles del vehículo agregado: ");
                    System.out.println("====");
                    System.out.println("Patente Vehículo: " + vPasajeros.getPlacaPatente());
                    System.out.println("Tipo de Vehículo: " + vPasajeros.getTipoVehiculo());
                    System.out.println("Estado de Disponibilidad: " + vPasajeros.getEstadoRenta());
                    System.out.println("Más características: " + vPasajeros.getTipoDeVehiculo());
                    System.out.println("Marca del Vehículo: " + vPasajeros.getMarcaVehiculo());
                    System.out.println("Modelo del Vehículo: " + vPasajeros.getModeloVehiculo());
                    System.out.println("===="); 
        }else{
            System.out.println("El vehículo ingresado ya posee registros previos en nuestro Rent A Car (Placa Patente ya existe)");
            return;
        }
        
        }
        }
    
    
    
}
    }
