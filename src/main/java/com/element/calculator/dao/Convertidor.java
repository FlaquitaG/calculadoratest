package com.element.calculator.dao;

public interface Convertidor {

    double convertirCentigrados(String origen, String destino, int valor);
    double convertirKelvin(String origen, String destino, int valor);
    double convertirFahrenheit(String origen, String destino, int valor);
}
