package pacote;

import java.util.Random;

public class MyClass {
    
    public static void main(String[] args){
        //instância um objeto da classe Random usando o construtor básico
        //Exige importação da classe java.util.Random
        Random gerador = new Random();

        //imprime sequência de 10 números inteiros aleatórios entre 1 e 5
        for (int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt(5) + 1);
        }
        
    }
}
