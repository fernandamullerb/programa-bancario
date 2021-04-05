package projetobancario;

import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {

        //Objeto:
        ContaBancaria cb = new ContaBancaria("Fernanda Bank", "10090-56", "Louro José");
       
        System.out.println("Seja bem-vindo ao Fernanda Bank");
        int i=0;
        while(i == 0) {
        System.out.println("Escolha a opção desejada: \n 1 - Consultar saldo \n 2 - Depositar \n 3 - Sacar \n 4 - Alterar tipo da conta \n 5 - Trocar de agência \n 6 - Incluir segundo titular \n 7 - Imprimir todos os dados \n 8 - Sair");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        
        switch (opcao) {  
            
            case 1: System.out.println("Saldo: R$ " + cb.getSaldo()); break;
            
            case 2: System.out.println("Digite o valor do depósito:");
                float valorDeposito = sc.nextFloat();
                cb.depositar(valorDeposito); break;
                
            case 3: System.out.println("Digite o valor do saque:");
                float valorSaque  = sc.nextFloat();
                cb.sacar(valorSaque); break;
                
            case 4: System.out.println("Escolha o tipo de conta que deseja: \n C - Corrente \n P - Poupança");
                char tipoConta = sc.next().toUpperCase().charAt(0);
                cb.setTipoConta(tipoConta);
                if (tipoConta == 'P') {
                    System.out.println("Tipo de conta: Poupança");
                } else if (tipoConta == 'C') {
                    System.out.println("Tipo de conta: Corrente");
                } else {
                    System.out.println("Tipo de conta inválido");
                } break;
                
            case 5: System.out.println("Digite o número da nova agência:");
                String numeroAgencia = sc.next();
                cb.setNumeroAgencia(numeroAgencia); break;
                
            case 6: System.out.println("Digite o nome do segundo titular: ");
                String segundoTitular = sc.next();
                cb.setSegundoTitular(segundoTitular);
                System.out.println(segundoTitular + " incluído(a) com sucesso como segundo titular da conta.");  break;    
            
            case 7: cb.imprimirDados(); break;
            
            case 8: i=1; break;
            
            default: System.out.println("Opção inválida"); break;
            
            }
        }
    }
}
