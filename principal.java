package DAW.Programación.Ejercicios.programas.Trim_2.A2048_game;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Tablero tablero_1 = new Tablero();
        int[][] tablero = new int[4][4];
    
        char nuevoMov;

        tablero[3][1] = 2;
        tablero[3][2] = 2; 
        
        tablero_1.DibujarTablero(tablero);
        nuevoMov = sc.nextLine().charAt(0);
        Movimiento.movimiento(nuevoMov, tablero, tablero_1);
        sc.nextLine();
        
    }
}