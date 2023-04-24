package ativi;

public class palindromo extends base {

    public boolean ehPalin(int num) {
        int digits = 0;
        int n = num;

        while (n > 0) {
            digits++;
            n /= 10;
        }

        int div = (int) Math.pow(10, digits - 1);

        while (num > 0) {
            int primeiro = num / div;
            int ultimo = num % 10;

            if (primeiro != ultimo) {
                return false;
            }

            num = (num % div) / 10;
            div /= 100;
        }

        return true;
    }
}
