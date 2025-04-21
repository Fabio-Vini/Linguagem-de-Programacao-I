/*
 DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
 EXERCICIO:
 10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas).
*/

import java.util.Scanner;

public class TP02Exe10 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int linhas, colunas;

        do {
            System.out.print("A matriz precisa ser quadrática!\nDigite o número de linhas (max 10): ");
            linhas = myObj.nextInt();

            if (linhas > 10 || linhas < 1) {
                System.out.println("Valor inválido! Digite um número entre 1 e 10.");
            }
        } while (linhas > 10 || linhas < 1);

        do {
            System.out.print("Digite o número de colunas (max 10): ");
            colunas = myObj.nextInt();

            if (colunas > 10 || colunas < 1) {
                System.out.println("Valor inválido! Digite um número entre 1 e 10.");
            } else if (colunas != linhas) {
                System.out.println("O número de linhas e colunas precisa ser igual!");
            }
        } while (colunas > 10 || colunas < 1 || colunas != linhas);

        int ordem = linhas;
        double[][] matriz = new double[ordem][ordem];
        double[][] identidade = new double[ordem][ordem];

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Digite o valor da posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = myObj.nextDouble();

                identidade[i][j] = (i == j) ? 1 : 0;
            }
        }

        System.out.println("\nMatriz original:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("%.2f ", matriz[i][j]);
            }
            System.out.println();
        }

        // Método de Gauss
        for (int i = 0; i < ordem; i++) {
            double pivo = matriz[i][i];

            if (pivo == 0) {
                System.out.println("\nA matriz não possui inversa (divisão por zero).");
                return;
            }

            for (int j = 0; j < ordem; j++) {
                matriz[i][j] /= pivo;
                identidade[i][j] /= pivo;
            }

            for (int k = 0; k < ordem; k++) {
                if (k != i) {
                    double fator = matriz[k][i];
                    for (int j = 0; j < ordem; j++) {
                        matriz[k][j] -= fator * matriz[i][j];
                        identidade[k][j] -= fator * identidade[i][j];
                    }
                }
            }
        }

        System.out.println("\nMatriz Inversa:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("%.2f ", identidade[i][j]);
            }
            System.out.println();
        }

    }
}
