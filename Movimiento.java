package DAW.Programación.Ejercicios.programas.Trim_2.A2048_game;


public class Movimiento {


    public static int[][] movimiento(char direccion, int[][] dato, Tablero tablero) {

        switch (direccion) {
            case 'w':
                arriba(dato, tablero);
                break;
        
            default:
                System.out.println("tecla no valida");
                break;
        }
        return dato;        
    }
    
    public static int[][] arriba(int[][] dato, Tablero tablero) {
        for (int y = 0; y < dato.length; y++) {
            for (int x = 0; x < dato[0].length; x++) {
                if (dato[y][x] == 0) {
                    for (int i = y + 1; i < dato.length; i++) { 
                        if (dato[i][x] != 0) {         
                            dato[y][x] = dato[i][x];   
                            dato[i][x] = 0;
                        }
                    }
                } else if(dato[y][x] != 0) {
                    for (int i = y + 1; i < dato.length; i++) { 
                        if (dato[i][x] == dato[y][x]) {         
                            dato[y][x] = dato[i][x] * 2;
                            dato[i][x] = 0;
                        }
                    }
                }
            }
        }

        LimpiarPantalla.limpiarPantalla();
        return dato;
    }
}
