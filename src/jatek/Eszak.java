
package jatek;


public class Eszak extends Helyszin implements MasikIrany {

    public Eszak() {
    }

     @Override
    public String leiras() {
        return "Északra jöttél";
    }

    @Override
    public Helyszin egyikIrany() {
       return new E2();
    }

    @Override
    public String egyikBtn() {
        return "Észak 2";
    }

    @Override
    public Helyszin masikIrany() {
        return new E1();
    }

    @Override
    public String masikBtn() {
        return "Észak 1";
    }
    
}
