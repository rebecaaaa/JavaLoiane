package lista1;
/*Fa�a um Programa que pergunte quanto voc� ganha por hora e o 
n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu 
sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o 
Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um 
programa que nos d�:
. sal�rio bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o sal�rio l�quido.
d. calcule os descontos e o sal�rio l�quido, conforme a tabela 
abaixo:*/

import java.util.Scanner;

public class exe15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o seu valor/hora e quantas horas voce trabalha por m�s: ");
		double valor = scan.nextDouble();
		double horas = scan.nextDouble();
		
		double salarioBruto = valor*horas;
		
		double inss = (salarioBruto/100) * 8;
		
		double iR = (salarioBruto/100) * 11;
		
		double sindicato = (salarioBruto/100) * 5;
		
		double descontos  = inss + iR + sindicato;
		
		double salarioLiquido = salarioBruto - descontos; 
		
		System.out.println("O total de descontos pagos foi de " + descontos + "R$, e esse � o seu sal�rio l�quido " + salarioLiquido + "R$" );
		

	}

}
