package zadanieTrzecie;

public class Stringi {
    public static void main(String[] args) {
/*Napisz program, który wyświetli trzy różne zdania opisujące aktualną pogodę.
W czwartej linii wypisz sumaryczną długość trzech poprzednich zdań.
 */
        String temperature= "dziś jest Ciepło";
        System.out.print(temperature);
        String sunny =" ,oraz słonecznie";
        System.out.print(sunny);
        String opad = " - na dodatek nie będzie padać!";
        System.out.print(opad);
        int lenght = (temperature.length()+sunny.length()+opad.length());
        System.out.println(lenght);
    }
}
