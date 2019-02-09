package com.element.calculator.impl;

import com.element.calculator.dao.OperacionesBasicas;
public class OperacionesBasicasImpl implements OperacionesBasicas {

    public double suma(double a, double b) {

        return a+b;
    }

    public double multiplicacion(double a, double b){
        final double i = a * b;
        return i;

    }
    public double resta(double a, double b){
        double a1;
        double b1;
        double resultado;

        if ( a > b ) {
            resultado = a - b;
        }
        else {
            a1 = b;
            b1 = a;
            resultado = a1 - b1;
        }

        //System.out.println("El resultado de la resta es: " + resultado);

        return resultado;
    }

    public double division(double a, double b){
        double resultado;
        if (b == 0) {
            System.out.println("No se puede hacer divicion entre Cero ");
            return 0;
        }
        else{
            resultado = a / b;
            return resultado;
        }
    }

}
