package oving8;

public final class Person {
    private String fornavn;
    private String etternavn;
    private String fodselsAar;

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
