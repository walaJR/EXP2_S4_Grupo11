package inventario_de_productos;

import Inventario.Inventario;
import java.util.Scanner;

public class Inventario_De_Productos {

    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();
        Scanner teclado = new Scanner (System.in);
        int opcionUsuario;
        
        do{
        System.out.println("----------------======== GESTIÓN DE INVENTARIO ----------------========");
        System.out.println("Digite [1] Para AGREGAR un Producto al Inventario");
        System.out.println("Digite [2] Para BUSCAR un Producto por su código en el Inventario");
        System.out.println("Digite [3] Para VER todos los Productos del Inventario");
        System.out.println("Digite [4] Para ACTUALIZAR la información de un Producto");
        System.out.println("Digite [5] Para ELIMINAR un Producto del Inventario");
        System.out.println("Digite [6] Para SALIR");
        opcionUsuario = teclado.nextInt();
        teclado.nextLine();
        
        switch(opcionUsuario) {
        
            case 1: inventario.agregarProducto();
                    break;
                    
            case 2: inventario.buscarProducto();
                    break;
                    
            case 3: inventario.buscarTodosLosProductos();
                    break;
                    
            case 4: System.out.println("Digite [1] Si desea ACTUALIZAR el Código de un Producto");
                    System.out.println("Digite [2] Si desea ACTUALIZAR el Nombre de un Producto");
                    System.out.println("Digite [3] Si desea ACTUALIZAR el Precio de un Producto");
                    int opcionDos = teclado.nextInt();
                    teclado.nextLine();
                    
                    switch(opcionDos) {
                    
                    
                        case 1: inventario.actualizarCodigo();
                                break;
                        case 2: inventario.actualizarNombre();
                                break;
                        case 3: inventario.actualizarPrecio();
                                break;
                                
                        default: System.out.println("Opción inválida. Por favor, digite una opción. Ejemplo: 1");
                    }
                    
            case 5: inventario.eliminarProducto();
                    break;
                    
                    
            case 6: System.out.println("Saliendo...");
                    break;
                    
            default: System.out.println("Opción inválida. Por favor, digite una opción. Ejemplo: 1");
        
        }
        
        }while(opcionUsuario !=6);
       
        teclado.close();
    }
    
}
