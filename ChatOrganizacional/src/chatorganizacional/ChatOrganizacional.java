package chatorganizacional;

import Empleados.Empleado;
import NumerosPrimos.PrimeList;
import java.util.ArrayList;
import java.util.Scanner;


public class ChatOrganizacional {

    
    public static void main(String[] args) {
        
        int opcionMenu;
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleados = new ArrayList <Empleado>();
        PrimeList numerosPrimos = new PrimeList();
        Empleado empleados = new Empleado();
        
        Empleado empleado1 = new Empleado("Sebastian Olave", "Programador", 19941991);
        Empleado empleado2 = new Empleado("Princesa Violeta", "Jefa Máxima", 2021);
        Empleado empleado3 = new Empleado("Esteban Paredes", "Presidente de PrimeSecure", 2022);
        Empleado empleado4 = new Empleado("Johnny Herrores", "El eslabón más bajo", 00);
        Empleado empleado5 = new Empleado("Don Mirko Jozic", "CEO", 1991);
        Empleado empleado6 = new Empleado("Don David Arellano", "CEO Honorable Fundador", 19251991);
        Empleado empleado7 = new Empleado("Cacique Colo-Colo", "El Eterno Campeón", 1925);
        Empleado empleado8 = new Empleado("Gustavo Quinteros", "Ex-Director", 20212021);
        Empleado empleado9 = new Empleado("Jorge Almirón", "Director Ténico", 2024);
        Empleado empleado10 = new Empleado("Arturo Vidal", "El Rey", 2006);
        
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaEmpleados.add(empleado4);
        listaEmpleados.add(empleado5);
        listaEmpleados.add(empleado6);
        listaEmpleados.add(empleado7);
        listaEmpleados.add(empleado8);
        listaEmpleados.add(empleado9);
        listaEmpleados.add(empleado10);
        
        do {
            System.out.println("----------------------------- PRIME SECURE -----------------------------");
            System.out.println(" ");
            System.out.println("Bienvenido al Chat Organizacional de PrimeSecure.");
            System.out.println("En este programa, podrás enviar y recibir mensajes mensajes de toda la Organización.");
            System.out.println("Recuerda que por seguridad, los mensajes serán encriptados.");
            System.out.println(" ");
            System.out.println("Para continuar, por favor digita una opción: ");
            System.out.println("[1] Para ENVIAR un Mensaje");
            System.out.println("[2] Para LEER un Mensaje (Desencriptación)");
            System.out.println("[3] Para LEER todos los Mensajes");
            System.out.println("[4] Para CALCULAR si un número es número primo"); // Mediante método ISPRIME()
            System.out.println("[5] Ingresar un número entero a PrimeList"); // Mediante la modificación de ADD, acepta sólo números primos. IllegalArgumentException
            System.out.println("[6] Para ver cuantos Números Primos hay en PrimeList"); // Mediante GETPRIMESCOUNT()
            System.out.println("[7] Para SALIR");
            System.out.println("====================================================================");
            opcionMenu = teclado.nextInt();
            teclado.nextLine();
        
            switch(opcionMenu) {
            
                case 1: 
                        empleados.mensajeEmpleado(listaEmpleados);
                        break;
                        
                case 2:
                        empleados.mensajesDesencriptados(Empleado.listaMensajesEncriptados);
                        break;
            
                case 3:
                        empleados.todosLosMensajes(Empleado.listaMensajesEncriptados);
                        break;
                        
                case 4:
                        numerosPrimos.calculadoraNumeroPrimo();
                        break;
                    
                case 5:
                        numerosPrimos.ingresarNumeroAColeccion();
                        break;
                        
                case 6:
                        numerosPrimos.tamanioColeccion();
                        break;
                        
                case 7:
                    System.out.println("Saliendo... Gracias por usar la mensajería de PrimeSecure COMPANY");
                    break;
                    
                default: System.out.println("Opción ingresada no válida. Por favor ingrese una opción. Ejemplo: 1");
                return;
            } 
     
        } while (opcionMenu !=7);     
        
    }
    
}
