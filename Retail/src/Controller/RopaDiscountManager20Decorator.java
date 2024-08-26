package Controller;

import Model.RopaDecorator;
import Model.Command;
import Model.Component;
import java.util.Scanner;

public class RopaDiscountManager20Decorator extends RopaDecorator implements Command{
    
    private static RopaDiscountManager20Decorator desc20Singleton;
    
    private RopaDiscountManager20Decorator(Component componente) {
        super(componente);
    }
    
    public static RopaDiscountManager20Decorator obtenerInstancia(){ //PATRÓN DE DISEÑO S I N G L E T O N
        if(desc20Singleton == null){
        desc20Singleton = new RopaDiscountManager20Decorator();
        }
        return desc20Singleton;
    }
    
    public RopaDiscountManager20Decorator(){
    }

    @Override
    public void descuento(int total, boolean[] booleanDescuento) { // INTERFAZ COMPONENT que implementa la lógica del DECORATOR
        Scanner teclado = new Scanner(System.in);
        if(booleanDescuento[0]) {
            System.out.println("Ya se ha aplicado un descuento previamente. No se puede volver a aplicar otro.");
            System.out.println("Tu TOTAL es de: $ "+total);
            return;
        }
        int edadUsuario;
        System.out.println("Clientes MAYORES de 70 años, obtendrán $ 20.000 pesos de descuento en el total de su boleta");
        System.out.println("Por favor ingrese su EDAD");
        edadUsuario = teclado.nextInt();
        if(edadUsuario > 70) {
            booleanDescuento[0] = true;
            System.out.println("Estimado Cliente: Su edad es MAYOR a 70 años");
            System.out.println("Por cortesía, usted tendrá $ 20.000 pesos de descuento en el total de su boleta");
            total = (total - 20000);
            System.out.println("Tu nuevo TOTAL es de: $ "+total);
            System.out.println("¡Gracias por preferirnos! ¡Regresa Pronto!");
        }else{
            System.out.println("No se ha hecho efectivo el descuento por EDAD");
            System.out.println("");
        }
    }

    @Override
    public void ejecutar(int total, boolean[] booleanDescuento) { // // PATRÓN DE DISEÑO COMMAND IMPLEMENTANDO COMPONENT, Y A SU VEZ, LA LÓGICA DE DESCUENTO DEL DECORATOR 2.
        this.descuento(total, booleanDescuento);
    }
    
}
