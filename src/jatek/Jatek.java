
package jatek;


public class Jatek {


    public static void main(String[] args) {
       run();
    }

    private static void run() {
        Karakter karakter = new Karakter();
        karakter.felvesz(new Targy("Pajzs", "Növeli a karakter kitartását"));
        karakter.felvesz(new Targy("Kard", "Növeli a karakter sebzését"));
        karakter.felvesz(new Targy("Számszeríj", "Alkalmas távoli támadásokra."));
        karakter.felvesz(new Targy("Kötszer", "5 darab használata helyreállítja a karakter életerejét"),2);
        karakter.felvesz(new Targy("Nyílvessző", "Számszeríj alapvető lőszere"),20);
        karakter.felvesz(new Targy("Nyílvessző", "Számszeríj alapvető lőszere"),5);
  
        karakter.Hasznal("Pajzs");
        karakter.Hasznal("Kard");
        karakter.Hasznal("Számszeríj");
        karakter.Hasznal("Nyílvessző", 10);
        karakter.Hasznal("Kötszer", 5, false);
        karakter.Hasznal("Kötszer", 5, true);

    }
    
}
