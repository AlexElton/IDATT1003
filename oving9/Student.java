package oving9;

public class Student {
  private final String navn;
  private int antOppg;

  public Student(String navn, int antOppg) {
    this.navn = navn;
    this.antOppg = antOppg;
  }

  public String getNavn() {
    return navn;
  }

  public int getAntOppg() {
    return antOppg;
  }

  public void okAntOppg(int okning) {
    if (okning > 0) {
      this.antOppg += okning;
    }
  }

  @Override
  public String toString() {
    return "Navn: " + navn + ", Antall oppgaver: " + antOppg;
  }
}