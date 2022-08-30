package lista1;

import java.util.Scanner;

/*Tendo como dados de entrada a altura de uma pessoa, construa um 
algoritmo que calcule seu peso ideal, usando a seguinte fórmula: 
(72.7*altura) - 58*/


public class exe12 {

	public static void main(String[] args) {
		
		Scanner altura = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double alt = altura.nextDouble();
		
		double pesoIdeal = ((72.7 * alt) - 58);
		
		System.out.println("Com base na sua altura, o seu peso 'ideal' seria: " + pesoIdeal );
		

	}

}
