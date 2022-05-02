package zadaniePierwsze;

import java.util.Scanner;

public class Metody {
    public static void main(String[] args) {
        /*Na koniec mam dla Ciebie małe ćwiczenie.
        Napisz metodę, która sprawdzi czy temperatura przekazana jako argument jest dodatnia
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        double liczba = scanner.nextDouble();
boolean result = liczba > 0;
if (result){
    System.out.println("liczba jest dodatnia");
}
else{
    System.out.println("liczba jest ujemna");
}
    }
}
