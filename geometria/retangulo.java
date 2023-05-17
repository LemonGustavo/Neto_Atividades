package geometria;

import java.util.Scanner;

public class retangulo extends FormasGeometricas {
    Scanner scam = new Scanner (System.in);
    protected double base;
    protected double altura;

    retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcArea() {
        System.out.println("Quanto mede a base do retângulo?");
        base = scam.nextDouble();
        System.out.println("Quanto mede a altura do retângulo?");
        altura = scam.nextDouble();

        area = base * altura;
        return area;
    } 

    public double calcPeri () {
        System.out.println("Quanto mede a base do retângulo?");
        base = scam.nextDouble();
        System.out.println ("Quanto mede a altura do retângulo?");
        altura = scam.nextDouble();

        perimetro = 2 * (base + altura);
        return perimetro;
    } 
}
