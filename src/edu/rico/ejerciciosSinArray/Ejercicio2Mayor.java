package edu.rico.ejerciciosSinArray;

import java.util.Random;

public class Ejercicio2Mayor {
    public static void main(String[] args) {
        Random random = new Random();

        // 1. Declaración e inicialización de 5 variables con números aleatorios [0 - 100]
        int n1 = random.nextInt(101); // Valores del 0 al 100 inclusive
        int n2 = random.nextInt(101);
        int n3 = random.nextInt(101);
        int n4 = random.nextInt(101);
        int n5 = random.nextInt(101);

        // Mostramos los valores generados
        System.out.println("Números generados:");
        System.out.println("n1: " + n1 + " | n2: " + n2 + " | n3: " + n3 + " | n4: " + n4 + " | n5: " + n5);

        // 2. Detección del mayor con variable de seguimiento
        // Se toma el primer número como referencia inicial
        int mayor = n1;

        // Se comprueba si alguno de los restantes supera al actual
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        if (n4 > mayor) {
            mayor = n4;
        }
        if (n5 > mayor) {
            mayor = n5;
        }

        // 3. Salida por consola
        System.out.println("El número mayor es: " + mayor);
    }
}
