//Faça um Programa que leia três números e mostre o maior e o menor deles.

import java.util.Scanner;

public class ex07 {
    
    public static void main(String [] args) throws Exception{

        System.out.printf("Bem vindo ao conta maior e menor!%nNesse programa, receberemos 3 números de você usuário e retornaremos%no maior e o menor.%n%nEntão vamos começar!");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nPara começarmos, digite a seguir o primeiro número: ");
        float n1 = scanner.nextFloat();

        System.out.printf("%nAgora, insira a seguir o segundo número: ");
        float n2 = scanner.nextFloat();

        System.out.printf("%nE para finalizarmos, insira a seguir o terceiro e ultimo número: ");
        float n3 = scanner.nextFloat();

        float maior = 0;

        float menor = 0;

        scanner.close();

        if (n1 > n2 && n1 > n3){
            maior += n1;
            if (n2 > n3){
                menor += n3;
            }
            else{
                menor += n2;
            }
        }
        else if(n2 > n1 && n2 > n3){
            maior += n2;
            if (n1 > n3){
                menor += n3;
            }
            else{
                menor += n1;
            }
        }
        else if (n3 > n2 && n3 > n1){
            maior += n3;
            if (n1 > n2){
                menor += n2;
            }
            else{
                menor += n1;
            }
        }
        else if (n1 == n2 && n1 > n3){
            maior += n1;
            menor += n3;
        }
        else if (n2 == n3 && n2 > n1){
            maior += n2;
            menor += n1;
        }
        else if (n3 == n1 && n3 > n2){
            maior += n3;
            menor += n2;
        }
        else{
            maior += n1;
            menor += n3;
        }
        System.out.printf("%nBaseado nos números apresentados:%n%n1º número = %.1f %n2º número = %.1f %n3º número = %.1f %n%nO número %.0f é o maior entre eles, e o número %.0f é o menor!",n1,n2,n3,maior,menor);

    }
}
