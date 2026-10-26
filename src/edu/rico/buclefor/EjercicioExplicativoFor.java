package edu.rico.buclefor;

public class EjercicioExplicativoFor {


    public static void main(String[] args) {
        //DIFERENCIAS CON WHILE:
        //Lo usamos siempre para iterar cuando sabemos con antelación cuantas iteraciones haremos
        //La variable de control es el contador y va incluido en el for

        //int i = 0 => declaración de la variable de control e inicialización
        //i < 10 => condición de parada
        //i++ => incremento de la variable de control
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola mundo");
        }

        //Este bucle decrementa de 1 en 1 la variable de control o iteradora
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}
