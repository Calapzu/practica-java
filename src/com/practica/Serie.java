package com.practica;

public class Serie implements Entregable{

    private static int numTemporadas = 3;
    private static boolean entregado = false;

    private String titulo;
    private int temporadas;
    private boolean entragada;
    private String genero;
    private String creador;

    public Serie() {
        this.temporadas = numTemporadas;
        this.entragada = entregado;
    }

    public Serie(String titulo, String creador) {
        this.temporadas = numTemporadas;
        this.entragada = entregado;
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.entragada = entregado;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", temporadas=" + temporadas +
                ", entragado=" + entragada +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        entragada = true;

    }

    @Override
    public void devolver() {
        entragada = false;
    }

    @Override
    public boolean isEntregado() {
        if (entragada){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object a) {
        int estado= -1;

        //Hacemos un casting de objetos para usar el metodo get
        Serie ref=(Serie) a;
        if (temporadas > ref.getTemporadas()){
            estado = 1;
        }else if(temporadas == ref.getTemporadas()){
            estado = 0;
        }

        return estado;
    }
}
