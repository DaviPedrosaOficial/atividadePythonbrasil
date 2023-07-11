/*Classe carro: Implemente uma classe chamada Carro com as seguintes propriedades:

Um veículo tem um certo consumo de combustível (medidos em km / litro) e uma certa quantidade de combustível no tanque.
O consumo é especificado no construtor e o nível de combustível inicial é 0.

Forneça um método andar( ) que simule o ato de dirigir o veículo por uma certa distância, 
reduzindo o nível de combustível no tanque de gasolina.

Forneça um método obterGasolina( ), que retorna o nível atual de combustível.
Forneça um método adicionarGasolina( ), para abastecer o tanque. 
Exemplo de uso:
meuFusca = Carro(15);           # 15 quilômetros por litro de combustível. 
meuFusca.adicionarGasolina(20); # abastece com 20 litros de combustível. 
meuFusca.andar(100);            # anda 100 quilômetros.
meuFusca.obterGasolina()        # Imprime o combustível que resta no tanque. */

public class Carro {
    
    private double consumoMedio;
    private double tanque = 0;

    public Carro (double KmPorLit) {
        this.consumoMedio = KmPorLit;
    }

    public void andar(double distanciaEmKm){
        
        double baseCal = distanciaEmKm;
        
        while (this.tanque > 0) {
            while (baseCal >= 1){ 
                baseCal -= 1;
                this.tanque -= this.consumoMedio * 0.1;
                if (this.tanque < 5 && this.tanque > 3){
                    System.out.printf("%nNivel de combustivel baixo.");
                }
                else if (this.tanque <= 0){
                    break;
                } 
            }
            if (baseCal <= 1){
                    baseCal -= baseCal;
                    this.tanque -= (baseCal * 0.1) * this.consumoMedio;
                    break;
            }
        }

        if (this.tanque <= 0 && baseCal > 0){
            System.out.printf("%nSem combustivel para concluir a viagem!%nAinda faltam %.2f Km.",baseCal);
        }
    }

    public double adicionarGasolina(double qtd){
        return this.tanque += qtd;
    }

    public void obterGasolina (){
        System.out.printf("%nO tanque esta com %.2f litros.",this.tanque);
    }

    public class Main{
        public static void main(String [] args){

            Carro civic = new Carro(7);
            civic.adicionarGasolina(20);
            civic.andar(50);
            civic.obterGasolina();
        }
    }
}
