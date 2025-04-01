/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCÍCIO:
  7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.
*/

import java.util.Scanner;

public class TP01Ex07{
 public static void main(String[] args) {
     
    double v1, v2;
	
	Scanner myObj = new Scanner (System.in);
	
	System.out.println("Informe o valor 1: ");
	v1 = myObj.nextDouble();
	
	System.out.println("Informe o valor 2: ");
	v2 = myObj.nextDouble();

	
	
	System.out.println("A média geométrica é: " + Math.sqrt(v1 * v2));
 }
} 