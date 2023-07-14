package Banco;
/*Classe Conta de Investimento: Faça uma classe contaInvestimento que seja semelhante a classe contaBancaria, 
com a diferença de que se adicione um atributo taxaJuros. 

Forneça um construtor que configure tanto o saldo inicial como a taxa de juros. 
Forneça um método adicioneJuros (sem parâmetro explícito) que adicione juros à conta. 

Escreva um programa que construa uma poupança com um saldo inicial de R$1000,00 e uma taxa de juros de 10%. 
Depois aplique o método adicioneJuros() cinco vezes e imprime o saldo resultante. */

public class ContaInvestimento {
    
    private int numConta;
    private String nomeCon;
    private double saldo;
    private double taxaJuros;

    public ContaInvestimento (int numConta, String nomeCon, double saldoInicial, double taxaJuros){
        this.numConta = numConta;
        this.nomeCon = nomeCon;
        this.saldo = saldoInicial;
        this.taxaJuros = taxaJuros;
    }

    public void setNumConta (int numConta){
        this.numConta = numConta;
    }

    public void getNumConta (){
        System.out.printf("%nNumero da Conta : %d",this.numConta);
    }

    public void setNomeConta (String nomeCon){
        this.nomeCon = nomeCon;
    }

    public void getNomeConta (){
        System.out.printf("%nNome da Conta: %s",this.nomeCon);
    }

    public void setSaldo (double saldo){
        this.saldo = saldo;
    }

    public void getSaldo (){
        System.out.printf("%nSaldo da conta: R$ %.2f",this.saldo);
    }

    public void adicioneJuros (){
        this.saldo += (this.saldo * this.taxaJuros) / 100;
    }

    public class Main {
        public static void main(String [] args){

            ContaInvestimento contaPoupança = new ContaInvestimento (001,"Davi Pedrosa",1000,10);
            contaPoupança.adicioneJuros();
            contaPoupança.adicioneJuros();
            contaPoupança.adicioneJuros();
            contaPoupança.adicioneJuros();
            contaPoupança.adicioneJuros();
            contaPoupança.getSaldo();
        }
    }
}
