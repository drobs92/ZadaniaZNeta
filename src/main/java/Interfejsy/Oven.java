package Interfejsy;

import java.util.function.ObjDoubleConsumer;

public class Oven implements BakingOven, RoastOven {
    private int time;
    private int temperature;
    @Override
    public void bakeBread(){
        temperature = 200;
        time =120;
        turnOn();
    }
    @Override
    public void bakeCookies(){
        temperature=180;
        time=90;
        turnOn();
    }
    @Override
    public void roastChicken(){
        temperature =180;
        time = 240;
        turnOn();
    }
    private void turnOn(){
        System.out.println(String.format("Start. Podgrzej do %s stopni i piecz przez %s minut", temperature,time));
    }

    public static void main(String[] args) {
        Oven oven = new Oven();
        BakingOven bakingOven = oven;
        RoastOven roastOven = oven;

        bakingOven.bakeBread();
        bakingOven.bakeCookies();
        roastOven.roastChicken();
    }
}
