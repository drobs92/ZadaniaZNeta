package zadanieDrugie.Zoo;

import zadanieDrugie.Ptaki.Seagull;
import zadanieDrugie.Ssaki.Lew;

public class ZooMain {
    public static void main(String[] args) {
        Lew lew1= new Lew(120, 35);
        Lew lew2= new Lew(150,65);
        Seagull mewa1= new Seagull(2,20);
        Seagull mewa2= new Seagull(3,30);
        System.out.println(lew1.getPredkosc() +" " + lew1.getWaga());
    }
}
