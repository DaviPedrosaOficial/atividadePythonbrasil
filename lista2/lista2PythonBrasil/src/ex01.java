//Faça um Programa que peça dois números e imprima o maior deles.

import java.util.Scanner;

public class ex01 {

    public static void main(String [] args) throws Exception{

        System.out.printf("Olá Mundo!%nNeste exercício solicitaremos dois numeros a vocês, e retornaremos o maior entre eles!");
        System.out.printf("%nPara isso precisamos de sua ajuda para nos informar os números desejados.");
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nDigite a seguir o primeiro número desejado (utilize apenas inteiros): ");
        int num1 = scanner.nextInt();

        System.out.printf("%nAgora digite o segundo número que deseja comparar (somente inteiros): ");
        int num2 = scanner.nextInt();

        scanner.close();

        if (num1 == num2){ 
            System.out.printf("%nOs números são iguais (equivalentes)!");
        }
        else if(num1 > num2){
            System.out.printf("%nO número %d é maior que o %d !",num1 ,num2);
        }
        else{
            System.out.printf("%nO número %d é maior que o %d !",num2, num1);
        }
    }
    
}
