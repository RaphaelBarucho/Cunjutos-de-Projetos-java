package trim1;

import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont = 3;
		
		System.out.print("Digite o numero, de vezes que deseja que a sequencia se repita: ");
		int stop = sc.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		
		System.out.print(num1 + " " +num2 + " ");
		
		while (cont <= stop) {
			int res = num1 + num2;
			System.out.print(res + " ");
			
			num1 = num2;
			num2 = res;
			cont++;
		}
		sc.close();
	}

}
