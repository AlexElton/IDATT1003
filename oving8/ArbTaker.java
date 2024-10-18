package oving8;

import java.util.ArrayList;

public class ArbTaker {
    private final Person person;
    private final int arbTakerNr;
    private final int ansettelsesAar;
    private double maanedslonn;
    private double skatteprosent;
    //liste over alle ArbTakere
    private final static ArrayList<ArbTaker> arbTakere = new ArrayList<ArbTaker>();

    public ArbTaker(Person person, int arbtakernr, int ansettelsesAar, double maanedslonn, double skatteprosent) {
        this.person = person;
        this.arbTakerNr = arbtakernr;
        this.ansettelsesAar = ansettelsesAar;
        this.maanedslonn = maanedslonn;
        this.skatteprosent = skatteprosent;
        arbTakere.add(this);
    }

    public String getNavn() {
        return person.getEtternavn() + ", " + person.getFornavn();
    }

    public int alder() {
        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        int aar = kalender.get(java.util.Calendar.YEAR);
        return aar - Integer.parseInt(person.getFodselsAar());
    }

    //søke etter ansatt og kunne endre informajon om denne
    public static ArbTaker finnArbTaker(int arbTakerNr) {
        for (ArbTaker arbTaker : arbTakere) {
            if (arbTaker.arbTakerNr == arbTakerNr) {
                return arbTaker;
            }
        }
        return null;
    }

    //ende informasjon om ansatt
    public void endreInfo(double maanedslonn, double skatteprosent) {
        this.maanedslonn = maanedslonn;
        this.skatteprosent = skatteprosent;
    }


    public double skattPerManed() {
        return Math.round((maanedslonn * skatteprosent/100) / 0.875 * 100.0) / 100.0;
    }

    public double skattPerAr() {
        return Math.round(skattPerManed() * 10.5);
    }

    public double bruttoLonn() {
        return maanedslonn * 12;
    }

//    public double lonnEtterSkatt() {
//        return bruttoLonn() - skattPerAr();
//    }

    public double aarIBedriften() {
        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        int aar = kalender.get(java.util.Calendar.YEAR);
        return aar - ansettelsesAar;
    }

    public String ansettelseOverInput(int input) {
        if (aarIBedriften() > input) {
            return "JA! Ansettelse over " + input + " år";
        } else {
            return "NEI! Ansettelse under " + input + " år";
        }
    }

    public String toString() {
        return "Navn: " + getNavn() + "\n" +
            "Alder: " + alder() + "år \n" +
            "Skatt per måned: NOK " + skattPerManed() + " (0,- skatt i juni og 1/2 skatt i Desember\n" +
            "Bruttolønn: NOK " + bruttoLonn() + "\n" +
            "Skattetrekk per år: NOK " + skattPerAr() + "\n" +
            "Antall år i bedriften: " + aarIBedriften() + "år \n" +
            ansettelseOverInput(10);


    }
}
