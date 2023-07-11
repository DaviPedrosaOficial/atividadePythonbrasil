/*Classe Funcionário: Implemente a classe Funcionário. Um empregado tem um nome (um string) e um salário(um double). 
Escreva um construtor com dois parâmetros (nome e salário) e métodos para devolver nome e salário. 
Escreva um pequeno programa que teste sua classe. */

public class Funcionarios {
    
    private String nomeFun;
    private double salario;

    public Funcionarios (String nomeFun, double salario){
        this.nomeFun = nomeFun;
        this.salario = salario;
    }

    public void setNomeFun (String nomeFun){
        this.nomeFun = nomeFun;
    }

    public void getNomeFun (){
        System.out.printf("%nNome do funcionário: %s",this.nomeFun);
    }

    public void setSalario (double salario){
        this.salario = salario;
    }

    public void getSalario (){
        System.out.printf("%nSalário do funcionário: R$ %.2f", this.salario);
    }

    public class Main {
    
        public static void main (String [] args){
            Funcionarios Davi = new Funcionarios ("Davi Pedrosa", 1300);
            Davi.setNomeFun("Pablo Augusto");
            Davi.getNomeFun();
            Davi.setSalario(1500);
            Davi.getSalario();
        }
    }
}
