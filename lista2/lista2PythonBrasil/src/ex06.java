//Faça um Programa que leia três números e mostre o maior deles.

import java.util.Scanner;

public class ex06 {
    
    public static void main(String [] args) throws Exception{

        System.out.printf("Bem vindo ao verificador de grandeza!%nNesse sistema, solicitaremos 3 números a vocês, e retornaremos, qual deles é o maior!");
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nPara começarmos a brincadeira, informe a seguir o primeiro número desejado: ");
        float num1 = scanner.nextFloat();

        System.out.printf("%nAgora, para continuarmos, insira o segundo número: ");
        float num2 = scanner.nextFloat();

        System.out.printf("%nE para finalizar, insira a seguir o ultimo número: ");
        float num3 = scanner.nextFloat();

        scanner.close();

        if (num1 > num2 && num1 > num3){
            System.out.printf("%nLevando em consideração os números que foram informados:%n1º número - %.2f %n2º número - %.2f %n3º número - %.2f%n%nO primeiro número (%.2f) foi o maior entre eles!",num1,num2,num3,num1);
        }
        else if (num2 > num1 && num2 > num3){
            System.out.printf("%nLevando em consideração os números que foram informados:%n1º número - %.2f %n2º número - %.2f %n3º número - %.2f%n%nO segundo número (%.2f) foi o maior entre eles!",num1,num2,num3,num2);
        }
        else if (num3 > num1 && num3 > num2){
            System.out.printf("%nLevando em consideração os números que foram informados:%n1º número - %.2f %n2º número - %.2f %n3º número - %.2f%n%nO terceiro número (%.2f) foi o maior entre eles!",num1,num2,num3,num3);
        }
        else if (num1 == num2 && num1 > num3){
            System.out.printf("%nLevando em consideração os números que foram informados:%n1º número - %.2f %n2º número - %.2f %n3º número - %.2f%n%nO primeiro número (%.2f) e o segundo (%.2f) são equivalentes%ne ambos são maiores que o terceiro (%.2f)!",num1,num2,num3,num1,num2,num3);
        }
        else if (num2 == num3 && num2 > num1){
            System.out.printf("%nLevando em consideração os números que foram informados:%n1º número - %.2f %n2º número - %.2f %n3º número - %.2f%n%nO segundo número (%.2f) e o terceiro (%.2f) são equivalentes%ne ambos são maiores que o terceiro (%.2f)!",num1,num2,num3,num2,num3,num1);
        }
        else if (num1 == num3 && num1 > num2){
            System.out.printf("%nLevando em consideração os números que foram informados:%n1º número - %.2f %n2º número - %.2f %n3º número - %.2f%n%nO primeiro número (%.2f) e o terceiro (%.2f) são equivalentes%ne ambos são maiores que o segundo (%.2f)",num1,num2,num3,num1,num3,num2);
        }
        else if (num1 == num2 && num3 == num1){
            System.out.printf("%nLevando em consideração os números que foram informados:%n1º número - %.2f %n2º número - %.2f %n3º número - %.2f%n%nO primeiro número (%.2f) o segundo (%.2f) e o terceiro (%.2f) são equivalentes!",num1,num2,num3,num1,num2,num3);
        }
    }
}
