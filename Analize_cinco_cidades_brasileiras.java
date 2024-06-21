import java.util.Scanner;

public class Analize_cinco_cidades_brasileiras {
	public static void main(String[] args) {
        String[] cidades = {"Maringá", "Londrina", "Cascavel", "Ponta Grossa", "Foz do Iguaçu"};
        int[] veiculosPasseio = new int[5];
        int[] acidentesComVitimas = new int[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe a quantidade de veículos de passeio em " + cidades[i] + ":");
            veiculosPasseio[i] = scanner.nextInt();
            System.out.println("Informe o número de acidentes com vítimas no ano anterior em " + cidades[i] + ":");
            acidentesComVitimas[i] = scanner.nextInt();
        }

        int maiorAcidentes = acidentesComVitimas[0];
        int menorAcidentes = acidentesComVitimas[0];
        String cidadeMaiorAcidentes = cidades[0];
        String cidadeMenorAcidentes = cidades[0];

        for (int i = 1; i < 5; i++) {
            if (acidentesComVitimas[i] > maiorAcidentes) {
                maiorAcidentes = acidentesComVitimas[i];
                cidadeMaiorAcidentes = cidades[i];
            }
            if (acidentesComVitimas[i] < menorAcidentes) {
                menorAcidentes = acidentesComVitimas[i];
                cidadeMenorAcidentes = cidades[i];
            }
        }

        System.out.println("Cidade com maior número de acidentes: " + cidadeMaiorAcidentes);
        System.out.println("Cidade com menor número de acidentes: " + cidadeMenorAcidentes);

        System.out.println("\nMédias anuais de acidentes por quantidade de veículos:");
        for (int i = 0; i < 5; i++) {
            double mediaAnual = (double) acidentesComVitimas[i] / veiculosPasseio[i];
            System.out.println(cidades[i] + ": " + mediaAnual);
        }

        int totalAcidentes = 0;
        int totalVeiculos = 0;
        for (int i = 0; i < 5; i++) {
            totalAcidentes += acidentesComVitimas[i];
            totalVeiculos += veiculosPasseio[i];
        }
        double mediaTotal = (double) totalAcidentes / totalVeiculos;
        System.out.println("\nMédia total de acidentes pela quantidade de veículos: " + mediaTotal);

        scanner.close();
    }
}
