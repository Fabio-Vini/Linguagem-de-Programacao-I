/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCÍCIO:
  2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado.
*/

import java.util.Scanner;

public class TP01Ex02 {
 public static void main(String[] args) {
     
    double lado;
	double result;
	
	Scanner myObj = new Scanner (System.in);
	
	System.out.println("Informe o lado: ");
	lado = myObj.nextDouble();
	
	
	result = (lado * lado );
	
	System.out.println("A area do Quadrado é: " + result + "M");
	
	
 }
} 