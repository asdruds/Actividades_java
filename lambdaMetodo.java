package Act_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

interface lambdaClass{
    void sort(List lista);

}
public class lambdaMetodo {

    public static void main(String[] args) { //Asdruds

        List<String> listaB = new ArrayList<>();
        listaB.add("Hamburguesa");
        listaB.add("Pambazo");
        listaB.add("Tacos");
        listaB.add("Chilaquiles");
        listaB.add("Spaguetti");
        listaB.add("Enchiladas");
        listaB.add("Lasagna");
        listaB.add("Mole");
        listaB.add("Empanadas");
        listaB.add("Quesadillas");

        lambdaClass sortLongitud = (list) -> {
            Collections.sort(list, (String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
        };

        sortLongitud.sort(listaB);
        System.out.println("Por longitud");
        System.out.println(listaB);

        lambdaClass sortAlfabetico= (lista) -> {
            Collections.sort(lista);
        };

        sortAlfabetico.sort(listaB);
        System.out.println("Por orden alfabético");
        System.out.println(listaB);


    }

}