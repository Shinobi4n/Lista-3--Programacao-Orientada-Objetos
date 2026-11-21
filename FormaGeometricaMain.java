public class FormaGeometricaMain {

    public static void main(String[] args) {

        FormaGeometrica[] formas = new FormaGeometrica[3];

        formas[0] = new Circulo(25);
        formas[1] = new Retangulo(16, 24);
        formas[2] = new Triangolo(16, 24);

        for (int i = 0; i < formas.length; i++) {
            System.out.println("Área: " + formas[i].calcularArea());
        }
    }

}
