package zadanieCzwarte;

public class petlaFor {
    public static void main(String[] args) {
        int[] primeNumbers = new int[] {2, 3, 5, 7,};
        for (int index = 0; index < primeNumbers.length; index++) {
            System.out.println(primeNumbers[index]);
        }
        for (int primeNumer : primeNumbers){
            System.out.print((primeNumer));
        }

    }
}
