package projeto;
import java.util.Scanner;
	public class desconto_inss {
		public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
// // pedindo ao usuario o salario bruto
		System.out.println("Digite o salário bruto do funcionário:");
		double salarioBruto = scanner.nextDouble();
// Calculando o desconto do INSS
		double descontoINSS  = salarioBruto * 0.11;
// Calculanda zalario Liquido após o desconto do INSS double salarioLiquido salarioBruto desconto INSS;
		double salarioLiquido  = salarioBruto - descontoINSS;
// Exibindo palazza com desconto do INSS
		System.out.println("O salário com desconto do INSS e:" + salarioLiquido);
	scanner.close();
	}
}