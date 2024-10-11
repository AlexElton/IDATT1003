package oving2;
public class oppgave2 {

    public static void main(String[] args) {
        
       double prisA = 35.90; //kr
       double vektA = 450; //gram

       double prisB = 39.50; //kr
       double vektB = 500; //gram

       double prisPerGramA = prisA / vektA;
       double prisPerGramB = prisB / vektB;

       if (prisPerGramA < prisPerGramB) {
        System.out.println("Merke A er billigst per kilo");
       } else if (prisPerGramA > prisPerGramB) {
        System.out.println("Merke B er billigst per kilo");
       } else {
        System.out.println("Merke A og Merke B har samme kilo pris");
       }

    }
}