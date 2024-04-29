package trim1;
import java.util.Scanner;
public class carros_parcelas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o valor do carro: ");
        double precoCarro = sc.nextDouble();

        
        double precoAVista = precoCarro * 0.8;

        
        System.out.println("\nTabela de Parcelamento:");
        System.out.println("Preço Final\tQuantidade de Parcelas\tValor da Parcela");

       
        int[] quantidadesParcelas = {6, 12, 18, 24, 30, 36, 42, 48, 54, 60};
        for (int quantidade : quantidadesParcelas) {
            
            double percentualAcrescimo = 0.0;
            switch (quantidade) {
                case 6:
                    percentualAcrescimo = 0.03;
                    break;
                case 12:
                    percentualAcrescimo = 0.06;
                    break;
                case 18:
                    percentualAcrescimo = 0.09;
                    break;
                case 24:
                    percentualAcrescimo = 0.12;
                    break;
                case 30:
                    percentualAcrescimo = 0.15;
                    break;
                case 36:
                    percentualAcrescimo = 0.18;
                    break;
                case 42:
                    percentualAcrescimo = 0.21;
                    break;
                case 48:
                    percentualAcrescimo = 0.24;
                    break;
                case 54:
                    percentualAcrescimo = 0.27;
                    break;
                case 60:
                    percentualAcrescimo = 0.30;
                    break;
            }
            double precoFinal = precoCarro * (1 + percentualAcrescimo);
            double valorParcela = precoFinal / quantidade;
           
            System.out.printf("%.2f\t\t%d\t\t\t\t%.2f\n", precoFinal, quantidade, valorParcela);
        }
        System.out.printf("\nPreço à vista com 20%% de desconto: %.2f\n", precoAVista);

        sc.close();
	}

}
