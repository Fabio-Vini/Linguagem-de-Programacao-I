/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCICIO:
  2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.
*/

import java.util.Scanner;
public class TP02Ex02 {

	public static void main(String[] args) {
		 
		Scanner myObj = new Scanner (System.in);
		
		int maior = 0, soma = 0;
		double media;
		int numero;
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Informe o " + i + "° numero: ");
			numero = myObj.nextInt();
			
			if(numero > maior)
		{
			maior = numero;
			
		}
		
		soma = soma + numero;
		}
		
		media = soma / 10.0;
		
		
		
		System.out.println("Maior numero digitado: " + maior);
		System.out.println("Soma dos valores: " + soma);
		System.out.println("Media dos valores: " + media);
		
		
		
	}

}

