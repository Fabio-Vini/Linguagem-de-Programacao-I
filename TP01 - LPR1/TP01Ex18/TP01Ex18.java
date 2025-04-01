/*
  DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
  
  EXERCICIO:
 18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.
  
*/


import java.util.Scanner;
public class TP01Ex18 {
    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);

        double v1,v2,v3,v4,v5,troco,pagamento,total;

        System.out.println("valor produto 1: ");
       v1 = MyObj.nextDouble();

       System.out.println("valor produto 2: ");
       v2 = MyObj.nextDouble();

       System.out.println("valor produto 3: ");
       v3 = MyObj.nextDouble();

       System.out.println("valor produto 4: ");
       v4 = MyObj.nextDouble();

       System.out.println("valor produto 5: ");
       v5 = MyObj.nextDouble();

       total = v1 + v2 + v3 + v4 + v5;

       System.out.println("----------------------------------------------");
       System.out.println("TOTAL COMPRA: R$"+ total);
       System.out.println("----------------------------------------------");

       System.out.println("Valor recebido do pagamento: ");
       pagamento = MyObj.nextDouble();

       troco = pagamento - total;

       System.out.println("----------------------------------------------");
       System.out.println("PAGAMENTO DO CLIENTE: R$" + pagamento);
       System.out.println("TROCO: R$" + troco);
       System.out.println("----------------------------------------------");
    }
    
}
