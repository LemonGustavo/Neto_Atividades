package geometria;

import java.util.Scanner;
import static java.lang.Math.PI;


public class circulo extends FormasGeometricas {
    Scanner scam = new Scanner (System.in);
    private double raio;

    circulo (double raio) {
        this.raio = raio;
    }

    public double calcArea() {
        System.out.println("Quanto vale o raio do círculo?");
        raio = scam.nextDouble();
        area = PI * (raio * raio);
        return area;
    }

    public double calcPeri() {
        System.out.println("Quanto vale o raio do círculo?");
        raio = scam.nextDouble();
        perimetro = 2 * PI * raio;
        scam.close();
        return perimetro;
    } 
}
