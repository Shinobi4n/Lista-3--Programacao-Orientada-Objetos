public class Retangolo extends FormaGeometrica {

    private double largura;
    private double altura;

    public Retangolo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

}
