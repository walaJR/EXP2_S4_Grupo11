package Controller;

import Model.RopaDecorator;
import Model.Command;
import Model.Component;
import java.util.Scanner;

public class RopaDiscountManager10Decorator extends RopaDecorator implements Command{

    private static RopaDiscountManager10Decorator desc10Singleton; 
    
    public RopaDiscountManager10Decorator(Component componente) {
        super(componente);
    }
    
    public RopaDiscountManager10Decorator(){
    }

    public static RopaDiscountManager10Decorator obtenerInstancia(){ //PATRÓN DE DISEÑO S I N G L E T O N
        if(desc10Singleton == null){
        desc10Singleton = new RopaDiscountManager10Decorator();
        }
        return desc10Singleton;
    }
    
    @Override
    public void descuento(int total, boolean[] booleanDescuento) { // // INTERFAZ COMPONENT que implementa la lógica del DECORATOR
        Scanner teclado = new Scanner(System.in);
        if(booleanDescuento[0]) {
            return;
        }
        int opcionUsuario;
        System.out.println("----------------------== PLATAFORMA DE PAGO ==----------------------");
        System.out.println("¿Su pago es mediante EFECTIVO? Digite [1] Sí [2] NO");
        System.out.println("Recuerde que pagos mediante EFECTIVO, tendrán $ 10.000 de descuento en el total de su boleta.");
        opcionUsuario = teclado.nextInt();
            if(opcionUsuario == 1) {
                total = (total - 10000);
                booleanDescuento[0] = true;
                System.out.println("Usted ha seleccionado la opción pagar mediante EFECTIVO.");
                System.out.println("Se ha reflejado un descuento de $10.000 en el total de tu boleta");
                System.out.println("Tu nuevo TOTAL es de: $ "+total);
                System.out.println("¡Gracias por preferirnos! ¡Regresa Pronto!");
            }else{
                System.out.println("Usted ha seleccionado la opción pagar mediante OTROS métodos de pago.");
                System.out.println("El descuento no se ha hecho efectivo");
                System.out.println("Tu TOTAL es de: $ "+total);
                System.out.println("¡Gracias por preferirnos! ¡Regresa Pronto!");
            } 
    }

    @Override
    public void ejecutar(int total, boolean[] booleanDescuento) { // PATRÓN DE DISEÑO COMMAND IMPLEMENTANDO COMPONENT, Y A SU VEZ, LA LÓGICA DE DESCUENTO DEL DECORATOR 1.
        this.descuento(total, booleanDescuento);
    }

    
    
}
