package projeto;
	import java.util.Scanner;
	public class mediaPonderada {
			public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
			System.out.println("Digite o primeiro valor: ");
			double n1 = scanner.nextDouble();
			System.out.println("Digite o segundo valor: ");
			double n2 = scanner.nextDouble();
			System.out.println("Digite o terceiro valor: ");
			double n3 = scanner.nextDouble();
			System.out.println("Digite o quarto valor: ");
			double n4 = scanner.nextDouble();
			double mediaPonderada = (n1*2 + n2*2 + n3*3 + n4*4) / 10.0;
			System.out.println("A média ponderada é: " + mediaPonderada);
	scanner.close();
	}
}