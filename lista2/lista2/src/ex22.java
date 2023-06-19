/*Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão). */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex22 {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Insira um numero inteiro, para que possamos retornar se o mesmo é par ou impar: ");
        
        int nCliente = 0;

        while (true){
            try{    
            
            nCliente = scanner.nextInt(); 
            
            break;
            } catch(InputMismatchException e){
                System.out.printf("%nApenas numeros inteiros serão aceitos!%nPor favor, insira novamente o numero desejado: ");
                scanner.next();
                
            }
        }
       
        scanner.close();
        
        if (nCliente % 2 == 0){
            System.out.printf("%nO numero %d é par!",nCliente);
        }
        else{
            System.out.printf("%nO numero %d é impar!",nCliente);
        }

    }
}


