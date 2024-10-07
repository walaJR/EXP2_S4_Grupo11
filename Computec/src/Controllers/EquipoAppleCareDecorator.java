package Controllers;

import Models.Command;
import Models.Component;
import Models.EquipoDecorator;
import javax.swing.JOptionPane;


public class EquipoAppleCareDecorator extends EquipoDecorator implements Command{
    
    private static EquipoAppleCareDecorator appleCareSingleton;
    
    private EquipoAppleCareDecorator(Component componente) {
        super(componente);
    }
    
    public static EquipoAppleCareDecorator obtenerInstancia(){ //PATRÓN DE DISEÑO S I N G L E T O N
        if(appleCareSingleton == null){
        appleCareSingleton = new EquipoAppleCareDecorator();
        }
        return appleCareSingleton;
    }
    
    public EquipoAppleCareDecorator(){
    }
    

    @Override
    public void appleCare(int total) { // Interfaz COMPONENT que aplica la lógica del Decorator
        
        total = total + 320000;
        JOptionPane.showMessageDialog(null, "Protección AppleCare+ activada. Venta realizada con éxito");
        
    }

    @Override
    public void ejecutar(int total) { // Patrón de diseño COMMAND que ejecutará COMPONENT y a su vez DECORATOR.
        appleCare(total);
        
    }
    
    
    
}
