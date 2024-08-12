package DiscountManager;


public class DiscountManager { // PATRÓN DE DISEÑO S I N G L E T O N
    
    private static DiscountManager descuento;
    
    private DiscountManager(){
    }
    
    public static DiscountManager obtenerInstancia() {
        
        if(descuento == null) {
        descuento = new DiscountManager();
        }
        
        return descuento;
    }
    
    public void realizarDescuento(int total){
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
        System.out.println("¡Gracias por preferirnos!");
    }
}
