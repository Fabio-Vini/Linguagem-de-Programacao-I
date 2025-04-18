/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCICIO:
7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.
*/

import java.util.Scanner;



public class TP02Ex07 {

    public static void main(String[] args) {
        
        Scanner myObj = new Scanner (System.in);

        int[][] matriz = new int[3][4];

        int costnte_mult;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = myObj.nextInt();
            }
    }

    System.out.println("Informe uma constante multiplicativa:");
    costnte_mult = myObj.nextInt();

    for( int i = 0; i < 3; i++){    
        for(int j = 0; j < 4; j++){
         matriz[i][j] = (matriz[i][j] * costnte_mult);
        }
    }

    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 4; j++){

            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
    

 }
}