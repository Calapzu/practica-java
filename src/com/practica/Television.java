package com.practica;

public class Television extends Electrodomestico{

    private double resolucionDefecto = 20;
    private boolean sintonizadorTDTDefecto = false;

    private double resolucion;
    private boolean sintonizadorTDT;

    public Television() {
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double precioConSintonizador(){
        double precioConsintonizador = super.precioFinal();
        if (this.isSintonizadorTDT()){
            return precioConsintonizador =precioConsintonizador + 50;
        }
        return precioConsintonizador;
    }

    public double precioConPulgadas(){
        double precioConPulgadas = super.precioFinal();
        if (this.resolucion > 40){
            return precioConPulgadas += (precioConPulgadas * 0.3 ) ;
        }
        return precioConPulgadas;
    }

    @Override
    public double precioFinal() {
        return precioConPulgadas() + precioConSintonizador();
    }
}
