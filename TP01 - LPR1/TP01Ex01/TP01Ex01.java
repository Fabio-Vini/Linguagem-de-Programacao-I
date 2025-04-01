/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCÍCIO:
  1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.
*/

import java.util.Scanner;

public class TP01Ex01 {
 public static void main(String[] args) {
     
    double base;
	double altura;
	double result;
	
	Scanner myObj = new Scanner (System.in);
	
	System.out.println("Informe a base: ");
	base = myObj.nextDouble();
	
	System.out.println("Informe a altura: ");
	altura = myObj.nextDouble();
	
	result = (base * altura) / 2;
	
	System.out.println("A area do retangulo é: " + result + "M");
	
	
 }
} 