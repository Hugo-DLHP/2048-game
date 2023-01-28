package DAW.Programación.Ejercicios.programas.Trim_2.A2048_game;

public class GenerarNumeros {

    public static int[] generarPosNumeros(int dato[]) {
    for (int i = 0; i < 2; i++) {
        dato[i] = (int) (Math.random()*((3 - 0) + 1) + 0);
    }
    return dato;
    }

    public static int[][] generarNumeros(int dato[][]) {
        return dato;

    }
}