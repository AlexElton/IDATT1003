package oving10.oppgave2;

import java.util.ArrayList;
import java.util.List;

class MenyRegister {
  private List<Retter> retter;
  private List<Meny> menyer;

  public MenyRegister() {
    this.retter = new ArrayList<>();
    this.menyer = new ArrayList<>();
  }

  public void registrerRett(Retter rett) {
    retter.add(rett);
  }

  public Retter finnRett(String navn) {
    for (Retter rett : retter) {
      if (rett.getNavn().equals(navn)) {
        return rett;
      }
    }
    return null;
  }

  public List<Retter> finnRetterAvType(String type) {
    List<Retter> resultat = new ArrayList<>();
    for (Retter rett : retter) {
      if (rett.getType().equals(type)) {
        resultat.add(rett);
      }
    }
    return resultat;
  }

  public void registrerMeny(Meny meny) {
    menyer.add(meny);
  }

  public List<Meny> finnMenyerInnenforPrisIntervall(double minPris, double maxPris) {
    List<Meny> resultat = new ArrayList<>();
    for (Meny meny : menyer) {
      double pris = meny.totalPris();
      if (pris >= minPris && pris <= maxPris) {
        resultat.add(meny);
      }
    }
    return resultat;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Alle menyer:\n");
    for (Meny meny : menyer) {
      sb.append(meny.toString()).append("\n");
    }
    return sb.toString();
  }

  }