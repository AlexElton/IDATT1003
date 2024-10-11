package oving5;

public class brok {
    public static void main(String []args) {
        
        Regne a, b;
        //try-catch for situasjon når nevner er lik 0 ---> printer output til bruker deretter kjører teller og nevner lik med 1
        try {
          a = new Regne(9.9, 2.7);
        } catch(IllegalArgumentException e) {
          System.out.println(e);
          a = new Regne(1);
        }

        try {
          b = new Regne(9, 4);
        } catch(IllegalArgumentException e)   {
          System.out.println(e);
          b = new Regne(1);
        }

        //printer "tabell" til brukeren med inputen gitt ovenfor
        a.addere(b);
        System.out.println(a.resultat());
        a.subtrahere(b);
        System.out.println(a.resultat());
        a.multiplisere(b);
        System.out.println(a.resultat());
        a.dividere(b);
        System.out.println(a.resultat());
    }
}

class Regne {
    double teller, nevner;
    String resultatOutput, resultatTotal;
    

    public Regne(double teller, double nevner) {
        //filter for å sjekke om nevner er lik 0 ---> output melding til bruker
        if (nevner == 0) {
            throw new IllegalArgumentException("Nevneren kan ikke være lik 0");
        } else {
            this.teller = teller;
            this.nevner = nevner;
        }
    }

    public Regne(double teller) {
        this.teller = teller;
        this.nevner = 1;
    }

    //bruker this.xxx for å ikke returnere noen verdier

    public void addere(Regne b) {
        double lokalTeller = (this.teller * b.nevner) + (b.teller * this.nevner);
        double lokalNevner = this.nevner * b.nevner;
        String lokalTotal = lokalTeller + "/" + lokalNevner;
        
        this.resultatTotal = lokalTotal;
        this.resultatOutput = this.teller + "/" + this.nevner + " + " + b.teller + "/" + b.nevner;
        
    }

    public void subtrahere(Regne b) {
        double lokalTeller = (this.teller * b.nevner) - (b.teller * this.nevner);
        double lokalNevner = this.nevner * b.nevner;
        String lokalTotal = lokalTeller + "/" + lokalNevner;

        this.resultatTotal = lokalTotal;
        this.resultatOutput = this.teller + "/" + this.nevner + " - " + b.teller + "/" + b.nevner;
    }

    public void multiplisere(Regne b) {
        double lokalTeller = this.teller * b.teller;
        double lokalNevner = this.nevner * b.nevner;
        String lokalTotal = lokalTeller + "/" + lokalNevner;

        this.resultatTotal = lokalTotal;
        this.resultatOutput = this.teller + "/" + this.nevner + " * " + b.teller + "/" + b.nevner;
    }

    public void dividere(Regne b) {
        double lokalTeller = this.teller * b.nevner;
        double lokalNevner = this.nevner * b.teller;
        String lokalTotal = lokalTeller + "/" + lokalNevner;

        this.resultatTotal = lokalTotal;
        this.resultatOutput = this.teller + "/" + this.nevner + " / " + b.teller + "/" + b.nevner;
    }

    public String resultat(){
        String resultat = resultatOutput + " = " + resultatTotal;
        return resultat;
    }

      


   
}