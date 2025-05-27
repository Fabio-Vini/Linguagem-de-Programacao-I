/*
 DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
 EXERCICIO:
 8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
 digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
 valor da matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
 correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
 colunas.
*/

import java.util.Scanner;

public class TP02Exe08 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int[][] matriz = new int[3][4];
        int[][] matriz_result = new int[3][4];
        int constante_mult;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = myObj.nextInt();
            }
        }

        System.out.print("Informe uma constante multiplicativa: ");
        constante_mult = myObj.nextInt();


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz_result[i][j] = matriz[i][j] * constante_mult;
            }
        }

        System.out.println("\nMatriz original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

      
        System.out.println("\nMatriz após multiplicação:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz_result[i][j] + " ");
            }
            System.out.println();
        }

        myObj.close();
    }
}
