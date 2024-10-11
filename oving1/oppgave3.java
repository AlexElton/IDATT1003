package oving1;
import java.util.Scanner;

public class oppgave3 {
    public static void main (String []args) {
    
        try (  // sørger for at scanner stenges på slutten av funksjonen

            Scanner scanner = new Scanner(System.in)) {
            System.out.print("Skriv inn antall Sekunder: ");
            
            int totalSekunder = scanner.nextInt();
            
            // Beregn antall timer
            int timer = totalSekunder / 3600;
            
            // Beregn resterende sekunder etter å ha trukket fra hele timer
            int resterendeSekunder = totalSekunder % 3600;
            
            // Beregn antall minutter fra de resterende sekundene
            int minutter = resterendeSekunder / 60;
            
            // Beregn de resterende sekundene
            int sekunder = resterendeSekunder % 60;
            
            
            System.out.println("Tid: " + timer + " timer, " + minutter + " minutter, " + sekunder + " sekunder");
        }
    }
    
}
