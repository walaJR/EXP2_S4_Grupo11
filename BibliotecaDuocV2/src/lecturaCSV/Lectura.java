package lecturaCSV;

import LibrosBiblioteca.Libro;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lectura {
    
    public static List<Libro> lecturaLibros(String archivo) {
    
        System.out.println("--------------------- LECTOR DE ARCHIVOS CSV ---------------------");
        List<Libro> lecturaCsv = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            String separador = ",";
            boolean primeraLinea = true;
            
            while((linea = br.readLine()) !=null) {
                if(primeraLinea) {
                primeraLinea = false;
                continue;
                }
                String[] datos = linea.split(separador);
                Libro libros = new Libro(datos[0],datos[1],Integer.parseInt(datos[2]));
                lecturaCsv.add(libros);
                System.out.println(" ");
                System.out.println("Datos del Archivo CSV: ");
                System.out.println(" ");
                System.out.println(linea);
                System.out.println(" ");
                System.out.println("================================================");
                System.out.println("Objetos a partir del Archivo CSV Creados con Éxito.");
            }
        }catch(IOException excep) {
                    System.out.println("Archivo CSV no encontrado.");
                    }
        
        return lecturaCsv;
        
        
    }
}
