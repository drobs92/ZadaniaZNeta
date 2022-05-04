package Rzutowanie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class wyjątki {
    public static void main(String[] args) {
        /*Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek.
        Do obliczenia pierwiastka możesz użyć istniejącej metody java.lang.Math.sqrt().
        Jeśli użytkownik poda liczbę ujemną rzuć wyjątek java.lang.IllegalArgumentException.
         Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.
         */
        Scanner scanner = new Scanner(System.in);
        String pytanie;
        do {
            System.out.println("podaj liczbę");
            double liczba = 0;

            while (true) {
                try {
                    liczba = scanner.nextDouble();
                    break;
                } catch (InputMismatchException a) {
                    System.out.println("Podaj poprawną liczbę!");
                    // ignoring wrong token
                    scanner.next();
                }
            }
            while (liczba < 0) {
                System.out.println("podaj poprawną liczbę dodatnią");
                liczba = scanner.nextDouble();
                if (liczba > 0) {
                    break;
                }
            }
            System.out.println(Math.sqrt(liczba));
            System.out.println("jeszcze raz? y-tak, n-nie");
            pytanie = scanner.next();

            //if(liczba<0){
            //throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczby rzeczywistej %.4f nie istnieje!", liczba));
            // }
        } while (pytanie.equals("y"));
    }
}
