/*Aprimore a classe do exercício anterior para adicionar o método aumentarSalario (porcentualDeAumento) 
que aumente o salário do funcionário em uma certa porcentagem.

Exemplo de uso:
  harry=funcionário("Harry",25000)
  harry.aumentarSalario(10) */

public class Funcionarios2 {
    
    private String nomeFun;
    private double salario;

    public Funcionarios2 (String nomeFun, double salario){
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

    public double aumentaSalario (double porcentagem){
        return this.salario += (this.salario * porcentagem) / 100;
    }

    public class Main {
    
        public static void main (String [] args){
            Funcionarios2 funcionario = new Funcionarios2 ("Davi Pedrosa", 1300);
            funcionario.setNomeFun("Pablo Augusto");
            funcionario.getNomeFun();
            funcionario.setSalario(1500);
            funcionario.aumentaSalario(10);
            funcionario.getSalario();
        }
    }
}
