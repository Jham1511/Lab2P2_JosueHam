package lab2p2_josueham;

import java.util.*;

public class Lab2P2_JosueHam {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        do {
            String menu = "----- Bienvenido al menu del programa -----"
                    + "\n1 -> Registro de Inmueble"
                    + "\n2 -> Manejo de Estados"
                    + "\n3 -> Log In/Sign Up"
                    + "\n4 -> Salir"
                    + "\nIngrese que opcion desea: ";
            System.out.println(menu);
            opcion = leer.nextInt();

            switch (opcion) {

                case 1: {
                    String opciones = "Crear Casas/Edificios/Solares\n"
                            + "\nListar Casas/Edificios/Solares\n"
                            + "\nModificar Casas/Edificios/Solares\n"
                            + "\nBorrar Casas/Edificios/Solares\n"
                            + "\nComprar Casas/Edificios/Solares"
                            + "\nIngrese que opcion desea: ";
                            System.out.println(opciones);
                            int op = leer.nextInt();
                            
                }//Fin case 1
                break;
                
            }//Fin del switch
        } while (opcion != 4);
    }//Fin del main 

}//Fin de la clase
