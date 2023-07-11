/*Classe Bomba de Combustível: Faça um programa completo utilizando classes e métodos que:

Possua uma classe chamada bombaCombustível, com no mínimo esses atributos:
tipoCombustivel.
valorLitro
quantidadeCombustivel
Possua no mínimo esses métodos:
abastecerPorValor( ) – método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo
abastecerPorLitro( ) – método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.
alterarValor( ) – altera o valor do litro do combustível.
alterarCombustivel( ) – altera o tipo do combustível.
alterarQuantidadeCombustivel( ) – altera a quantidade de combustível restante na bomba.
OBS: Sempre que acontecer um abastecimento é necessário atualizar a quantidade de combustível total na bomba. */

public class BombaCombustivel {

    private String tipoComb = "Gasolina";
    private double valComb = 4.5;
    private double quantTotalCombustivel = 10000;
    
    public void abastecerPorValor(double valor){
        double total = valor / valComb;
        this.quantTotalCombustivel -= total;
        System.out.printf("%nSerá abastecido %.2f litros.", total);
    }

    public void abastecerPorLitro (double quant){
        double valor = quant * valComb;
        this.quantTotalCombustivel -= quant;
        System.out.printf("%nO valor total será de R$%.2f .",valor);
    }

    public double alterarValor (double valor){
        return this.valComb = valor;
    }

    public String alterarCombustivel (String tipoComb){
        return this.tipoComb = tipoComb;
    }
    
    public double alterarQuantidadeCombustivel (double total){
        return this.quantTotalCombustivel = total;
    }

    public void getStatus(){
        System.out.printf("%nTipo de combustivel: %s %nValor do litro: R$%.2f%nQuantidade total na bomba: %.2f",this.tipoComb,this.valComb,this.quantTotalCombustivel);
    }
    
    public class Main{
        public static void main (String[] args){

            BombaCombustivel Shell = new BombaCombustivel();
            Shell.abastecerPorValor(20);
            Shell.abastecerPorLitro(5);
            Shell.alterarValor(5.2);
            Shell.alterarCombustivel("Alcool");
            Shell.getStatus();
        }
    }
}
