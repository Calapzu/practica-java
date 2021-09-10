package com.practica;

public class Persona {
    private  final int opcion1 = -1, opcion2 = 0, opcion3 = 1;

    private String nombre;
    private int edad;
    private int DNI;
    private char sexo = 'H';
    private double peso;
    private double altura;

    public Persona() {
        comprobarSexo(getSexo());
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.DNI = generaDNI();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(){
        double IMC = peso/Math.pow(altura, 2);
            if (IMC < 20){
                return opcion1;
            }else if (IMC >= 20 && IMC <= 25){
                return opcion2;
            }else{
                return opcion3;
            }

    }

    public boolean esMayorDeEdad(){
        if (edad >= 18 ){
            return true;
        }
        return false;
    }

    public char comprobarSexo(char sexo){
        if (sexo == 'M' || sexo == 'H'){
            return sexo;
        }
        return this.sexo;
    }
    public int generaDNI(){
        return (int) (1000000000 * Math.random());
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }


}
