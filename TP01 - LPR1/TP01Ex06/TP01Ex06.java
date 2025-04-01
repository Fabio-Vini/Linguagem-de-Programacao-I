/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCÍCIO:
  6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.
*/

import java.util.Scanner;

public class TP01Ex06{
 public static void main(String[] args) {
     
    double v1, v2, v3, v4, resultado;
	
	Scanner myObj = new Scanner (System.in);
	
	System.out.println("Informe o valor 1: ");
	v1 = myObj.nextDouble();
	
	System.out.println("Informe o valor 2: ");
	v2 = myObj.nextDouble();
	
	System.out.println("Informe o valor 3: ");
	v3 = myObj.nextDouble();
	
	System.out.println("Informe o valor 4: ");
	v4 = myObj.nextDouble();
	
	resultado = (v1 + v2 + v3 + v4) / 4;
	
	
	System.out.println("A média é: " + resultado);
 }
} 