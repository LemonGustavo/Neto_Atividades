package Conversor;

public class Octal {
    
    private String oct;
    public Octal() {
        oct = "";
    }

    public String Conver_Octa (int decimal) {
        int quoci = decimal;
        if (decimal == 0) {
            oct = "0";
        }
        while (quoci != 0) {
            int resto = quoci % 8;
            oct = resto + oct;
            quoci = quoci /8;
        }
        return oct;
    }
}