package Validador;

import Poligonos.Poligono;
import Poligonos.Quadrado;
import Poligonos.Triangulo;

import java.util.Scanner;


public class ValidaEntradasUsuario {

    private Scanner scanner;

    public ValidaEntradasUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public int obterInt(String entrada) {
        int valor = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print(entrada);
            if (scanner.hasNextInt()) {
                valor = scanner.nextInt();
                if (valor > 0) {
                    valido = true;
                } else {
                    System.out.println("O valor deve ser um número positivo.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next();
            }
        }
        return valor;
    }

    public double obterDouble(String entrada) {
        double valor = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print(entrada);
            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();
                if (valor > 0) {
                    valido = true;
                } else {
                    System.out.println("O valor deve ser um número positivo.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número decimal.");
                scanner.next();
            }
        }
        return valor;
    }

    public Poligono obterPoligono() {
        int lados = obterInt("Informe o número de lados do polígono: ");
        double tamanhoDoLado = obterDouble("Informe o tamanho do lado (em cm): ");

        if (lados == 3) {
            return new Triangulo(tamanhoDoLado);
        } else if (lados == 4) {
            return new Quadrado(tamanhoDoLado);
        } else {
            System.out.println("Número de lados inválido. Apenas triângulos (3) e quadrados (4) são permitidos.");
            return null;
        }
    }
}
