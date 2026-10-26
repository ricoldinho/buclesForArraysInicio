package edu.rico.ejerciciosSinArray;

import java.util.Random;

public class Ejercicio3Multiplos {
    public static void main(String[] args) {
        Random random = new Random();

        // 1. Declaración e inicialización de 5 variables con valores aleatorios [0 - 100]
        int n1 = random.nextInt(101);
        int n2 = random.nextInt(101);
        int n3 = random.nextInt(101);
        int n4 = random.nextInt(101);
        int n5 = random.nextInt(101);

        // Mostramos las entradas generadas
        System.out.println("Números generados:");
        System.out.println("n1: " + n1 + " | n2: " + n2 + " | n3: " + n3 + " | n4: " + n4 + " | n5: " + n5);

        // 2. Detección del número menor
        int menor = n1;
        if (n2 < menor) menor = n2;
        if (n3 < menor) menor = n3;
        if (n4 < menor) menor = n4;
        if (n5 < menor) menor = n5;

        // 3. Detección del número mayor
        int mayor = n1;
        if (n2 > mayor) mayor = n2;
        if (n3 > mayor) mayor = n3;
        if (n4 > mayor) mayor = n4;
        if (n5 > mayor) mayor = n5;

        // 4. Variables acumuladora y contadora para los múltiplos
        int sumaMultiplos = 0;
        int contadorMultiplos = 0;

        // Evaluación individual de cada variable sin bucles
        if (n1 % 3 == 0 && n1 % 4 == 0) {
            sumaMultiplos += n1;
            contadorMultiplos++;
        }
        if (n2 % 3 == 0 && n2 % 4 == 0) {
            sumaMultiplos += n2;
            contadorMultiplos++;
        }
        if (n3 % 3 == 0 && n3 % 4 == 0) {
            sumaMultiplos += n3;
            contadorMultiplos++;
        }
        if (n4 % 3 == 0 && n4 % 4 == 0) {
            sumaMultiplos += n4;
            contadorMultiplos++;
        }
        if (n5 % 3 == 0 && n5 % 4 == 0) {
            sumaMultiplos += n5;
            contadorMultiplos++;
        }

        // 5. Salida por consola de los extremos
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Número menor: " + menor);
        System.out.println("Número mayor: " + mayor);

        // 6. Cálculo y muestra de la media evitando división por cero
        if (contadorMultiplos > 0) {
            double media = (double) sumaMultiplos / contadorMultiplos;
            System.out.println("Múltiplos de 3 y 4 encontrados: " + contadorMultiplos);
            System.out.println("Suma total de los múltiplos: " + sumaMultiplos);
            System.out.println("Media de los múltiplos es: " + media);
        } else {
            System.out.println("Ninguno de los 5 números es múltiplo simultáneo de 3 y 4.");
        }
    }
    /*
    Comprobación de múltiplos simultáneos: Se emplea el operador módulo % para comprobar que el resto de la división
    sea cero y el operador lógico && (AND) para verificar que ambas condiciones (divisible entre 3 y entre 4) se cumplan
    a la vez.

    Acumuladores y contadores: Para cada variable que supera la condición, se suma su valor al total
    (sumaMultiplos += nX) y se incrementa en uno la cantidad de coincidencias (contadorMultiplos++).

    Control de división por cero: Si ninguno de los 5 números aleatorios cumple el criterio, el contador permanece en 0.
    Se utiliza una estructura condicional if para controlar este caso y evitar una división indeterminada.

    Casting a double: Al dividir dos cantidades de tipo entero (int), Java descarta los decimales si no se fuerza la
    conversión; realizar (double) sumaMultiplos / contadorMultiplos preserva el resultado con precisión decimal.
    */
}
