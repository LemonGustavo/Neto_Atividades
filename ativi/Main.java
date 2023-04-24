package ativi;

public class Main {
    public static void main(String[] args) {
        palindromo palis = new palindromo();

        for (int i = 100; i < 1000; i++) {
            if (palis.ehPalin(i)) {
                System.out.println(i + " é palíndromo.");
            }
        }
    }
}
