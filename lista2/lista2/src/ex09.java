//Faça um Programa que leia três números e mostre-os em ordem decrescente.

import java.util.Scanner;

public class ex09 {
    
    public static void main(String []args) throws Exception{

        System.out.printf("Bem vindo ao sistema crescente!%nNesse programa, receberemos 3 números de vocês usuários e colocaremos os mesmo em ordem crescente.");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nEntão para começarmos, insira a seguir o primeiro número: ");
        float num01 = scanner.nextFloat();

        System.out.printf("%nAgora, insira o segundo número: ");
        float num02 = scanner.nextFloat();

        System.out.printf("%nE para finalizarmos, insira o ultimo número:  ");
        float num03 = scanner.nextFloat();

        scanner.close();

        float maior = 0;

        float mediano = 0;

        float menor = 0;
        

        if (num01 > num02 && num01 > num03){
            maior += num01;
            if (num02 > num03){
                mediano += num02;
                menor += num03;
            }
            else{
                mediano += num03;
                menor += num02;
            }
        }
        else if (num02 > num01 && num02 > num03){
            maior += num02;
            if (num01 > num03){
                mediano += num01;
                menor += num03;
            }
            else{
                mediano += num03;
                menor += num01;
            }
        }
        else if (num03 > num01 && num03 > num02){
            maior += num03;
            if (num01 > num02){
                mediano += num01;
                menor += num02;
            }
            else{
                mediano += num02;
                menor += num01;
            }
        }
        else if (num01 == num02 && num01 > num03){
            maior += num01;
            mediano += num02;
            menor += num03;
        }
        else if (num01 == num02 && num01 < num03){
            maior += num03;
            mediano += num01;
            menor += num02;
        }
        else if (num02 == num03 && num02 > num01){
            maior += num02;
            mediano += num03;
            menor += num01;
        }
        else if (num02 == num03 && num02 < num01){
            maior += num01;
            mediano += num02;
            menor += num03;
        }
        else if (num03 == num02 && num03 == num01){
            maior += num01;
            mediano += num02;
            menor += num03;
        }
        else if (num03 == num01 && num03 > num02){
            maior += num01;
            mediano += num03;
            menor += num02;
        }

        System.out.printf("%n%nOs números apresentados ficaram na seguinte ordem: %n- Maior: %.0f%n- Mediano: %.0f%n- Menor: %.0f",maior,mediano,menor);
    }
}
