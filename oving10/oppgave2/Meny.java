package oving10.oppgave2;

import java.util.ArrayList;
import java.util.List;

class Meny {
  private List<Retter> retter;

  public Meny() {
    this.retter = new ArrayList<>();
  }

  public void leggTilRett(Retter rett) {
    retter.add(rett);
  }

  public double totalPris() {
    double sum = 0;
    for (Retter rett : retter) {
      sum += rett.getPris();
    }
    return sum;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Meny:\n");
    for (Retter rett : retter) {
      sb.append(rett.toString()).append("\n");
    }
    sb.append("Total pris: ").append(totalPris()).append(" kr");
    return sb.toString();
  }
}
