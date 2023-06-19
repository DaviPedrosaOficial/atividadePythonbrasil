/*Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois 
informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. 

O valor mínimo é de 10 reais e o máximo de 600 reais. 

O programa não deve se preocupar com a quantidade de notas existentes na máquina.

Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, 
uma nota de 5 e uma nota de 1;

Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, 
quatro notas de 10, uma nota de 5 e quatro notas de 1. */

import java.util.Scanner;

public class ex21 {
    
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nPara sacar o dinheiro de sua conta, insira a seguir o valor desejado: ");
        int saque = scanner.nextInt();
        
        while(true){
            try {
                if(saque < 10 || saque > 600){
                    throw new Exception();
                }
            break;
            } catch(Exception saqInv){
                System.out.printf("%nO saque inserido é inválido, %ninsira apenas valores maiores que R$ 10,00 e menores que R$ 600,00.");
                System.out.printf("%nInsira novamente, o valor que você deseja sacar: ");
                saque = scanner.nextInt();
            }
        }

        scanner.close();

        int contNotas = saque;
        int n_1 = 0;
        int n_5 = 0;
        int n_10 = 0;
        int n_50 = 0;
        int n_100 = 0;

        while (contNotas != 0){
            if (contNotas >= 100){
                n_100 += 1;
                contNotas -= 100;
            }
            else if (contNotas >= 50){
                n_50 += 1;
                contNotas -= 50;
            }
            else if (contNotas >= 10){
                n_10 += 1;
                contNotas -= 10;
            }
            else if (contNotas >= 5){
                n_5 += 1;
                contNotas -= 5;
            }
            else {
                n_1 += 1;
                contNotas -= 1;
            }
        }


        System.out.printf("%nSaque aceito!%n%nAguarde para a retirada do dinheiro.%nSolicitamos que confira o dinheiro, o mesmo será entregue em : %n");
        if (n_100 > 0){
            System.out.printf("%nNota(s) de R$ 100,00: %d",n_100);
        }
        if (n_50 > 0){
            System.out.printf("%nNota(s) de R$ 50,00: %d",n_50);
        }
        if (n_10 > 0){
            System.out.printf("%nNota(s) de R$ 10,00: %d",n_10);
        }
        if (n_5 > 0){
            System.out.printf("%nNota(s) de R$ 5,00: %d",n_5);
        }
        if (n_1 > 0){
            System.out.printf("%nNota(s) de R$ 1,00: %d",n_1);
        }
        System.out.printf("%n%nValor total: R$ %d,00",saque);
    }
}
