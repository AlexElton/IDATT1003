package oving7.oppgave1;

//immutabel klasse
//konstruktør som tar inn et objekt av klassen String som argument
//forkorter setning - beholder kun første bokstav i hvert ord
//fjerner av betemt tegn - f.eks fjerne alle 'e' i en setning

public class NyString {
    private final String string;

    public NyString(String string) {
        this.string = string;
    };

    public String forkort() {
        StringBuilder sb = new StringBuilder();
        String[] words = string.split(" ");
        for (String word : words) {
            sb.append(word.charAt(0));
        }

        return sb.toString();
    };

    public String fjernOnsketChar(char c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != c) {
                sb.append(string.charAt(i));
            }
        }
        return sb.toString();
    };

    public static void main(String[] args) {
        NyString nyString = new NyString("Dette er allen test");
        System.out.println("Forkortet Tekst: " + nyString.forkort());
        char fjern = 't';
        System.out.println("Tekst uten " + fjern + ": " + nyString.fjernOnsketChar(fjern));
    }
}


