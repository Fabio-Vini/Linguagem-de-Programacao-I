/*
 DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
 EXERCICIO:
 11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
 sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
 calcular e exibir determinante da matriz.
*/

import java.util.Scanner;

public class TP02Exe11 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		int ordem;
		
		do {
			System.out.print("Digite a ordem da matriz quadrada (1 a 10): ");
			ordem = myObj.nextInt();
			if (ordem < 1 || ordem > 10) {
				System.out.println("Valor inválido! Digite um número entre 1 e 10.");
			}
		} while (ordem < 1 || ordem > 10);

		double[][] matriz = new double[ordem][ordem];

		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				System.out.print("Digite o valor da posição [" + (i+1) + "][" + (j+1) + "]: ");
				matriz[i][j] = myObj.nextDouble();
			}
		}

		System.out.println("\nMatriz original:");
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		double determinante = calcularDeterminante(matriz, ordem);
		System.out.println("\nDeterminante da matriz: " + determinante);
	}

	public static double calcularDeterminante(double[][] matriz, int n) {
		double det = 0;

		if (n == 1) {
			return matriz[0][0];
		}

		if (n == 2) {
			return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
		}

		double[][] submatriz = new double[n - 1][n - 1];

		for (int x = 0; x < n; x++) {
			int subi = 0;
			for (int i = 1; i < n; i++) {
				int subj = 0;
				for (int j = 0; j < n; j++) {
					if (j == x)
						continue;
					submatriz[subi][subj] = matriz[i][j];
					subj++;
				}
				subi++;
			}
			double sinal = (x % 2 == 0) ? 1 : -1;
			det += sinal * matriz[0][x] * calcularDeterminante(submatriz, n - 1);
		}
		return det;
	}
}
