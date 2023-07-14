package Eletronicos;
/*Classe TV: Faça um programa que simule um televisor criando-o como um objeto. 
O usuário deve ser capaz de informar o número do canal e aumentar ou diminuir o volume. 
Certifique-se de que o número do canal e o nível do volume permanecem dentro de faixas válidas. */

public class Tv {
    
    private int canal;
    private int volume;

    public Tv(){
        this.canal = 1;
        this.volume = 1; 
    }

    public void setDigitaCanal (int canal){
        this.canal = canal;
        if (canal > 100 || canal < 1){
            System.out.printf("%nCanal inexistente!");
        }
    }

    public int alteraCanal(boolean alteraCanal){
        if (alteraCanal == true){
            if (this.canal == 99){
                System.out.printf("%nCanal inexistente!%n");
                return this.canal;
            }
            return this.canal += 1;
        }
        else {
            if (this.canal == 1){
                System.out.printf("%nCanal inexistente!%n");
                return this.canal;
            }
            return this.canal -= 1;
        }
    }

    public int getCanal(){
        return this.canal;
    }

    public int aumentaVol(boolean vol){
        if (vol == true){
            if (this.volume == 99){
                System.out.printf("%nVolume máximo atingido!%n");
                return this.volume;
            }
            return this.volume += 1;
        }
        else {
            if (this.volume == 1){
                System.out.printf("%nVolume mínimo atingido!%n");
                return this.volume;
            }
            return this.volume -= 1;
        }
    }

    public void status(){
        System.out.printf("Canal: %d%nVolume: %d",canal,volume);
    }

}
