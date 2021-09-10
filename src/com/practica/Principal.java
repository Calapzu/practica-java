package com.practica;

import java.text.Normalizer;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Ejercicios ejercicios = new Ejercicios();

        boolean bandera = true;
        int numEjercicio = 0;
        do {

            try {
                System.out.print("Digite el numero del ejercicio al que quiere entrar > ");
                numEjercicio = entrada.nextInt();


            } catch (InputMismatchException e) {
                System.out.println("Has digitado mal " + e);
            }


            switch (numEjercicio) {
                case 0:
                    System.out.println("Has digitado la opcion salir");
                    break;
                case 1:
                    int num1 = 8, num2 = 0;
                    if (ejercicios.numeroMayor(num1, num2) == num1) {
                        System.out.println("El numero " + num1 + " Es mayor");
                    } else if (ejercicios.numeroMayor(num1, num2) == num2) {
                        System.out.println("El numero " + num2 + " Es mayor");
                    } else {
                        System.out.println("Los numeros sonn iguales");
                    }
                    //Ejercicio_1_2 ejer1 = new Ejercicio_1_2(num3, num4);
                    //ejer1.numeroMayor();
                    break;
                case 2:
                    int num3 = 0, num4 = 0;

                    while (bandera) {
                        try {
                            System.out.print("Digite el numero 1 > ");
                            num1 = entrada.nextInt();

                            System.out.print("Digite el numero 2 > ");
                            num2 = entrada.nextInt();

                            bandera = false;
                        } catch (InputMismatchException e) {
                            entrada.nextLine();
                            System.out.println("Error has digito mal!! " + e);
                        }
                    }
                    if (ejercicios.numeroMayor(num3, num4) == num3) {
                        System.out.println("El numero " + num3 + " Es mayor");
                    } else if (ejercicios.numeroMayor(num3, num4) == num4) {
                        System.out.println("El numero " + num4 + " Es mayor");
                    } else {
                        System.out.println("Los numeros sonn iguales");
                    }

               /* Ejercicio_1_2 ejer2 = new Ejercicio_1_2();
                ejer2.setNum1(num1);
                ejer2.setNum2(num2);
                ejer2.numeroMayor();*/
                    break;
                case 3:
                    double area = 0;

                    while (bandera) {
                        System.out.print("Digite el radio de un circulo > ");
                        try {
                            area = entrada.nextDouble();
                            bandera = false;
                        } catch (InputMismatchException e) {
                            entrada.nextLine();
                            System.out.println("Error has digito mal!! " + e);
                        }
                    }

                    System.out.println("El area de circulo es de: " + ejercicios.calcularArea(area));

                /*Ejercicio3 ejer3 = new Ejercicio3();
                ejer3.setRadio(area);
                ejer3.calcularAreaCirculo();*/
                    break;
                case 4:
                    double precio = 0;

                    while (bandera) {
                        System.out.print("Digite el precio de un producto > ");
                        try {
                            precio = entrada.nextDouble();
                            bandera = false;
                        } catch (InputMismatchException e) {
                            entrada.nextLine();
                            System.out.println("Error has digito mal!! " + e);
                        }
                    }
                    System.out.println("El precio " + precio + " con la suma del iva de 21% es de: " + ejercicios.calcularPrecioConIva(precio));
                /* Ejercicio4 ejer4 = new Ejercicio4();
                ejer4.setPrecio(precio);
                ejer4.calcularPrecio();*/
                    break;
                case 5:
                    System.out.println(ejercicios.mostrarNumerosImparesWhile());
                /*int num = 1;
                while (num <= 100) {
                    if (num % 2 == 0) {
                        System.out.println("Numeros par: " + num);
                    } else {
                        System.out.println("Numero impar: " + num);
                    }
                    num++;
                }*/
                    break;
                case 6:
                    System.out.println(ejercicios.mostrarNumerosImparesFor());
                /*int num6 = 100;
                for (int i = 1; i <= num6; i++) {
                    if (i % 2 == 0) {
                        System.out.println("Numeros par: " + i);
                    } else {
                        System.out.println("Numero impar: " + i);
                    }
                }*/
                    break;
                case 7:
                    int numero = 0;
                    System.out.println(bandera);

                    do {
                        try {
                            System.out.print("Digite un numero > ");
                            numero = entrada.nextInt();
                            bandera = false;
                        } catch (InputMismatchException e) {
                            entrada.nextLine();
                            System.out.println("Error has digito mal!! " + e);
                        }
                    } while (ejercicios.comprobarNumeroMayorCero(numero) == false);

                    System.out.println("El numero es: " + numero);

                    break;
                case 8:
                    System.out.print("Digite un dia de la semana > ");
                    String dia = entrada.next();
                    System.out.println(ejercicios.diaLaboral(dia));
                    break;
                case 9:
                    System.out.print("Digite el texto que quiere añadir > ");
                    entrada.nextLine();
                    String textoUsuario = entrada.nextLine();

                    System.out.println(ejercicios.reemplazarLasA(textoUsuario));

                    break;
                case 10:
                    System.out.print("Digite una frase > ");
                    entrada.nextLine();
                    String frase = entrada.nextLine();

                    System.out.println(ejercicios.elinminarEspacios(frase));

                    break;
                case 11:

                    System.out.print("Digite una frase > ");
                    entrada.nextLine();
                    String frase1 = entrada.nextLine();

                    System.out.println("La longitud de la frase es de: " + frase1.length() + " y contiene " + ejercicios.cantidadDeVocales(frase1) + " vocales");
                    break;
                case 12:

                    System.out.println("Digite la primer palabra");
                    String palabra1 = entrada.next();
                    System.out.println("Digite la segunda palabra");
                    String palabra2 = entrada.next();


                    System.out.println(ejercicios.compararDosPalabras(palabra1, palabra2));

                    break;

                case 13:
                    System.out.println(ejercicios.fechaActual());
                    break;
                case 14:
                    int num = 1;

                    while (bandera) {
                        System.out.print("Digite un numero > ");
                        try {
                            num = entrada.nextInt();
                            bandera = false;
                        } catch (InputMismatchException e) {
                            entrada.nextLine();
                            System.out.println("Error has digito mal!! " + e);
                        }
                    }
                    System.out.println(ejercicios.numerosDe2en2(num));
                    break;
                case 15:
                    int numero15 = 0;
                    do {
                        System.out.println(ejercicios.mostrarMenu(numero15));

                        System.out.print("Digite el numero de la opcion a la que deseas entrar > ");
                        try {
                            numero15 = entrada.nextInt();
                        } catch (InputMismatchException e) {
                            entrada.nextLine();
                            System.out.println("Error has digito mal!! " + e);
                        }
                    } while (numero15 != 8);

                    System.out.println("Has salido del programa...");

                    break;
                case 16:
                    int numPersona = 0;
                    boolean bandera7 = false;
                    do {
                        try {
                            System.out.print("Digite el numero de la persona que quiere ver > ");
                            numPersona = entrada.nextInt();

                        } catch (InputMismatchException e) {
                            bandera7 = true;
                            System.out.println("Ha digitado algo mal!!! " + e);
                        }

                        switch (numPersona) {
                            case 1:
                                String nombre = "";
                                int edad = 0;
                                char sexo = ' ';
                                double peso = 0;
                                double altura = 0;
                                try {
                                    System.out.print("Digite el nombre > ");
                                    entrada.nextLine();
                                    nombre = entrada.nextLine();

                                    System.out.print("Digite la edad > ");
                                    edad = entrada.nextInt();

                                    System.out.print("Digite el sexo > ");
                                    sexo = entrada.next().charAt(0);

                                    System.out.print("Digite el peso > ");
                                    peso = entrada.nextDouble();

                                    System.out.print("Digite su altura > ");
                                    altura = entrada.nextDouble();
                                } catch (InputMismatchException e) {
                                    System.out.println("Ha digitado algo mal!!! " + e);
                                }

                                Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

                                if (persona1.calcularIMC() == -1) {
                                    System.out.println("La persona con nombre " + persona1.getNombre() + " esta en su peso ideal");
                                } else if (persona1.calcularIMC() == 0) {
                                    System.out.println("La persona con nombre " + persona1.getNombre() + " esta por debajo de su peso ideal");
                                } else if (persona1.calcularIMC() == 1) {
                                    System.out.println("La persona con nombre " + persona1.getNombre() + " esta con sobrepeso");
                                } else {
                                    System.out.println("La persona con nombre " + persona1.getNombre() + " no escribio su peso");

                                }

                                if (persona1.esMayorDeEdad()) {
                                    System.out.println("La persona con nombre " + persona1.getNombre() + " es mayor de edad ");
                                } else {
                                    System.out.println("La persona con nombre " + persona1.getNombre() + " es menor de edad");
                                }

                                System.out.println(persona1.toString());

                                break;
                            case 2:
                                String nombre2 = "";
                                int edad2 = 0;
                                char sexo2 = ' ';

                                try {
                                    System.out.print("Digite el nombre > ");
                                    entrada.nextLine();
                                    nombre2 = entrada.nextLine();

                                    System.out.print("Digite la edad > ");
                                    edad2 = entrada.nextInt();

                                    System.out.print("Digite el sexo > ");
                                    sexo2 = entrada.next().charAt(0);
                                } catch (InputMismatchException e) {
                                    System.out.println("Ha digitado algo mal!!! " + e);
                                }

                                Persona persona2 = new Persona(nombre2, edad2, sexo2);
                                System.out.println(persona2.generaDNI());


                                if (persona2.calcularIMC() == -1) {
                                    System.out.println("La persona con nombre " + persona2.getNombre() + " esta en su peso ideal");
                                } else if (persona2.calcularIMC() == 0) {
                                    System.out.println("La persona con nombre " + persona2.getNombre() + " esta por debajo de su peso ideal");
                                } else if (persona2.calcularIMC() == 1) {
                                    System.out.println("La persona con nombre " + persona2.getNombre() + " esta con sobrepeso");
                                } else {
                                    System.out.println("La persona con nombre " + persona2.getNombre() + " no escribio su peso");

                                }

                                if (persona2.esMayorDeEdad()) {
                                    System.out.println("La persona con nombre " + persona2.getNombre() + " es mayor de edad ");
                                } else {
                                    System.out.println("La persona con nombre " + persona2.getNombre() + " es menor de edad");
                                }

                                System.out.println(persona2.toString());

                                break;
                            case 3:
                                Persona persona3 = new Persona();

                                persona3.setNombre("Jhoan");
                                persona3.setEdad(21);
                                persona3.setSexo('h');
                                persona3.setPeso(55);
                                persona3.setAltura(1.70);


                                if (persona3.calcularIMC() == -1) {
                                    System.out.println("La persona con nombre " + persona3.getNombre() + " esta en su peso ideal");
                                } else if (persona3.calcularIMC() == 0) {
                                    System.out.println("La persona con nombre " + persona3.getNombre() + " esta por debajo de su peso ideal");
                                } else if (persona3.calcularIMC() == 1) {
                                    System.out.println("La persona con nombre " + persona3.getNombre() + " esta con sobrepeso");
                                } else {
                                    System.out.println("La persona con nombre " + persona3.getNombre() + " es menor de edad");

                                }

                                if (persona3.esMayorDeEdad()) {
                                    System.out.println("La persona con nombre " + persona3.getNombre() + " es mayor de edad ");
                                } else {
                                    System.out.println("La persona con nombre " + persona3.getNombre() + " es menor de edad");
                                }

                                System.out.println(persona3.toString());

                                break;

                        }

                        System.out.println("bandera =" + bandera7);
                        entrada.nextLine();
                    } while (bandera7 != false);


                    break;
                case 17:

                    Electrodomestico arregloElectrodomesticos[] = new Electrodomestico[10];

                    arregloElectrodomesticos[0] = new Electrodomestico(10000, "blanco", 'A', 49);
                    arregloElectrodomesticos[1] = new Electrodomestico(10000, "negro", 'C', 11);
                    arregloElectrodomesticos[2] = new Electrodomestico(100000, "rojo", 'D', 70);

                    arregloElectrodomesticos[3] = new Lavadora(100000, "rojo", 'C', 70, 80);
                    arregloElectrodomesticos[4] = new Lavadora(200000, "azul", 'E', 70, 30);
                    arregloElectrodomesticos[5] = new Lavadora(300000, "blanco", 'A', 70, 20);

                    arregloElectrodomesticos[6] = new Television(300000, "blanco", 'A', 70, 20, true);
                    arregloElectrodomesticos[7] = new Television(300000, "negro", 'B', 50, 45, false);
                    arregloElectrodomesticos[8] = new Television(300000, "azul", 'C', 10, 45, false);
                    arregloElectrodomesticos[9] = new Television(300000, "rojo", 'D', 30, 60, true);
                    double tempTo = 0, tempE = 0, tempL = 0, tempT = 0;
                    for (int i = 0; i < arregloElectrodomesticos.length; i++) {
                        double valorTo = 0, valorL = 0, valorT = 0, valorE = 0;
                        if (arregloElectrodomesticos[i] instanceof Television) {
                            valorT = arregloElectrodomesticos[i].precioFinal();
                            tempT = tempT + valorT;
                        }
                        if (arregloElectrodomesticos[i] instanceof Lavadora) {
                            valorL = arregloElectrodomesticos[i].precioFinal();
                            tempL = tempL + valorL;
                        }

                        valorTo = arregloElectrodomesticos[i].precioFinal();
                        tempTo = tempTo + valorTo;

                    }
                    System.out.println("El valor total de todos los Electromesticos, Lavdoras y Televisores: " + tempTo);
                    System.out.println("El valor total de todos los Electromesticos: " + (tempTo - (tempT + tempL)));
                    System.out.println("El valor total de todas las lavadoras: " + tempL);
                    System.out.println("El valor total de todos los Televisores: " + tempT);

                    break;
                case 18:
                    Serie arregloSerie[] = new Serie[5];
                    Videojuego arregloVideojuego[] = new Videojuego[5];

                    //String titulo, int temporadas, String genero, String creador
                    arregloSerie[0] = new Serie("La casa de papel", 30, "drama", "Yamson");
                    arregloSerie[1] = new Serie("New Amsterdam", 40, "terror", "Jhoan");
                    arregloSerie[2] = new Serie("StartUp", 50, "ficcion", "Valentina");
                    arregloSerie[3] = new Serie("La serpiente", 60, "comedia", "Leidy");
                    arregloSerie[4] = new Serie("Shy Rojo", 70, "drama", "Yojana");

                    //String titulo, int horaEstimada, String genero, String compania
                    arregloVideojuego[0] = new Videojuego("Fornite", 20, "guerra", "EA");
                    arregloVideojuego[1] = new Videojuego("Pac-Man", 30, "pensar", "Sport");
                    arregloVideojuego[2] = new Videojuego("TETRIS", 40, "pensar", "LOCOS");
                    arregloVideojuego[3] = new Videojuego("Minecraft", 50, "pensar", "FF");
                    arregloVideojuego[4] = new Videojuego("LOL", 100, "pensar", "Riot games");

                    arregloSerie[0].entregar();
                    arregloSerie[3].entregar();

                    arregloVideojuego[1].entregar();
                    arregloVideojuego[2].entregar();
                    arregloVideojuego[3].entregar();
                    int cantidadEntregados = 0;
                    for (Serie s : arregloSerie) {
                        if (s.isEntregado()) {
                            cantidadEntregados += 1;
                            s.devolver();
                        }
                    }
                    for (Videojuego v : arregloVideojuego) {
                        if (v.isEntregado()) {
                            cantidadEntregados += 1;
                            v.devolver();
                        }
                    }
                    System.out.println("Existen " + cantidadEntregados + " entregados entre videojuegos y series");

                    Videojuego miVideoJuegoConMasHoras = arregloVideojuego[0];
                    Serie miSerieConMasTemporadas = arregloSerie[0];

                    for (int i = 1; i < arregloVideojuego.length; i++) {
                        if (arregloVideojuego[i].compareTo(miVideoJuegoConMasHoras) == 1) {
                            miVideoJuegoConMasHoras = arregloVideojuego[i];
                        }
                        if (arregloSerie[i].compareTo(miSerieConMasTemporadas) == 1) {
                            miSerieConMasTemporadas = arregloSerie[i];
                        }
                    }

                    System.out.println("el videojuego con más horas " + miVideoJuegoConMasHoras.toString());
                    System.out.println("la serie con más temporadas " + miSerieConMasTemporadas.toString());


                    break;
                default:
                    System.out.println("Ha digitado un numnero invalido");

            }
            System.out.println("Digite [0] para salir");

        } while (numEjercicio != 0);
    }
}
