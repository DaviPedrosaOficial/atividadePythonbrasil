/*Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, 
que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, 
mas não é descontado (é a empresa que deposita).
 O Salário Líquido corresponde ao Salário Bruto menos os descontos.
O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. 
No exemplo o valor da hora é 5 e a quantidade de hora é 220.
        Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00  
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Liquido                 : R$  935,00 */

import java.util.Scanner;

public class ex12 {
    
    public static void main(String [] args) throws Exception{

        System.out.printf("Bem vindo ao calculo salárial!%nNesse programa, calcularemos seu salário líquido e demonstraremos todo o processo.");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nPara começarmos, insira a seguir, o valor de sua hora trabalhada: ");
        float valHora = scanner.nextFloat();

        System.out.printf("%nAgora, insira a seguir a quantidade de horas que você trabalhou esse mês: ");
        float quantHoras = scanner.nextFloat();

        scanner.close();

        float salBruto = valHora * quantHoras;

        int ir = 0;

        if (salBruto <= 900){
            ir += 0;
        }
        else if (salBruto >= 900 && salBruto <= 1500){
            ir += 5;
        }
        else if (salBruto >1500 && salBruto <= 2500){
            ir += 10;
        }
        else if (salBruto > 2500){
            ir = 20;
        }

        float FGTS = (salBruto * 11) / 100;

        float INSS = (salBruto * 10) / 100;

        float sindicato = (salBruto * 3) / 100;

        float impRenda = (salBruto * ir) / 100;

        System.out.printf("%n%nSeu salário foi calculado, veja a seguir:%n%nSalário Bruto (%.2f * %.2f)    :R$%.2f%n%nIR:(%.2f * %d %%)               :R$%.2f%nINSS (%.2f * 10 %%)             :R$%.2f%nSindicato (%.2f * 3 %%)         :R$%.2f%nFGTS (%.2f * 11 %%)             :R$%.2f%n%nTotal descontos                   :%.2f%nSalário Líquido                   :R$%.2f",valHora,quantHoras,salBruto,salBruto,ir,impRenda,salBruto,INSS,salBruto,sindicato,salBruto,FGTS,(impRenda + INSS + sindicato + FGTS),salBruto - (impRenda + INSS + sindicato + FGTS));

    }
}
