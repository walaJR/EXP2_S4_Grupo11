package RopaDeVestir;

//import DiscountManager.DiscountManager;
import Command.Command;
import InterfaceComponent.Component;
import java.util.ArrayList;
import java.util.Scanner;


public class RopaComponenteConcreto implements Component, Command{
    
    private String marcaRopa;
    private String modeloRopa;
    private String tipoRopa;
    private int precioPrenda;
    private RopaComponenteConcreto ropaObjeto;
    int opcionUsuario;

    
    public void vender(){
    
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> totalYRetornoCompra = new ArrayList<>();
        ArrayList<RopaComponenteConcreto> ropa = new ArrayList<>();
        
        do{
        System.out.println("----------------------== SECCIÓN VESTUARIO ==----------------------");
        System.out.println("");
        System.out.println("Digite [1] Para COMPRAR Camisetas de Vestir HOMBRE");
        System.out.println("Digite [2] Para COMPRAR Camisetas de Vestir MUJER");
        System.out.println("Digite [3] Para COMPRAR Pantalones de Vestir HOMBRE");
        System.out.println("Digite [4] Para COMPRAR Pantalones de Vestir MUJER");
        System.out.println("Digite [5] Para COMPRAR Camisetas de Fútbol HOMBRE");
        System.out.println("Digite [6] Para COMPRAR Camisetas de Fútbol MUJER");
        System.out.println("Digite [7] Para COMPRAR Zapatillas Deportivas UNISEX");
        System.out.println("Digite [8] Para VER Mi Carrito de Compras y PAGAR");
        System.out.println("Digite [9] Para SALIR");
        opcionUsuario = teclado.nextInt();
        teclado.nextLine();
        
        switch(opcionUsuario) {
        
            case 1:
                System.out.println("----------------------== SECCIÓN VESTUARIO ==----------------------");
                System.out.println("");
                System.out.println("Digite [1] Para Camiseta Hombre TOMMY HILFIGER BLANCA Talla S $55.990");
                System.out.println("Digite [2] Para Camiseta Hombre TOMMY HILFIGER BLANCA Talla M $55.990");
                System.out.println("Digite [3] Para Camiseta Hombre TOMMY HILFIGER BLANCA Talla L $55.990");
                System.out.println("Digite [4] Para Camiseta Hombre TOMMY HILFIGER CELESTE Talla S $55.990");
                System.out.println("Digite [5] Para Camiseta Hombre TOMMY HILFIGER CELESTE Talla M $55.990");
                System.out.println("Digite [6] Para Camiseta Hombre TOMMY HILFIGER CELESTE Talla L $55.990");
                System.out.println("Digite [7] Para Camiseta Hombre TOMMY HILFIGER ROSADA Talla S $55.990");
                System.out.println("Digite [8] Para Camiseta Hombre TOMMY HILFIGER ROSADA Talla M $55.990");
                System.out.println("Digite [9] Para Camiseta Hombre TOMMY HILFIGER ROSADA Talla L $55.990");
                int opcionUsuarioCVH = teclado.nextInt();
                teclado.nextLine();
                switch(opcionUsuarioCVH) {
                    case 1: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir HOMBRE");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Blanca Talla S");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 2: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir HOMBRE");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Blanca Talla M");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 3: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir HOMBRE");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Blanca Talla L");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 4: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir HOMBRE");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Celeste Talla S");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 5: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir HOMBRE");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Celeste Talla M");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 6: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir HOMBRE");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Celeste Talla L");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                    
                    case 7: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir HOMBRE");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Rosada Talla S");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 8: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir HOMBRE");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Rosada Talla M");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 9: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir HOMBRE");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Rosada Talla L");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                }
                break;
                
            case 2:
                System.out.println("----------------------== SECCIÓN VESTUARIO ==----------------------");
                System.out.println("");
                System.out.println("Digite [1] Para Camiseta Mujer TOMMY HILFIGER BLANCA Talla S $55.990");
                System.out.println("Digite [2] Para Camiseta Mujer TOMMY HILFIGER BLANCA Talla M $55.990");
                System.out.println("Digite [3] Para Camiseta Mujer TOMMY HILFIGER BLANCA Talla L $55.990");
                System.out.println("Digite [4] Para Camiseta Mujer TOMMY HILFIGER CELESTE Talla S $55.990");
                System.out.println("Digite [5] Para Camiseta Mujer TOMMY HILFIGER CELESTE Talla M $55.990");
                System.out.println("Digite [6] Para Camiseta Mujer TOMMY HILFIGER CELESTE Talla L $55.990");
                System.out.println("Digite [7] Para Camiseta Mujer TOMMY HILFIGER ROSADA Talla S $55.990");
                System.out.println("Digite [8] Para Camiseta Mujer TOMMY HILFIGER ROSADA Talla M $55.990");
                System.out.println("Digite [9] Para Camiseta Mujer TOMMY HILFIGER ROSADA Talla L $55.990");
                int opcionUsuarioCVM = teclado.nextInt();
                teclado.nextLine();
                switch(opcionUsuarioCVM) {
                    case 1: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir MUJER");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Blanca Talla S");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 2: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir MUJER");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Blanca Talla M");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 3: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir MUJER");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Blanca Talla L");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 4: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir MUJER");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Celeste Talla S");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 5: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir MUJER");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Celeste Talla M");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 6: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir MUJER");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Celeste Talla L");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                    
                    case 7: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir MUJER");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Rosada Talla S");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 8: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir MUJER");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Rosada Talla M");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 9: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Vestir MUJER");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Rosada Talla L");
                            ropaObjeto.setPrecioPrenda(55990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                }
                break;
                
            case 3:
                System.out.println("----------------------== SECCIÓN VESTUARIO ==----------------------");
                System.out.println("");
                System.out.println("Digite [1] Para Pantalón HOMBRE TOMMY HILFIGER AZUL MARINO Talla 46 $60.990");
                System.out.println("Digite [2] Para Pantalón HOMBRE TOMMY HILFIGER AZUL MARINO Talla 48 $60.990");
                System.out.println("Digite [3] Para Pantalón HOMBRE TOMMY HILFIGER AZUL MARINO Talla 50 $60.990");
                int opcionUsuarioPVH = teclado.nextInt();
                teclado.nextLine();
                switch(opcionUsuarioPVH) {
                    case 1: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Pantalón de Vestir HOMBRE");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Azul Marino Talla 46");
                            ropaObjeto.setPrecioPrenda(60990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 2: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Pantalón de Vestir HOMBRE");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Azul Marino Talla 48");
                            ropaObjeto.setPrecioPrenda(60990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 3: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Pantalón de Vestir HOMBRE");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Azul Marino Talla 50");
                            ropaObjeto.setPrecioPrenda(60990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                }
                break;
               
            case 4:
                System.out.println("----------------------== SECCIÓN VESTUARIO ==----------------------");
                System.out.println("");
                System.out.println("Digite [1] Para Pantalón MUJER TOMMY HILFIGER BEIGE Talla 42 $60.990");
                System.out.println("Digite [2] Para Pantalón MUJER TOMMY HILFIGER BEIGE Talla 44 $60.990");
                System.out.println("Digite [3] Para Pantalón MUJER TOMMY HILFIGER BEIGE Talla 48 $60.990");
                int opcionUsuarioPVM = teclado.nextInt();
                teclado.nextLine();
                switch(opcionUsuarioPVM) {
                    case 1: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Pantalón de Vestir MUJER");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Beige Talla 42");
                            ropaObjeto.setPrecioPrenda(60990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 2: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Pantalón de Vestir MUJER");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Beige Talla 44");
                            ropaObjeto.setPrecioPrenda(60990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 3: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Pantalón de Vestir MUJER");
                            ropaObjeto.setMarcaRopa("Tommy Hilfiger");
                            ropaObjeto.setModeloRopa("Beige Talla 48");
                            ropaObjeto.setPrecioPrenda(60990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                }
                break;
               
            case 5:
                System.out.println("----------------------== SECCIÓN VESTUARIO ==----------------------");
                System.out.println("");
                System.out.println("Digite [1] Para Camiseta de Fútbol HOMBRE COLO-COLO Talla S $59.990");
                System.out.println("Digite [2] Para Camiseta de Fútbol HOMBRE COLO-COLO Talla M $59.990");
                System.out.println("Digite [3] Para Camiseta de Fútbol HOMBRE COLO-COLO Talla L $59.990");
                int opcionUsuarioCFH = teclado.nextInt();
                teclado.nextLine();
                switch(opcionUsuarioCFH) {
                    case 1: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Fútbol HOMBRE");
                            ropaObjeto.setMarcaRopa("Adidas");
                            ropaObjeto.setModeloRopa("COLO-COLO Talla S");
                            ropaObjeto.setPrecioPrenda(59990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                      
                    case 2: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Fútbol HOMBRE");
                            ropaObjeto.setMarcaRopa("Adidas");
                            ropaObjeto.setModeloRopa("COLO-COLO Talla M");
                            ropaObjeto.setPrecioPrenda(59990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 3: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Fútbol HOMBRE");
                            ropaObjeto.setMarcaRopa("Adidas");
                            ropaObjeto.setModeloRopa("COLO-COLO Talla L");
                            ropaObjeto.setPrecioPrenda(59990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                }
                break;
                
            case 6:
                System.out.println("----------------------== SECCIÓN VESTUARIO ==----------------------");
                System.out.println("");
                System.out.println("Digite [1] Para Camiseta de Fútbol MUJER COLO-COLO Talla S $59.990");
                System.out.println("Digite [2] Para Camiseta de Fútbol MUJER COLO-COLO Talla M $59.990");
                System.out.println("Digite [3] Para Camiseta de Fútbol MUJER COLO-COLO Talla L $59.990");
                int opcionUsuarioCFM = teclado.nextInt();
                teclado.nextLine();
                switch(opcionUsuarioCFM) {
                    case 1: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Fútbol MUJER");
                            ropaObjeto.setMarcaRopa("Adidas");
                            ropaObjeto.setModeloRopa("COLO-COLO Talla S");
                            ropaObjeto.setPrecioPrenda(59990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                      
                    case 2: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Fútbol MUJER");
                            ropaObjeto.setMarcaRopa("Adidas");
                            ropaObjeto.setModeloRopa("COLO-COLO Talla M");
                            ropaObjeto.setPrecioPrenda(59990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 3: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Camiseta de Fútbol MUJER");
                            ropaObjeto.setMarcaRopa("Adidas");
                            ropaObjeto.setModeloRopa("COLO-COLO Talla L");
                            ropaObjeto.setPrecioPrenda(59990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                }
                break;
                
            case 7:
                setTipoRopa("Zapatillas Deporitvas UNISEX");
                System.out.println("----------------------== SECCIÓN VESTUARIO ==----------------------");
                System.out.println("");
                System.out.println("Digite [1] Para Zapatilla NIKE AirZoom Talla 40 $99.990");
                System.out.println("Digite [2] Para Zapatilla NIKE AirZoom Talla 42 $99.990");
                System.out.println("Digite [3] Para Zapatilla NIKE AirZoom Talla 44 $99.990");
                System.out.println("Digite [4] Para Zapatilla NIKE AirZoom Mercury Talla 40 $129.990");
                System.out.println("Digite [5] Para Zapatilla NIKE AirZoom Mercury Talla 42 $129.990");
                System.out.println("Digite [6] Para Zapatilla NIKE AirZoom Mercury Talla 44 $129.990");
                int opcionUsuarioZD = teclado.nextInt();
                teclado.nextLine();
                switch(opcionUsuarioZD) {
                    case 1: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Zapatillas Deportivas UNISEX");
                            ropaObjeto.setMarcaRopa("Nike");
                            ropaObjeto.setModeloRopa("AirZoom Talla 40");
                            ropaObjeto.setPrecioPrenda(99990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 2: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Zapatillas Deportivas UNISEX");
                            ropaObjeto.setMarcaRopa("Nike");
                            ropaObjeto.setModeloRopa("AirZoom Talla 42");
                            ropaObjeto.setPrecioPrenda(99990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 3: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Zapatillas Deportivas UNISEX");
                            ropaObjeto.setMarcaRopa("Nike");
                            ropaObjeto.setModeloRopa("AirZoom Talla 44");
                            ropaObjeto.setPrecioPrenda(99990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 4: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Zapatillas Deportivas UNISEX");
                            ropaObjeto.setMarcaRopa("Nike");
                            ropaObjeto.setModeloRopa("AirZoom Mercury Talla 40");
                            ropaObjeto.setPrecioPrenda(129990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 5: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Zapatillas Deportivas UNISEX");
                            ropaObjeto.setMarcaRopa("Nike");
                            ropaObjeto.setModeloRopa("AirZoom Mercury Talla 42");
                            ropaObjeto.setPrecioPrenda(129990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                            
                    case 6: ropaObjeto = new RopaComponenteConcreto();
                            ropaObjeto.setTipoRopa("Zapatillas Deportivas UNISEX");
                            ropaObjeto.setMarcaRopa("Nike");
                            ropaObjeto.setModeloRopa("AirZoom Mercury Talla 44");
                            ropaObjeto.setPrecioPrenda(129990);
                            totalYRetornoCompra.add(getPrecioPrenda());
                            System.out.println("Usted está llevando: ");
                            System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                            System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                            System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                            ropa.add(ropaObjeto);
                            break;
                }
                break;
                
            case 8:
                System.out.println("----------------------== PLATAFORMA DE PAGO ==----------------------");
                int totalAPagar = 0;
                System.out.println("El Resumen de tu Compra: ");
                System.out.println("===============================================");
                for (RopaComponenteConcreto prenda : ropa) {
                    System.out.println("Prenda: " + prenda.getTipoRopa());
                    System.out.println("Marca prenda: "+prenda.getMarcaRopa());
                    System.out.println("Modelo prenda: "+prenda.getModeloRopa());
                    System.out.println("Precio prenda: $ "+prenda.getPrecioPrenda());
                    System.out.println("===============================================");
                    totalAPagar = totalAPagar + prenda.getPrecioPrenda();
                }
                System.out.println("Total a Pagar : $ "+totalAPagar);
                System.out.println("===============================================");
                System.out.println("¿Desea confirmar la compra? Digite [1] Sí [2] No");
                int confirmarCompra = teclado.nextInt();
                teclado.nextLine();
                if(confirmarCompra == 1) {
                    System.out.println("Usted ha sido seleccionado para un descuento exclusivo en el total de su boleta");
                    this.ejecutar(totalAPagar); // INTERFACE C O M M A N D 
                    //descuento(totalAPagar); // INTERFACE C O M P O N E N T 
                    RopaGarantiaExtendidaDecorator garantiaExtendida = new RopaGarantiaExtendidaDecorator();// IMPLEMENTANDO DECORADOR 1
                    garantiaExtendida.extra(totalAPagar);
                    RopaTicketDeCambioDecorator ticketDeCambio = new RopaTicketDeCambioDecorator();// IMPLEMENTANDO DECORADOR 2
                    ticketDeCambio.extra(totalAPagar);
                    ropa.clear();
                    totalYRetornoCompra.clear();
                    totalAPagar = 0;
                } else {
                    System.out.println("Cancelando compra... Por favor espere...");
                    System.out.println("3...");
                        try {
                            Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
                    System.out.println("2...");
                        try {
                            Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
                    System.out.println("1...");
                        try {
                            Thread.sleep(1500);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
                    System.out.println("Su compra ha sido cancelada con éxito y el carrito ha sido vaciado.");
                    System.out.println("¡Gracias por preferirnos!");
                    ropa.clear();
                    totalYRetornoCompra.clear();
                    totalAPagar = 0;
                }
                break;
                
            case 9:
                System.out.println("Saliendo de la tienda... ¡Gracias por Preferirnos!");
                break;
            default:
                System.out.println("Opción inválida. Por favor digite una opción. Ejemplo: 2");         
        }
        
        }while(opcionUsuario != 9);
        
        teclado.close();
    }
    
    public RopaComponenteConcreto() {
    }

    public RopaComponenteConcreto(String marcaRopa, String modeloRopa, int precioPrenda, int codigoPrenda) {
        this.marcaRopa = marcaRopa;
        this.modeloRopa = modeloRopa;
        this.precioPrenda = precioPrenda;

    }

    public RopaComponenteConcreto(String marcaRopa, String modeloRopa, String tipoRopa, int precioPrenda) {
        this.marcaRopa = marcaRopa;
        this.modeloRopa = modeloRopa;
        this.tipoRopa = tipoRopa;
        this.precioPrenda = precioPrenda;
    }


    public String getMarcaRopa() {
        return marcaRopa;
    }

    public void setMarcaRopa(String marcaRopa) {
        this.marcaRopa = marcaRopa;
    }

    public String getModeloRopa() {
        return modeloRopa;
    }

    public void setModeloRopa(String modeloRopa) {
        this.modeloRopa = modeloRopa;
    }

    public String getTipoRopa() {
        return tipoRopa;
    }

    public void setTipoRopa(String tipoRopa) {
        this.tipoRopa = tipoRopa;
    }

    public int getPrecioPrenda() {
        return precioPrenda;
    }

    public void setPrecioPrenda(int precioPrenda) {
        this.precioPrenda = precioPrenda;
    }

    @Override
    public void descuento(int total) { // INTERFACE C O M P O N E N T 
        if(total <= 100000) {
        int descuentoAplicado = 10000;
    total = total - descuentoAplicado;
        System.out.println("Descuento exclusivo de $10.000 pesos en el total de tu boleta aplicado con éxito.");
        System.out.println("Tu nuevo Total a Pagar es de: $ "+total);
        System.out.println("Procesando... Por favor espere unos segundos.");
                    System.out.println("3...");
                        try {
                            Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
                    System.out.println("2...");
                        try {
                            Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
                    System.out.println("1...");
                        try {
                            Thread.sleep(1500);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
        System.out.println("Pagado con éxito");
        }
        
        
        if(total > 100000) {
            int descuentoAplicado = 20000;
    total = total - descuentoAplicado;
        System.out.println("Descuento exclusivo de $20.000 pesos en el total de tu boleta aplicado con éxito.");
        System.out.println("Tu nuevo Total a Pagar es de: $ "+total);
        System.out.println("Procesando... Por favor espere unos segundos.");
                    System.out.println("3...");
                        try {
                            Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
                    System.out.println("2...");
                        try {
                            Thread.sleep(1000);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
                    System.out.println("1...");
                        try {
                            Thread.sleep(1500);
                                }catch(InterruptedException e){
                                    System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
                    }
        System.out.println("Pagado con éxito");
        }
    }

    @Override
    public void extra(int total) {
        
    }

    @Override
    public void ejecutar(int total) { // INTERFACE C O M M A N D Para aplicar descuentos
        
        this.descuento(total); // INTERFACE C O M P O N E N T
        
    }
    
    public void saludoDespedida(){
        System.out.println("Gracias por visitar nuestra tienda.");
        System.out.println("¡Te esperamos pronto de vuelta!");
    }

    
    
}