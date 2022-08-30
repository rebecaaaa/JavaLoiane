package lista1;
/*.Faça um Programa que peça a temperatura em graus Celsius, 
transforme e mostre em graus Farenheit.*/

import java.util.Scanner;

public class exe10 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em ºC: ");
		double c = scan.nextDouble();
		
		double f = ((c*1.8) + 32) ;
		
		System.out.println("Essa temperatura corresponde a " + f + "ºFarenheit");
	}

}
