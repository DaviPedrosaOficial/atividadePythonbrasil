//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, 
//sabendo que a decisão é sempre pelo mais barato.

import java.util.Scanner;

public class ex08 {
    
    public static void main(String [] args) throws Exception{

        System.out.printf("Bem vindo ao seu mais novo auxiliar de compras!%n%nNesse programa, soliciteremos preço de 3 produtos para você%ne retornaremos qual a melhor opção de compra (a mais barata)!");
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nEntão vamos dar início ao nosso sistema.%nInsira a seguir o preço do primeiro produto: ");
        float prod1 = scanner.nextFloat();
        
        System.out.printf("%nAgora, insira o preço do segundo: ");
        float prod2 = scanner.nextFloat();

        System.out.printf("%nE para finalizar, insira a seguir o preço do ultimo produto: ");
        float prod3 = scanner.nextFloat();

        scanner.close();

        if (prod1 < prod2 && prod1 < prod3){
            System.out.printf("%nO primeiro produto no valor de R$%.2f é o mais barato, portanto, seria a melhor escolha de compra.",prod1);
        }
        else if (prod2 < prod1 && prod2 < prod3){
            System.out.printf("%nO segundo produto no valor de R$%.2f é o mais barato, portanto, seria a melhor escolha de compra.",prod2);
        }
        else if (prod3 < prod1 && prod3 < prod2){
            System.out.printf("%nO terceiro produto no valor de R$%.2f é o mais barato, portanto, seria a melhor escolha de compra.",prod3);
        }
        else if (prod1 == prod2 && prod1 < prod3){
            System.out.printf("%nO primeiro e o segundo produto custam o mesmo valor de R$%.2f, e ambos são mais baratos que o terceiro produto!%nSendo assim, ambos seriam uma boa escolha de compra!",prod1);
        }
        else if (prod2 == prod3 && prod2 < prod1){
            System.out.printf("%nO segundo e o terceiro produto custam o mesmo valor de R$%.2f, e ambos são mais baratos que o primeiro produto!%nSendo assim, ambos seriam uma boa escolha de compra!",prod2);
        }
        else if (prod3 == prod1 && prod3 <prod2){
            System.out.printf("%nO primeiro e o terceiro produto custam o mesmo valor de R$%.2f, e ambos são mais baratos que o segundo produto!%nSendo assim, ambos seriam uma boa escolha de compra!",prod3);
        }
        else if (prod1 == prod2 && prod2 == prod3){
            System.out.printf("%nTodos os produtos tem preço equivalente de R$%.2f, sendo assim, a decisão poderia ser baseada em seu gosto proprio!",prod1);
        }
    }
}
