package Conversor;

public class Hexade {
    
    private String hex;
    public Hexade() {
        hex = "";
    }

    public String Conver_Hex (int decimal) {
        int quoci = decimal;
        if (decimal == 0) {
            hex = "0";
        }
        while (quoci != 0) {
            int resto = quoci % 16;
            if (resto == 10) {
                hex = "A"+hex;
            } else if (resto == 11) {
                hex = "B"+hex;
            } else if (resto == 12) {
                hex = "C"+hex;
            } else if (resto == 13) {
                hex = "D"+hex;
            } else if (resto == 14) {
                hex = "E"+hex;
            } else if (resto == 15) {
                hex = "F"+hex;
            } else {
            hex = resto + hex;
            }
            quoci = quoci /16;
        }
        return hex;
    }
}