package pacote;

import java.util.Random;

public class SorteioRepresentantes {
    
    public static void main(String[] args){
        //instância um objeto da classe Random usando o construtor básico
        //Exige importação da classe java.util.Random
        Random gerador = new Random();
        
        String[] alunos = new String[4];
        alunos[0] = "Gabriel";
        alunos[1] = "João";
        alunos[2] = "Gian";
        alunos[3] = "Fernando";

        int representante = gerador.nextInt(4);
        int vice_representante = gerador.nextInt(4);
        
        System.out.println("Representante escolhido: " + alunos[representante]);
        System.out.println("Vice-Representante escolhido: " + alunos[vice_representante]);
        
    }
}
