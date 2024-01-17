import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();
    }

    private static void exemploNumeros() {
        System.out.println("****** Exemplo Lista Simples Numeros ******");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        System.out.println(numeros);
    }

    private static void exemploListaSimples () {
        System.out.println("****** Exemplo Lista Simples ******");
        List<String> lista = new ArrayList<>();
        lista.add("Guilherme Guimarães");
        lista.add("Gustavo Guimarães");
        lista.add("Gabriel Guimarães");

        System.out.println(lista);

    }

    private static  void exemploListaSimplesOrdemAscendente (){
        System.out.println("****** Exemplo Lista Ascendente ******");
        List<String> lista = new ArrayList<>();
        lista.add("Guilherme Guimarães");
        lista.add("Gustavo Guimarães");
        lista.add("Gabriel Guimarães");
        Collections.sort(lista);
        System.out.println(lista);

        lista.add("Family");



    }
}