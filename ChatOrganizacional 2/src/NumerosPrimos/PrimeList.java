package NumerosPrimos;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeList extends ArrayList<Integer> {
    
    public boolean isPrime(int number) { // Método para verificar numeros primos
    
    if(number <= 1) {
        return false;
    }
    for(int i = 2; i * i <= number; i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
    }
    
    @Override // Sobre escritura del método ADD para sólo agregar números primos a la ArayList.
    public boolean add(Integer number) { 
    if(!isPrime(number)) {
        throw new IllegalArgumentException("El número " + number + " no es PRIMO y por lo tanto no se puede agregar a la lista.");
    }
    return super.add(number);
    }
    
    @Override // Sobre escritura del método ADD cuando se quiera agregar un número primo a la ArrayList mediante índice
    public void add(int index, Integer number) {
    if(!isPrime(number)) {
        throw new IllegalArgumentException("El número " + number + " no es PRIMO y por lo tanto no se puede agregar a la lista.");
    }
    super.add(index, number);
    }
    
    @Override // Sobre escribimos el método REMOVE
    public Integer remove(int index) {
        return super.remove(index);
    }
    
    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }
    
    // Método para devolver la cantidad de números primos en la lista
    public int getPrimesCount() {
        return this.size();
    }
    
    public void calculadoraNumeroPrimo(){
        
        Scanner teclado = new Scanner(System.in);
        
    System.out.println("-------------------------- VERIFICADOR DE NUMEROS PRIMOS --------------------------");
    System.out.println("Instrucciones de Uso:");
    System.out.println("Para saber si un número es un número primo, simplemente ingrese un número a continuación: ");
    int nPrimo = teclado.nextInt();
    teclado.nextLine();
    boolean resultado = isPrime(nPrimo);
    if(resultado) {
        System.out.println("El número ingresado "+nPrimo+" SI es un número primo.");
    } else {
        System.out.println("El número ingresado "+nPrimo+" NO es un número primo.");
   }
    }
    
    public void ingresarNumeroAColeccion() {
    
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("---------------------- Colección PrimeList (ArrayList modificado) ----------------------");
        System.out.println("");
        System.out.println("RECUERDA: El número que ingreses, sólo se unirá a la Colección si es un NÚMERO PRIMO.");
        System.out.println("En caso de que el número NO sea primo, el programa dará un error IllegalArgumentException.");
        System.out.println("Para ingresar un número a la Colección PrimeList, digita el número: ");
        int numeroIngresado = teclado.nextInt();
        PrimeList numerosPrimos = new PrimeList();
        numerosPrimos.add(numeroIngresado);
        if(!numerosPrimos.isEmpty()) {
            System.out.println("Número " + numeroIngresado + " ingresado correctamente ");
        }
    
    
    }
    
    public void tamanioColeccion(){
    
        System.out.println("--------------- TAMAÑO COLECCIÓN PRIMELIST ---------------");
        System.out.println("");
        System.out.println("A continuación, se mostrarán cuantos números primos hay en una PrimeList que contiene 10.000 números enteros.");
        System.out.println("El resultado demostrará efectivamente cuantos números primos hay en total entre 0 y 9.999 números.");
        PrimeList listaNumerosPrimos = GeneradorNumeroPrimo.generadorPrimos(10000);
        System.out.println("");
        System.out.println("=========== RESULTADO ===========");
        System.out.println("");
        System.out.println("La cantidad total de números primos entre 10.000 números en el PrimeList: "+listaNumerosPrimos.getPrimesCount());
    }
}
