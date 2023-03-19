package Act_8;

public class Card { //Asdruds

    public String palo;
    public String color;
    public String valor;
    public Card (String palo, String color, String valor){

        this.palo = palo;
        this.color = color;
        this.valor = valor;

    }


    public String getPalo() {
        return palo;
    }

    public String getColor() {
        return color;
    }

    public String getValor(){
        return valor;
    }
}
