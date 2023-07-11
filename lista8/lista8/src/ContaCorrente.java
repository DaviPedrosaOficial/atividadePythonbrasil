/*Classe Conta Corrente: Crie uma classe para implementar uma conta corrente. 
A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. 
Os métodos são os seguintes: alterarNome, depósito e saque; No construtor, saldo é opcional, 
com valor default zero e os demais atributos são obrigatórios.
*/

public class ContaCorrente {
    
    private int numConta;
    private String nomeCon;
    private double saldo = 0;

    public ContaCorrente(int numConta, String nomeCon){
        this.setNumConta(numConta);
        this.setNomeCon(nomeCon);
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta (int num){
        this.numConta = num;
    }

    public void getnomeCon(){
        System.out.printf("%nNome da Conta: %s",this.nomeCon);
    }

    public void setNomeCon (String nome){
        this.nomeCon = nome;
    }

    public void alterarNome(String nome){
        this.nomeCon = nome;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public void saque(double valor){
        this.saldo -= valor;
    }

    public void status(){
        System.out.printf("Nome do proprietário: %s%nNumero da conta: %d%nSaldo em conta: %.2f",this.nomeCon,this.numConta,this.saldo);
    }
}
