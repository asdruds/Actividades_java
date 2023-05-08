package Act_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

interface AnonClass {
    public void sortLongitud(List lista);

    public void sortAlfabetico(List lista);

}

public class AnonMetodo {

    public static void main(String[] args) { //Asdruds

        List<String> listaA = new ArrayList<>();
        listaA.add("Hamburguesa");
        listaA.add("Pambazo");
        listaA.add("Tacos");
        listaA.add("Chilaquiles");
        listaA.add("Spaguetti");
        listaA.add("Enchiladas");
        listaA.add("Lasagna");
        listaA.add("Mole");
        listaA.add("Empanadas");
        listaA.add("Quesadillas");


        AnonClass anon = new AnonClass() {
            public void sortLongitud(List lista) {

                Collections.sort(lista, new Comparator<String>() {
                    public int compare(String s1, String s2) {
                        return Integer.compare(s1.length(), s2.length());
                    }
                });
                System.out.println("Por longitud");
                System.out.println(lista);
            }

            public void sortAlfabetico(List lista) {

                Collections.sort(lista);
                System.out.println("Por orden alfabético");
                System.out.println(lista);

            }
        };

        anon.sortLongitud(listaA);
        anon.sortAlfabetico(listaA);
    }
}
