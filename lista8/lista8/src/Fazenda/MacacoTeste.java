package Fazenda;
public class MacacoTeste {
    
    public static void main(String [] args){

        Macaco caco = new Macaco("Caco");
        Macaco bobba = new Macaco("bobba");

        bobba.comer("Banana");
        bobba.comer("Ração");
        bobba.comer("Abacate"); //Não é possível comer o outro macaco.
        bobba.getBucho();

        caco.comer("Banana");
        caco.comer("Maça");
        caco.comer("Ração");
        caco.digerir();
        caco.getBucho();
    }
}
