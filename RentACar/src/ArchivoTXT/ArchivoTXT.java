package ArchivoTXT;

import Vehiculo.VehiculoCarga;
import Vehiculo.VehiculoPasajeros;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ArchivoTXT {
    
    public static void archivoTXT(ArrayList<VehiculoCarga> listaVehiculosCarga, ArrayList<VehiculoPasajeros> listaVehiculosPasajeros){
    
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("VehiculosCarga.txt"))){
        bw.write("----= Vehículos de Carga VIOLETA'S RENT A CAR =----");
        bw.newLine();
            for(VehiculoCarga vehiculoCarga : listaVehiculosCarga) {
                bw.newLine();
                bw.write("Detalles del vehículo de carga: ");
                bw.write("Placa Patente: "+vehiculoCarga.getPlacaPatente());
                bw.write("Marca Vehículo: "+vehiculoCarga.getMarcaVehiculo());
                bw.write("Modelo Vehículo: "+vehiculoCarga.getModeloVehiculo());
                bw.write("Tipo de Vehículo: "+vehiculoCarga.getTipoVehiculo());
                bw.write("Tipo de Carga: "+vehiculoCarga.getTipoDeCarga());
                bw.write("Estado de Disponibilidad: "+vehiculoCarga.getEstadoRenta());
                bw.newLine();
        }
        }catch(IOException e){
            System.out.println("Ha ocurrido un error con el archivo. Por favor intente otra vez.");
        }
     
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("VehiculosDePasajeros.txt"))){
        bw.write("----= Vehículos de Pasajeros VIOLETA'S RENT A CAR =----");
        bw.newLine();
            for(VehiculoPasajeros vehiculoPasajeros : listaVehiculosPasajeros) {
                bw.newLine();
                bw.write("Detalles del vehículo de pasajeros: ");
                bw.write("Placa Patente: "+vehiculoPasajeros.getPlacaPatente());
                bw.write("Marca Vehículo: "+vehiculoPasajeros.getMarcaVehiculo());
                bw.write("Modelo Vehículo: "+vehiculoPasajeros.getModeloVehiculo());
                bw.write("Tipo de Vehículo: "+vehiculoPasajeros.getTipoVehiculo());
                bw.write("Más detalles: "+vehiculoPasajeros.getTipoDeVehiculo());
                bw.write("Estado de Disponibilidad: "+vehiculoPasajeros.getEstadoRenta());
                bw.newLine();
        }
        }catch(IOException e){
            System.out.println("Ha ocurrido un error con el archivo. Por favor intente otra vez.");
        }
        
        
        }
    
    public static void lecturaTXTCarga(){
    
        try(BufferedReader br = new BufferedReader(new FileReader("VehiculosCarga.txt"))) {
        String linea;
        while((linea = br.readLine()) !=null) {
            System.out.println(linea);
        }
        }catch(IOException e){
            System.out.println("El archivo que estás intentando leer, no existe. Asegúrate de poner la ruta correcta del archivo.");
        }  
    }
    
    public static void lecturaTXTPasajeros(){
    
        try(BufferedReader br = new BufferedReader(new FileReader("VehiculosDePasajeros.txt"))) {
        String linea;
        while((linea = br.readLine()) !=null) {
            System.out.println(linea);
        }
        }catch(IOException e){
            System.out.println("El archivo que estás intentando leer, no existe. Asegúrate de poner la ruta correcta del archivo.");
        }  
    }
    }
