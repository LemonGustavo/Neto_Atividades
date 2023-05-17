package geometria;
public class Main {
    public static void main(String[] args) {
        retangulo r = new retangulo(0, 0);
        System.out.println("A área do retâgulo é igual a: "+r.calcArea());
        System.out.println("O perímetro do retângulo é igual a: "+r.calcPeri());

        circulo c = new circulo(0);
        System.out.println("A área do círculo é igual a: "+c.calcArea());
        System.out.println("O perímetro do círculo é igual a: "+c.calcPeri());
    }
}
