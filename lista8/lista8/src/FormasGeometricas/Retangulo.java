package FormasGeometricas;
/*Classe Retangulo: Crie uma classe que modele um retangulo:

Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher)
Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular Perímetro;
Crie um programa que utilize esta classe. Ele deve pedir ao usuário que informe as medidades de um local. 
Depois, deve criar um objeto com as medidas e calcular a quantidade de pisos e de rodapés necessárias para o local.
 */

public class Retangulo {
    
    double base;
    double altura;
    double area;
    double perimetro;

    void mudaValor (double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    void valorLados(){
        System.out.printf("%nO comprimento tem %.2f e a largura %.2f",this.base,this.altura);
    }

    void calcArea (){
        this.area = this.base * this.altura;
    }

    void calcPerimetro(){
        this.perimetro = 2 * (this.base + this.altura);
    }
}
