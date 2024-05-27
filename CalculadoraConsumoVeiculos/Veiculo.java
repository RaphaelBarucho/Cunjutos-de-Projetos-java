package CalculadoraConsumoVeiculos;

public class Veiculo {
    String marca;
    String modelo;
    String combustivel;
    double tanque;
    double eficiencia;

    public Veiculo(String m, String mod, String comb, double tanq, double efic) {
        marca = m;
        modelo = mod;
        combustivel = comb;
        tanque = tanq;
        eficiencia = efic;
    }

    public double calcularConsumo(double distancia) {
        return distancia / eficiencia;
    }
}
