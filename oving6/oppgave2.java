package oving6;
import java.util.*;

class Oppgave2 {
    private static boolean sant = true;

    public static void main(String[] args) {
        while (sant) {
            start();
        }
    }

    public static void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Tast inn teksten som skal analyseres:");
        String input = in.nextLine();
        tekstAnalyse abc = new tekstAnalyse(input);
    }
}