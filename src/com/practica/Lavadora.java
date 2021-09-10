package com.practica;

public class Lavadora extends Electrodomestico {

    private final double cargaDefecto = 5;

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        if (this.carga > 30){
            return super.precioFinal() + 50;
        }
        return super.precioFinal();
    }
}
