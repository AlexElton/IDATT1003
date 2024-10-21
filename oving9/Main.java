package oving9;

public class Main {
  public static void main(String[] args) {
    OppgaveOversikt oversikt = new OppgaveOversikt(10);

    // Registrer studenter
    oversikt.registrerStudent("Anna");
    oversikt.registrerStudent("Bjørn");

    // Øk antall oppgaver for Anna
    oversikt.okAntOppgForStudent("Anna", 5);

    // Skriv ut oversikt
    System.out.println(oversikt);

    // Finn antall oppgaver for Bjørn
    System.out.println("Bjørn har levert: " + oversikt.getAntOppgForStudent("Bjørn") + " oppgaver.");

    // Øk antall oppgaver for Bjørn
    oversikt.okAntOppgForStudent("Bjørn", 3);
    System.out.println(oversikt);
  }
}
