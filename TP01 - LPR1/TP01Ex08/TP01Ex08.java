/* 
   DUPLA:
   - Kauã Felipe Da Silva Jenior
   - Fabio Vinicius Santos De Freitas
 
  EXERCÍCIO:
  8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.
*/


import java.util.Scanner;

public class TP01Ex08{
 public static void main(String[] args) {
     
    double milha, converte;
	
	Scanner myObj = new Scanner (System.in);
	
	System.out.println("Informe as milhas em metros: ");
	milha = myObj.nextDouble();
	
	converte = milha * 1852;

	
	
	System.out.println("O valor em quilometros é: " + converte);
 }
} 

/*
milha = 1852m

quilometro = 1000m
*/