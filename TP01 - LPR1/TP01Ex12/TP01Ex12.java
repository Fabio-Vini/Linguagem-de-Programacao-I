/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCICIO:
  12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.
*/

import java.util.Scanner;

public class TP01Ex12 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		double volume, h, r;
		
		System.out.println("Iforme o valor da altura: ");
		h = myObj.nextDouble();
		
		System.out.println("Informe o raio da base: ");
		r = myObj.nextDouble();
		
		volume = 1.0/3 * 3.14 * Math.pow(r, 2) * h;
		
		System.out.println("Volume do cone: " + volume);

	}

}
