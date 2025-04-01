/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCÍCIO:
  5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.
*/

import java.util.Scanner;

public class TP01Ex05{
 public static void main(String[] args) {
     
     double raio;
	double pi = 3.14;
	double diametro;
	double volume;
	
	Scanner myObj = new Scanner (System.in);
	
	System.out.println("Informe o diametro da esfera: ");
	diametro= myObj.nextDouble();
	
	raio = diametro/2;
	
	
	volume = 4 * pi * (raio * raio * raio) / 3;
	
	System.out.println("O volume da esfera é: " + volume + "m3");
	
	
 }
} 