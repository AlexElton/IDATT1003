package oving6;
import java.util.Arrays;
import java.util.Random;

public class randomOversikt {
    public static void main(String []args) {
        Random random = new Random();

        int antallTall = 10;
        int antallRunder = 100;
        int[] array = new int[antallTall];

        for (int i = 0; i < antallRunder; i++) {
            int tall = random.nextInt(antallTall);
            array[tall]++;
        }

        for (int i = 0; i < array.length; i++) {
            long stjerner = Math.round(array[i] / (antallRunder / 100.0));
            String stjerne = "";
            for (long j = 0; j < stjerner; j++) {
                stjerne = stjerne + "*";
            }
            System.out.println(i + ") " + array[i] + " " + stjerne);

        }


    }
}

