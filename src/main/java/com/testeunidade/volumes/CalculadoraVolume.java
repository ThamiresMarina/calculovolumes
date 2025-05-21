package com.testeunidade.volumes;

public class CalculadoraVolume {
    public static double volumeCubo(double lado) {
        return Math.pow(lado, 3); // eleva o número a potência 3
    }

    public static double volumeParelelepipedo(double largura, double altura, double comprimento) {
        return largura * altura * comprimento;
    }

    public static double volumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

}