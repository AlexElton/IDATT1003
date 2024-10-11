package oving6;

class tekstAnalyse {
    private static int[] antallTegn;


    public tekstAnalyse(String input) {
        antallTegn = new int[30]; //lager liste med 30 elementer
        String tekst = input;
        tekst = tekst.toLowerCase();

        //går igjennom teksten og setter hver bokstav til sin plass a=0, b=1...å=28
        for(int i = 0; i < tekst.length(); i++) {
            char ch = tekst.charAt(i);
            if (ch >= 'a' && ch <= 'z') { //hver bokstav har en ASCII-verdi som gjør at vi kan behandle bokstavene som tall
                antallTegn[ch - 'a']++;
            } else if (ch == 230){ //æ, ø, å er i et annet ASCII alfabet og verdien er dermed ikke i samme 'rekke' som a-z alfabetet
                antallTegn[26]++;
            } else if (ch == 248) {
                antallTegn[27]++;
            } else if (ch == 229) {
                antallTegn[28]++;
            } else {
                antallTegn[29]++;
            }
        }

        //for-loop for å printe ut antall bokstaver i teksten
        for (int i = 0; i < 26; i++) {
            if (antallTegn[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + antallTegn[i]);
            }
        }
        if (antallTegn[26] > 0) {
            System.out.println("æ: " + antallTegn[26]);
        }
        if (antallTegn[27] > 0) {
            System.out.println("ø: " + antallTegn[27]);
        }
        if (antallTegn[28] > 0) {
            System.out.println("å: " + antallTegn[28]);
        }
        if (antallTegn[29] > 0) {
            System.out.println("Andre Tegmn: " + antallTegn[29]);
        }

        //Printer ut alle metodene vi har lagd for tekst-inputen
        System.out.println(forksjelligeTegn());
        System.out.println(antallBokstaver());
        System.out.println(prosentTegn());
        System.out.println(bestemtBokstav('a'));
        System.out.println(flestForekomst());

    }

    public String forksjelligeTegn() {
        int antallForskjellige = 0;
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > 0) {
                antallForskjellige++;
            }
        }
        return "Det er " + antallForskjellige + " forksjellige bokstaver i denne teksten!";
    }

    public String antallBokstaver() {
        int sum = 0;
        for (int i = 0; i < 29; i++){
            sum += antallTegn[i];
        }
        return "Det er " + sum + " bokstaver i teksten!";
    }

    public String prosentTegn() {
        int bokstaver = 0;
        int tegn = antallTegn[29];
        for (int i = 0; i < 30; i++){
            bokstaver += antallTegn[i];
        }
        double prosent = Math.round(((double) tegn / bokstaver * 100) * 100.0) / 100.0;
        return prosent + "% er ikke bokstaver";
    }

    public String bestemtBokstav(char x) {
        int charIndex = 'a' - x;
        int antallBestemtBokstax = 0;
        if (x >= 'a' && x <= 'z') {
            antallBestemtBokstax = antallTegn[charIndex];
        }
        switch (x) {
            case 'æ' -> {
                antallBestemtBokstax = antallTegn[26];
            }
            case 'ø' -> {
                antallBestemtBokstax = antallTegn[27];
            }
            case 'å' -> {
                antallBestemtBokstax = antallTegn[28];
            }
        }

        return "I setningen forekommer bokstaven '" + x + "' " + antallBestemtBokstax + " ganger!";

    }

    public String flestForekomst() {
        StringBuilder hoyesteBokstav = new StringBuilder();
        int antall = 0;
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > antall) { //sjekker om antallTegn[i] er det høyeste tallet
                if (i < 26) {
                    antall = antallTegn[i];
                    hoyesteBokstav = new StringBuilder(String.valueOf((char) ('a' + i)));
                } else {
                    switch (i) {
                        case 26 -> {
                            antall = antallTegn[i];
                            hoyesteBokstav = new StringBuilder(String.valueOf((char) 230));
                        }
                        case 27 -> {
                            antall = antallTegn[i];
                            hoyesteBokstav = new StringBuilder(String.valueOf((char) 248));
                        }
                        case 28 -> {
                            antall = antallTegn[i];
                            hoyesteBokstav = new StringBuilder(String.valueOf((char) 229));
                        }
                    }
                }
            } else if (antallTegn[i] == antall) { //Hvis antallTegn[i] er lik det forrige høyeste så blir den bokstaven lagt til i stringen 'hoyesteBokstav'
                if (i < 26) {
                    hoyesteBokstav.append(", ").append(String.valueOf((char) ('a' + i)));

                } else {
                    switch (i) {
                        case 26 -> {
                            hoyesteBokstav.append(", ").append(String.valueOf((char) 230));
                        }
                        case 27 -> {
                            hoyesteBokstav.append(", ").append(String.valueOf((char) 248));
                        }
                        case 28 -> {
                            hoyesteBokstav.append(", ").append(String.valueOf((char) 229));
                        }
                    }
                }
            }
        }
        return "Bokstaven(e) " + hoyesteBokstav + " ble skrevet oftest - " + antall + " gang(er)";
    }


}
