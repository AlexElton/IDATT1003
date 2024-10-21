package oving9;

public class OppgaveOversikt {
  private final Student[] studenter;
  private int antStud;

  public OppgaveOversikt(int maksAntallStudenter) {
    this.studenter = new Student[maksAntallStudenter];
    this.antStud = 0;
  }

  public int getAntStud() {
    return antStud;
  }

  public int getAntOppgForStudent(String navn) {
    for (int i = 0; i < antStud; i++) {
      if (studenter[i].getNavn().equals(navn)) {
        return studenter[i].getAntOppg();
      }
    }
    return -1; // Returnerer -1 hvis studenten ikke finnes
  }

  public void registrerStudent(String navn) {
    if (antStud < studenter.length) {
      studenter[antStud] = new Student(navn, 0);
      antStud++;
    }
  }

  public void okAntOppgForStudent(String navn, int okning) {
    for (int i = 0; i < antStud; i++) {
      if (studenter[i].getNavn().equals(navn)) {
        studenter[i].okAntOppg(okning);
        return;
      }
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < antStud; i++) {
      sb.append(studenter[i].toString()).append("\n");
    }
    return sb.toString();
  }
}
