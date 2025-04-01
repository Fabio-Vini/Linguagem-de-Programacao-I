/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCICIO:
  11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
*/

import java.util.Scanner;

public class TP01Ex11 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner (System.in);
		
		double area, diametro;
		
		System.out.println("Informe o diametro: ");
		diametro = myObj.nextDouble();
		
		area = 3.14 * Math.pow((diametro/2), 2);
		
		System.out.println("Area do circulo: " + area);

	}

}
