package oving11;
import java.util.Scanner;

public class Main {
  private static EiendomsRegister register = new EiendomsRegister();
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    boolean ferdig = false;

    while (!ferdig) {
      visMeny();
      int valg = scanner.nextInt();
      scanner.nextLine(); // Håndter linjeskift

      switch (valg) {
        case 1:
          leggTilEiendom();
          break;
        case 2:
          skrivUtAlleEiendommer();
          break;
        case 3:
          søkEtterEiendom();
          break;
        case 4:
          beregnGjennomsnittsAreal();
          break;
        case 5:
          ferdig = true;
          System.out.println("Avslutter programmet.");
          break;
        default:
          System.out.println("Ugyldig valg, prøv igjen.");
      }
    }
  }

  // Viser menyen
  private static void visMeny() {
    System.out.println("\nEiendomsregister - Meny");
    System.out.println("1. Legg til eiendom");
    System.out.println("2. Skriv ut alle eiendommer");
    System.out.println("3. Søk etter eiendom");
    System.out.println("4. Beregn gjennomsnittsareal");
    System.out.println("5. Avslutt");
    System.out.print("Velg et alternativ: ");
  }

  // Legger til en ny eiendom
  private static void leggTilEiendom() {
    System.out.print("Kommunenummer: ");
    int kommunenr = scanner.nextInt();
    System.out.print("Gårdsnummer: ");
    int gnr = scanner.nextInt();
    System.out.print("Bruksnummer: ");
    int bnr = scanner.nextInt();
    scanner.nextLine(); // Håndter linjeskift
    System.out.print("Navn (valgfritt): ");
    String navn = scanner.nextLine();
    System.out.print("Areal (m²): ");
    double areal = scanner.nextDouble();
    scanner.nextLine(); // Håndter linjeskift
    System.out.print("Eier: ");
    String eier = scanner.nextLine();

    Eiendom nyEiendom = new Eiendom(kommunenr, gnr, bnr, navn, areal, eier);
    register.leggTilEiendom(nyEiendom);
    System.out.println("Eiendom registrert!");
  }

  // Skriver ut alle eiendommer
  private static void skrivUtAlleEiendommer() {
    register.skrivUtAlleEiendommer();
  }

  // Søker etter en eiendom
  private static void søkEtterEiendom() {
    System.out.print("Kommunenummer: ");
    int kommunenr = scanner.nextInt();
    System.out.print("Gårdsnummer: ");
    int gnr = scanner.nextInt();
    System.out.print("Bruksnummer: ");
    int bnr = scanner.nextInt();

    Eiendom eiendom = register.finnEiendom(kommunenr, gnr, bnr);
    if (eiendom != null) {
      System.out.println("Eiendom funnet: " + eiendom);
    } else {
      System.out.println("Ingen eiendom funnet med oppgitte verdier.");
    }
  }

  // Beregner gjennomsnittsarealet av alle eiendommer
  private static void beregnGjennomsnittsAreal() {
    double gjennomsnitt = register.beregnGjennomsnittsAreal();
    System.out.println("Gjennomsnittlig areal av alle eiendommer: " + gjennomsnitt + " m²");
  }
}
