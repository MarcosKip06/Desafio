package Poligonos;

public class Triangulo extends Poligono{


    public Triangulo(double tamanhoDoLado) {
        super(3, tamanhoDoLado);
    }

    @Override
    public double calculaAreaPoligono() {
        return (Math.sqrt(3) / 4) * Math.pow(tamanhoDoLado, 2);
    }

    @Override
    public String toString() {
        return String.format("Triângulo de lado %.2f cm e área %.2f cm²", tamanhoDoLado, calculaAreaPoligono());
    }
}
