package RopaDeVestir;

import Command.Command;
import InterfaceComponent.Component;

public class RopaTicketDeCambioDecorator extends RopaDecorator implements Command{
    
    RopaComponenteConcreto ropa;
    
    public RopaTicketDeCambioDecorator(Component componente) {
        super(componente);
    }
    
    public RopaTicketDeCambioDecorator(){
    }

    @Override
    public void extra(int total) {
        System.out.println("------------- === TICKET DE CAMBIO === -------------");
        System.out.println("Este es el ticket de cambio");
        System.out.println("Es válido en la sucursal la cual el producto fué comprado");
        System.out.println("Y es válido para cambiar o devolver el producto");
        System.out.println("---------------------------------------");
        System.out.println("Fin Ticket de Cambio");
        System.out.println("---------------------------------------");
        System.out.println("");
        ejecutar(0);
    }

    @Override
    public void descuento(int total) {
        
    }

    @Override
    public void ejecutar(int total) { // Patrón de diseño C O M M A N D 
        if(ropa == null){
        ropa = new RopaComponenteConcreto();
        ropa.saludoDespedida();
        }
    }
    
}
