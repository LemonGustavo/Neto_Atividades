package Conversor;

public class Binario {
    
    private String bin;
    public Binario() {
        bin = "";
    }

    public String Conver_Bin (int decimal) {
        int quoci = decimal;
        if (decimal == 0) {
            bin = "0";
        }
        while (quoci != 0) {
            int resto = quoci % 2;
            bin = resto + bin;
            quoci = quoci /2;
        }
        return bin;
    }
}
