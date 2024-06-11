package cl.duoc.Cuenta;

public abstract class Cuenta {
    
    private int numeroCuenta;
    private int saldo;
    
    public Cuenta() {
        
        
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    public abstract void depositarDinero();
    public abstract void retirarDinero();
    public abstract int calcularInteres();
    
}
