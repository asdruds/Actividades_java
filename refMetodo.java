package Act_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
interface RefM {
    void sort(List lista);
}

class refClass {
    static void sortLongitud(List lista) {

        Collections.sort(lista, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

    }

    static void sortAlfabetico(List lista) {

        Collections.sort(lista);

    }

}

public class refMetodo{

    public static void main(String[] args) { //Asdruds

        List<String> listaC = new ArrayList<>();
        listaC.add("Hamburguesa");
        listaC.add("Pambazo");
        listaC.add("Tacos");
        listaC.add("Chilaquiles");
        listaC.add("Spaguetti");
        listaC.add("Enchiladas");
        listaC.add("Lasagna");
        listaC.add("Mole");
        listaC.add("Empanadas");
        listaC.add("Quesadillas");

        RefM sortLongitud = refClass::sortLongitud;

        RefM sortAlfabetico = refClass::sortAlfabetico;

        sortLongitud.sort(listaC);
        System.out.println("Por longitud");
        System.out.println(listaC);

        sortAlfabetico.sort(listaC);
        System.out.println("Por orden alfabético");
        System.out.println(listaC);

    }

}
