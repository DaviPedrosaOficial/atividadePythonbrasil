/*Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, 
e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:

Média de Aproveitamento  Conceito
  Entre 9.0 e 10.0        A
  Entre 7.5 e 9.0         B
  Entre 6.0 e 7.5         C
  Entre 4.0 e 6.0         D
  Entre 4.0 e zero        E

  O algoritmo deve mostrar na tela as notas, a média, 
  o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.*/

import java.util.Scanner;

  public class ex14{

    public static void main(String [] args) throws Exception{

        System.out.printf("%nPrograma de Notas Montanha");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nInsira a seguir a nota tirada em sua primeira prova: ");
        float n1 = scanner.nextFloat();
        
        while (true) {
            try {
                if (n1 > 10 || n1 < 0){
                    throw new Exception();
                }
                break;
            }
            catch (Exception notaInvalida) {
                System.out.printf("%nInsira apenas notas equivalente ao curso (1 a 10).");
                System.out.printf("%nInsira novamente a nota de sua primeira prova: ");
                n1 = scanner.nextFloat();
            }
        }

        System.out.printf("%nAgora, informe a seguir a nota de sua segunda prova: ");
        float n2 = scanner.nextFloat();

        while (true) {
            try {
                if (n2 > 10 || n2 <0){
                    throw new Exception();
                }
                break;
            }
            catch (Exception notaInvalida2){
                System.out.printf("%nInsira apenas notas equivalentes ao curso (1 a 10).");
                System.out.printf("%nInsira novamente a nota de sua segunda prova: ");
                n2 = scanner.nextFloat();    
            }
        }

        scanner.close();

        float media = (n1 + n2) / 2;

        String conceito = "";

        if (media <= 4){
            conceito += "E";
        }
        else if (media <= 6){
            conceito += "D";
        }
        else if (media <= 7.5){
            conceito += "C";
        }
        else if (media <= 9){
            conceito += "B";
        }
        else if (media <= 10){
            conceito += "A";
        }

        String a = "A";

        String b = "B";

        String c = "C";

        String aR = "";

        if (conceito.equals(a)){
            aR += "Aprovado";
        }
        else if (conceito.equals(b)){
            aR += "Aprovado";
        }
        else if (conceito.equals(c)){
            aR += "Aprovado";
        }
        else {
            aR += "Reprovado";
        }

        System.out.printf("%n%nTabela provas%nNota Primeira: %.2f%nNota Segunda: %.2f%n%nMédia: %.2f%nConceito: %s%n%nResultado: %s",n1,n2,media,conceito,aR);
    }
  }
