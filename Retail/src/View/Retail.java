package View;


public class Retail {

    
    public static void main(String[] args) {
        
        System.out.println("¡Bienvenido a nuestra tienda!");
        System.out.println("Por ahora, sólo tenemos un departamento de VESTUARIO con reconocidas marcas de vestuario.");
        Ropa ropaObjeto = new Ropa(); // Los Decoradores y sus distintos descuentos se irán activando (O no) en el transcurso de la venta.
        ropaObjeto.vender();
        
    }
    
}
