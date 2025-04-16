/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCICIO:
  1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor.
*/

import java.util.Scanner;
public class TP02Ex01 {

	public static void main(String[] args) {
		 
		Scanner myObj = new Scanner (System.in);
		
		int v1, v2;
		
		
		 do {
			 System.out.println("Informe o primeiro valor: ");
			 v1 = myObj.nextInt();
			 
			 System.out.println("Informe o segundo valor: ");
			 v2 = myObj.nextInt();
		 }
		 while (v1 > v2);
		
         System.out.println("Programa encerrado v2 é maior que v1");
	}

}

