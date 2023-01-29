package DAW.Programación.Ejercicios.programas.Trim_2.A2048_game;


public class Movimiento {


    public static int[][] movimiento(char direccion, int[][] dato, Tablero tablero) {

        switch (direccion) {
            case 'w','W':
                arriba(dato, tablero);
            break;

            case 's','S':
                abajo(dato, tablero);
            break;

            case 'd','D':
                derecha(dato, tablero);
            break;

            case 'a','A':
                izquierda(dato, tablero);
            break;
        
            default:
                System.out.println("tecla no valida");
            break;
        }
        return dato;        
    }


    /*********************************************************************/
    /*******************************ARRIBA********************************/
    /*********************************************************************/    
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
    /*********************************************************************/
    /*********************************************************************/
    /*********************************************************************/
    /*-------------------------------------------------------------------*/
    /*-------------------------------------------------------------------*/
    /*-------------------------------------------------------------------*/
    /*********************************************************************/
    /********************************ABAJO********************************/
    /*********************************************************************/
    public static int[][] abajo(int[][] dato, Tablero tablero) {
        for (int y = dato.length - 1; y >= 0; y--) {
            for (int x = dato[0].length - 1; x >= 0; x--) {
                if (dato[y][x] == 0) {
                    for (int i = y - 1; i >= 0; i--) { 
                        if (dato[i][x] != 0) {         
                            dato[y][x] = dato[i][x];   
                            dato[i][x] = 0;
                        }
                    }
                } else if(dato[y][x] != 0) {
                    for (int i = y - 1; i >= 0; i--) { 
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
    /*********************************************************************/
    /*********************************************************************/
    /*********************************************************************/
    /*-------------------------------------------------------------------*/
    /*-------------------------------------------------------------------*/
    /*-------------------------------------------------------------------*/
    /*********************************************************************/
    /******************************DERECHA********************************/
    /*********************************************************************/
    public static int[][] derecha(int[][] dato, Tablero tablero) {
        for (int y = 0; y < dato.length; y++) {
            for (int x = dato[0].length - 1; x >= 0; x--) {
                if (dato[y][x] == 0) {
                    for (int k = x - 1; k >= 0; k--) {
                        if (dato[y][k] != 0) {         
                            dato[y][x] = dato[y][k];   
                            dato[y][k] = 0;
                        }
                    }
                } else if(dato[y][x] != 0) {
                    for (int k = x - 1; k >= 0; k--) {
                        if (dato[y][k] == dato[y][x]) {         
                            dato[y][x] = dato[y][k] * 2;   
                            dato[y][k] = 0;
                        }
                    }
                }
            }
        }

        LimpiarPantalla.limpiarPantalla();
        return dato;
    }    
    /*********************************************************************/
    /*********************************************************************/
    /*********************************************************************/
    /*-------------------------------------------------------------------*/
    /*-------------------------------------------------------------------*/
    /*-------------------------------------------------------------------*/
    /*********************************************************************/
    /****************************IZQUIERDA********************************/
    /*********************************************************************/
    public static int[][] izquierda(int[][] dato, Tablero tablero) {
        for (int y = dato.length - 1; y >= 0; y--) {
            for (int x = 0; x < dato[0].length; x++) {
                if (dato[y][x] == 0) {
                    for (int k = x + 1; k < dato[0].length; k++) {
                        if (dato[y][k] != 0) {         
                            dato[y][x] = dato[y][k];   
                            dato[y][k] = 0;
                        }
                    }
                } else if(dato[y][x] != 0) {
                    for (int k = x + 1; k < dato[0].length; k++) {
                        if (dato[y][k] == dato[y][x]) {         
                            dato[y][x] = dato[y][k] * 2;   
                            dato[y][k] = 0;
                        }
                    }
                }
            }
        }

        LimpiarPantalla.limpiarPantalla();
        return dato;
    }    
    /*********************************************************************/
    /*********************************************************************/
    /*********************************************************************/
}
