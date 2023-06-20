/*Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool:
- até 20 litros, desconto de 3% por litro
- acima de 20 litros, desconto de 5% por litro

Gasolina:
- até 20 litros, desconto de 4% por litro
- acima de 20 litros, desconto de 6% por litro 

Escreva um algoritmo que leia o número de litros vendidos, 
o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser 
pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90. */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ex26 {
    
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        double lit = 0;
        
        while(true){
            try{
                System.out.printf("%nInsira a quantidade de gasolina a frente: ");
                double confereLitro = scanner.nextDouble();
                scanner.nextLine();
                
                if (confereLitro <= 0){
                    throw new Exception();
                }
                else{
                    lit = confereLitro;
                }
                break;
            } catch (InputMismatchException Inv){
                System.out.printf("%nValor inserido inválido%n ");
                scanner.next();
            } catch (Exception valNeg){
                System.out.printf("%nValor inserido inválido%n");
                scanner.next();
            }
        }


        String[] gasolina = {"g"};
        List <String> listaGas = Arrays.asList(gasolina);

        String[] alcool = {"a"};
        List <String> listaAlc = Arrays.asList(alcool);

        String tipo = "";

        while(true){
            try{
                System.out.printf("%nAgora, insira (A) para álcool ou (G) para gasolina: ");
                
                String confereTipo = scanner.nextLine();
                String format = confereTipo.toLowerCase();
                
                if (listaGas.contains(format)){
                    tipo = format;
                    break;
                }
                else if (listaAlc.contains(format)){
                    tipo = format;
                    break;
                }
                else {
                    throw new Exception();
                }

            } catch (Exception Inv){
                System.out.printf("%nValor inserido inválido%nAperte Enter para tentar novamente %n");
                scanner.nextLine();
            }
        }
        
        scanner.close();

        double valTotal = 0;

        if (tipo.equals("g")){
            if (lit <= 20){
                valTotal = (lit * 2.5) - ((lit * 2.5) * 0.04);
            }
            else {
                valTotal = (lit * 2.5) - ((lit * 2.5) * 0.06);
            }
        }
        else if (tipo.equals("a")){
            if (lit <= 20){
                valTotal = (lit * 1.9) - ((lit * 1.90) * 0.03);
            }
            else {
                valTotal = (lit * 1.9) - ((lit * 1.90) * 0.05);
            }
        }

        System.out.printf("%n%nValor a pagar :    R$ %.2f",valTotal);

    }
}
