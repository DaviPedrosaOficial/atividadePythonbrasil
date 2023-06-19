/*Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex23 {
    
    public static void main(String [] args){
    
        System.out.printf("%nDigite a seguir um numero de sua escolha, em seguida lhe informaremos se o mesmo é inteiro ou decimal. ");
        Scanner scanner = new Scanner(System.in);

        float n = 0;

        while(true){
            try{
                System.out.printf("%nInsira o número a seguir: ");
                n = scanner.nextFloat();
                break;
            } 
            catch (InputMismatchException letra){
                System.out.printf("%nSomente números serão aceitos, tente novamente.");
                scanner.next();
            }
    }
        scanner.close();

        float arred = Math.round(n);

        if (n != arred){
            System.out.printf("%n%nO número %.2f é decimal!",n);
        }
        else {
            System.out.printf("%n%nO número %.2f é inteiro!",n);
        }

    }
}
