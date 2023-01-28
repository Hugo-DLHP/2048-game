package DAW.Programación.Ejercicios.programas.Trim_2.A2048_game;


public class GenerarNumeros {

    public static int[][] generarNumeros(int dato[][], Tablero tablero) {
        boolean condition = false;
        int y, x;
        do {
            y = (int) (Math.random()*((3 - 0) + 1) + 0);
            x = (int) (Math.random()*((3 - 0) + 1) + 0);

            if (dato[y][x] == 0){
                dato[y][x] = 2;
                condition = true;
            } else {
                condition = false;
            }
        } while (condition != true);

        tablero.DibujarTablero(dato);
        return dato;

    }

    public static int[][] generarNumeros(int dato[][]) {
        boolean condition = false;
        int y, x;
        do {
            y = (int) (Math.random()*((3 - 0) + 1) + 0);
            x = (int) (Math.random()*((3 - 0) + 1) + 0);

            if (dato[y][x] == 0){
                dato[y][x] = 2;
                condition = true;
            } else {
                condition = false;
            }
        } while (condition != true);

        return dato;

    }
}