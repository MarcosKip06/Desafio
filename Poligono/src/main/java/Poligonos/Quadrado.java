package Poligonos;

public class Quadrado extends Poligono {

    public Quadrado(double tamanhoDoLado) {
        super(4, tamanhoDoLado);
    }

    @Override
    public double calculaAreaPoligono() {
        return Math.pow(tamanhoDoLado, 2);
    }

    @Override
    public String toString() {
        return String.format("Quadrado de lado %.2f cm e área %.2f cm²", tamanhoDoLado, calculaAreaPoligono());
    }
}
