package pacote;

public class BancoObjetos {
    
    public static void main(String[] args){
        
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        conta1.setConta(1);
        conta1.setNome("Jonas");
        conta1.setSaldo(200);
        
        conta2.setConta(2);
        conta2.setNome("Juca");
        conta2.setSaldo(500);
        
        //Imprima todas as informações de uma conta em apenas uma linha
        System.out.println(conta1.imprimeConta());
        System.out.println(conta2.imprimeConta());
        
        //Operação de saque. Precisa veriricar se existe suficiente para o saque
        //conta1.saque(50);
        
        //conta1.transferencia(100, conta2);
        System.out.println(conta1.imprimeConta());
        System.out.println(conta2.imprimeConta());
        
        //BÔNUS: Fazer operação de transferência (pode ser um saque e um depósito)
        

    }
    
}
