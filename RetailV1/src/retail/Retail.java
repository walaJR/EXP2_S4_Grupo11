package retail;

import RopaDeVestir.Ropa;


public class Retail {

    
    public static void main(String[] args) {
        
        Ropa ropaObjeto = new Ropa(); // A pesar de que el patrón Singleton está presente sólo en la clase "DiscountManager",
        ropaObjeto.venderRopa(); // Lo cierto es que también se pudiese haber aplicado en "Ropa", ya que sólo necesitamos una única instancia, por ahora.
        
    }
    
}
