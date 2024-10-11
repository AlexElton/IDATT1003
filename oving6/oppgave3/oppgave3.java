package oving6.oppgave3;
import java.util.Scanner;
import java.util.Arrays;

public class oppgave3 {
    private static Scanner in = new Scanner(System.in);
    private static double[][] n;

    public static void main(String[] args) {
        //Lag meny for å 1) Lage 1 matrise 2) Lage velge hva du vil gjøre med den

        visMeny();

    }

    public static void visMeny() {
        System.out.println("Skriv inn antall rader i matrise: ");
        int rows = in.nextInt();
        System.out.println("Skriv inn antall kolonner i matrise: ");
        int cols = in.nextInt();

        n = new double[rows][cols];
        Matrise matrise1 = lagMatrise(rows, cols);

        System.out.println("Tast 1 for å addere denne matrisen til en annen");
        System.out.println("Tast 2 for å multiplisere denne matrisen til en annen");
        System.out.println("Tast 3 for å tranponere matrisen");

        int menyValg = in.nextInt();
        Matrise result = null;

        switch (menyValg){
            case 1:
                Matrise matrise2 = lagMatrise(rows, cols);
                result = Matrise.addereMatriser(matrise1, matrise2);
                break;
            case 2:
                Matrise matrise3 = lagMatrise(rows, cols);
                result = Matrise.multiplisereMatrise(matrise1, matrise3);
                break;
            case 3:
                result = Matrise.transponereMatrise(matrise1);
                break;
            default:
                System.out.println("Ugyldig valg");
                break;
        }

        if (result != null) {
            System.out.println("Resultat: \n" + result);
        } else {
            System.out.println("Operasjonen kan ikke utføres grunnet ugyldig dimensjoner");
        }

        in.close();
    }

    public static Matrise lagMatrise(int rader, int kolonner) {
        for (int i = 0; i < rader; i++) {
            for(int j = 0; j < kolonner ; j++) {
                System.out.println("Skriv inn verdi for rad " + i + " og kolonne " + j);
                n[i][j] = in.nextDouble();
            }
        }

        return new Matrise(n);
    }

}