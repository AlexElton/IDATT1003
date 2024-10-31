package oving11;

import java.util.ArrayList;
import java.util.List;

public class EiendomsRegister {
  private final List<Eiendom> eiendommer; // Liste over eiendommer

  // Konstruktør
  public EiendomsRegister() {
    eiendommer = new ArrayList<>();
  }

  // Metode for å registrere en ny eiendom i registeret
  public void leggTilEiendom(Eiendom eiendom) {
    eiendommer.add(eiendom);
  }

  // Metode for å finne en eiendom basert på kommunenr, gnr og bnr
  public Eiendom finnEiendom(int kommunenr, int gnr, int bnr) {
    for (Eiendom e : eiendommer) {
      if (e.getKommunenr() == kommunenr && e.getGnr() == gnr && e.getBnr() == bnr) {
        return e;
      }
    }
    return null; // Returner null hvis ingen eiendom er funnet
  }

  // Metode for å skrive ut alle eiendommer
  public void skrivUtAlleEiendommer() {
    if (eiendommer.isEmpty()) {
      System.out.println("Ingen eiendommer registrert.");
    } else {
      for (Eiendom e : eiendommer) {
        System.out.println(e);
      }
    }
  }

  // Metode for å beregne gjennomsnittsarealet av alle eiendommene
  public double beregnGjennomsnittsAreal() {
    if (eiendommer.isEmpty()) {
      return 0.0;
    }

    double totalAreal = 0;
    for (Eiendom e : eiendommer) {
      totalAreal += e.getAreal();
    }
    return totalAreal / eiendommer.size();
  }
}
