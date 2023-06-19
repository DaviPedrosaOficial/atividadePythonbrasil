//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

import java.util.Scanner;

public class ex04 {

    public static void main(String []args) throws Exception{

        System.out.println("Bem vindo ao verifica vogal!");
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nPara verificar quantas vogais temos em seu texto!%n%nPara isso, insira a seguir o texto desejado: ");
        String textoCliente = scanner.nextLine().toLowerCase();

        scanner.close();

        int totalVogais = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        String novoTexto = "";

        for (var percorre = 0; percorre < textoCliente.length(); percorre++) {
                if (textoCliente.charAt(percorre) == 'a'){
                    a += 1;
                    totalVogais += 1;
                    novoTexto += 'x';
                }
                else if (textoCliente.charAt(percorre) == 'e'){
                    e += 1;
                    totalVogais += 1;
                    novoTexto += 'x';
                }
                else if (textoCliente.charAt(percorre) == 'i'){
                    i += 1;
                    totalVogais += 1;
                    novoTexto += 'x';
                }
                else if (textoCliente.charAt(percorre) == 'o'){
                    o += 1;
                    totalVogais += 1;
                    novoTexto += 'x';
                }
                else if (textoCliente.charAt(percorre) == 'u'){
                    u += 1;
                    totalVogais += 1;
                    novoTexto += 'x';
                }
                else{
                    novoTexto += textoCliente.charAt(percorre);
                }
            }
        
            System.out.printf("%nNo texto inserido '%s', foram encontradas %d vogais! %nSendo elas as seguintes :%n%na = %d%ne = %d%ni = %d%no = %d%nu = %d%n%nSe as mesmas fosse substituidas por 'x'o texto ficaria da seguinte forma: '%s'",textoCliente,totalVogais,a,e,i,o,u,novoTexto);
    }
    }

            
        



    

