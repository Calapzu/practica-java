package com.practica;

public class Videojuego implements Entregable{

    private static int horasEstimadas = 10;
    private static boolean entregada = false;

    private String titulo;
    private int horaEstimada;
    private boolean entregado;
    private String genero;
    private String compania;

    public Videojuego() {
        this.horaEstimada = horasEstimadas;
        this.entregado = entregada;
    }

    public Videojuego(String titulo, int horaEstimada) {
        this.titulo = titulo;
        this.horaEstimada = horaEstimada;
        this.entregado = entregada;
    }

    public Videojuego(String titulo, int horaEstimada, String genero, String compania) {
        this.titulo = titulo;
        this.horaEstimada = horaEstimada;
        this.entregado = entregada;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoraEstimada() {
        return horaEstimada;
    }

    public void setHoraEstimada(int horaEstimada) {
        this.horaEstimada = horaEstimada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        if (entregado){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object a) {
        //el videojuego con más hora retornara 1, 0 si son iguales y -1 si es menor :)
        int auxRes = -1;
        Videojuego miVideojuego = (Videojuego) a;
        if (this.horaEstimada >  miVideojuego.horaEstimada){
            auxRes = 1;
        }else if (this.horaEstimada == miVideojuego.getHoraEstimada()){
            auxRes = 0;
        }
        return auxRes;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horaEstimada=" + horaEstimada +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }


}
