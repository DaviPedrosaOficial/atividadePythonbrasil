package Fazenda;

public class BichoFazenda {
    
    private String nome;
    private int idade;
    private boolean saude;
    private boolean fome;
    private double barriga;
    private String humor;
    private double controlaHumor;
    private String barulhoDoAnimal;

    public BichoFazenda (String nome, int idade, String barulhoDoAnimal){

        this.nome = nome;
        this.idade = idade;
        this.barulhoDoAnimal = barulhoDoAnimal;
        this.saude = aleatorio();
        this.barriga = aleatorioDouble();
        this.fome = getFome();
        setHumor();

    }
    
    private boolean aleatorio(){
        boolean booleanAleatorio = Math.random() > 0.5;

        return booleanAleatorio;
        }
    
    private double aleatorioDouble(){
        double min = 0;
        double max = 2000;
        return Math.random() * (max - min) + min;
    }

    public boolean tratarAnimais(){
        return this.saude = true; 
    }

    public boolean getSaude(){
        return this.saude;
    }

    public boolean getFome(){
        if (this.barriga > 200){
            this.fome = false;
        }
        else {
            this.fome = true;
        }
        return this.fome;
    }

    public void setHumor(){
        if (this.saude == true && this.fome == false){
            this.humor = "Feliz";
            this.controlaHumor = 10;
        }
        else if ((this.saude == true && this.fome == true) || (this.saude == false && this.fome == false)){
            this.humor = "Triste";
            this.controlaHumor = 5;
        }
        else {
            this.humor = "Depressivo";
            this.controlaHumor = 0;
        }
    }

    public String getHumor(){
        if (this.saude == true && this.fome == false && this.controlaHumor > 5){
            this.humor = "Feliz";
        }
        else if ((this.saude == true && this.fome == true && this.controlaHumor > 0) || (this.saude == false && this.fome == false && this.controlaHumor > 0) || (this.saude == true && this.fome == false && this.controlaHumor <= 5)){
            this.humor = "Triste";
        }
        else {
            this.humor = "Depressivo";
        }
        return this.humor;
    }

    public double comer(double qtd){
        return this.barriga += qtd;
    }

    public double getBarriga(){
        return this.barriga;
    }

    public void brincar (double tempoMinutos){
        this.controlaHumor += tempoMinutos * 0.1;
        this.barriga -= tempoMinutos * 0.5;
    }

    public void ouvirAnimal (){
        System.out.println(this.barulhoDoAnimal);
    }

    public void status(){
     
       System.out.printf("%nNome do animal: %s %nIdade : %d %nFome: %b %nSaude: %b %nBarriga: %.2fg %nHumor: %s%n",this.nome,this.idade,this.fome,this.saude,this.barriga,this.humor);
    }
}


