/*Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. 
Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;*/

import java.util.Scanner;

public class ex15 {
    
    public static void main(String [] args) throws Exception{

        System.out.printf("Bem vindo ao Triangle!%n%nNeste programa, lhe demontraremos se as medidas apresentadas podem ser um triangulo,%ne se sim, qual tipo de triangulo ele seria!");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nEntão para começarmos o teste, insira a seguir a medida do primeiro lado: ");
        float lado1 = scanner.nextFloat();

        System.out.printf("%nPara continuarmos, insira a medida do segundo lado: ");
        float lado2 = scanner.nextFloat();

        System.out.printf("%nE para finalizarmos, insira a medida do ultimo lado: ");
        float lado3 = scanner.nextFloat();

        scanner.close();

        boolean triangulo = false;

        String tipo = "";

        if ((lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && (lado1 + lado3) > lado2){
            triangulo = true;
            if (triangulo == true){
                if (lado1 == lado2 && lado1 == lado3){
                    tipo += "Equilatero";
                }
                else if (lado1 == lado2 && lado1 != lado3){
                    tipo += "Isósceles";
                }
                else if (lado2 == lado3 && lado2 != lado1){
                    tipo += "Isósceles";
                }
                else if (lado3 == lado1 && lado3 != lado2){
                    tipo += "Isósceles";
                }
                else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
                    tipo += "Escaleno";
                }
            }
        }

        if (triangulo == false){
            System.out.printf("%n%nEntão vamos ao resultado!%n%nA forma não é um triangulo!");
        }
        else{
            System.out.printf("%n%nEntão vamos ao resultado!%n%nA forma inserida é um triangulo do tipo %s",tipo);
        }
    }
}
