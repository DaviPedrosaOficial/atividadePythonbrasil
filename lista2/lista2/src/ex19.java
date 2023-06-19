/*Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16 */

import java.util.Scanner;

public class ex19 {

    public static void main(String [] args) {

        System.out.printf("Bem vindo ao contador de inteiros!");

        System.out.printf("%nNeste programa mostraremos a vocês qual a quantidade de centenas, dezenas e unidades de um número.%n%nEntão para darmos sequência ao exercício insira um numero inteiro menor a 1000: ");
        Scanner scanner = new Scanner(System.in);
        int numCliente = scanner.nextInt();
        
        while (true){
            try{  
                if (numCliente >= 1000 || numCliente <= 0){
                    throw new Exception();
                }
            break;
            }
            catch (Exception intInvalido){
                System.out.printf("%nVocê informou um número não aceito, apenas inteiros positivos entre 1000 e 1 serão admitidos%n no programa!%nInforme novamente um inteiro válido: ");
                numCliente = scanner.nextInt();
            }
        }

        scanner.close();
        
        int confereNum = 0;

        int centenas = 0;

        int restoCentenas = 0;

        int dezenas = 0;

        int unidades = 0;

        if(confereNum < 1000 && confereNum > 99)
        {
            centenas = confereNum / 100;
            restoCentenas = confereNum % 100;
            if (restoCentenas > 9) {
                dezenas = restoCentenas / 10;
                unidades = restoCentenas % 10;
            } 
            else {
                unidades = restoCentenas;
            }

        }
        else if(confereNum <= 99 && confereNum > 9){
            dezenas = confereNum / 10;
            unidades = confereNum % 10;
        }
        else if(confereNum <= 9 && confereNum > 0){
            unidades = confereNum;
        }

        if(confereNum < 1000 && confereNum > 99){
            System.out.printf(
                    "%nEntão vamos lá aos resultados! %nO número aprensentado por você '%d' é constituido por %d centenas %d dezenas %d unidades!",
                    confereNum, centenas, dezenas, unidades);
        }
        else if(confereNum <= 99 && confereNum > 9){
            System.out.printf(
                    "%nEntão vamos lá aos resultados! %nO número aprensentado por você '%d' é constituido por %d dezenas %d unidades!",
                    confereNum, dezenas, unidades);
        }
        else if(confereNum <= 9 && confereNum > 0){
            System.out.printf(
                    "%nEntão vamos lá aos resultados! %nO número aprensentado por você '%d' é constituido por %d unidades!",
                    confereNum, unidades);
        }

}}
