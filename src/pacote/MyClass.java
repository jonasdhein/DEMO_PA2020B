package pacote;

import java.util.Random;

public class MyClass {
    
    public static void main(String[] args){
        //instância um objeto da classe Random usando o construtor básico
        //Exige importação da classe java.util.Random
        Random gerador = new Random();

        //imprime sequência de 10 números inteiros aleatórios entre 1 e 5
        for (int i = 0; i < 10; i++) {
            //System.out.println(gerador.nextInt(5) + 1);
        }
        
        int num1 = 10;
        int num2 = 100;
        
        int num3 = 0;
        num3 = soma(num1, num2);
        System.out.println("Soma = " + num3);
    }
    
    private static int soma(int n1, int n2){
        int n3 = n1 + n2;
        return n3;
    }
}
