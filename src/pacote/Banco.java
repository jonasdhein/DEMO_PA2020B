package pacote;

public class Banco {
    
    public static void main(String[] args){
        
        int conta1 = 1;
        String nomeConta1 = "Jonas";
        float saldoConta1 = 200;
        System.out.println("Conta: " + conta1 + " - " + nomeConta1 + " (R$ " + saldoConta1 + ")");
        
        int conta2 = 2;
        String nomeConta2 = "Juca";
        float saldoConta2 = 500;
        System.out.println("Conta: " + conta2 + " - " + nomeConta2 + " (R$ " + saldoConta2 + ")");
        
        //operacao de transferencia de dinheiro entre as contas
        //Conta1 vai transferir R$ 100,00 para a conta2
        saldoConta1 -= 100;
        saldoConta2 += 100;
        
        System.out.println("Conta: " + conta1 + " - " + nomeConta1 + " (R$ " + saldoConta1 + ")");
        System.out.println("Conta: " + conta2 + " - " + nomeConta2 + " (R$ " + saldoConta2 + ")");
        
    }
    
}
