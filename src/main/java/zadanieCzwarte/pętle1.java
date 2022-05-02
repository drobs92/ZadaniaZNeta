package zadanieCzwarte;

import java.util.Scanner;

public class pętle1 {
    public static void main(String[] args) {
        System.out.println("podaj temperaturę");
        Scanner scanner = new Scanner(System.in);
        double temperatura = scanner.nextDouble();
        if (temperatura < 36.4) {
            System.out.println("Jesteś osłabiony");
        } else if (temperatura < 37) {

            System.out.println("w normie");
        } else if (temperatura < 38){
            System.out.println("Masz gorączkę");
        }
      else{
            System.out.println("do lekarza!");
        }
    }
}
