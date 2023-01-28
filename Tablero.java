package DAW.Programación.Ejercicios.programas.Trim_2.A2048_game;

public class Tablero {

    public void DibujarTablero(int tablero[][]) {

        int filas = tablero.length;
        int columnas = tablero[0].length;

        for (int i = 0; i < filas; i++) {
            for (int k = 0; k < columnas; k++) {
                if (k == 0) {                    
                    System.out.print("________");
                } else {
                    System.out.print("_______");
                }
            }
            System.out.println();
            for (int k = 0; k < columnas; k++) {
                if (tablero[i][k] > 999) {
                    System.out.print("| " + tablero[i][k] + " ");
                } else if (tablero[i][k] > 99) {
                    System.out.print("|  " + tablero[i][k] + " ");
                } else if(tablero[i][k] > 9){                    
                    System.out.print("|  " + tablero[i][k] + "  ");
                } else if (tablero[i][k] > 0){                    
                    System.out.print("|   " + tablero[i][k] + "  ");
                } else {                    
                    System.out.print("|      ");
                }

            }
            System.out.println("|");   
        }
    }
    
}
