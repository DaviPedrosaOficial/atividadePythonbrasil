package Fazenda;

import java.util.Scanner;

public class JogoFazendinha {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.printf("%n========= Bem vindo a sua Fazendinha! =========%n");
        int start;

        while(true){
            try{
                System.out.printf("%nInsira 1 para começar a jogar ou 0 para encerrar o programa: ");
                int começar = Integer.parseInt(scanner.nextLine());
                if(começar == 1 || começar == 0){
                    start = começar;
                    break;
                }
                else{
                    throw new Exception();
                }

            } catch(Exception valinv){
                System.out.printf("%nO valor inserido é inválido.%n");
            }
        }

        Fazendinha fazendinhaCliente = new Fazendinha();
        
        while(start == 1){
            try{
            System.out.printf("%n< ================== Menu fazendinha ================== >%n");
            System.out.printf("%nInsira 1 para adicionar um animal a sua fazenda");
            System.out.printf("%nAperte 2 para alimentar os animais");
            System.out.printf("%nAperte 3 para brincar com os animais");
            System.out.printf("%nAperte 4 para tratar(curar) os animais");
            System.out.printf("%nAperte 5 para ouvir os animais da sua fazenda");
            System.out.printf("%nAperte 6 para verificar o status de todos os animais da fazenda");
            System.out.printf("%nAperte 7 para fechar o programa%n");

            int escolhaCliente = (Integer.parseInt(scanner.nextLine()));

            if (escolhaCliente > 7 || escolhaCliente < 1 ){
                throw new Exception();
            }
            else { 
                switch (escolhaCliente){
                case 1 :
                    
                    System.out.printf("%nPara que possamos adicionar um novo animal a fazenda, insira a seguir%no nome que você deseja dar para ele: ");
                    String animalNovo = scanner.nextLine();
                    System.out.printf("%nAgora insira a idade do animal: ");
                    int idade = Integer.parseInt(scanner.nextLine());
                    System.out.printf("%nE por ultimo, insira o barulho que esse animal faz: ");
                    String barulhoAnimal = scanner.nextLine();  
                    
                    BichoFazenda bichoCliente = new BichoFazenda(animalNovo, idade, barulhoAnimal);
                    fazendinhaCliente.adicionarAnimal(bichoCliente); 
                    break;
                
                case 2 :
                
                    double qtdCliente;
                    
                    while(true){
                        try{
                            System.out.printf("%nPara que possamos alimenta-los, insira a quantidade de comida desejada: ");
                            double testando = Double.parseDouble(scanner.nextLine());

                            if(testando < 2000 || testando > 0){
                                qtdCliente = testando;
                                break;
                            }
                            else {
                                throw new Exception();
                            }
                        } catch (Exception valInv){
                            System.out.printf("%nValor inserido invalido%n");
                        }    
                    }
                    
                    final double totalQtd = qtdCliente; //Teve de ser inserida devido ao Loop;
                    fazendinhaCliente.animais.stream().forEach(animal -> {
                                ((BichoFazenda)animal).comer(totalQtd);
                    });
                    System.out.printf("%nAnimais alimentados!%n");
                    break;

                case 3 :

                    double tempoCliente;

                    while (true){
                        try{
                            System.out.printf("%nInsira a seguir o tempo que você deseja brincar com os animais: ");
                            double test = Double.parseDouble(scanner.nextLine());

                            if (test > 0){
                                tempoCliente = test;
                                break;
                            }
                            else {
                                throw new Exception();
                            }
                        } catch (Exception valInv){
                            System.out.printf("%nValor inserido invalido%n");
                        }
                    }

                    final double totalTempo = tempoCliente;
                    fazendinhaCliente.animais.stream().forEach(animal ->{
                        ((BichoFazenda)animal).brincar(totalTempo);
                        ((BichoFazenda)animal).getHumor();
                    });
                    break;
                
                case 4:

                    System.out.printf("%nOs animais foram tratados!");
                    fazendinhaCliente.animais.stream().forEach(animal -> {
                        ((BichoFazenda)animal).tratarAnimais();
                    });

                case 5 :

                    System.out.printf("%nSom dos animais: ");
                    fazendinhaCliente.animais.stream().forEach(animal ->{
                        ((BichoFazenda)animal).ouvirAnimal();
                    });
                    break;

                case 6 :

                    fazendinhaCliente.animais.stream().forEach(animal ->{
                        ((BichoFazenda)animal).getBarriga();
                        ((BichoFazenda)animal).getFome();
                        ((BichoFazenda)animal).getSaude();
                        ((BichoFazenda)animal).getHumor();
                        ((BichoFazenda)animal).status();
                    });
                    break;
                
                case 7: 

                    System.out.printf("%nObrigado por jogar nosso jogo.%nNos vemos na próxima!");
                    start += 1;
                    break;

                }
            }
        } catch (Exception valInv){
            System.out.printf("%nValor inserido invalido%n");
        }    
    }
        scanner.close();    
}
}


