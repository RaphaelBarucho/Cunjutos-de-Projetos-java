package condicional;

import java.util.Scanner;

public class ProvaEri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0.6% mes 
		//renda fixa 1%
		
		Scanner sc = new Scanner(System.in);
		
		double sal_carlos, sal_joao, meses = 0.0;

		System.out.println("qual o salario do carlos?:");
		sal_carlos = sc.nextDouble();
		
		sal_joao = sal_carlos / 3;
		
		while (sal_joao < sal_carlos) {
			sal_carlos = (sal_carlos + (sal_carlos * 0.6 / 100.0));
			sal_joao = sal_joao + (sal_joao * 1.0 / 100.0);
			meses = meses + 1;
		} sc.close();
		// System.out.printf("o salario de carlos é: %d. e o salário de joão é: %d e o total de meses é: %d", sal_carlos, sal_joao, meses);
		System.out.println(meses);
	} 
	
}
