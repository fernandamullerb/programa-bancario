package projetobancario;

public class ContaBancaria {

    //Atributos:
    private String nomeBanco;
    private String numeroAgencia;
    private String numeroConta;
    private String nomeTitular;
    private char tipoConta;
    private float saldo;
    private String segundoTitular;
    
    //Construtor:
    public ContaBancaria(String nomeBanco, String numeroConta, String nomeTitular) {
        this.nomeBanco = nomeBanco;
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0f;
    }
    
    //Getter:
    public String getNomeBanco() {
    return nomeBanco;
    }
    
    public String getNumeroAgencia() {
    return numeroAgencia;
    }
        
    public String getNumeroConta() {
        return numeroConta;
    }
    
    public String getNomeTitular() {
    return nomeTitular;
    }
    
    public char getTipoConta() {
    return tipoConta;
    }
    
    public float getSaldo() {
    return saldo;
    }
    
    public String getSegundoTitular() {
    return segundoTitular;
    }
    
    //Setter:   
    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
        
    public void setTipoConta(char tipoConta) {
        if (tipoConta == 'P' || tipoConta == 'C') {
            this.tipoConta = tipoConta;
        }
    }
    
    public void setSegundoTitular(String segundoTitular) {
        this.segundoTitular = segundoTitular;
    }
    
    //Método Depositar:
    public void depositar(float valorDeposito) {
        if (valorDeposito > 0.0) {
            saldo += valorDeposito;
            System.out.println("Depósito de R$ " + valorDeposito + " realizado.");
        } else {
            System.out.println("Valor inválido.");
        }
        System.out.println("Saldo atual: R$ " + saldo);
    }
    
    //Método Sacar:
    public void sacar(float valorSaque) {
        if (valorSaque < 0.0) {
            System.out.println("Valor inválido.");            
        } else if (valorSaque > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("Saque de R$ " + valorSaque + " realizado.");
            saldo -= valorSaque; 
        }
        System.out.println("Saldo atual: R$ " + saldo);
    }
    
    //Método Imprimir:
    public void imprimirDados(){
         System.out.println("Banco: " + getNomeBanco());
         System.out.println("Agência: " + getNumeroAgencia());
         System.out.println("Conta: " + getNumeroConta());
         System.out.println("Titular: " + getNomeTitular());
         System.out.println("Tipo de Conta: " + getTipoConta());
         System.out.println("Saldo Atual: " + getSaldo());
     }
}
