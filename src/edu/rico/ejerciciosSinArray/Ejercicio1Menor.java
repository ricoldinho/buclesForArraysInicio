package edu.rico.ejerciciosSinArray;

import java.util.Random;

public class Ejercicio1Menor {
    public static void main(String[] args) {
        Random random = new Random();

        // 1. Declaración e inicialización de 5 variables con números aleatorios [0 - 100]
        int n1 = random.nextInt(101);
        int n2 = random.nextInt(101);
        int n3 = random.nextInt(101);
        int n4 = random.nextInt(101);
        int n5 = random.nextInt(101);

        // Mostramos los valores obtenidos
        System.out.println("Números generados:");
        System.out.println("n1: " + n1 + " | n2: " + n2 + " | n3: " + n3 + " | n4: " + n4 + " | n5: " + n5);

        // 2. Detección del menor usando una variable de seguimiento
        // Se asume inicialmente que el primer número es el menor
        int menor = n1;

        // Se compara secuencialmente contra los demás, si el nuevo menor es menor, se actualiza
        // Nos ahorramos el infierno de if-else anidados que veiamos a primera hora
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        if (n4 < menor) {
            menor = n4;
        }
        if (n5 < menor) {
            menor = n5;
        }

        // 3. Salida por consola
        System.out.println("El número menor es: " + menor);
    }
    /*
    Cómo funciona la lógica aplicada
    Rango de números aleatorios: Se utiliza random.nextInt(101), cuyo límite superior es exclusivo
    (toma valores desde 0 hasta 100). También es equivalente escribir (int) (Math.random() * 101).

    Estrategia del pivote o acumulador: En lugar de realizar árboles (if-else) condicionales anidados complejos con operadores
    &&, se parte de la premisa de que n1 es el menor actual. Con cuatro comprobaciones if independientes, la variable
    menor se actualiza únicamente si encuentra un valor estrictamente inferior.
    */
}
