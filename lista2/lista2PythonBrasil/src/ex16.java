/*Faça um programa que calcule as raízes de uma equação do segundo grau, 
na forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências, 
informando ao usuário nas seguintes situações:

a) Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
b) Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
c) Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
d) Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário; */

import java.util.Scanner;

public class ex16 {
    
    public static void main(String [] args) throws Exception{

        System.out.printf("%nBem vindo as Raizes de seu problemas!%n%nNesse programa, calcularemos a raizes de equações do segundo grau,%napresentadas por vocês!");
        System.out.printf("%n%nPara que o programa possa funcionar, precisaremos que vocês informem os seguintes dados:%n  ax2 + bx + c  ===> (a,b,c)serão apresentados por vocês!");
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nEntão para começarmos, insira a seguir o número que você deseja para 'a' :");
        double a = scanner.nextInt();

        System.out.printf("%nAgora, para prosseguirmos, insira a seguir o número desejado para a posição 'b' : ");
        double b = scanner.nextInt();

        System.out.printf("%nE para finalizarmos, insira a seguir o número desejado para a posição 'c' : ");
        double c = scanner.nextInt();

        scanner.close();

        double delta = Math.pow(b , 2) - 4 * a * c;

        if (a == 0){
            System.out.printf("%nPara que a equação seja executada, o valor de 'a' precisa ser < ou > que 0%n%n===== Fim do Programa =====");
        }
        else if(delta == 0){ 
            double deltaZero = -b / (2 * a);
            System.out.printf("%n%nA sua função teve delta igual a 0.%n%nPortanto o 'x' da função se tornou unico, segue o a seguir :  %.0f%n%n===== Fim do Programa =====",deltaZero);
        }
        else if (delta < 0){
                System.out.printf("%nSeu delta foi negativo, infelizmente a operação não possui raízes!%n%n===== Fim do Programa =====");
            }
         else if(delta > 0){   
            double xMais = (- b + Math.sqrt(delta)) / (2 * a);
            double xMenos = (- b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("%nCom o delta %.0f os resultados de 'x' da sua função foram: %n%n x1 == %.2f%n x2 == %.2f",delta,xMais,xMenos);
         }
        }

    }

