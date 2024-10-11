package oving2;
import java.util.Scanner;

public class oppgave1 {
    public static void main (String []args){
        //Oppgave 1
        try ( 
            Scanner scanner = new Scanner(System.in)) {
            System.out.print("Skriv inn år: ");
            int aar = scanner.nextInt();
            if (aar % 4 == 0 & aar % 100 != 0 || aar % 400 == 0) {
                System.out.println("Skuddår");
            } else {
                System.out.println("Ikke et skuddår");
            }
            
        }
    } 
}
