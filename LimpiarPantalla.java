package DAW.Programación.Ejercicios.programas.Trim_2.A2048_game;

import java.util.ArrayList;

public class LimpiarPantalla {
/**********************************************************************************/
/*******************ESTA FUNCION LA HE ENCONTRADO EN INTERNET**********************/
/**********************************************************************************/
    public static void limpiarPantalla(){

        try {
            String sistemaOperativo = System.getProperty("os.name");
            ArrayList<String> comando= new ArrayList<>();
            if(sistemaOperativo.contains("Windows")){        
                comando.add("cmd");
                comando.add("/C");
                comando.add("cls");
                
            } else {
                comando.add("clear");
            } 
            
            ProcessBuilder pb = new ProcessBuilder(comando);
            Process iniciarProceso = pb.inheritIO().start();
            iniciarProceso.waitFor();
            
        } catch (Exception e) {
            System.out.println("Error al limpiar la pantalla"+e.getMessage());
        }
    }
/**********************************************************************************/
/**********************************************************************************/
/**********************************************************************************/
}
