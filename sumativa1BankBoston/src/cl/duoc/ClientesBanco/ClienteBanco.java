package cl.duoc.ClientesBanco;

import cl.duoc.CuentaAhorro.CuentaAhorro;
import cl.duoc.CuentaCorriente.CuentaCorriente;
import cl.duoc.CuentaInversion.CuentaInversion;
import java.util.Scanner;


public class ClienteBanco {
    
    private String rut;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String domicilio;
    private String comuna;
    private int telefono;
    private int cuentaBancaria;
    public int numeroCuentaUsuario = 0;
    public int saldoUsuarioRegistro = 0;
    public int eleccionTipoCuenta = 0;
    private String tipoCuenta = "";
    
    private CuentaCorriente cuentaCorriente;
    private CuentaAhorro cuentaAhorro;
    private CuentaInversion cuentaInversion;
    Scanner teclado = new Scanner(System.in);

    public ClienteBanco() {
    }

    
    public ClienteBanco(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String domicilio, String comuna, int telefono, int cuentaBancaria) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
        this.comuna = comuna;
        this.telefono = telefono;
        this.cuentaBancaria = cuentaBancaria;
    }
    
    public void registrarCliente() {
    
        System.out.println(" -------------------------- REGISTRO DE CLIENTES --------------------------");
        System.out.println("Esta es la plataforma de registro de clientes --- BANK BOSTON INTERNATIONAL ---");
        System.out.println("Por favor, ingrese su Rut. Con puntos, guion y digito verificador. Ejemplo: 12.453.412-0");
        String rutUsuario = teclado.nextLine(); 
        if (rutUsuario.length() >= 11 && rutUsuario.length() <= 12) {
            numeroCuentaUsuario = 100000000 + (int) (Math.random() * 900000000);
            saldoUsuarioRegistro = 0;
            setRut(rutUsuario);
            System.out.println("Rut ingresado correctamente");
        }
        else {
            System.out.println("Invalido. Por favor digite su rut. Con puntos, guion y digito verificacor. Ejemplo: 12.453.412-0");
            return;
        }
        System.out.println("Digite el Tipo de Cuenta que usted desea.");
        System.out.println("[1] Para CREAR una Cuenta Corriente");
        System.out.println("[2] Para CREAR una Cuenta de Ahorro");
        System.out.println("[3] Para CREAR una Cuenta de Inversion");
        eleccionTipoCuenta = teclado.nextInt();
        
       switch (eleccionTipoCuenta) {
       
           case 1:
               System.out.println("Usted ha elegido la Opcion Cuenta Corriente");
               setTipoCuenta("Cuenta Corriente");
               cuentaCorriente = new CuentaCorriente();
               cuentaCorriente.setNumeroCuenta(numeroCuentaUsuario);
               cuentaCorriente.setSaldo(saldoUsuarioRegistro);
               int interes = cuentaCorriente.calcularInteres(2);
               cuentaCorriente.setInteresAsociado(interes);
               System.out.println("El interes asociado a su nueva cuenta será del: "+cuentaCorriente.getInteresAsociado()+" %.");
               break;
               
           case 2:
               System.out.println("Usted ha elegido la Opcion Cuenta de Ahorro");
               setTipoCuenta("Cuenta de Ahorro");
               cuentaAhorro = new CuentaAhorro();
               cuentaAhorro.setNumeroCuenta(numeroCuentaUsuario);
               cuentaAhorro.setSaldo(saldoUsuarioRegistro);
               interes = cuentaAhorro.calcularInteres();
               cuentaAhorro.setInteresAsociado(interes);
               System.out.println("El interes asociado a su nueva cuenta será del: "+cuentaAhorro.getInteresAsociado()+" %.");
               break;
               
           case 3:
               System.out.println("Usted ha elegido la Opcion Cuenta de Inversion");
               setTipoCuenta("Cuenta de Inversion");
               cuentaInversion = new CuentaInversion();
               cuentaInversion.setNumeroCuenta(numeroCuentaUsuario);
               cuentaInversion.setSaldo(saldoUsuarioRegistro);
               interes = cuentaInversion.calcularInteres(4);
               cuentaInversion.setInteresAsociado(interes);
               System.out.println("El interes asociado a su nueva cuenta será del: "+cuentaInversion.getInteresAsociado()+" %.");
               break;
            
           default:
               System.out.println("Opción no valida. Por favor Digite 1, 2 o 3");
               return;
           
       }
        teclado.nextLine();
        System.out.println("Para Continuar, Por favor Ingrese su nombre completo. Ejemplo: Esteban Efrain");
        String nombreCompleto = teclado.nextLine();
        if (!nombreCompleto.isEmpty()) {
        setNombre(nombreCompleto);
            System.out.println("Nombre ingresado correctamente");
        } else {
            System.out.println("Invalido. Por favor ingrese su nombre completo. Ejemplo: Esteban Efrain");
        }
        System.out.println("Ingrese su Apellido Paterno. Ejemplo: Paredes");
        String apellidoPaternoUsuario = teclado.nextLine();
        if (!apellidoPaternoUsuario.isEmpty()) {
            setApellidoPaterno(apellidoPaternoUsuario);
            System.out.println("Apellido Paterno ingresado correctamente");
        } else {
            System.out.println("Invalido. Por favor ingrese su Apellido Paterno. Ejemplo: Paredes");
        }
        System.out.println("Ingrese su Apellido Materno. Ejemplo: Quintanilla");
        String apellidoMaternoUsuario = teclado.nextLine();
        if (!apellidoMaternoUsuario.isEmpty()) {
        setApellidoMaterno(apellidoMaternoUsuario);
            System.out.println("Apellido Materno ingresado correctamente");
        } else {
            System.out.println("Invalido. Por favor ingrese su Apellido Materno. Ejemplo: Quintanilla");
        }
        System.out.println("Ingrese su Domicilio. Ejemplo: Av. Marathon #5300");
        String domicilioUsuario = teclado.nextLine();
        if (!domicilioUsuario.isEmpty()) {
        setDomicilio(domicilioUsuario);
            System.out.println("Domicilio ingresado correctamente");
        } else {
            System.out.println("Invalido. Por favor ingrese su domicilio. Ejemplo: Av. Marathon #5300");
        }
        System.out.println("Ingrese su Comuna. Ejemplo: Macul");
        String comunaUsuario = teclado.nextLine();
        if (!comunaUsuario.isEmpty()) {
        setComuna(comunaUsuario);
            System.out.println("Comuna ingresada correctamente");
        }
        else {
            System.out.println("Invalido. Por favor ingrese su comuna. Ejemplo: Macul");
        }
        System.out.println("Ingrese su Número de Teléfono: Ejemplo: 963867456");
        int telefonoUsuario = teclado.nextInt();
        if (telefonoUsuario >0) {
        setTelefono(telefonoUsuario);
            System.out.println("Telefono ingresado correctamente");
        } else {
            System.out.println("Invalido. Por favor ingrese su teléfono. Ejemplo: 963867456");
        }
        
        System.out.println("Proceso exitoso. Se ha creado tu Cuenta Bancaria");
        System.out.println("A continuacion, tu numero de cuenta. ¡Anotalo, guardalo! ¡No lo olvides!");
        System.out.println("Tu Número de cuenta es: " +numeroCuentaUsuario+" Tipo de cuenta: "+getTipoCuenta());
        System.out.println("Muchas gracias por confiar en BANK BOSTON. Estamos honrados de que nos hayas elegido como tu Banco");
        System.out.println(" ");
        System.out.println("---------------------------- BANK BOSTON INTERNATIONAL ----------------------------");
        
    }
    public void verDatosCliente(){
        
            System.out.println("------------------------ MIS DATOS ------------------------");
            System.out.println("¡Bienvenido "+getNombre()+"!");
            System.out.println("El resumen de tus datos personales registrados en BANK BOSTON: ");
            System.out.println("Rut: "+getRut());
            System.out.println("Nombre completo: "+getNombre());
            System.out.println("Apellido Paterno: "+getApellidoPaterno());
            System.out.println("Apellido Materno: "+getApellidoMaterno());
            System.out.println("Domicilio: "+getDomicilio());
            System.out.println("Comuna: "+getComuna());
            System.out.println("Teléfono: "+getTelefono());
            System.out.println("Tipo de Cuenta: "+getTipoCuenta());
            
            switch (getTipoCuenta()) {
            
                case "Cuenta Corriente":
                    System.out.println("Numero de Cuenta Corriente: "+cuentaCorriente.getNumeroCuenta());
                    System.out.println("Saldo: $ "+cuentaCorriente.getSaldo()+" pesos.");
                    System.out.println("El interes aplicado a tu cuenta es de un: "+cuentaCorriente.getInteresAsociado()+" %.");
                    break;
                    
                case "Cuenta de Ahorro":
                    System.out.println("Numero de Cuenta de Ahorro: "+cuentaAhorro.getNumeroCuenta());
                    System.out.println("Saldo: $ "+cuentaAhorro.getSaldo()+" pesos.");
                    System.out.println("El interes aplicado a tu cuenta es de un: "+cuentaAhorro.getInteresAsociado()+" %.");
                    break;
                    
                case "Cuenta de Inversion":
                    System.out.println("Numero de Cuenta de Credito: "+cuentaInversion.getNumeroCuenta());
                    System.out.println("Saldo: $ "+cuentaInversion.getSaldo());
                    System.out.println("El interes aplicado a tu cuenta es de un: "+cuentaInversion.getInteresAsociado()+" %.");
                    break;
                
            }
    }
    
    public CuentaCorriente getCuentaCorriente() {
    return cuentaCorriente;
    }
    
    public CuentaAhorro getCuentasAhorro() {
    return cuentaAhorro;
    }
    
    public CuentaInversion getCuentaInversion() {
    return cuentaInversion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    public String getTipoCuenta() {
    return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
}
