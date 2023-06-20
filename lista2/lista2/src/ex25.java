/*Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", 
entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente". */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex25 {
    
    public static void main(String [] args){

        System.out.printf("%nBem vindo a triagem da Polícia Civil de Belo Horizonte.%nComplete as respostas a baixo com (S ou N) para podermos dar sequência ao seu processo.");

        String[] sim = {"s", "sim"};
        List<String> listaSim = Arrays.asList(sim);

        String[] não = {"n","não","nao"};
        List<String> listaNão = Arrays.asList(não);

        int resultado = 0;

        resultado = teste(listaSim, listaNão);

        switch (resultado){
            case 1 : System.out.printf("%nAvalição concluida!%nPerfil do candidato: Inocente");
                break;
            case 2 : System.out.printf("%nAvaliação concluida!%nPerfil do candidato: Suspeito");
                break;
            case 3 : System.out.printf("%nAvaliação concluida!%nPerfil do candidato: Cúmplice");
                break;
            case 4 : System.out.printf("%nAvaliação concluida!%nPerfil do candidato: Cúmplice");
                break;
            case 5 : System.out.printf("%nAvaliação concluida!%nPerfil do candidato: Assassino");
                break;
        }
    }

    public static int teste(List<String> s,List<String> n){
           
        Scanner scanner = new Scanner(System.in);
            
        int contPerg = 0;
        int perg = 0;

        while(true){
            try{

                perg += 1;

                if(perg == 1){
                    System.out.printf("%n%nTelefonou para a vítima? : ");
                }
                else if (perg == 2){
                    System.out.printf("%nEsteve no local do crime? :");
                } 
                else if (perg == 3){
                    System.out.printf("%nMora perto da vítima? :");
                }
                else if (perg == 4){
                    System.out.printf("%nDevia para a vítima? :");
                }
                else {
                    System.out.printf("%nJá trabalhou com a vítima? :");
                }

                String respCliente = scanner.nextLine();
                String lower = respCliente.toLowerCase();

                if(s.contains(lower)){
                    contPerg += 1;
                }
                else if(n.contains(lower)){
                    contPerg += 0;
                }
                else{
                    throw new Exception();
                }

                if(perg >= 5){
                    break;
                }

            } catch (Exception respInv){
                System.out.printf("%nA resposta inserida é inválida.%n%nAperte enter para retornar a pergunta anterior.");
                scanner.nextLine();
                perg -= 1;
            }
        }
        scanner.close();

        return contPerg;
    }
}
    
