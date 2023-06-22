/*Classe Bola: Crie uma classe que modele uma bola:

Atributos: Cor, circunferência, material
Métodos: trocaCor e mostraCor */

public class Bola {

    String cor;
    double circunferência;
    String material;

    void trocaCor(String cor){
        this.cor = cor;
    }

    void mostraCor(){
        System.out.print(this.cor);
    }

}
