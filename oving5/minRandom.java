package oving5;
import java.util.Random;
import java.util.Scanner;

public class minRandom {

    private static final Random random = new Random();
    private static final minRandom minRandom = new minRandom();
    private static final Scanner in = new Scanner(System.in);

    public static void main(String []args){
        visMeny();        
    }    

    public static void visMeny() {

        System.out.println("Skriv inn nedre tall i intervallet ditt: ");
        int nedre = in.nextInt();

        System.out.println("Skriv inn øvre tall i intervallet ditt: ");
        int ovre = in.nextInt();

        System.out.println("Vil du ha heltall (1) eller desimaltall (2): ");
        int menyValg = in.nextInt();

        switch (menyValg) {
            case 1 -> {
                for (int i = 0; i < 15; i++) {
                    System.out.println(minRandom.heltall(nedre, ovre));
                }
            }
            case 2 -> {
                for (int i = 0; i < 30; i++) {
                    System.out.println(minRandom.desimal(nedre, ovre));
                }
            }
            default -> {
                System.out.println("Feil input! Du må taste 1 (for heltall) eller 2 (for desimaltall) ");
                visMeny();
            }   
        }
    }

    public minRandom() {
    }

    public int heltall(int nedre, int ovre) {
        int max = ovre - nedre;
        int resultat = random.nextInt(max);
        resultat = resultat + nedre;

        return resultat;
    }

    public double desimal(double nedre, double ovre) {
        double diff = ovre - nedre;
        double tilfeldig = random.nextDouble();

        return nedre + (tilfeldig * diff);
    }
}
