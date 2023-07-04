/*Classe Macaco: Desenvolva uma classe Macaco,que possua os atributos nome e bucho (estomago) e pelo 
menos os métodos comer(), verBucho() e digerir(). 
Faça um programa ou teste interativamente, criando pelo menos dois macacos, alimentando-os com pelo 
menos 3 alimentos diferentes e verificando o conteúdo do estomago a cada refeição. Experimente fazer com que um macaco coma o outro. 
É possível criar um macaco canibal? */

import java.util.ArrayList;
import java.util.List;

public class Macaco {
    
    private String nome;
    private List<String> bucho;

    public Macaco (String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void comer(String alimento){
        if (this.bucho == null){
            this.bucho = new ArrayList<>();
        }
        this.bucho.add(alimento);
    }

    public void getBucho(){
        System.out.print(this.bucho);
    }

    public void digerir(){
        this.bucho.clear();
    }
}

