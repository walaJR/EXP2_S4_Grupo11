package PrimesThread;

import NumerosPrimos.PrimeList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class PrimesThread extends Thread{
    
    PrimeList primeList;
    private Lock lock = new ReentrantLock();
    
    @Override
    public synchronized void run() { // SYNCHRONIZED
        lock.lock();
        System.out.println("Generando un número aleatorio");
        System.out.println("Por favor espere unos segundos...");
        System.out.println("");
        try {
            PrimesThread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
        }
        System.out.println("...");
        int numeroAleatorio = (int) (Math.random() * 90000);
        System.out.println("Número creado con éxito. Tu número aleatorio es: "+numeroAleatorio);
        System.out.println("-------");
        System.out.println("Comprobando si el número es un número primo. Por favor espere unos segundos...");
        try {
            PrimesThread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
        }
        System.out.println("...");
        boolean verificacion = primeList.isPrime(numeroAleatorio);
        while(!verificacion) {
        try {
        wait(); // WAIT
        }catch(InterruptedException excepti) {
            System.out.println("Ha ocurrido un fallo inesperado.");
            return;
        }
        }
        if(verificacion) {
            System.out.println("El número "+numeroAleatorio+"es un número primo, y se añadirá a la Lista de Números Primos.");
            System.out.println("Añadiendo el número primo a la lista. Por favor espere unos segundos...");
            try {
            PrimesThread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("Ups... Algo imprevisto ha ocurrido. Inténtalo otra vez.");
        }
            System.out.println("...");
            PrimeList listaNumerosPrimos = new PrimeList();
            List<Integer> syncList = Collections.synchronizedList(listaNumerosPrimos); // SYNCHRONIZED LIST
            syncList.add(numeroAleatorio);
            listaNumerosPrimos.add(numeroAleatorio);
            System.out.println("El número primo ha sido añadido con éxito a PrimeList y SynchronizedList");
            System.out.println("La lista de números primos: ");
            System.out.println(listaNumerosPrimos);
            System.out.println("La lista SynchronizedList de números primos: ");
            System.out.println(syncList.size());
            System.out.println("Y la cantidad de elementos(números primos) totales en la lista es de: "+listaNumerosPrimos.getPrimesCount());
        } else {
            throw new IllegalArgumentException("El número NO es primo y por lo tanto no se puede agregar a la lista.");
        }
        notifyAll(); // NOTIFY
        lock.unlock();
    }
}
