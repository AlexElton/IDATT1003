import java.util.Scanner;

class Valuta {
    float verdi;
    String navn;

    public Valuta(float verdi, String navn) {
        this.navn = navn; 
        this.verdi = verdi;
    }
    
    public double fraNok(double money) {
        double ans = money / verdi;
        return ans;
    }

    public double tilNok(double money) {
        double ans = money * verdi;
        return ans;
    }

}

public class konverter {

    private static final Valuta[] valuta = new Valuta[3]; //lager en array av objekter som har plass til 3 "inputs" - vil forelopig være 'null' intill vi gir innholdet i arrayen noen verdier
    public static void main(String []args) {

        //gir arrayen av objekter verdier
        valuta[0] = new Valuta(10.61f, "USD");
		valuta[1] = new Valuta(11.72f, "EUR");
		valuta[2] = new Valuta(1.03f, "SEK");

        //starter programmet
        meny();
    }

    public static void meny() {
        boolean fortsett = true;
        Scanner in = new Scanner(System.in);
        
        while (fortsett) {
            System.out.println("Skriv inn hvilken valuta du ønsker konvertert: ");
            System.out.println("1: Dollar ");
            System.out.println("2: Euro ");
            System.out.println("3: Svenske kroner: ");
            System.out.println("4: Avslutt: ");

            int menyValg = in.nextInt();

            if (menyValg == 4){
                System.out.println("Den er god! Ha en fin dag videre :)");
                fortsett = false;
            } else if (menyValg == 1 || menyValg == 2 || menyValg == 3){
                System.out.println("Vil du konvertere fra NOK til " + valuta[menyValg-1].navn + " eller fra " + valuta[menyValg-1].navn + " til NOK - ( 1 | 2 )");
                int konvertering = in.nextInt();
                Valuta valgtValuta = valuta[menyValg - 1];

                switch (konvertering) {
                    case 1 -> { 
                        System.out.println("Hvor mye vil du konvertere?");
                        double mengde = in.nextDouble();
                        System.out.println("Det blir " + valgtValuta.fraNok(mengde) + " " + valgtValuta.navn);
                        fortsett = false;
                        
                    }
                    case 2 -> {
                        System.out.println("Hvor mye vil du konvertere?");
                        double mengde = in.nextDouble();
                        System.out.println("Det blir NOK " + valgtValuta.tilNok(mengde));
                        fortsett = false;
                    }
                    default -> System.out.println("---------------------Ugyldig valg!---------------------");
                }
            } else {
                System.out.println("---------------------Ugyldig valg! Prøv igjen...---------------------");
            }
        }

        in.close();
        
        
    }

    
}




