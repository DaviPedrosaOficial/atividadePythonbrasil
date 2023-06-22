/*Classe Quadrado: Crie uma classe que modele um quadrado:

Atributos: Tamanho do lado
Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área; */

public class Quadrado {

    double lado ;

    void mudaLado(double lado){
        this.lado = lado;
    }

    void mostraLado(){
        System.out.printf("%nO tamanho do lado desse quadrado é : %.2f",this.lado);
    }

    void area(){
        double area = this.lado * this.lado;
        System.out.printf("%n%nA área deste quadrado é de :  %.2f",area);
    }

}
