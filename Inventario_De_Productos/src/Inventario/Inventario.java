package Inventario;

import Producto.Producto;
import java.util.HashMap;
import java.util.Scanner;


public class Inventario {
    
    private HashMap<String, Producto> productos;
    
    public Inventario() {
    
        productos = new HashMap<>();
        
    }
    
    public void agregarProducto() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------=== AGREGAR PRODUCTO ===---------------- ");
        System.out.println("Para agregar un producto, por favor ingrese la información: ");
        System.out.println("Código del Producto: ");
        String nuevoCodigoProducto = teclado.nextLine();
        System.out.println("Ingrese el Nombre del Producto: ");
        String nuevoNombreProducto = teclado.nextLine();
        System.out.println("Ingrese el Precio del Producto: ");
        int nuevoPrecioProducto = teclado.nextInt();
        teclado.nextLine();
        Producto nuevoProducto = new Producto(nuevoCodigoProducto, nuevoNombreProducto, nuevoPrecioProducto);
        productos.put(nuevoProducto.getCodigoProducto(), nuevoProducto);
            System.out.println("Ingresando producto.... Por favor espere.");
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
            System.out.println("Producto ingresado exitosamente. Aquí el resumen del producto ingresado: ");
            System.out.println("Codigo del producto: "+nuevoProducto.getCodigoProducto());
            System.out.println("Nombre del producto: "+nuevoProducto.getNombreProducto());
            System.out.println("Precio del producto: $ "+nuevoProducto.getPrecioProducto());
        
    }
    
    
    public void buscarProducto(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------=== BUSCAR PRODUCTO ===---------------- ");
        System.out.println("Para buscar un producto, debes ingresar el Código del Producto.");
        System.out.println("Por favor ingresa el código del producto que deseas buscar: ");
        String codigoBusqueda = teclado.nextLine();
        
        Producto productoEncontrado = productos.get(codigoBusqueda);
        
        if(productoEncontrado != null) {
            System.out.println("Producto encontrado con éxito. ");
            System.out.println("Nombre del Producto: "+productoEncontrado.getNombreProducto());
            System.out.println("Precio del Producto: $ "+productoEncontrado.getPrecioProducto());
                } else {
                    System.out.println("No se ha encontrado ningún producto con el código ingresado.");
        }
    }
    
    
    public void buscarTodosLosProductos(){
        System.out.println("----------------=== BUSCAR TODOS LOS PRODUCTOS ===---------------- ");
        for(Producto producto : productos.values()) {
            System.out.println("Código del Producto: "+producto.getCodigoProducto());
            System.out.println("Nombre del Producto: "+producto.getNombreProducto());
            System.out.println("Precio del Producto : $"+producto.getPrecioProducto());
        }
    }
    
    
    public void generarInforme(){
            System.out.println("----------------=== INFORME DE INVENTARIO ===---------------- ");
            System.out.println("Cantidad de productos en el inventario: "+productos.size());

    }
    
    
    public void actualizarCodigo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------=== ACTUALIZAR INVENTARIO ===---------------- ");
        System.out.println("Ingrese el Código del Producto que desea actualizar:  ");
        String codigoBusqueda = teclado.nextLine();
        
        Producto productoEncontrado = productos.get(codigoBusqueda);
        
        if(productoEncontrado != null) {
            System.out.println("Producto encontrado ");
            System.out.println("Por favor, digite el NUEVO Código del Producto: ");
            String nuevoCodigo = teclado.nextLine();
            if(!nuevoCodigo.isEmpty()) {
                productoEncontrado.setCodigoProducto(nuevoCodigo);
                System.out.println("El cambio de Código se ha hecho efectivo.");
                System.out.println("El nuevo Código del Producto: "+productoEncontrado.getCodigoProducto());
                System.out.println("El Nombre del Producto: "+productoEncontrado.getNombreProducto());
                System.out.println("El Precio del Producto: $ "+productoEncontrado.getPrecioProducto());
            }
                } else {
                    System.out.println("No se ha encontrado ningún producto con el código ingresado.");
        }
    }
    
    public void actualizarNombre(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------=== ACTUALIZAR INVENTARIO ===---------------- ");
        System.out.println("Ingrese el Código del Producto que desea actualizar:  ");
        String codigoBusqueda = teclado.nextLine();
        
        Producto productoEncontrado = productos.get(codigoBusqueda);
        
        if(productoEncontrado != null) {
            System.out.println("Producto encontrado ");
            System.out.println("Por favor, digite el NUEVO Nombre del Producto: ");
            String nuevoNombre = teclado.nextLine();
            if(!nuevoNombre.isEmpty()) {
                productoEncontrado.setNombreProducto(nuevoNombre);
                System.out.println("El cambio de Nombre se ha hecho efectivo.");
                System.out.println("El Código del Producto: "+productoEncontrado.getCodigoProducto());
                System.out.println("El nuevo Nombre del Producto: "+productoEncontrado.getNombreProducto());
                System.out.println("El Precio del Producto: $ "+productoEncontrado.getPrecioProducto());
            }
                } else {
                    System.out.println("No se ha encontrado ningún producto con el código ingresado.");
        }
    }
    
    public void actualizarPrecio(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------=== ACTUALIZAR INVENTARIO ===---------------- ");
        System.out.println("Ingrese el Código del Producto que desea actualizar:  ");
        String codigoBusqueda = teclado.nextLine();
        
        Producto productoEncontrado = productos.get(codigoBusqueda);
        
        if(productoEncontrado != null) {
            System.out.println("Producto encontrado ");
            System.out.println("Por favor, digite el NUEVO Precio del Producto: ");
            int nuevoPrecio = teclado.nextInt();
            teclado.nextLine();
            if(nuevoPrecio != 0) {
                productoEncontrado.setPrecioProducto(nuevoPrecio);
                System.out.println("El cambio de Precio se ha hecho efectivo.");
                System.out.println("El Código del Producto: "+productoEncontrado.getCodigoProducto());
                System.out.println("El Nombre del Producto: "+productoEncontrado.getNombreProducto());
                System.out.println("El nuevo Precio del Producto: $ "+productoEncontrado.getPrecioProducto());
            }
                } else {
                    System.out.println("No se ha encontrado ningún producto con el código ingresado.");
        }
    }
    
    public void eliminarProducto(){
    
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------=== ELIMINAR PRODUCTO ===---------------- ");
        System.out.println("Para eliminar un producto, debes ingresar el Código del Producto.");
        System.out.println("Por favor ingresa el código del producto que deseas eliminar: ");
        String codigoBusqueda = teclado.nextLine();
        
        Producto productoEncontrado = productos.get(codigoBusqueda);
        
        if(productoEncontrado != null) {
        productos.remove(codigoBusqueda);
        System.out.println("Eliminando producto.... Por favor espere.");
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
        
            System.out.println("Producto Eliminado con éxito");
            System.out.println("");
        }
        
    }
    
}
