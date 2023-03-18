package Conversor;

public class Tabela {
public static void main (String [] args) {
    System.out.println ("Decimal | Binario | Hexadecimal | Octal");
    for (int i = 0; i < 256; i++){
        int decimal = i;

        Binario bin1 = new Binario ();
        String bina = bin1.Conver_Bin (decimal);

        Hexade hex1 = new Hexade ();
        String hexa = hex1.Conver_Hex (decimal);

        Octal oct1 = new Octal ();
        String octa = oct1.Conver_Octa (decimal);

        System.out.println (decimal+" | "+bina+ " | "+hexa+" | "+octa);
    }
}
}