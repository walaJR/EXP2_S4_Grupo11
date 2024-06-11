package cl.duoc.CuentaAhorro;

import cl.duoc.Cuenta.Cuenta;
import cl.duoc.interfaceCuentasBanco.InterfaceCuentasBanco;
import java.util.Scanner;

public class CuentaAhorro extends Cuenta implements InterfaceCuentasBanco{
    
    private String tipoDeCuenta = "Cuenta Ahorro";
    private int interesAsociado = 0;
    public int saldoRegistro = 0;
    
    public CuentaAhorro() {
        super();
    }
    
    Scanner teclado = new Scanner(System.in);
    
    @Override // SOBRE ESCRITURA DE METODOS ABSTRACTOS
    public void depositarDinero() {
        System.out.println("--------------------------- ACCEDIENDO AL SISTEMA ---------------------------");
        System.out.println("--------------------------=== "+getTipoDeCuenta()+" ===--------------------------");
        System.out.println("--------------------------------- DEPOSITOS ----------------------------------");
            System.out.println("Por favor, indica el monto a depositar. Ejemplo: 50000");
            int deposito = teclado.nextInt(); 
            if (deposito > 0) {
            saldoRegistro = getSaldo();
            saldoRegistro = saldoRegistro + deposito;
            setSaldo(saldoRegistro);
            System.out.println("¡Deposito realizado!");
            System.out.println("Haz hecho un deposito por un total de: $ "+deposito+" pesos.");
            System.out.println("Tu nuevo saldo es: $ "+getSaldo()+" pesos.");
            } else {
                System.out.println("No se permite el ingreso de montos menores o iguales a 0 pesos. Por favor introduce un monto valido");
            }
    }
    @Override // SOBRE ESCRITURA DE METODOS ABSTRACTOS
    public void retirarDinero() {
        teclado.nextLine();
        System.out.println("--------------------------- ACCEDIENDO AL SISTEMA ---------------------------");
        System.out.println("--------------------------=== "+getTipoDeCuenta()+" ===--------------------------");
            System.out.println("---------------------------- RETIRAR DINERO -----------------------------");
            System.out.println("Por favor digita el monto que deseas retirar: ");
            int giroUsuario = teclado.nextInt();
            if (giroUsuario <= 0) {
                System.out.println("El monto a retirar debe ser mayor a 0 pesos");
            } else if (giroUsuario > getSaldo()) {
                System.out.println("El monto a retirar excede tu saldo actual");
            } else {
            int nuevoSaldo = getSaldo();
            nuevoSaldo = nuevoSaldo - giroUsuario;
            setSaldo(nuevoSaldo);
                System.out.println("¡Retiro exitoso! Tu nuevo saldo es: $ "+getSaldo()+" pesos.");
            }
    }
    @Override // SOBRE ESCRITURA DE METODOS ABSTRACTOS
    public int calcularInteres() {
    return 0;
    }
    // SOBRE CARGA DE METODO CALCULARINTERES().
    public int calcularInteres(int interes) {
    return interes;
    }
    @Override // INTERFACE
    public void consultarSaldo() {
        System.out.println("--------------------------- ACCEDIENDO AL SISTEMA ---------------------------");
        System.out.println("--------------------------=== "+getTipoDeCuenta()+" ===--------------------------");
        System.out.println("----------------------------- CONSULTA SALDO ------------------------------");
        System.out.println("Tu saldo es: $ "+getSaldo()+" pesos.");
    }
    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public int getInteresAsociado() {
        return interesAsociado;
    }

    public void setInteresAsociado(int interesAsociado) {
        this.interesAsociado = interesAsociado;
    } 
}
