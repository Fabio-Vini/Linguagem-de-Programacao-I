/* 
   DUPLA:
    - Kauã Felipe Da Silva Jenior
    - Fabio Vinicius Santos De Freitas
 
   EXERCICIO:
  15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
  
*/



import java.util.Scanner;

public class TP01Ex15 {

    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);

        double cotacaoDolar, dolares, conversao;

       
        System.out.println("Informe a cotação do dolar");
        cotacaoDolar = MyObj.nextDouble();
       
        System.out.println("Informe o valor que deseja converter em reais");
        dolares = MyObj.nextDouble();
        
        conversao = dolares * cotacaoDolar;

        System.out.println("USD $" + dolares + " Equivale a R$" + conversao + " na cotação informada");
    }
}