/*
 * FUP que compare textos e valores (Strings e int)
 */
package pacote;

public class Comparacao {

    public static void main(String[] args) {

        String nome = "Jonas";
        String nome2 = "Jonas";

        if (nome.equals(nome2)) {
            System.out.println("São iguais");
        } else {
            System.out.println("Não são iguais");
        }
        
        int num1 = 10;
        int num2 = 5;
        if(num1 == num2){
            System.out.println("Números são iguais");
        }else{
            System.out.println("Números não são iguais");
        }
    }

}
