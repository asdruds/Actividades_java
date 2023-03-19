package Act_8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck { //Asdruds

    //Valores de las cartas
    public String [] L_palo = {"Treboles", "Corazones", "Picas", "Diamantes"};
    public String [] L_valor = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

    public ArrayList<Card> NuevoDeck;
    Random R = new Random();

    public Deck(){

        String palo, color = "-", valor;
        NuevoDeck = new ArrayList<>(52);

        for( int i = 0; i < L_palo.length; i++){
            palo = L_palo[i];
            if (palo.equals("Treboles") || palo.equals("Picas")){
                color = "Negro";
            }else if (palo.equals("Corazones") || palo.equals("Diamantes")){
                color = "Rojo";
            }

            for(int x = 0; x < L_valor.length; x++){
                valor = L_valor[x];

                NuevoDeck.add(new Card(palo, color, valor));
            }
        }
        Collections.shuffle(this.NuevoDeck);

    }

    public void shuffle(){

        Collections.shuffle(this.NuevoDeck);

        System.out.println("Se mezcló el deck");
    }

    public void head(){

        Card Head = this.NuevoDeck.get(0);
        System.out.println(Head.getPalo() + ", " + Head.getColor() + ", " + Head.getValor());
        this.NuevoDeck.remove(0);

        System.out.println("Quedan "+ this.NuevoDeck.size() + " cartas en deck.");

    }

    public void pick(){

        int num = R.nextInt(this.NuevoDeck.size() + 1);
        Card Pick =  this.NuevoDeck.get(num);

        System.out.println(Pick.getPalo() + ", " + Pick.getColor() + ", " + Pick.getValor());
        this.NuevoDeck.remove(num);

        System.out.println("Quedan "+ this.NuevoDeck.size() + " cartas en deck."); 
    }

    public void hand(){

        for(int x = 0; x < 5; x++){

            int num = R.nextInt(this.NuevoDeck.size());
            Card Pick =  this.NuevoDeck.get(num);

            System.out.println(Pick.getPalo() + ", " + Pick.getColor() + ", " + Pick.getValor());
            this.NuevoDeck.remove(num);

        }

        System.out.println("Quedan "+ this.NuevoDeck.size() + " cartas en deck.");
        Collections.shuffle(this.NuevoDeck);

    }
}
