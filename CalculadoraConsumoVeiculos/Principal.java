package CalculadoraConsumoVeiculos;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados do veículo Popular:");
        System.out.print("Marca: ");
        String marcaPopular = sc.nextLine();
        System.out.print("Modelo: ");
        String modeloPopular = sc.nextLine();
        System.out.print("Combustível: ");
        String combustivelPopular = sc.nextLine();
        System.out.print("Capacidade do tanque (litros): ");
        double tanquePopular = sc.nextDouble();
        System.out.print("Eficiência do veículo (km/litro): ");
        double eficienciaPopular = sc.nextDouble();
        sc.nextLine();  
        Veiculo popular = new Veiculo(marcaPopular, modeloPopular, combustivelPopular, tanquePopular, eficienciaPopular);

        System.out.println("Informe os dados do veículo SUV:");
        System.out.print("Marca: ");
        String marcaSUV = sc.nextLine();
        System.out.print("Modelo: ");
        String modeloSUV = sc.nextLine();
        System.out.print("Combustível: ");
        String combustivelSUV = sc.nextLine();
        System.out.print("Capacidade do tanque (litros): ");
        double tanqueSUV = sc.nextDouble();
        System.out.print("Eficiência do veículo (km/litro): ");
        double eficienciaSUV = sc.nextDouble();
        sc.nextLine();  
        Veiculo suv = new Veiculo(marcaSUV, modeloSUV, combustivelSUV, tanqueSUV, eficienciaSUV);

        System.out.println("Informe os dados do veículo Minivan:");
        System.out.print("Marca: ");
        String marcaMinivan = sc.nextLine();
        System.out.print("Modelo: ");
        String modeloMinivan = sc.nextLine();
        System.out.print("Combustível: ");
        String combustivelMinivan = sc.nextLine();
        System.out.print("Capacidade do tanque (litros): ");
        double tanqueMinivan = sc.nextDouble();
        System.out.print("Eficiência do veículo (km/litro): ");
        double eficienciaMinivan = sc.nextDouble();
        sc.nextLine(); 
        Veiculo minivan = new Veiculo(marcaMinivan, modeloMinivan, combustivelMinivan, tanqueMinivan, eficienciaMinivan);

        System.out.print("Informe a distância da viagem (km): ");
        double distancia = sc.nextDouble();

        System.out.printf("Consumo do veículo Popular para %.2f km: %.2f litros\n", distancia, popular.calcularConsumo(distancia));
        System.out.printf("Consumo do veículo SUV para %.2f km: %.2f litros\n", distancia, suv.calcularConsumo(distancia));
        System.out.printf("Consumo do veículo Minivan para %.2f km: %.2f litros\n", distancia, minivan.calcularConsumo(distancia));

        sc.close();
    }
}
