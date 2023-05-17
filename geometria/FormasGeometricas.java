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
}
