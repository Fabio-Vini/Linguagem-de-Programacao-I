/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCICIO:
 4 Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.
*/

import java.util.Scanner;



public class TP02Ex04 {

    public static void main(String[] args) {
        
        Scanner myObj = new Scanner (System.in);

        int[][] matriz = new int[2][3];


        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
    }
    
 }
}