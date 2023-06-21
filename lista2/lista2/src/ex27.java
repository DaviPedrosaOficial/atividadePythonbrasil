/*Uma fruteira está vendendo frutas com a seguinte tabela de preços:
                      Até 5 Kg           Acima de 5 Kg
Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
receberá ainda um desconto de 10% sobre este total. 
Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas 
e escreva o valor a ser pago pelo cliente. */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex27{

    public static void main(String [] args){

        System.out.printf("Bem vindo ao caixa do Hortifruit ABC.");
        
        String[] morango = {"morango"};
        List <String> listaMorango = Arrays.asList(morango);

        String[] maçã = {"maçã","maça","maca","macã"};
        List <String> listaMaçã = Arrays.asList(maçã);

        Scanner scanner = new Scanner(System.in);

        String frutaCliente = "";

        while (true){
            try{
                System.out.printf("%n%nInsira a seguir a fruta desejada da promoção (Morango ou Maçã): ");
                String recebeFruta = scanner.nextLine();
                String formataFruta = recebeFruta.toLowerCase();

                if (listaMorango.contains(formataFruta)){
                    frutaCliente = formataFruta;
                    break;
                }
                //Infelizmente, não consegui formatar o codigo de uma maneira que o mesmo aceite maçã, acredito que seja algum problema com a lista
                //Caso você que estiver visualizando souber, será de grande aprendizado! :)
                else if (listaMaçã.contains(formataFruta)){
                    frutaCliente = formataFruta;
                    break;
                }
                else {
                    throw new Exception();
                }
            } catch (Exception frutaInv){
                System.out.printf("%nA fruta inserida é invalida!%nPressione Enter para tentar novamente.");
                scanner.nextLine();
            }
        }

        double kg = 0;

        while (true){
            try{
                System.out.printf("%nInsira a seguir a quantidade que o cliente está levando: ");
                double teste = scanner.nextDouble();

                if (teste > 0){
                    kg = teste;
                    break;
                }
                else {
                    throw new Exception();
                }
            } catch (Exception numNeg){
                System.out.printf("%nO valor inserido é invalido, tente novamente ");
                scanner.nextLine();
            }
        }

        scanner.close();

        double valor = 0;

        if (listaMorango.contains(frutaCliente)){
            if (kg <= 5){
                valor = kg * 2.5;
            }
            else {
                valor = kg * 2.2;
            }
        }
        else if (listaMaçã.contains(frutaCliente)){
            if (kg <= 5){
                valor = kg * 1.8;
            }
            else {
                valor = kg * 1.50;
            }
        }

        double valorFinal = 0;

        if (valor > 25 || kg > 8){
            valorFinal = valor - (valor * 0.1);
        }
        else{
            valorFinal = valor;
        }

        System.out.printf("%n%nO valor a pagar é R$ %.2f .",valorFinal);
    }
}