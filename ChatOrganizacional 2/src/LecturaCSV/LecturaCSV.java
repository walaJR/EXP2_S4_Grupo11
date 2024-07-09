package LecturaCSV;

import NumerosPrimos.PrimeList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaCSV {
            
    public static PrimeList lecturaArchivoCSV(String archivo) {
        
        System.out.println("--------------------- LECTOR DE ARCHIVOS CSV ---------------------");
        PrimeList lecturaCsv = new PrimeList();
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            String separador = ",";
            
            if ((linea = br.readLine()) != null) {
                
                String[] datos = linea.split(separador);
                for (String dato : datos) {
                    try {
                        int numero = Integer.parseInt(dato);
                        lecturaCsv.add(numero);
                    } catch (NumberFormatException e) {
                        System.err.println("Error al convertir el dato a número: " + dato);
                    }
                }
            }
            System.out.println("... Leyendo Archivo...");
            System.out.println("");
            System.out.println("Datos del Archivo CSV:");
            System.out.println("");
            System.out.println(lecturaCsv);
            System.out.println("");
            System.out.println("Se han añadido los respectivos números primos del Archivo CSV a la Lista.");
            System.out.println("Elementos totales de la lista: "+lecturaCsv.getPrimesCount());
            System.out.println("================================================");
            
        } catch (IOException excep) {
            System.out.println("Archivo CSV no encontrado.");
        }
        
        return lecturaCsv;
    }
    
}
