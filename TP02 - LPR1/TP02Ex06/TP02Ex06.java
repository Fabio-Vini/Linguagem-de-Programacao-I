/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCICIO:
 6 Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
*/

import java.util.Scanner;



public class TP02Ex06 {

    public static void main(String[] args) {
        
        Scanner myObj = new Scanner (System.in);

        String[][] matriz = new String[2][3];


        matriz[0][0] = "João";
        matriz[0][1] = "Maria";
        matriz[0][2] = "Valentina";
        matriz[1][0] = "Enzo";
        matriz[1][1] = "Livia";
        matriz[1][2] = "Matheus";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
    }
    
 }
}