package oving8;


import java.util.Scanner;

public class oppgave1 {
    public static void main(String[] args) {

        oppgave1 main = new oppgave1();
        main.start();

    }

    public void start() {

        //menystyrt program
        while (true) {
            System.out.println("1: Registrer arb-taker");
            System.out.println("2: Endre info i arb-taker");
            System.out.println("3: Avslutt");
            Scanner in = new Scanner(System.in);
            int valg = in.nextInt();
            switch (valg) {
                case 1:
                    System.out.println("Registrer arb-taker");
                    registrereArbTaker();
                    break;
                case 2:

                    System.out.println("Endre info i arb-taker");
                    System.out.println("Ansatt nr: ");
                    int ansattNr = in.nextInt();

                    ArbTaker arbTaker = ArbTaker.finnArbTaker(ansattNr);
                    if (arbTaker != null) {
                        System.out.println("Ny månedslønn: ");
                        int nyMaanedslonn = in.nextInt();
                        System.out.println("Ny skatteprosent: ");
                        double nySkatteprosent = in.nextDouble();
                        arbTaker.endreInfo(nyMaanedslonn, nySkatteprosent);
                        System.out.println("Endret informasjon for ansatt med ansattnr: " + ansattNr);
                        System.out.println(arbTaker.toString());
                    } else {
                        System.out.println("Fant ikke ansatt med dette ansattnr");
                    }
                    break;
                case 3:
                    System.out.println("Avslutter...");
                    //avslutt program
                    System.exit(0);
                default:
                    System.out.println("Ugyldig valg");
            }
        }



    }

    public void registrereArbTaker() {
        //TUI for å registrere arb-taker
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv inn fornavn: ");
        String fornavn = in.nextLine();
        System.out.println("Skriv inn etternavn: ");
        String etternavn = in.nextLine();
        System.out.println("Skriv inn fødselsår: ");
        String fodselsAar = in.nextLine();
        System.out.println("Skriv inn arb-taker nr: ");
        int arbTakerNr = in.nextInt();
        System.out.println("Skriv inn ansettelsesår: ");
        int ansettelsesAar = in.nextInt();
        System.out.println("Skriv inn månedslønn: ");
        double maanedslonn = in.nextDouble();
        System.out.println("Skriv inn skatteprosent: ");
        double skatteprosent = in.nextDouble();

        Person person = new Person(fornavn, etternavn, fodselsAar);
        ArbTaker arbTaker = new ArbTaker(person, arbTakerNr, ansettelsesAar, maanedslonn, skatteprosent);
    }




}
