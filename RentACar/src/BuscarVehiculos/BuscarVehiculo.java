package BuscarVehiculos;

import Vehiculo.VehiculoCarga;
import Vehiculo.VehiculoPasajeros;
import java.util.ArrayList;
import java.util.Scanner;


public class BuscarVehiculo {
    
    
    public static void arriendosActivos(ArrayList<VehiculoCarga> arriendosCarga, ArrayList<VehiculoPasajeros> arriendosPasajeros){
    
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite [1] Para BUSCAR todos los arriendos de automóviles activos");
        System.out.println("Digite [2] Para BUSCAR según su duración de arriendo");
        int opcionUsuario = teclado.nextInt();
        
        switch(opcionUsuario) {
        
            case 1:
                System.out.println("Vehículos con arriendos activos Division CARGA: ");
                for(VehiculoCarga vCarga : arriendosCarga) {
                if(vCarga.getEstadoRenta().equalsIgnoreCase("No Disponible")){
                    System.out.println("");
                    System.out.println("Marca vehículo: "+vCarga.getMarcaVehiculo());
                    System.out.println("Modelo vehículo: "+vCarga.getModeloVehiculo());
                    System.out.println("Tipo de vehículo: "+vCarga.getTipoDeCarga());
                    System.out.println("Placa Patente: "+vCarga.getPlacaPatente());
                    System.out.println("Duración del arriendo: "+vCarga.getDuracionArriendo());
                    System.out.println("División del Vehículo: "+vCarga.getTipoVehiculo());
                    System.out.println("");
                    System.out.println("------------------------------------");
                }
                
                }
                System.out.println("Vehículos con arriendos activos Division PASAJEROS: ");
                for(VehiculoPasajeros vPasajeros : arriendosPasajeros) {
                if(vPasajeros.getEstadoRenta().equalsIgnoreCase("No Disponible")){ 
                    System.out.println("");
                    System.out.println("Marca vehículo: "+vPasajeros.getMarcaVehiculo());
                    System.out.println("Modelo vehículo: "+vPasajeros.getModeloVehiculo());
                    System.out.println("Tipo de vehículo: "+vPasajeros.getTipoDeVehiculo());
                    System.out.println("Placa Patente: "+vPasajeros.getPlacaPatente());
                    System.out.println("Duración del arriendo: "+vPasajeros.getDuracionArriendo());
                    System.out.println("División del Vehículo: "+vPasajeros.getTipoVehiculo());
                    System.out.println("");
                    System.out.println("------------------------------------");
                    
                }
                
                }
            break;
            
            case 2:
                
                System.out.println("Vehículos con duraciones de arriendos de 15 días Division CARGA: ");
                for(VehiculoCarga vCarga : arriendosCarga) {
                if(vCarga.getEstadoRenta().equalsIgnoreCase("No Disponible")){
                    if(vCarga.getDuracionArriendo().equalsIgnoreCase("15 DÍAS")){
                        System.out.println("");
                    System.out.println("Marca vehículo: "+vCarga.getMarcaVehiculo());
                    System.out.println("Modelo vehículo: "+vCarga.getModeloVehiculo());
                    System.out.println("Tipo de vehículo: "+vCarga.getTipoDeCarga());
                    System.out.println("Placa Patente: "+vCarga.getPlacaPatente());
                    System.out.println("Duración del arriendo: "+vCarga.getDuracionArriendo());
                    System.out.println("División del Vehículo: "+vCarga.getTipoVehiculo());
                    System.out.println("");
                    System.out.println("------------------------------------");
                    }
                }
                
                }
                
                System.out.println("Vehículos con duraciones de arriendos de 30 días Division CARGA: ");
                for(VehiculoCarga vCarga : arriendosCarga) {
                if(vCarga.getEstadoRenta().equalsIgnoreCase("No Disponible")){
                    if(vCarga.getDuracionArriendo().equalsIgnoreCase("30 DÍAS")){
                        System.out.println("");
                    System.out.println("Marca vehículo: "+vCarga.getMarcaVehiculo());
                    System.out.println("Modelo vehículo: "+vCarga.getModeloVehiculo());
                    System.out.println("Tipo de vehículo: "+vCarga.getTipoDeCarga());
                    System.out.println("Placa Patente: "+vCarga.getPlacaPatente());
                    System.out.println("Duración del arriendo: "+vCarga.getDuracionArriendo());
                    System.out.println("División del Vehículo: "+vCarga.getTipoVehiculo());
                    System.out.println("");
                    System.out.println("------------------------------------");
                    }
                }
                
                }
                
                System.out.println("Vehículos con duraciones de arriendos de 15 días Division PASAJEROS: ");
                for(VehiculoPasajeros vPasajeros : arriendosPasajeros) {
                if(vPasajeros.getEstadoRenta().equalsIgnoreCase("No Disponible")){
                    if(vPasajeros.getDuracionArriendo().equalsIgnoreCase("15 DÍAS")) {
                        System.out.println("");
                    System.out.println("Marca vehículo: "+vPasajeros.getMarcaVehiculo());
                    System.out.println("Modelo vehículo: "+vPasajeros.getModeloVehiculo());
                    System.out.println("Tipo de vehículo: "+vPasajeros.getTipoDeVehiculo());
                    System.out.println("Placa Patente: "+vPasajeros.getPlacaPatente());
                    System.out.println("Duración del arriendo: "+vPasajeros.getDuracionArriendo());
                    System.out.println("División del Vehículo: "+vPasajeros.getTipoVehiculo());
                    System.out.println("");
                    System.out.println("------------------------------------");
                    }
                }
                
                }
                System.out.println("Vehículos con duraciones de arriendos de 30 días División PASAJEROS: ");
                for(VehiculoPasajeros vPasajeros : arriendosPasajeros) {
                if(vPasajeros.getEstadoRenta().equalsIgnoreCase("No Disponible")){
                    if(vPasajeros.getDuracionArriendo().equalsIgnoreCase("15 DÍAS")) {
                        System.out.println("");
                    System.out.println("Marca vehículo: "+vPasajeros.getMarcaVehiculo());
                    System.out.println("Modelo vehículo: "+vPasajeros.getModeloVehiculo());
                    System.out.println("Tipo de vehículo: "+vPasajeros.getTipoDeVehiculo());
                    System.out.println("Placa Patente: "+vPasajeros.getPlacaPatente());
                    System.out.println("Duración del arriendo: "+vPasajeros.getDuracionArriendo());
                    System.out.println("División del Vehículo: "+vPasajeros.getTipoVehiculo());
                    System.out.println("");
                    System.out.println("------------------------------------");
                    }
                }
                
                }
                
        }
        
    }
}
