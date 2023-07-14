package Fazenda;

import java.util.ArrayList;
import java.util.List;

public class Fazendinha {
    
    public List<Object> animais = new ArrayList<>();

    public void adicionarAnimal(BichoFazenda bichoCliente){
        this.animais.add(bichoCliente);
    }
}
