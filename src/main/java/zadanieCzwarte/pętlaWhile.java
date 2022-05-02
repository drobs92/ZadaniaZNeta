package zadanieCzwarte;

import java.util.Scanner;

public class pętlaWhile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i = scanner.nextInt();
        //while (i<=10){
          //  System.out.println(i + "obrot");
         //   i++;
        //}
        while (i<26){
            System.out.println(i+ "runda");
            i++;
            if(i==11){
                break;
            }
        }
    }
}
