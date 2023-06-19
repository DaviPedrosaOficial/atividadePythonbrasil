/*Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto. */

import java.util.Scanner;

public class ex17 {
    
    public static void main(String [] args) throws Exception{

        System.out.printf("%nBem vindos ao programa que lhe auxialiará a descobrir se o ano requerido é bissexto!");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nInsira a seguir o ano que você desejar: ");
        int ano = scanner.nextInt();

        scanner.close();

        if (ano % 4 == 0){ 
            System.out.printf("%nO ano de %d é/foi um ano bissexto!",ano);
        }
        else {
            System.out.printf("%nO ano de %d não é/foi um ano bissexto!",ano);
        }
    }   
}
