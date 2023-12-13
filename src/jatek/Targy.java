package jatek;

import java.util.UUID;

class Targy {

    private String nev, leiras;
    private UUID id;

    public Targy(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
        this.id = UUID.randomUUID();
    }

    public String getNev() {
        return nev;
    }

    public String getLeiras() {
        return leiras;
    }

}
