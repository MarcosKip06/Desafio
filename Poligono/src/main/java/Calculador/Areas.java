package Calculador;

import Poligonos.Poligono;
import Poligonos.Quadrado;
import Poligonos.Triangulo;
import Validador.ValidaEntradasUsuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Areas {

    private static ValidaEntradasUsuario validador = new ValidaEntradasUsuario();
    private static List<Poligono> poligonos = new ArrayList<>();

    public static void main(String[] args) {
        boolean continuarEntrada = true;

        while (continuarEntrada) {
            Poligono poligono = validador.obterPoligono();
            if (poligono != null) {
                poligonos.add(poligono);
            }

            System.out.print("Deseja inserir outro polígono? (s/n): ");
            String resposta = new Scanner(System.in).nextLine();
            continuarEntrada = resposta.equalsIgnoreCase("s");
        }

        double areaTotal = 0;
        for (Poligono poligono : poligonos) {
            System.out.println(poligono);
            areaTotal += poligono.calculaAreaPoligono();
        }

        System.out.printf("Área total %.2f cm²\n", areaTotal);
    }
}
