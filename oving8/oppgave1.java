package oving8;

public class oppgave1 {
    public static void main(String[] args) {
        //må spesifisere hvilken person som er fornavn, etternavn og fødselsår

        Person person = new Person("Ola", "Nordmann", "1990");
        ArbTaker arbTaker = new ArbTaker(person, 123456, 2010, 50000, 50);
        System.out.println(arbTaker.toString());


    }
}
