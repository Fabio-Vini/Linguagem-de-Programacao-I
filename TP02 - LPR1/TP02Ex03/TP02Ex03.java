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
		double media, media_positivo,media_negativo;
		int numero, positivo = 0, negativo = 0;

		int menor = Integer.MAX_VALUE;
		
		
      do {
		System.out.println("Informe a quantidades de numeros ");
			numero = myObj.nextInt();

			if (numero <= 0 || numero >= 20) {
                System.out.println(" Valor inválido! Digite um número entre 1 e 19.\n");
            }
		
	  } while (numero <= 0 || numero >= 20);



	  
	
		
		for(int i = 1; i <= numero; i++)
			
		
		{
			System.out.println("Informe o " + i + "° numero: ");
			digito = myObj.nextInt();
			
			if(digito > maior)
		{
			maior = digito;
			
		}  if (digito < menor){
			menor = digito;
		}

		if (digito > 0) {
			positivo++;
		}else{
			negativo++ ;
		}




		
		soma = soma + digito;
		}
		
		media = (double) soma /  numero;

		media_positivo =  (double) positivo / numero;
		media_negativo = (double) negativo / numero;


		
		
		
		System.out.println("Maior numero digitado: " + maior);
		System.out.println("Menor numero digitado: " + menor);
		System.out.println("Soma dos valores: " + soma);
		System.out.println("Media dos valores: " + media);

		System.out.println("Positivo: " + media_positivo * 100 + "%");
		System.out.println("negativo: " + media_negativo * 100 + "%" );
		
		
		
	}

}

