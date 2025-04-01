/* 
   DUPLA:
    - Kauã Felipe Da Silva Jenior
    - Fabio Vinicius Santos De Freitas
 
   EXERCICIO:
  13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.
  
*/


import java.util.Scanner;

public class TP01Ex13 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner (System.in);
		
		double Vf, Vi, a , t, Vfkm;
		
		System.out.println("Informe a velocidade incial (m/s): ");
		Vi = myObj.nextDouble();
		
		System.out.println("Informe a aceleração (m/s2): ");
		a = myObj.nextDouble();
		
		System.out.println("Informe o tempo de percurso (s): ");
		t = myObj.nextDouble();
		
		Vf = Vi + (a * t);
		
		//converter para km
		Vfkm = Vf * 3.6;
		
		System.out.println("Velocidade final: " + Vfkm + "km");
	}

}
