/*Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida. */

import java.util.Scanner;

public class ex18 {
    
    public static void main(String [] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nPara que possamos dar sequência aos nossos sistemas,%ninsira a seguir uma data desejada para que possamos ver se a mesma é válida ou não%nUtilize a formatação dd/mm/aaaa: ");
        String data = scanner.nextLine();

        scanner.close();

        String[] confere = data.split("/");

        int dia = Integer.parseInt(confere[0]);

        int mes = Integer.parseInt(confere[1]);

        int ano = Integer.parseInt(confere[2]);

        if (dia < 32 && dia > 0 && mes < 13 && mes > 0 && ano < 2024 ){
            System.out.printf("%nA data %d/%d/%d é uma data válida!%nFim da etapa, favor prosseguir!",dia,mes,ano);
        }
        else {
            System.out.printf("%nA data inserida não é válida!");
        }
        
       
    }
}
