package com.practica;

public class Electrodomestico {

    private final String colorDefecto = "blanco";
    private final char consumoEnergeticoDefecto = 'F';
    private final double precioBaseDefecto = 100;
    private final double pesoDefecto = 5;


    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        char letraN = Character.toUpperCase(letra);
        if (letraN == 'A' || letraN == 'B' || letraN == 'C' || letraN == 'D' || letraN == 'E' || letraN == 'F') {
            return this.consumoEnergetico = letraN;
        }
        return this.consumoEnergetico = consumoEnergeticoDefecto;
    }

    public String comprobarColor(String color) {
        String colorN = color.toLowerCase();
        if (colorN == "blanco" || colorN == "negro" || colorN == "rojo" || colorN == "azul" || colorN == "gris") {
            return this.color = colorN;
        }
        return this.color = colorDefecto;
    }

    public double precioConsumoEnergia() {
        double precioConsumoEnergia = 0;
        switch (this.consumoEnergetico) {
            case 'A':
                precioConsumoEnergia = 100;
                break;
            case 'B':
                precioConsumoEnergia = 80;
                break;
            case 'C':
                precioConsumoEnergia = 60;
                break;
            case 'D':
                precioConsumoEnergia = 50;
                break;
            case 'E':
                precioConsumoEnergia = 30;
                break;
            case 'F':
                precioConsumoEnergia = 10;
                break;
        }
        return precioConsumoEnergia;
    }

    public double precioSegunTamano() {
        double precioSeguntaTamano = 0;
        if (this.peso >= 0 && this.peso <= 19) {
            return precioSeguntaTamano = 10;
        } else if (this.peso >= 20 && this.peso <= 49){
            return precioSeguntaTamano = 50;
        }else if (this.peso >= 50 && this.peso <= 79){
            return precioSeguntaTamano = 80;
        }else{
            return precioSeguntaTamano = 100;
        }
    }

    public double precioFinal(){
        return precioConsumoEnergia() + precioSegunTamano();
    }


}
