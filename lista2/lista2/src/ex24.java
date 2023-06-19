/*Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. 
O resultado da operação deve ser acompanhado de uma frase que diga se o número é:

a) par ou ímpar;
b) positivo ou negativo;
c) inteiro ou decimal. */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ex24 {
    
    public static void main(String [] args){

        System.out.printf("Bem vindo a calculadora +!");
        Scanner scanner = new Scanner(System.in);

        float n1 = 0;
        
        while(true){
            try{
                System.out.printf("%n%nInsira a seguir um número desejado: ");
                n1 = scanner.nextFloat();
                scanner.nextLine();
                break;
            } catch (InputMismatchException letra){
                System.out.printf("%n%nInsira apenas números.");
                scanner.next();
            }
        }

        String op = "";

        while(true){
            try{ 
                System.out.printf("%nInsira qual operação você deseja fazer com este número: ");
                op = scanner.nextLine();
                break;
            } catch (InputMismatchException num){
                System.out.printf("%nInsira apenas sinais como (+ ou - ou / ou *) ou o nome da operação como%n(adição ou subtração ou multiplicação ou divisão).");
                scanner.next();
            }
        }
      
        float n2 = 0;

        while(true){
            try{
                System.out.printf("%nInsira a seguir o ultimo número da operação: ");
                n2 = scanner.nextFloat();
                scanner.nextLine();
                break;
            } catch (InputMismatchException letra){
                System.out.printf("%nInsira apenas números.");
                scanner.next();
            }
        }

        scanner.close();

        String[] adição = {"+","adição","adiçao","adicao","adicão","plus"};
        List<String> listaAdição = Arrays.asList(adição);

        String[] subtração = {"-","subtração","subtraçao","subtracao","subtracão","less"};
        List<String> listaSubtração = Arrays.asList(subtração);

        String[] multiplicação = {"*","multiplicação","multiplicaçao","multiplicacao","multiplicacão","multiply"};
        List<String> listaMultiplicação = Arrays.asList(multiplicação);

        String[] divisão = {"/","divisão","divisao","divide"};
        List<String> listaDivisão = Arrays.asList(divisão);

        String formOp = op.toLowerCase();

        float res = 0;

        if (listaAdição.contains(formOp)){
            res = n1 + n2;
        }
        else if (listaSubtração.contains(formOp)){
            res = n1 - n2;
        }
        else if (listaMultiplicação.contains(formOp)){
            res = n1 * n2;
        }
        else if (listaDivisão.contains(formOp)){
            res = n1 / n2;
        }

        System.out.printf("%n%nO resultado da operação foi :  %.2f%nEsse reultado é um numero : ",res);

        if (res % 2 == 0){
            System.out.printf("%n- Par");
        }
        else {
            System.out.printf("%n- Impar");
        }

        if (res > 0){
            System.out.printf("%n- Positivo");
        }
        else{
            System.out.printf("%n- Negativo");
        }

        float arred = Math.round(res);
        
        if (res != arred){
            System.out.printf("%n- Decimal");
        }
        else {
            System.out.printf("%n- Inteiro");
        }



    }


}
