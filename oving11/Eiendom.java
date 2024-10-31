package oving11;

public class Eiendom {
  private final int kommunenr;
  private final int gnr; // Gårdsnummer
  private final int bnr; // Bruksnummer
  private final String navn; // Navn på eiendommen (kan være tom)
  private final double areal; // Areal i m²
  private final String eier; // Eier av eiendommen

  public Eiendom(int kommunenr, int gnr, int bnr, String navn, double areal, String eier) {
    this.kommunenr = kommunenr;
    this.gnr = gnr;
    this.bnr = bnr;
    this.navn = navn;
    this.areal = areal;
    this.eier = eier;
  }

  public int getKommunenr() {
    return kommunenr;
  }

  public int getGnr() {
    return gnr;
  }

  public int getBnr() {
    return bnr;
  }

  public String getNavn() {
    return navn;
  }

  public double getAreal() {
    return areal;
  }

  public String getEier() {
    return eier;
  }

  // Metode for å returnere eiendommens unike ID i formatet "kommunenr-gnr/bnr"
  public String hentEiendomsID() {
    return kommunenr + "-" + gnr + "/" + bnr;
  }

  // Metode for å representere eiendommen som en streng
  @Override
  public String toString() {
    return "Eiendoms-ID: " + hentEiendomsID() + ", Navn: " + navn + ", Areal: " + areal + " m², Eier: " + eier;
  }
}

