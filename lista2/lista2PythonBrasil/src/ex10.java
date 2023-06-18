/*Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso. */

import java.util.Scanner;

public class ex10 {

    public static void main(String [] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Em qual periodo você estuda?%n%nDigite 'M' para Matutino%n'V' para vesperino%n'N' para noturno %n%n=====>    ");
        String texto = scanner.nextLine();
        String textoCliente = texto.toLowerCase();

        scanner.close();

        String matutino = "m";
        String vesperino = "v";
        String noturno = "n";

        if (textoCliente.equals(matutino)){
            System.out.printf("%nBom dia!");
        }
        else if (textoCliente.equals(vesperino)){
            System.out.printf("%nBoa tarde!");
        }
        else if (textoCliente.equals(noturno)){
            System.out.printf("%nBoa noite!");
        }
        else{
            System.out.printf("%nValor invalido!%nFavor inserir apenas os parametros queridos (M/V/N)");
        }
    }
    
}
