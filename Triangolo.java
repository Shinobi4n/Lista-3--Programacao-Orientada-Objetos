public class Triangolo extends FormaGeometrica {

    private double base;
    private double altura;

    public Triangolo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double calcularArea() {
        return (getBase() * getAltura()) / 2;
    }

}
