package lista1;
/*.Faça um Programa que peça 2 números inteiros e um número real. 
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.*/

import java.util.Scanner;

public class exe11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite dois números inteiros e um número real: ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		int a = ((x*2)* (y/2));
		int b = ((x*3)+ z);
		int c = (z*z*z);
		
		System.out.println(a + b + c);
		

	}

}
