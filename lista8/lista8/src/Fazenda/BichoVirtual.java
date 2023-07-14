package Fazenda;
/*Classe Bichinho Virtual++: Melhore o programa do bichinho virtual (Tamagushi), 
permitindo que o usuário especifique quanto de comida ele fornece ao bichinho e por quanto tempo ele brinca com o bichinho. 
Faça com que estes valores afetem quão rapidamente os níveis de fome e tédio caem. */

import java.util.ArrayList;
import java.util.List;

public class BichoVirtual{
    
    private String nome;
    private boolean fome;
    private int barriga;
    private List<String> bucho = new ArrayList<>();
    private boolean saúde;
    private int idade;
    private String humor;
    private double controladorHumor;

    public BichoVirtual(String nome, boolean fome, boolean saúde, int idade){
        this.nome = nome;
        this.fome = fome;
        this.saúde = saúde;
        this.idade = idade;

        if (this.saúde == true && this.fome == false){
            this.humor = "feliz";
            this.controladorHumor = 10;
        }
        else if ((this.saúde == true && this.fome == true)||(this.saúde == false && this.fome == false)){
            this.humor = "triste";
            this.controladorHumor = 5;
        }
        else {
            this.humor = "depressivo";
            this.controladorHumor = 1;
        }

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void getNome(){
        System.out.printf("%nNome do Tamagushi: %s",this.nome);
    }

    public void setAlimentar(String alimento,int qtdGramas){
        this.barriga = qtdGramas;
        this.bucho.add(alimento);
    }

    public void digerir(){
        this.bucho.clear();
    }

    public void olharBucho (){
        System.out.printf("%nBucho do %s: %s",this.nome,this.bucho);
    }

    public boolean getFome(){
        if (this.barriga >= 200){
            this.fome = false;
        }
        else {
            this.fome = true;
        }
        return this.fome;
    }

    public void brincar(int tempoEmMinutos){
        this.controladorHumor += tempoEmMinutos * 0.1;
        this.barriga -= tempoEmMinutos * 0.5;  
    }

    public void getSaude(){
        if (this.fome == false || this.controladorHumor > 5){
            this.saúde = true;
        }
        else {
            this.saúde = false;
        }
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void getIdade(){
        System.out.printf("%nIdade do Tamagushi: %d",this.idade);
    }

    public void setHumor(){
        if (this.saúde == true && this.fome == false && this.controladorHumor > 5){
            this.humor = "feliz";
        }
        else if (((this.saúde == true && this.fome == true)||(this.saúde == false && this.fome == false)) && this.controladorHumor <= 5 && this.controladorHumor >=2){
            this.humor = "triste";
        }
        else {
            this.humor = "depressivo";
        }
    }

    public void getHumor(){
        System.out.printf("%nO %s está %s.",this.nome,this.humor);
    }

    public void status(){
        System.out.printf("%nNome do Tamagushi: %s%nFome: %s%nSaúde: %s%nIdade: %d%nHumor: %s",this.nome,this.fome,this.saúde,this.idade,this.humor);
    }

    public class Main{

        public static void main (String [] args){

            BichoVirtual tamagushi = new BichoVirtual("Gugu",false,true,2);

            tamagushi.setNome("Papagaio Zeca");
            tamagushi.setAlimentar("Sementes",250);
            tamagushi.getFome();
            tamagushi.setIdade(3);
            tamagushi.brincar(120);
            tamagushi.getFome();
            tamagushi.setHumor();

            tamagushi.getSaude();
            tamagushi.getHumor();

            tamagushi.status();
        }
    }
}
