/* 
   DUPLA:
    - Kauã Felipe Da Silva Jenior
    - Fabio Vinicius Santos De Freitas
 
   EXERCICIO:
  14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
r inscrita em um cubo perfeito de aresta a. Os valores de r  e a serão
digitados.
  
*/




import java.util.Scanner;

public class TP01Ex14 {

    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);

        double r, a, volume_livre, volume_cubo, volume_esfera;

       
        System.out.println("Informe o valor do raio da esfera");
        r = MyObj.nextDouble();
       
        System.out.println("Informe o valor da aresta do cubo");
        a = MyObj.nextDouble();
        
        volume_cubo = Math.pow(a, 3);
        volume_esfera = (4.0/3.0) * Math.PI * Math.pow(r, 3);
        volume_livre = volume_cubo - volume_esfera;

        System.out.println("O volume livre do ambiente é: " + volume_livre + " unidades cúbicas.");
    }
}