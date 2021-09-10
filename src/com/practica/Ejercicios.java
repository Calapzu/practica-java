package com.practica;

import java.text.Normalizer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Ejercicios {

    public int numeroMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else if (num1 < num2) {
            return num2;
        } else {
            return 0;

        }
    }

    public double calcularArea(double radio) {
        double areaCirculo = Math.round(Math.PI * Math.pow(radio, 2));
        return areaCirculo;
    }

    public double calcularPrecioConIva(double precio) {
        double precioIva = precio + (precio * 0.21);
        return precioIva;
    }

    public String mostrarNumerosImparesWhile() {
        String numerosPares = " ";
        String numerosImpares = " ";

        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0) {
                numerosPares += i + " ";
            } else {
                numerosImpares += i + " ";
            }
            i++;
        }

        return "Los numeros pares son: " + numerosPares + "\n" + "Los numeros impares son: " + numerosImpares;
    }

    public String mostrarNumerosImparesFor() {
        String numerosPares = " ";
        String numerosImpares = " ";

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                numerosPares += i + " ";
            } else {
                numerosImpares += i + " ";
            }
        }

        return "Los numeros pares son: " + numerosPares + "\n" + "Los numeros impares son: " + numerosImpares;
    }

    public boolean comprobarNumeroMayorCero(int num) {
        boolean bandera = false;

        if (num >= 0) {
            bandera = true;
        }
        return bandera;
    }

    public String diaLaboral(String dia) {
        String esLaboral = cleanString(dia.toLowerCase());
        switch (esLaboral) {
            case "lunes":
                esLaboral += "es dia laboral";
                break;
            case "martes":
                esLaboral += " es dia laboral";
                break;
            case "miercoles":
                esLaboral += " es dia laboral";
                break;
            case "jueves":
                esLaboral += " es dia laboral";
                break;
            case "viernes":
                esLaboral += " es dia laboral";
                break;
            case "sabado":
                esLaboral += " no es dia laboral";
                break;
            case "domingo":
                esLaboral += " no es dia laboral";
                break;
            default:
                esLaboral += " Escribio mal el dia de la semana!!!";
        }
        return esLaboral;
    }

    public static String cleanString(String texto) {
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return texto;
    }

    public String reemplazarLasA(String frase) {
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        String nuevoTexto = "";

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                nuevoTexto = texto.replace(texto.charAt(i), 'e');
            }
        }

        return nuevoTexto + " " + frase;
    }

    public String elinminarEspacios(String frase) {
        String fraseSinEspacios = frase.replaceAll(" ", "");
        return fraseSinEspacios;
    }

    public int cantidadDeVocales(String frase) {
        int cantidadVocales = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'
                    || frase.charAt(i) == 'u') {
                cantidadVocales++;
            }
        }
        return cantidadVocales;
    }

    public String fechaActual() {
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
        return "yyyy/MM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now());
    }

    public String numerosDe2en2(int num) {
        String numeros = " ";

        while (num <= 1000) {
            numeros += num + " ";
            num = num + 2;

        }
        return numeros;
    }

    public String compararDosPalabras(String palabra1, String palabra2){
        String auxRes = "";
        String auxRes2 = "";

        if (palabra1.equals(palabra2)) {
            auxRes = "Las palabras son iguales ";
        } else {
            for (int i = 0; i < palabra1.length(); i++) {
                auxRes += "La letra de la primera palabra es: " + palabra1.charAt(i)+"\n";
            }
            for (int i = 0; i < palabra2.length(); i++) {

                auxRes2 += " La letra de la segunda palabra es: " + palabra2.charAt(i)+"\n";

            }
        }
        return auxRes +auxRes2;
    }

    public String mostrarMenu(int menu) {

            return "****** GESTION CINEMATOGRÁFICA ********\n" + "1-NUEVO ACTOR\n 2-BUSCAR ACTOR \n 3-ELIMINAR ACTOR \n 4-MODIFICAR ACTOR \n" +
                    "5-VER TODOS LOS ACTORES\n 6- VER PELICULAS DE LOS ACTORES\n " +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n 8-SALIR ";

    }
}