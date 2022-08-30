package lista1;
/*Faça um Programa que pergunte quanto você ganha por hora e o 
número de horas trabalhadas no mês. Calcule e mostre o total do seu 
salário no referido mês, sabendo-se que são descontados 11% para o 
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um 
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela 
abaixo:*/

import java.util.Scanner;

public class exe15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o seu valor/hora e quantas horas voce trabalha por mês: ");
		double valor = scan.nextDouble();
		double horas = scan.nextDouble();
		
		double salarioBruto = valor*horas;
		
		double inss = (salarioBruto/100) * 8;
		
		double iR = (salarioBruto/100) * 11;
		
		double sindicato = (salarioBruto/100) * 5;
		
		double descontos  = inss + iR + sindicato;
		
		double salarioLiquido = salarioBruto - descontos; 
		
		System.out.println("O total de descontos pagos foi de " + descontos + "R$, e esse é o seu salário líquido " + salarioLiquido + "R$" );
		

	}

}
