
package jatek;


public class Balra extends Helyszin implements MasikIrany{
       @Override
    public String leiras() {
        return "Balra jöttél! Nyugat vagy Kelet";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Nyugat();
    }

    @Override
    public Helyszin masikIrany() {
        return new Kelet();
    }

    @Override
    public String egyikBtn() {
        return "Nyugat";
    }

    @Override
    public String masikBtn() {
        return "Kelet";
    }
}
