/*Classe Conta Corrente: Crie uma classe para implementar uma conta corrente. 
A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. 
Os métodos são os seguintes: alterarNome, depósito e saque; No construtor, saldo é opcional, 
com valor default zero e os demais atributos são obrigatórios.
*/

public class ContaCorrente {
    
    private int numConta;
    private String nomeCor;
    private double saldo = 0;

    public ContaCorrente(int numConta, String nomeCor){
        this.setNumConta(numConta);
        this.setNomeCor(nomeCor);
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta (int num){
        this.numConta = num;
    }

    public String getNomeCor(){
        return this.nomeCor;
    }

    public void setNomeCor (String nome){
        this.nomeCor = nome;
    }

    public void alterarNome(String nome){
        this.nomeCor = nome;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public void saque(double valor){
        this.saldo -= valor;
    }

    public void status(){
        System.out.printf("Nome do proprietário: %s%nNumero da conta: %d%nSaldo em conta: %.2f",this.nomeCor,this.numConta,this.saldo);
    }
}
