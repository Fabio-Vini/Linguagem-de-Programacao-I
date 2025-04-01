/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCICIO:
  9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
*/

import java.util.Scanner;

public class TP01Ex09 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner (System.in);
		
		double v, i, x;
		
		System.out.println("Informe a corrente elétrica: ");
		i = myObj.nextDouble();
		
		System.out.println("Informe a resistencia: ");
		x = myObj.nextDouble();
		
		v = i * x;

		
		System.out.println("Tensao eletrica: " + v + "V");

	}
}