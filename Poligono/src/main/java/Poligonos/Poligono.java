package Poligonos;

public abstract class Poligono {

    protected int lados;
    protected double tamanhoDoLado;

    public Poligono(int lados, double tamanhoDoLado) {
        this.lados = lados;
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public int getLados() {
        return lados;
    }

    public double getTamanhoDoLado() {
        return tamanhoDoLado;
    }

    public abstract double calculaAreaPoligono();
}
