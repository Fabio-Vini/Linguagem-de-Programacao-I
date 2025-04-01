/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCICIO:
   16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos. * 
*/

   
import java.util.Scanner;

public class TP01Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um ângulo em graus: ");
        double anguloGraus = scanner.nextDouble();
        scanner.close();
        
        double anguloRadianos = Math.toRadians(anguloGraus);
        
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        double secante =  1 / Math.cos(anguloRadianos);
        
        System.out.printf("Seno: %.4f\n", seno);
        System.out.printf("Cosseno: %.4f\n", cosseno);
        System.out.printf("Tangente: %.4f\n", tangente);
        System.out.printf("Secante: %s\n", + secante);
    }
}
