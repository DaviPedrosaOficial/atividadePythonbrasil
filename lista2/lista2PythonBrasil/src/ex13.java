/*Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), 
se digitar outro valor deve aparecer valor inválido. */

import java.util.Scanner;

public class ex13 {
    
    public static void main(String [] args) throws Exception{

        System.out.printf("%nBem vindo ao calendario de Maio 2023!%nAqui apresentaremos o dia equivalente a data informada.%n%nExemplo: Data informada por você usuário ==> 15 %nDia occorido ==> Segunda%n%nEntaõ vamos começar!");

        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nInsira a seguir a data do seu desejo: ");
        int dataCliente = scanner.nextInt();

        String dia = "";
        
        while(true){
            try{
                if (dataCliente < 1 || dataCliente > 31){
                    throw new Exception();
                }
                break;
            } 
            catch (Exception nInvalido){
                System.out.printf("%nOpção invalida, insira apenas números de 1 a 31.");
                System.out.printf("%nInsira a seguir a data do seu desejo: ");
                dataCliente = scanner.nextInt();
            }
        }
        
        scanner.close();

        if (dataCliente == 1 || dataCliente == 8 || dataCliente == 15 || dataCliente == 22 || dataCliente == 29){
            dia += "segunda";
        }
        else if (dataCliente == 2 || dataCliente == 9 || dataCliente == 16 || dataCliente == 23 || dataCliente == 30){
            dia += "terça";
        }
        else if (dataCliente == 3 || dataCliente == 10 || dataCliente == 17 || dataCliente == 24 || dataCliente == 31 ){
            dia += "quarta";
        }
        else if (dataCliente == 4 || dataCliente == 11 || dataCliente == 18 || dataCliente == 25){
            dia += "quinta";
        }
        else if (dataCliente == 5 || dataCliente == 12 || dataCliente == 19 || dataCliente == 26){
            dia += "sexta";
        }
        else if (dataCliente == 6 || dataCliente == 13 || dataCliente == 20 || dataCliente == 27){
            dia += "sabado";
        }
        else if (dataCliente == 7 || dataCliente == 14 || dataCliente == 21 || dataCliente == 28){
            dia += "domingo";
        }
       
        
        System.out.printf("%n%nO dia %d de maio de 2023, foi um(a) %s !",dataCliente,dia);
    
}
}

    

