package DAW.Programación.Ejercicios.programas.Trim_2.A2048_game;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Tablero tablero_1 = new Tablero();
        int[][] tablero = new int[4][4];    
        char nuevoMov;

        LimpiarPantalla.limpiarPantalla();
        GenerarNumeros.generarNumeros(tablero);        
        GenerarNumeros.generarNumeros(tablero);
        tablero_1.DibujarTablero(tablero);


        for (int i = 0; i < 100; i++) {
            nuevoMov = sc.nextLine().charAt(0);
            Movimiento.movimiento(nuevoMov, tablero, tablero_1);
            GenerarNumeros.generarNumeros(tablero, tablero_1);  
        }
        sc.close();


        //Creacion del movimiento terminada.
        //lo unico que falta es ajustar un par de detalles tales como:
        /*
         * Movimiento hacia arriba
         * |   |   |   |   |  ==>>  |   | 2 |   |   |
         * |   | 2 |   |   |  ==>>  |   |   |   |   |
         * |   | 2 |   |   |  ==>>  |   |   |   |   |
         * |   |   |   |   |  ==>>  |   |   |   |   |
         * Y ocurre con situaciones similares para el resto de movimietntos
         */

        /*
         * Movimiento hacia abajo
         * | 4 | 4 | 4 | 4 |  ==>>  |   |   |   |   |
         * |   |   |   |   |  ==>>  |   |   |   |   |
         * |   |   |   |   |  ==>>  |   |   |   |   |
         * | 2 |   | 2 |   |  ==>>  | 4 | 4 | 4 | 4 |
         * Y ocurre con situaciones similares para el resto de movimietntos
         */

        /*
         * Movimiento hacia arriba
         * |   | 2 |   |   |  ==>>  |   | 2 |   |   |
         * |   |   |   |   |  ==>>  |   |   |   |   |
         * |   | 2 |   |   |  ==>>  |   |   |   |   |
         * |   |   |   |   |  ==>>  |   |   |   |   |
         * Y ocurre con situaciones similares para el resto de movimietntos
         */
    }
}