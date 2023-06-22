/*Crie um programa que utilize esta classe. Ele deve pedir ao usuário que informe as medidades de um local. 
Depois, deve criar um objeto com as medidas e calcular a quantidade de pisos e de rodapés necessárias para o local. */

import java.util.Scanner;

public class Retangulo2 {
    
    public static void main(String [] args){

        System.out.println("Bem vindo ao sistema de calculo de pizos");

        Scanner scanner = new Scanner(System.in);

        double comprimento = 0;

        while(true){
            try{
                System.out.printf("%nInsira a seguir o comprimento da área que você deseja preencher: ");
                double compInserido = scanner.nextDouble();

                if (compInserido > 0){
                    comprimento = compInserido;
                    break;
                }
                else {
                    throw new Exception();
                }
            } catch (Exception valInv){
                System.out.printf("%nO valor inserido é inválido!");
                scanner.nextLine();
            }
        }

        double largura = 0;

        while(true){
            try{
                System.out.printf("%nInsira a seguir a largura da área que você deseja preencher: ");
                double largInserida = scanner.nextDouble();

                if (largInserida > 0){
                    largura = largInserida;
                    break;
                }
                else {
                    throw new Exception();
                }
            } catch (Exception valInv){
                System.out.printf("%nO valor inserido é inválido!");
                scanner.nextLine();
            }
        }
        scanner.close();

        Retangulo cliente = new Retangulo();
        cliente.base = comprimento;
        cliente.altura = largura;
        cliente.calcArea();
        cliente.calcPerimetro();

        double calPisos = Math.round(cliente.area / (1.5 * 1.5));
        double calRodape = Math.round(cliente.perimetro / 0.5);

        System.out.printf("%nLevando em consideração que os pisos vendidos na Una acabamentos, tem como medida 1,5m * 1,5m%ne nossos rodapés possuem 0,50 m,%nvocê precisará de %.0f pisos e %.0f rodapés!",calPisos,calRodape);
    }

}
