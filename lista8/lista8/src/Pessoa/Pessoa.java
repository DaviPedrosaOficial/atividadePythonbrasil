package Pessoa;


public class Pessoa {
    
    String nome;
    int idade;
    double peso;
    double altura;

    void envelhecer(){
        this.idade += 1;
        if (this.idade < 21){
            this.altura += 0.05;
        }
    }

    void engordar(double peso){
        this.peso += peso;
    }

    void emagrecer(double peso){
        this.peso -= peso;
    }

    void crescer(double altura){
        this.altura += altura;
    }
}
