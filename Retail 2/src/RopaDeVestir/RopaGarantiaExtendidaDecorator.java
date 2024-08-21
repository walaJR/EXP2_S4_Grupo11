package RopaDeVestir;

import InterfaceComponent.Component;
import java.util.Scanner;

public class RopaGarantiaExtendidaDecorator extends RopaDecorator {

    public RopaGarantiaExtendidaDecorator(Component componente) {
        super(componente);
    }
    
    public RopaGarantiaExtendidaDecorator(){
    }

    @Override
    public void extra(int total) {
        Scanner teclado = new Scanner(System.in);
        int costeGarantia = 20000;
        System.out.println("----------------------- === GARANTÍA EXTENDIDA === -----------------------");
        System.out.println("¿Desea usted aplicar una Garantía Extendida a su(s) producto(s)? [1] SÍ [2] NO");
        int opcionUsuario = teclado.nextInt();
        teclado.nextLine();
        if(opcionUsuario == 1){
        System.out.println("Usted ha seleccionado la opción de Garantía Extendida");
        System.out.println("En vestuario, por $20.000 adicionales al total de su boleta, usted obtendrá la garantía extra");
        System.out.println("Esta garantía ofrece 180 días (6 meses) de cobertura extendida, la cual cubrirá:");
        System.out.println("1.- Cualquier daño producto del lavado e inclusive de cualquier tipo de índole");
        System.out.println("2.- Robo de la prenda (Efectivo con la respectiva denuncia policial)");
        System.out.println("El nuevo monto de su boleta es: $ "+(total+costeGarantia));
        System.out.println("");
        }
        else{
            System.out.println("Usted ha escogido NO contratar la Garantía Extendida.");
            System.out.println("");
        }
        
    }
    
    @Override
    public void descuento(int total) {
        
    }

    
    
}
