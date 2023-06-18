//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

import java.util.Scanner;

public class ex02 {
    
    public static void main(String [] args) throws Exception{

        System.out.printf("%nOlá Mundo!%nSeja Bem vindo ao avaliador de positivos e negativos!");
        System.out.printf("%nNeste programa, receberemos um número de vocês e retornaremos se o mesmo é%npositivo ou negativo.");
        System.out.printf("%nEntão vamos prosseguir para a conferência!");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("%n%nPara que possamos fazer a conferência, informe a seguir o número que você deseja conferir: ");
        double numCliente = scanner.nextDouble();

        scanner.close();

        if (numCliente >= 0){
            System.out.printf("%nO número %.2f é positivo!",numCliente);
        }
        else{
            System.out.printf("%nO número %.2f é negativo!",numCliente);
        }

    }
}
