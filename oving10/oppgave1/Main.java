package oving10.oppgave1;

import java.util.List;
import java.util.Scanner;

public class Main {
    ArrangementRegister register = new ArrangementRegister();

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        while (true) {
            System.out.println("Velkommen");
            System.out.println("1) Registrer arrangement");
            System.out.println("2) Finn arrangementer på et gitt sted");
            System.out.println("3) Finn arrangementer på en gitt dato");
            System.out.println("4) Finn arrangementer innenfor et tidsintervall");
            System.out.println("5) List alle arrangementer sortert etter sted");
            System.out.println("6) List alle arrangementer sortert etter tidspunkt");
            System.out.println("7) List alle arrangementer sortert etter type");
            System.out.println("8) Avslutt");

            Scanner input = new Scanner(System.in);
            int valg = input.nextInt();
            input.nextLine(); // Consume newline after nextInt()

            switch (valg) {
                case 1:
                    registrerArrangement();
                    break;
                case 2: {
                    System.out.println("Arrangementer på et gitt sted: ");
                    String sted = input.nextLine();
                    List<Arrangement> arrangements = register.findByLocation(sted);
                    arrangements.forEach(System.out::println);
                    break;
                }
                case 3: {
                    System.out.println("Arrangementer på en gitt dato: ");
                    long dato = input.nextLong();
                    List<Arrangement> arrangements = register.findByDate(dato);
                    arrangements.forEach(System.out::println);
                    break;
                }
                case 4: {
                    System.out.println("Arrangementer fra: ");
                    long start = input.nextLong();
                    System.out.println("Arrangementer til: ");
                    long slutt = input.nextLong();
                    List<Arrangement> arrangements = register.findByTimeInterval(start, slutt);
                    arrangements.forEach(System.out::println);
                    break;
                }
                case 5: {
                    List<Arrangement> arrangements = register.sortByLocation();
                    arrangements.forEach(System.out::println);
                    break;
                }
                case 6: {
                    List<Arrangement> arrangements = register.sortByTime();
                    arrangements.forEach(System.out::println);
                    break;
                }
                case 7: {
                    List<Arrangement> arrangements = register.sortByType();
                    arrangements.forEach(System.out::println);
                    break;
                }
                case 8: {
                    System.out.println("Avslutter...");
                    input.close();
                    System.exit(0);
                }
                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
            }
        }
    }

    public void registrerArrangement() {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn arrangementets ID: ");
        int id = input.nextInt();
        input.nextLine(); // Consume the newline after nextInt()
        System.out.println("Skriv inn arrangementets navn: ");
        String name = input.nextLine();
        System.out.println("Skriv inn arrangementets lokasjon: ");
        String location = input.nextLine();
        System.out.println("Skriv inn arrangementets arrangør: ");
        String organizer = input.nextLine();
        System.out.println("Skriv inn arrangementets type: ");
        String type = input.nextLine();
        System.out.println("Skriv inn arrangementets tidspunkt: (yyyy|mm|dd|hh|mm) ");
        long time = input.nextLong();
        register.registerArrangement(new Arrangement(id, name, location, organizer, type, time));
    }
}
