import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Map<String, String> generos = new HashMap<>();
        generos.put("M", "masculino");
        generos.put("F", "feminino");
        generos.put("O", "outros");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual é o seu sexo? (F/M/O) ");
        String sexo = entrada.nextLine().toUpperCase();

        entrada.close();
        String descricaoGenero = generos.get(sexo);

        if (descricaoGenero != null) {
            System.out.println("Você se identifica como " + descricaoGenero);
        } else {
            System.out.println("Opção inválida.");
        }

    }
}
