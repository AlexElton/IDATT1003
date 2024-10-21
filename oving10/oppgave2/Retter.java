package oving10.oppgave2;

import java.util.ArrayList;
import java.util.List;

// Rett class
class Retter {
  private String navn;
  private String type;
  private double pris;
  private String oppskrift;

  public Retter(String navn, String type, double pris, String oppskrift) {
    this.navn = navn;
    this.type = type;
    this.pris = pris;
    this.oppskrift = oppskrift;
  }

  public String getNavn() { return navn; }
  public String getType() { return type; }
  public double getPris() { return pris; }

  @Override
  public String toString() {
    return navn + " (" + type + "): " + pris + " kr, Oppskrift: " + oppskrift;
  }
}