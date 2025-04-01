/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCÍCIO:
  4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
*/

import java.util.Scanner;

public class TP01Ex04{
 public static void main(String[] args) {
     
     double base;
	double altura;
	double result;
	
	Scanner myObj = new Scanner (System.in);
	
	System.out.println("Informe a base do triangulo: ");
	base = myObj.nextDouble();
	
	System.out.println("Informe a altura do triangulo: ");
	altura = myObj.nextDouble();
	
	result = (base * altura) / 2;
	
	System.out.println("A area do triangulo é: " + result + "m2");
	
	
 }
} 