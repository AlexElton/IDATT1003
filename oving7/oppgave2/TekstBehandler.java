package oving7.oppgave2;

public class TekstBehandler {
    String string;

    public TekstBehandler(String string) {
        this.string = string;
    };

    //Finne antall ord i teksten
    //Finne gjennomsnittlig ordlengde
    //Finne gjennomsnittlig antall ord per periode. Punktum, utropstegn, kolon og spørretegn er skilletegn
    //Skiffte ut et ord med et annet gjennom hele teksen - eks finnes -> fins
    //Hente ut teksten slik den står, uten endringer
    //Hente ut teksten, men slik at alle bokstaver er store
    //Husk tekster med æ, ø og å

    public int antallOrd(){
        return string.split(" ").length;
    }

    public int gjennomsnittligOrdLengde(){
        String[] words = string.split(" ");
        int totalLength = 0;

        for (String word : words) {
            totalLength += word.length();
        }

        return totalLength / words.length;
    }

    public int gjennomsnittligOrdPerPeriode(){
        String[] words = string.split("[.!:?]");
        int totalWords = 0;

        for (String word : words) {
            totalWords += word.split(" ").length;
        }

        return totalWords / words.length;
    }

    public String skiftUtOrd(String oldWord, String newWord){
        return string.replaceAll(oldWord, newWord);
    }

    public String returnTekst(){
        return string;
    }

    public String returnTekstStore(){
        return string.toUpperCase();
    }



    public static void main(String[] args) {
        TekstBehandler tekstBehandler = new TekstBehandler("Alle årer er æss. men æss er år: ører lærer år! " );
        System.out.println("Antall ord: " + tekstBehandler.antallOrd());
        System.out.println("Gjennomsnitt lengde på ord i teksen:  " + tekstBehandler.gjennomsnittligOrdLengde());
        System.out.println("Gjennomsnittlig ord per periode: " + tekstBehandler.gjennomsnittligOrdPerPeriode());
        System.out.println("Tekst med skiftet ord: " + tekstBehandler.skiftUtOrd("æss", "ååååå"));
        System.out.println("Uendret tekst: " + tekstBehandler.returnTekst());
        System.out.println("Tekst i store bokstaver: " + tekstBehandler.returnTekstStore());


    }
}
