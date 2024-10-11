import java.util.Scanner;

public class oppgave2 {

    public static void main (String []args) {
        erPrimtall();
    }

    public static void erPrimtall() {
        //Definerer tallet som skal skrives inn
        int erPrimtall = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn tall for å sjekke om det er et primtall:");
        int tall = input.nextInt();

        //Sjekker om tallet er 1 (eller lavere)
        if (tall <= 1) {
            System.out.println("Tallet er ikke et primtall");
            
        }

        //sjekker alle tall fra 2 til tall-1
        for (int i = 2; i < tall; i++) {
            if (tall % i == 0) {
                System.out.println("Tallet er ikke et primtall");
                erPrimtall = 1;
                break;
            }
        }

        if (erPrimtall == 0) {
            System.out.println("Tallet er et primtall");
        }
        
        System.out.println("Ønsker du å fortsette? (1 for ja / 2 for nei)");
        int svar = input.nextInt();
        if (svar == 1) {
            erPrimtall(); //kan også bruke en while-løkke for å unngå recursion (som vil redusere minne brukt av programmet)
        } else {
            System.out.println("Takk for bruken. Ha en fin dag videre!");
        }
        
        input.close();

    }


}

