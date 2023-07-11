import java.util.Scanner;

public class Ponto {

    private double x;
    private double y;

    public Ponto (double x, double y){
        this.x = x;
        this.y = y;
    }

    public void getPontos (){
        System.out.printf("Ponto X: " + this.x + "%nPonto Y: " + this.y);
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void setNovaCoord (double coordX, double coordY){
        this.x = coordX;
        this.y = coordY;
    }
        

    class Retangulo {

        private Ponto pontoInicial;
        private double largura;
        private double altura;

        public Retangulo (Ponto pontoInicial, double largura, double altura){
            this.pontoInicial = pontoInicial;
            this.largura = largura;
            this.altura = altura;
        }

        public void alteraValores (double largura, double altura){
            this.largura = largura;
            this.altura = altura;
            System.out.printf("%nValores do retangulo alterados para: %nAltura: %.2f %nLargura: %.2f",this.altura,this.largura);
        }

        public Ponto encontraCentro (Ponto pontoinicial){
            double centroX = pontoInicial.getX() + largura / 2;
            double centroY = pontoInicial.getY() + altura / 2;
            System.out.printf("Centro eixo X: " + centroX + "%nCentro eixo Y: " + centroY);
            return new Ponto(centroX, centroY);
        }

        public class Main {
            public static void main(String [] args){

                Ponto verticeInicial = new Ponto (0,0);
                Retangulo retanguloInicial = verticeInicial.new Retangulo (verticeInicial,0,0);

                Scanner scanner = new Scanner(System.in);
                int opçãoCliente = 0;

                while (true){
                    System.out.printf("%n+=========Menu=========");
                    System.out.printf("%n%n1. Altera valores do retangulo");
                    System.out.printf("%n2. Imprimir centro do retangulo");
                    System.out.printf("%n3. Encerrar%n");
                    
                    try{
                    
                        System.out.printf("%nInsira o valor correspondente ao passo que você deseja tomar: ");
                        int recebeDadoCliente = scanner.nextInt();

                        if (recebeDadoCliente == 1 || recebeDadoCliente == 2 || recebeDadoCliente == 3){
                            opçãoCliente = recebeDadoCliente;
                        }
                        else {
                        throw new Exception();
                        }

                    } catch (Exception valInv){
                        System.out.printf("%nO valor inserido é invalido.%n");
                        scanner.nextLine();
                    }

                    if (opçãoCliente == 1){
                        System.out.printf("%nDigite a seguir o valor que você deseja inserir para a largura do retangulo: ");
                        double larg = scanner.nextDouble();

                        System.out.printf("%nAgora insira o valor que você deseja para a altura do retangulo: ");
                        double alt = scanner.nextDouble();

                        retanguloInicial.alteraValores(larg, alt);
                    }
                    else if (opçãoCliente == 2){
                        System.out.printf("%nO centro do retangulo se localiza nas seguintes coordenadas: %n");
                        retanguloInicial.encontraCentro(verticeInicial);
                    }
                    else if (opçãoCliente == 3) {
                        System.out.printf("%nFinalizando programa.");
                        break;
                    }

                    }
                    scanner.close();


                }
            }
        }
}

