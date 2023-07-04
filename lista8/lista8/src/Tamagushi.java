/*Classe Bichinho Virtual:Crie uma classe que modele um Tamagushi (Bichinho Eletrônico):

Atributos: Nome, Fome, Saúde e Idade b. Métodos: Alterar Nome, Fome, Saúde e Idade; 
Retornar Nome, Fome, Saúde e Idade 
Obs: Existe mais uma informação que devemos levar em consideração, o Humor do nosso tamagushi, 
este humor é uma combinação entre os atributos Fome e Saúde, ou seja, um campo calculado, 
então não devemos criar um atributo para armazenar esta informação por que ela pode ser calculada a qualquer momento. */

public class Tamagushi {

    private String nome;
    private boolean fome;
    private boolean saúde;
    private int idade;
    private String humor;

    public Tamagushi(String nome, boolean fome, boolean saúde, int idade){
        this.nome = nome;
        this.fome = fome;
        this.saúde = saúde;
        this.idade = idade;

        if (this.saúde == true && this.fome == false){
            this.humor = "Feliz";
        }
        else if ((this.saúde == true && this.fome == true)||(this.saúde == false && this.fome == false)){
            this.humor = "Triste";
        }
        else {
            this.humor = "Depressivo";
        }

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setFome(boolean fome){
        this.fome = fome;
    }

    public boolean getFome(){
        return this.fome;
    }

    public void setSaúde(boolean saúde){
        this.saúde = saúde;
    }

    public boolean getSaúde(){
        return this.saúde;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setHumor(){
        if (this.saúde == true && this.fome == false){
            this.humor = "Feliz";
        }
        else if ((this.saúde == true && this.fome == true)||(this.saúde == false && this.fome == false)){
            this.humor = "Triste";
        }
        else {
            this.humor = "Depressivo";
        }
    }

    public String getHumor(){
        return this.humor;
    }

    public void status(){
        System.out.printf("%nNome do Tamagushi: %s%nFome: %s%nSaúde: %s%nIdade: %d%nHumor: %s",this.nome,this.fome,this.saúde,this.idade,this.humor);
    }
}
