package oving8;

public final class Person {
    private final String fornavn;
    private final String etternavn;
    private final String fodselsAar;

    public Person (String fornavn, String etternavn, String fodselsAar) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselsAar = fodselsAar;

    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getFodselsAar() {
        return fodselsAar;
    }
}
