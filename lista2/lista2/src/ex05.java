/*Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem Aprovado, se a média alcançada for maior ou igual a sete;
A mensagem Reprovado, se a média for menor do que sete.
A mensagem Aprovado com Distinção, se a média for igual a dez.*/

import java.util.Scanner;

public class ex05{

    public static void main(String []args) throws Exception{

        System.out.printf("Bem vindo ao resultado final de seu concurso!%nOnde vamos avaliar o seu desempenho e te dizer se você foi aprovado ou não.");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nPara que possamos prosseguir, informe a seguir qual foi a nota de sua 1ª prova: ");
        float prova1 = scanner.nextFloat();

        System.out.printf("%nAgora para encerrarmos, insira a nota de sua segunda prova: ");
        float prova2 = scanner.nextFloat();

        scanner.close();

        float media = (prova1 + prova2) / 2;
        
        if (media == 10 && prova1 <= 10 && prova2 <= 10) {
            System.out.printf("Viemos parabenizá-lo, você acaba de passar com distinção no concurso!%nVocê teve como média a nota %.2f !",media);
        }
        else if (media >= 7 && prova1 <= 10 && prova2 <= 10) {
            System.out.printf("%nParabéns, você passou no concurso com %.2f de média!",media);
        }
        else if (media < 7 && prova1 <= 10 && prova2 <= 10) {
            System.out.printf("%nInfelizmente não foi dessa vez, sua media foi %.2f e você precisava de no mínimo 7,00 para poder passar!",media);
        }
        else {
            System.out.printf("%nPor favor, inserir somente notas até 10 pontos !");
        }
    }
}
