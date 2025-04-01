/* 
   DUPLA:
    - Kauã Felipe Da Silva Jenior
    - Fabio Vinicius Santos De Freitas
 
   EXERCICIO:
  17. Entrar via teclado com dois valores quaisquer X e Y. Calcular e exibir o
cálculo XY (X elevado a Y). Pesquisar as funções Exp e Ln.
  
*/


import java.util.Scanner;

public class TP01Ex17 {
    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);
       double x, y, resultado;
       
       System.out.println("Informe a base: ");
       x = MyObj.nextDouble();

       System.out.println("Informe o expoente: ");
       y = MyObj.nextDouble();

        resultado = Math.pow(x, y);

        System.out.println(x + " elevado a " + y + " é igual á: " + resultado);
    }
}
