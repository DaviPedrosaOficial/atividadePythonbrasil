/*Classe Pessoa: Crie uma classe que modele uma pessoa:

Atributos: nome, idade, peso e altura
Métodos: Envelhercer, engordar, emagrecer, crescer. Obs: Por padrão, a cada ano que nossa pessoa envelhece, 
sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm. */

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
