package NumerosPrimos;

public class GeneradorNumeroPrimo {
    
    public static PrimeList generadorPrimos(int limite) {
    
    boolean[] esPrimo = new boolean[limite+1];
    
    for(int i = 2; i <= limite; i++) {
        esPrimo[i] = true;
    }
    
    for(int i = 2; i * i <= limite; i++) {
        if(esPrimo[i]) {
            for(int j = i * i; j <= limite; j+= i) {
                esPrimo[j] = false;
             } 
          }
    }
    
    PrimeList numerosPrimos = new PrimeList();
    for(int i = 2; i <= limite; i++) {
        if(esPrimo[i]) {
        numerosPrimos.add(i);
        }
    }
    
    return numerosPrimos;

    }
}
