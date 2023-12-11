package jatek;

import java.util.ArrayList;
import java.util.Random;

public class Karakter {

    private int eletero, ugyesseg, szerencse;
    private ArrayList<Targy> felszereles;
    Random rand = new Random();

    public Karakter(ArrayList<Targy> felszereles) {

        this.eletero = rand.nextInt(14, 24) + 12;
        this.ugyesseg = rand.nextInt(1, 6) + 6;
        this.szerencse = rand.nextInt(1, 6) + 6;
        this.felszereles = new ArrayList<>();
    }

    public void felvesz(Targy targy) {
        felvesz(targy, 1);

    }

    public void felvesz(Targy targy, int darab) {
        for (int i = 0; i <= darab; i++) {
            felszereles.add(targy);
        }

    }

    public void Hasznal(String nev) {
        for (int i = 0; i < felszereles.size(); i++) {
            if (felszereles.get(i).getNev().equals(nev)) {
                felszereles.remove(i);
            }
        }
    }

    public void Hasznal(String nev, int darab) {
        int keszlet = 0;
        for (int i = 0; i < felszereles.size(); i++) {
            if (felszereles.get(i).getNev().equals(nev)) {
                felszereles.remove(i);
                keszlet++;
            }
        }
        if (darab > keszlet) {
            System.out.println("Nincs elég tárgy: " + nev);
        } else {
            for (int i = 0; i < felszereles.size() && darab > 0; i++) {
                if (felszereles.get(i).getNev().equals(nev)) {
                    felszereles.remove(i);
                    darab--;
                }
            }
        }
    }
    
    public void Hasznal(String nev, int darab, boolean eleg) {
        if(eleg){
            Hasznal(nev, darab);
        }else{
            System.out.println("");
        }
    }

}
