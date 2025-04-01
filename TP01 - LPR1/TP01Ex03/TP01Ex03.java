/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCÍCIO:
  3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
*/

import java.util.Scanner;

public class TP01Ex03 {
 public static void main(String[] args) {
     
    double diagonal;
	double result;
	
	Scanner myObj = new Scanner (System.in);
	
	System.out.println("Informe o lado: ");
	diagonal= myObj.nextDouble();
	
	
	result = (diagonal * diagonal) / 2;
	
	System.out.println("A area do Quadrado é: " + result + "M");
	
	
 }
} 