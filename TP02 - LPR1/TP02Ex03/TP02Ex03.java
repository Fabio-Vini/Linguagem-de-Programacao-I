/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCICIO:
 3 Entrar via teclado com N valores quaisquer. O valor N (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos N valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente S ou N e encerrar o
programa em função dessa resposta.
*/

import java.util.Scanner;
public class TP02Ex03 {

	public static void main(String[] args) {
		 
		Scanner myObj = new Scanner (System.in);
		
		int maior = 0, soma = 0, digito = 0 ;
		double media;
		int numero;
		int menor = Integer.MAX_VALUE;
		
		
		System.out.println("Informe a quantidades de numeros ");
			numero = myObj.nextInt();
		
		for(int i = 0; i < numero; i++)
			
		
		{
			System.out.println("Informe o " + i + "° numero: ");
			digito = myObj.nextInt();
			
			if(digito > maior)
		{
			maior = digito;
			
		}  if (digito < menor){
			menor = digito;
		}
		
		soma = soma + digito;
		}
		
		media = soma / 10.0;
		
		
		
		System.out.println("Maior numero digitado: " + maior);
		System.out.println("Menor numero digitado: " + menor);
		System.out.println("Soma dos valores: " + soma);
		System.out.println("Media dos valores: " + media);
		
		
		
	}

}

