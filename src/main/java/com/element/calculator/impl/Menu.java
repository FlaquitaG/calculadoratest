package com.element.calculator.impl;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Menu {

    public void displayMenu() {
        validateUserChooseCorrectOption();
    }

    public boolean deseaContinuar (String value){
        boolean continuar = true;
            if (value.contentEquals("YES")){
                menuContent();
                //validOption = true;
            }else
            if (value.contentEquals("NO")){
                continuar = false;
            }
        return continuar;
    }
    public boolean deseaContinuarPlanB (String value){
        boolean continuar = true;
        if (value.equalsIgnoreCase("YES")){
            continuar = true;
        }else
        if (value.equalsIgnoreCase("NO")){
            continuar = false;
        }
        return continuar;
    }

    public void validateUserChooseCorrectOption(){
        String value;
        String origen = "";
        String destino = "";
        int valueToConvert;
        boolean validOption, continuar = true;
        Scanner reader = new Scanner (System.in);
        ConvertidorImpl convertidor = new ConvertidorImpl();
        menuContent();
        value = reader.nextLine();

        do {
            //System.out.println("opcio " + validOption);
            if (value.contentEquals("0")) {
                System.out.println("Valor invalido.. introduzca una opcion correcta");
                menuContent();
                value = reader.nextLine();
                //continuar = deseaContinuar(value);
            }else
                if (value.contentEquals("1") || value.contentEquals("3") ){
                    System.out.println("Introduce el valor para convertir: ");
                    value = reader.nextLine();
                    origen = "F";
                    destino = "C";
                    valueToConvert = Integer.parseInt(value);
                    System.out.println("Resultado: " + convertidor.convertirFahrenheit(origen, destino, valueToConvert ));
                    System.out.println("Quieres hacer otra conversion? YES/NO  ");
                    value = reader.nextLine();
                     continuar = deseaContinuar(value);
            }else
                    if (value.contentEquals("2") || value.contentEquals("4")){
                        System.out.println("Introduce el valor para convertir...:  ");
                        value = reader.nextLine();
                        origen = "C";
                        destino = "F";
                        valueToConvert = Integer.parseInt(value) ;
                        System.out.println("Resultado: " + convertidor.convertirCentigrados(origen,destino, valueToConvert));

                        System.out.println("Quieres hacer otra conversion? YES/NO  ");
                        value = reader.nextLine();
                        continuar = deseaContinuar(value);

                    }

            else {
                        System.out.println("Valor invalido intenta de nuevo porfavor");
                        validOption = false;
                        menuContent();
                        value = reader.nextLine();
                    }
            //System.out.println("opcio " + validOption);
        }while ( continuar != false);
    }


    public void leeDeConsolaQueGradosQuiereConvertir(){
        String origen;
        String destino;
        String value;
        int valueInt;
        boolean continuar = true;
        ConvertidorImpl convertidor = new ConvertidorImpl();
        Scanner reader = new Scanner (System.in);

        do {
            System.out.println("Porfavor Introduce los valores que deseas converir: ");
            System.out.println("Introduce el tipo de grados a convertir (origen ejemplo C, K, F) : ");
            origen = reader.nextLine();
            System.out.println("Introduce a que grados quieres convertir (destino ejemplo C, K, F) : ");
            destino = reader.nextLine();
            System.out.println("Introduce la cantidad de grados a convertir : ");
            value = reader.nextLine();
            valueInt = Integer.parseInt(value);


            if (origen.equalsIgnoreCase("F")) {
                System.out.println("Resultado: " + convertidor.convertirFahrenheit(origen, destino, valueInt));
                System.out.println("Quieres hacer otra conversion? YES/NO  ");
                value = reader.nextLine();
                continuar = deseaContinuarPlanB(value);
            } else if (origen.equalsIgnoreCase("C")) {
                System.out.println("Resultado: " + convertidor.convertirCentigrados(origen, destino, valueInt));
                System.out.println("Quieres hacer otra conversion? YES/NO  ");
                value = reader.nextLine();
                continuar = deseaContinuarPlanB(value);
            } else if (origen.equalsIgnoreCase("K")) {
                System.out.println("Resultado: " + convertidor.convertirKelvin(origen, destino, valueInt));
                System.out.println("Quieres hacer otra conversion? YES/NO  ");
                value = reader.nextLine();
                continuar = deseaContinuarPlanB(value);
            }else{
                System.out.print("Valor invalido, deseas volver a intentar?  YES/NO  ");
                value = reader.nextLine();
                continuar = deseaContinuarPlanB(value);
            }
        }while (continuar == true);
    }

    public String validarTipoDeGrado (String g){
        String resultado = "";
       // resultado = Str
        return resultado;
    }
    public void menuContent(){
        System.out.println("** Menu Calculadora para convertir grados C, F y K **");
        System.out.println("1- Convertir F to C");
        System.out.println("2- Convertir C to F");
        System.out.println("3- Convertir F to K");
        System.out.println("4- Convertir C to K");
        System.out.println("Introduzca la opcion deseada.. ");

    }



}
