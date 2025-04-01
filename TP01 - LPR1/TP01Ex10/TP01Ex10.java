/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCICIO:
  10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.
*/

import java.util.Scanner;

public class TP01Ex10 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner (System.in);
		
		double c, f;
		
		System.out.println("Informe o valor em graus celcius: ");
		c = myObj.nextDouble();
		
		f = (c * 1.8) + 32;
		
		System.out.println("Temperatura em Fahrenheit: " + f);

	}

}
