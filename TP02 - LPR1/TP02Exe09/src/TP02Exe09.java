/*
 DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
 EXERCICIO:
 9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.
*/

import java.util.Scanner;
public class TP02Exe09 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		int linhas, colunas;
        
        do{
        	System.out.print("Digite o numero de linhas (max10): ");
            linhas = myObj.nextInt();
            if(linhas > 10 || linhas < 1)
            {
            	 System.out.println("Valor inválido! Digite um número entre 1 e 10.");
            }
        }
        while(linhas > 10 || linhas < 1);    
        
        
        do{
        	System.out.print("Digite o numero de colunas (max10): ");
            colunas = myObj.nextInt();
            if(colunas > 10 || colunas < 1)
            {
            	 System.out.println("Valor inválido! Digite um número entre 1 e 10.");
            }
        }
        while(colunas > 10 || colunas < 1);
        
        
        
		int[][] matriz = new int[linhas][colunas];
		
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor da posição [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = myObj.nextInt();
            }
        }
        
        System.out.println("\nMatriz original:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        
        System.out.println("\nMatriz transposta:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }

	}

}
