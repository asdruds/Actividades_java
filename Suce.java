package Act_7;

public class Suce { //Asdruds

    public int tamaño;
    public Suce(int tamaño){
        this.tamaño = tamaño;
    }

    public int[] S_primo(int tamaño) {

        int[] SPrimo = new int[tamaño];
        int num = 2;
        int x = 0;

        while(x < tamaño){

            int valor = esPrimo(num);

            if(valor != 0){
                SPrimo[x] = num;
                x++;
            }
            num++;
        }
        return SPrimo;
    }

    public int[] S_fibo(int tamaño){

        int[] Sfibo = new int[tamaño];
        int num1 = 0, num2 = 1;
        Sfibo[0]= num1;
        Sfibo[1] = num2;

        for(int x = 2; x < Sfibo.length; x++){
            int num3 = num1 + num2;
            Sfibo[x] = num3;

            num1 = num2;
            num2 = num3;
        }

        return Sfibo;
    }

    public int esPrimo(int num) {
        int x = 1, cont = 0;
        while (x <= num){
            if(num % x == 0){cont++;}
            x++;
        }
        if (cont <= 2){
            return num;
        }else{
            return 0;
        }
    }

}
