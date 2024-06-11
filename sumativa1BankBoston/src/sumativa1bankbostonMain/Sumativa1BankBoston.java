package sumativa1bankbostonMain;

import cl.duoc.ClientesBanco.ClienteBanco;
import java.util.ArrayList;
import java.util.Scanner;

public class Sumativa1BankBoston {

   
    public static void main(String[] args) {
        
    int opcionUsuario;
    String ingresoRut;
    int seleccionUsuario;
        
    Scanner teclado = new Scanner(System.in);
    ArrayList<ClienteBanco> clientes = new ArrayList <>();
    
    do {
        
            try {
        System.out.println("------------------------------ BIENVENIDOS A BANK BOSTON INTERNATIONAL ------------------------------ ");
        System.out.println("Por favor, DIGITE una opción valida: ");
        System.out.println("[1] Para REGISTRARSE como Nuevo Cliente de BANK BOSTON INTERNATIONAL.");
        System.out.println("[2] Para ACCEDER a tu Sucursal Virtual. RUT Requerido");
        System.out.println("[3] Para SALIR");
        opcionUsuario = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR: DEBES INGRESAR UN NUMERO VALIDO. EJEMPLO: 3");
                return;
             
    }
        if (opcionUsuario == 1) {
        ClienteBanco usuario = new ClienteBanco();
        usuario.registrarCliente();
        clientes.add(usuario);
        } else if (opcionUsuario == 2) {
        teclado.nextLine();
        try {
            System.out.println("Por favor, ingrese su RUT de Cliente. Recuerde que para acceder a Sucursal Virtual, usted debe ser Cliente.");
            ingresoRut = teclado.nextLine();
        } catch (Exception e) {
            System.out.println("ERROR: DEBES INGRESAR UN FORMATO DE RUT VÁLIDO CON PUNTOS, GUIÓN Y DÍGITO VERIFICADOR." + e);
            return;
    }
            boolean usuarioEncontrado = false;
            for (ClienteBanco cliente : clientes){
                if (ingresoRut.equals(cliente.getRut())) {
                    usuarioEncontrado = true;
           do { 
            
        System.out.println("-------------------------- BIENVENIDO A SUCURSAL VIRTUAL BANK BOSTON INTERNATIONAL --------------------------"); 
        System.out.println("Por favor, DIGITE una opcion valida: ");
        System.out.println("[1] Para VER tus datos de cliente");
        System.out.println("[2] Para DEPOSITAR dinero en tu cuenta");
        System.out.println("[3] Para RETIRAR dinero de tu cuenta");
        System.out.println("[4] Para CONSULTAR tu saldo");
        System.out.println("[5] Para SALIR");
        seleccionUsuario = teclado.nextInt();
        
        switch (seleccionUsuario) {
        
            case 1: cliente.verDatosCliente();
            break;
            case 2:
                switch (cliente.getTipoCuenta()) {
                
                    case "Cuenta Corriente":
                         cliente.getCuentaCorriente().depositarDinero();
                    break;
                    
                    case "Cuenta de Ahorro":
                         cliente.getCuentasAhorro().depositarDinero();  
                    break;
                    
                    case "Cuenta de Inversion":
                        cliente.getCuentaInversion().depositarDinero();   
                    break;
                }
                
            break;
            case 3:
                switch (cliente.getTipoCuenta()) {
                
                    case "Cuenta Corriente":
                         cliente.getCuentaCorriente().retirarDinero();  
                    break;
                    
                    case "Cuenta de Ahorro":
                         cliente.getCuentasAhorro().retirarDinero();
                    break;
                    
                    case "Cuenta de Inversion":
                        cliente.getCuentaInversion().retirarDinero(); 
                    break;
                }
                
            break;
            case 4:
                switch (cliente.getTipoCuenta()) {
                    
                    case "Cuenta Corriente":
                         cliente.getCuentaCorriente().consultarSaldo(); 
                    break;
                    
                    case "Cuenta de Ahorro":
                         cliente.getCuentasAhorro().consultarSaldo();
                    break;
                    
                    case "Cuenta de Inversion":
                         cliente.getCuentaInversion().consultarSaldo();  
                    break;
                }
            break;
            case 5: 
                System.out.println("Saliendo de la Sucursal Virtual...");
                break;
            default: 
                System.out.println("Por favor digita una opcion valida.");
                break;
           
        }
        
    } while (seleccionUsuario != 5);  
            } 
        } if (!usuarioEncontrado) {
            System.out.println("RUT no valido. Por favor, intente nuevamente");
        
            }   
        } else if (opcionUsuario != 3) {
        System.out.println("Por favor ingrese una opcion valida");
                }
        } while (opcionUsuario != 3);
                System.out.println("Gracias por usar BANK BOSTON INTERNATIONAL");
        
                
    teclado.close();
    }
    
}