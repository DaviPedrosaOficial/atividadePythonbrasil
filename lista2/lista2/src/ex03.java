//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever:
//F - Feminino, M - Masculino, Sexo Inválido.

import java.util.Scanner;

public class ex03 {
    
    public static void main(String [] args) throws Exception{

        System.out.printf("%nOlá Mundo!%n%nBem vindo ao sistema de identificação!");
        System.out.printf("%nNesse programa iremos verificar qual o seu sexo , para que possamos%nassim, prosseguir com seu cadastro!");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nEntão vamos começar, insira a frente o seu sexo (F / M / O): ");
        String sexoCliente = scanner.nextLine();

        scanner.close();

        String masculino = "M";
        String feminino = "F";
        String outros = "O";
        
        if (sexoCliente.equalsIgnoreCase(masculino)) {
            System.out.printf("%nSexo masculino");
        }
        else if (sexoCliente.equalsIgnoreCase(feminino)){
            System.out.printf("%nSexo Feminino");
        }
        else if (sexoCliente.equalsIgnoreCase(outros)){
            System.out.printf("%nOutro Sexo");
        }
        else{
            System.out.printf("%nPor favor, insira apenas as opções solicitadas (F / M / O).%nAgradeçemos pela atenção!");
        }
    }   
    }