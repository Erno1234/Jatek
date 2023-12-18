/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author paloci.erno
 */
public class Jobbra  extends Helyszin implements MasikIrany {
    @Override
    public String leiras() {
        return "Jobbra jöttél";
    }

    @Override
    public Helyszin egyikIrany() {
       return new Eszak();
    }

    @Override
    public String egyikBtn() {
        return "Észak";
    }

    @Override
    public Helyszin masikIrany() {
        return new Del();
    }

    @Override
    public String masikBtn() {
        return "Dél";
    }
}
