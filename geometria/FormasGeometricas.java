package geometria;

public abstract class FormasGeometricas {
    protected double area;
    protected double perimetro;

    public abstract double calcArea();
    public abstract double calcPeri();
    
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPeri() {
        return perimetro;
    }

    public void setPeri(double perimetro) {
        this.perimetro = perimetro;
    }

    public static void main(String[] args) {
        retangulo r = new retangulo(0, 0);
        System.out.println("A área do retâgulo é igual a: "+r.calcArea());
        System.out.println("O perímetro do retângulo é igual a: "+r.calcPeri());

        circulo c = new circulo(0);
        System.out.println("A área do círculo é igual a: "+c.calcArea());
        System.out.println("O perímetro do círculo é igual a: "+c.calcPeri());
    }
}
