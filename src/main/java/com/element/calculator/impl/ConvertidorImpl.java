package com.element.calculator.impl;

import com.element.calculator.dao.Convertidor;
import com.element.calculator.dao.OperacionesBasicas;

public class ConvertidorImpl implements Convertidor {
    int BASE_CENTIGRADOS = 32;
    double BASE_KELVIN = 273.15;
    double BASE_FAHRENHEIT =  1.8000;
    double resultado = 0;
    OperacionesBasicasImpl operacionesBasicas = new OperacionesBasicasImpl();

    public double convertirCentigrados(String origen, String destino, int valor){

        if (origen.equalsIgnoreCase("C") && destino.equalsIgnoreCase("F")){
           resultado = operacionesBasicas.suma((valor *BASE_FAHRENHEIT ),BASE_CENTIGRADOS);
        }else
            if (origen.equalsIgnoreCase("C") && destino.equalsIgnoreCase("K")){
                   resultado = operacionesBasicas.suma (valor, BASE_KELVIN);
        }else {
                System.out.println("Opcion incorrecta");
            }

    return resultado;
    }


    public double convertirKelvin(String origen, String destino, int valor){

        if (origen.equalsIgnoreCase("K") && destino.equalsIgnoreCase("F")){
            resultado = operacionesBasicas.suma((valor *1.8000),BASE_CENTIGRADOS);
        }else
        if (origen.equalsIgnoreCase("K") && destino.equalsIgnoreCase("C")){
            resultado = operacionesBasicas.suma (valor, BASE_KELVIN);
        }else{
            System.out.println("Opcion incorrecta");
        }

        return resultado;
    }

    public double convertirFahrenheit(String origen, String destino, int valor){
        if (origen.equalsIgnoreCase("F") && destino.equalsIgnoreCase("C")){
            resultado = operacionesBasicas.division(operacionesBasicas.resta(valor,32),BASE_FAHRENHEIT );
        }else
        if (origen.equalsIgnoreCase("F") && destino.equalsIgnoreCase("K")){
            resultado = operacionesBasicas.suma( operacionesBasicas.division(operacionesBasicas.suma(valor,BASE_CENTIGRADOS),BASE_FAHRENHEIT), BASE_KELVIN);
        }else{
            System.out.println("Opcion incorrecta");
        }
        return resultado;
    }



}
