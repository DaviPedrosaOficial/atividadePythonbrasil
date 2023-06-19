/*Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
A mensagem "Aprovado com Distinção", se a média for igual a 10. */

import java.util.Scanner;

public class ex20{

    public static void main(String [] args) {

        System.out.printf("%nBem vindo ao programa de boletim Una 2.0!");
        
        Scanner scanner = new Scanner(System.in);
        float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        
        do{
            System.out.printf("%nPara prosseguimos, informe a seguir a nota de sua primeira prova: ");
            n1 = scanner.nextFloat();

            if (!notaVal(n1)){
                System.out.printf("%n%nNota inserida invalida, favor informar apenas notas entre 0 e 10.%n");
            }
        } while(!notaVal(n1));

        do{
            System.out.printf("%nPara prosseguirmos, informe a seguir a nota de sua segunda prova: ");
            n2 = scanner.nextFloat();   

            if (!notaVal(n2)){
                System.out.printf("%n%nNota inserida invalida, favor informar apenas notas entre 0 e 10.%n");
            }
        } while(!notaVal(n2));

        do{
            System.out.printf("%nPara prosseguirmos, informe a seguir a nota de sua terceira prova: ");
            n3 = scanner.nextFloat();

            if (!notaVal(n3)){
                System.out.printf("%n%nNota inserida invalida, favor informar apenas notas entre 0 e 10.%n");
            }
        } while (!notaVal(n3));

        scanner.close();

        float media = (n1 + n2 + n3) / 3;

        if (media >= 7 && media != 10){
            System.out.printf("%n%nAprovado!");
        }
        else if (media < 7){
            System.out.printf("%n%nReprovado!");
        }
        else if (media == 10){
            System.out.printf("%n%nAprovado com Distinção!");
        }
    }
    
     public static boolean notaVal(float a){
        if (a <= 10 && a >= 0){
            return true;
        }
        else{
            return false;
        }
    }
}