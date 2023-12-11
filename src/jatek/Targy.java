package jatek;

import java.util.ArrayList;
import java.util.UUID;

class Targy {

    private String nev, leiras;
    private UUID id;
    private ArrayList<Targy> targyak;

    public Targy(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
        this.id = UUID.randomUUID();
    }

    public void felvesz(Targy targy) {
        felvesz(targy, 1);

    }

    public void felvesz(Targy targy, int darab) {
        for (int i = 0; i <= darab; i++) {
            targyak.add(targy);
        }

    }
}
