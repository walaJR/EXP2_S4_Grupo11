package rentacar;

import AgregarVehiculos.AgregarVehiculo;
import ArchivoTXT.ArchivoTXT;
import BuscarVehiculos.BuscarVehiculo;
import Vehiculo.VehiculoCarga;
import Vehiculo.VehiculoPasajeros;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class RentACar {

  
    public static void main(String[] args) {
        
        int opcionMenu = 0;
        int subMenu = 0;
        
        Scanner teclado = new Scanner(System.in);
        VehiculoCarga vCarga = new VehiculoCarga();
        ArrayList<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
        VehiculoCarga vehiculo1 = new VehiculoCarga("YF-2753", "Vehículo de Carga", "Disponible", "2700 KG Doble Eje", "Ford", "Transit Custom");
        VehiculoCarga vehiculo2 = new VehiculoCarga("XA-1008", "Vehículo de Carga", "No Disponible", "15 DÍAS", "2500 KG Doble Eje", "Opel", "Movano Cargo Van");
        VehiculoCarga vehiculo3 = new VehiculoCarga("BCKG-49", "Vehículo de Carga", "Disponible", "2850 KG Triple Eje", "Ford", "Cargo 1846T");
        VehiculoCarga vehiculo4 = new VehiculoCarga("WB-2755", "Vehículo de Carga", "Disponible", "2000 KG Doble Eje", "Ford", "Cargo 916");
        VehiculoCarga vehiculo5 = new VehiculoCarga("WCKG-49", "Vehículo de Carga", "No Disponible", "30 DÍAS", "2300 KG Triple Eje", "Ford", "Cargo 2831");
        VehiculoCarga vehiculo6 = new VehiculoCarga("XLOP-55", "Vehículo de Carga", "Disponible", "2100 KG Doble Eje", "Ford", "Transit Cargo Van");
        VehiculoCarga vehiculo7 = new VehiculoCarga("HGLP-69", "Vehículo de Carga", "Disponible", "2300 KG Doble Eje", "RAM", "ProMaster Cargo");
        VehiculoCarga vehiculo8 = new VehiculoCarga("EG-2000", "Vehículo de Carga", "No Disponible", "15 DÍAS", "1700 KG Doble Eje", "DFSK", "DFSK Cargo Van 1.5");
        
        VehiculoPasajeros vPasajeros = new VehiculoPasajeros();
        ArrayList<VehiculoPasajeros> listaVehiculosPasajeros = new ArrayList<>();
        VehiculoPasajeros vehiculoPasajeros1 = new VehiculoPasajeros("AA-1122", "Vehículo de Pasajeros", "Disponible", "Sedán", "Toyota", "Camry");
        VehiculoPasajeros vehiculoPasajeros2 = new VehiculoPasajeros("AB-2122", "Vehículo de Pasajeros", "No Disponible","30 DÍAS", "Sedán", "Mercedes-Benz", "C200");
        VehiculoPasajeros vehiculoPasajeros3 = new VehiculoPasajeros("AX-6554", "Vehículo de Pasajeros", "Disponible", "Hatchback", "Mercedes-Benz", "A200");
        VehiculoPasajeros vehiculoPasajeros4 = new VehiculoPasajeros("KG-0223", "Vehículo de Pasajeros", "Disponible", "SUV", "Lamborghini", "Urus");
        VehiculoPasajeros vehiculoPasajeros5 = new VehiculoPasajeros("XC-6969", "Vehículo de Pasajeros", "Disponible", "SUV", "Kia", "Sportage XLI");
        VehiculoPasajeros vehiculoPasajeros6 = new VehiculoPasajeros("QR-9633", "Vehículo de Pasajeros", "Disponible", "SUV", "Mercedes-Benz", "GLE");
        VehiculoPasajeros vehiculoPasajeros7 = new VehiculoPasajeros("OP-5812", "Vehículo de Pasajeros", "No Disponible", "15 DÍAS", "Sedán", "Toyota", "Corolla");
        VehiculoPasajeros vehiculoPasajeros8 = new VehiculoPasajeros("TY-5399", "Vehículo de Pasajeros", "No Disponible", "15 DÍAS", "City Car", "Smart", "Smart Electric");
        
        listaVehiculosPasajeros.add(vehiculoPasajeros1);
        listaVehiculosPasajeros.add(vehiculoPasajeros2);
        listaVehiculosPasajeros.add(vehiculoPasajeros3);
        listaVehiculosPasajeros.add(vehiculoPasajeros4);
        listaVehiculosPasajeros.add(vehiculoPasajeros5);
        listaVehiculosPasajeros.add(vehiculoPasajeros6);
        listaVehiculosPasajeros.add(vehiculoPasajeros7);
        listaVehiculosPasajeros.add(vehiculoPasajeros8);
        
        listaVehiculosCarga.add(vehiculo1);
        listaVehiculosCarga.add(vehiculo2);
        listaVehiculosCarga.add(vehiculo3);
        listaVehiculosCarga.add(vehiculo4);
        listaVehiculosCarga.add(vehiculo5);
        listaVehiculosCarga.add(vehiculo6);
        listaVehiculosCarga.add(vehiculo7);
        listaVehiculosCarga.add(vehiculo8);
        AgregarVehiculo hilo = new AgregarVehiculo(listaVehiculosCarga, listaVehiculosPasajeros);
        
        do {
        
            System.out.println("------------------------- ========== VIOLETA'S RENT A CAR ========== -------------------------");
            System.out.println("Bienvenid@. Para continuar, digite la opción deseada: ");
            System.out.println("Digite [1] Para BUSCAR Vehículos dentro del inventario");
            System.out.println("Digite [2] Para RENTAR un Vehículo en VIOLETA'S RENT A CAR");
            System.out.println("Digite [3] Para LEER Archivo.TXT con todos los vehículos del inventario"); // BufferedWriter y BufferedReader
            System.out.println("Digite [4] Para AGREGAR un Vehículo al inventario"); // No patentes repetidas, Lista sincronizada (Synchronized List)
            System.out.println("Digite [5] Para BUSCAR Arriendos Activos");
            System.out.println("Digite [6] Para SALIR del Programa");
            try{
            opcionMenu = teclado.nextInt();
            }catch(InputMismatchException e) {
                System.out.println("Debes ingresar una opción numérica válida. Por ejemplo: 1");
                System.out.println("");
            }
            teclado.nextLine();
            switch (opcionMenu) {
            
                case 1:
                        System.out.println("Digite [1] Si desea BUSCAR Vehículos división CARGA");
                        System.out.println("Digite [2] Si desea BUSCAR Vehículos división PASAJEROS");
                        try{
                        subMenu = teclado.nextInt();
                        teclado.nextLine();
                        }catch(InputMismatchException e) {
                        System.out.println("Debes ingresar una opción numérica válida. Por ejemplo: 1");
                        System.out.println("");
            }
                            if(subMenu == 1){
                                try{
                                vCarga.datosVehiculo(listaVehiculosCarga);
                                }catch(InputMismatchException e) {
                                System.out.println("Debes ingresar una opción numérica válida. Por ejemplo: 1");
                                System.out.println("");
                            }
                            }
                                if(subMenu == 2){
                                try{    
                                vPasajeros.datosVehiculo(listaVehiculosPasajeros);
                                }catch(InputMismatchException e) {
                                System.out.println("Debes ingresar una opción numérica válida. Por ejemplo: 1");
                                System.out.println("");
                                }
                                }
                        break;
                        
                case 2:
                        try{
                        System.out.println("Digite [1] Si desea RENTAR Vehículos división CARGA");
                        System.out.println("Digite [2] Si desea RENTAR Vehículos división PASAJEROS");
                        int subMenuDos = teclado.nextInt();
                        teclado.nextLine();
                            if(subMenuDos == 1){
                                vCarga.rentarVehiculo(listaVehiculosCarga);
                            }
                                if(subMenuDos == 2){
                                    vPasajeros.rentarVehiculo(listaVehiculosPasajeros);
                                }
                        }catch(InputMismatchException e){
                            System.out.println("Debes ingresar una opción numérica válida. Por ejemplo: 1");
                            System.out.println("");
                        }
                        break;
                        
                case 3:
                        ArchivoTXT.archivoTXT(listaVehiculosCarga, listaVehiculosPasajeros); // Crea o actualiza el Archivo TXT con todos los Vehículos
                        ArchivoTXT.lecturaTXTCarga(); // Leemos el Archivo TXT de Carga
                        ArchivoTXT.lecturaTXTPasajeros(); // Leemos el Archivo TXT de Pasajeros
                        break;
                        
                case 4:
                        hilo.start();
                        try {
                        hilo.join();
                        }catch(InterruptedException except) {
                            System.out.println("Ha habido un error en la ejecución del hilo. Por favor intente otra vez.");
                        }
                        break;
                        
                case 5:
                    
                        BuscarVehiculo.arriendosActivos(listaVehiculosCarga, listaVehiculosPasajeros);
                        break;
                    
                        
                case 6:
                        System.out.println("Saliendo...");
                        break;
            
                default:
                    System.out.println("Inválido. Por favor ingrese una opción válida: Ejemplo: 1");
                    break;
            }
        
        
        }while(opcionMenu !=6);
        
    }
    
}