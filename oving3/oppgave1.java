import java.util.Scanner;

public class oppgave1 {

    public static void main (String []args) {

        //Definerer tallene som skal skrives inn
        int tall1;
        int tall2;

        try ( //Sørger for at Scanneren closes
            Scanner scanner = new Scanner(System.in)) {

            System.out.print("Skriv inn starten av multiplikasjonstabellen: ");
            tall1 = scanner.nextInt();
            System.out.print("Skriv inn slutten av multiplikasjonstabellen: ");
            tall2 = scanner.nextInt();
            }
        

        gangetabell(tall1, tall2); //kaller på metoden/funksjonen "gangetabell" med tallene vi får fra input
    }

    static void gangetabell(int gangetabellStart, int gangetabellSlutt) {
        

        if (gangetabellStart <= gangetabellSlutt) { //Sjekker om brukeren har skrevet det laveste tallet først
            int inputDiff = gangetabellSlutt - gangetabellStart;

            if (inputDiff == 0) { //hvis brukeren har skrevet det samme tallet to ganger, vil programmet skrive ut gangetabellen en gang (i stedet for 2 ganger)
                System.out.println(gangetabellStart + "-gangen:");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(gangetabellStart + " * " + i + " = " + i*gangetabellStart);
                }
            } else { 
                for (int e = 0; e<=inputDiff; e++){ //finner ut hvor mange tall brukeren ønsker å få i gangetabellen
                    System.out.println((gangetabellStart+e) + "-gangen:");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(gangetabellStart+e + " * " + i + " = " + i*(gangetabellStart+e));
                    }
                }
            }
            
            

        } else { 
            System.out.println("Skriv det laveste tallet først");
        }
        
        

    }

}

