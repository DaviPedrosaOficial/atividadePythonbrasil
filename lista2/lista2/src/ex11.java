/*As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:

salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5% 

Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento. */

import java.util.Scanner;

public class ex11 {
    
    public static void main(String [] args) throws Exception{

        System.out.printf("%nBem vindo ao Tabajara reajustes!");
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nPara continuarmos, inrira o valor de sua salario a seguir: ");
        float salCliente = scanner.nextFloat();

        scanner.close();

        int percAumento = 0;

        if (salCliente <= 0){
            System.out.printf("%nA quantidade não é suficiente para calcular o aumento!");
            return;
        }
        else if (salCliente <= 280){
            percAumento += 20;
        }
        else if (salCliente > 280 && salCliente <= 700){
            percAumento += 15; 
        }
        else if (salCliente > 700 && salCliente <= 1500){
            percAumento += 10;
        }
        else{
            percAumento += 5;
        }

        float valAumento = (salCliente * percAumento) / 100;

        float novoSalario = valAumento + salCliente;

        System.out.printf("%nCalculo Aumento%n%nSalário antes do reajuste: R$%.2f%nPercentual do aumento: %d   %nValor do aumento: R$%.2f %nSalário após aumento: R$%.2f",salCliente,percAumento,valAumento,novoSalario);

    }
}
