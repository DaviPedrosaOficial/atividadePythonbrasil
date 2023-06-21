/*O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
                      Até 5 Kg           Acima de 5 Kg
File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, 
porém não há limites para a quantidade de carne por cliente. 
Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra. 
Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, 
contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.
*/

import java.util.Scanner;

public class ex28 {

    public static void main(String [] args){

        System.out.printf("Bem vindo ao sistema de notas fiscais Tabajara.");

        String fileDuplo = "file duplo";
        String alcatra = "alcatra";
        String picanha = "picanha";

        String carneCliente = "";

        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                System.out.printf("%nInsira a seguir a carne do cliente: ");
                String testaEntrada = scanner.nextLine();
                String formataTeste = testaEntrada.toLowerCase();

                if (formataTeste.equals(fileDuplo)){
                    carneCliente = "File Duplo";
                    break;
                }
                else if (formataTeste.equals(alcatra)){
                    carneCliente = "Alcatra";
                    break;
                }
                else if (formataTeste.equals(picanha)){
                    carneCliente = "Picanha";
                    break;
                }
                else {
                    throw new Exception();
                }
            } catch (Exception inv){
                System.out.printf("%nA carne inserida é inválida, pressione Enter para tentar novamente.");
                scanner.nextLine();
            }
        }

        double kg = 0;

        while (true){
            try{
                System.out.printf("%nInsira a quantidade Kg de carne que o cliente irá levar: ");
                double testadouble = scanner.nextDouble();
                scanner.nextLine();
                
                if (testadouble >= 0){
                    kg = testadouble;
                    break;
                }
                else {
                    throw new Exception();
                }
            } catch (Exception inv){
                System.out.printf("%nO valor inserido é inválido, pressione Enter para tentar novamente.");
                scanner.nextLine();
            }
        }

        String cartTabajara = "tabajara";
        String outros = "outro";
        String pag = "";

        while (true){
            try{
                System.out.printf("%nInsira a seguir a forma de pagamento, escreva apenas 'Tabajara' ou 'Outro': ");
                String recebePag = scanner.nextLine();
                String formataPag = recebePag.toLowerCase();

                if (formataPag.equals(cartTabajara)){
                    pag = "Tabajara";
                    break;
                }
                else if (formataPag.equals(outros)){
                    pag = "Outro";
                    break;
                }
                else {
                    throw new Exception();
                }
            } catch (Exception inv){
                System.out.printf("%nOpção inserida é invalida, tente novamente. ");
                scanner.next();
            }
        }

        double valor = 0;

        if (carneCliente.equals("File Duplo")){
            if (kg <= 5){
                valor = kg * 4.9;
            }
            else {
                valor = kg * 5.8;
            }
        }
        else if (carneCliente.equals("Alcatra")){
            if (kg <= 5){
                valor = kg * 5.9;
            }
            else {
                valor = kg * 6.8;
            }
        }
        else if (carneCliente.equals("Picanha")){
            if (kg <= 5){
                valor = kg * 6.9;
            }
            else {
                valor = kg * 7.8;
            }
        }

        double desconto = 0;

        if (pag.equals("Tabajara")){
            desconto = 0.05;
        }
        else {
            desconto = 0;
        }

        double descontoSeparado = valor * desconto;
        double totalApagar = valor - descontoSeparado;

        System.out.printf("%nNota Fiscal%n%nTipo da carne: %s%nQuantidade de carne: %.2f Kg%n%nPreço total: R$ %.2f%nTipo de Pagamento: %s%nValor do desconto: %.2f%nValor a pagar: %.2f",carneCliente,kg,valor,pag,descontoSeparado,totalApagar);

    }
    
}
