package edu.rico.ejercicioViernes;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1Menor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNumeros = new int[5];
        Random random = new Random();

        //Para escribir un valor dentro de un array:
        //arrayNumeros[0] = 10;
        //arrayNumeros[5] = 20;

        //Para leer un valor dentro de un array:
        //int valor = arrayNumeros[5];

        //USAMOS EL FOR PARA RELLENAR EL ARRAY
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduciéndose un numero de forma aleatoria: ");
            arrayNumeros[i] = random.nextInt(101);
            System.out.println("Has introducido un: " + arrayNumeros[i]);
        }

        //USAMOS EL FOR PARA VER QUIEN ES EL MENOR
        int menor = arrayNumeros[0];
        for (int i = 0; i < 5; i++) {
            if (arrayNumeros[i] < menor) {
                menor = arrayNumeros[i];
            }
        }
        System.out.println("El menor numero es: " + menor);

        //USAMOS EL FOR PARA VER QUIEN ES EL MAYOR
        int mayor = arrayNumeros[0];
        for (int i = 0; i < 5; i++) {
            if (arrayNumeros[i] > mayor) {
                mayor = arrayNumeros[i];
            }
        }
        System.out.println("El mayor numero es: " + mayor);

        //CALCULAR LA MEDIA DE LA SUMA DE LOS MULTIPLOS DE 3 Y 4
        int sumaMultiplos = 0;
        int numeroMultiplos = 0;
        for(int i = 0; i < 5; i++){
            if(arrayNumeros[i] % 3 == 0 && arrayNumeros[i] % 4 == 0){
                //sumaMultiplos = sumaMultiplos + arrayNumeros[i];
                sumaMultiplos += arrayNumeros[i];
                System.out.println("El numero " + arrayNumeros[i] + " es multiplo de 3 y 4");
                numeroMultiplos++;
            }
        }
        if(numeroMultiplos == 0){
            System.out.println("No hay multiplos de 3 y 4");
        }else{
            System.out.println("La media de los multiplos es: " + (double) sumaMultiplos / numeroMultiplos);
        }






    }
}
