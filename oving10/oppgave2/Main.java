package oving10.oppgave2;

public class Main {
  public static void main(String[] args) {
    MenyRegister register = new MenyRegister();

    // Register some dishes
    Retter pizza = new Retter("Pizza", "Hovedrett", 150.0, "Deig, tomatsaus, ost");
    Retter kake = new Retter("Sjokoladekake", "Dessert", 80.0, "Sjokolade, mel, sukker");
    register.registrerRett(pizza);
    register.registrerRett(kake);

    // Create a menu
    Meny meny = new Meny();
    meny.leggTilRett(pizza);
    meny.leggTilRett(kake);
    register.registrerMeny(meny);

    // Display all menus
    System.out.println(register);
  }
}


//UML Diagram:
//Rett
//
//Fields: navn, type, pris, oppskrift
//Methods: getNavn(), getType(), getPris(), toString()
//Meny
//
//Fields: retter
//Methods: leggTilRett(), totalPris(), toString()
//MenyRegister
//
//Fields: retter, menyer
//Methods: registrerRett(), finnRett(), finnRetterAvType(), registrerMeny(), finnMenyerInnenforPrisIntervall(), toString()

//+--------------------+       +---------------------+        +---------------------+
//|       Rett         |       |        Meny         |        |    MenyRegister      |
//+--------------------+       +---------------------+        +---------------------+
//| - navn: String     |       | - retter: List<Rett>|        | - retter: List<Rett> |
//| - type: String     |       +---------------------+        | - menyer: List<Meny> |
//| - pris: double     |       | + leggTilRett()     |        +---------------------+
//| - oppskrift: String|       | + totalPris(): double|       | + registrerRett()    |
//+--------------------+       | + toString(): String|        | + finnRett()         |
//| + getNavn()        |       +---------------------+        | + finnRetterAvType()  |
//| + getType()        |                                        | + registrerMeny()    |
//| + getPris()        |       * A Meny contains                | + finnMenyerInnenforPrisIntervall() |
//| + toString()       |       * multiple Rett objects          +---------------------+
//+--------------------+

//Tools:
//Lucidchart
//Microsoft Visio
//draw.io
//StarUML