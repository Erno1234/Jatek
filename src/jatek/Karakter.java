
package jatek;

import java.util.ArrayList;
import java.util.Random;


public class Karakter {
    private int eletero, ugyesseg, szerencse;
    private ArrayList<String> felszereles; 
    Random rand = new Random(); 
    public Karakter(ArrayList<String> felszereles){        
       
       this.eletero = rand.nextInt(14,24)+12;
       this.ugyesseg = rand.nextInt(1,6)+6;
       this.szerencse = rand.nextInt(1,6)+6;
       this.felszereles = felszereles;
    }

    
}
