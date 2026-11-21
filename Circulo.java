public class Circulo extends FormaGeometrica {

    private double raio;
    double PI = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * (raio * raio);
    }

}
