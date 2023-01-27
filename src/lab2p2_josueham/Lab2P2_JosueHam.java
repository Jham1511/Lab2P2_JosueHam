package lab2p2_josueham;

import java.util.*;

public class Lab2P2_JosueHam {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<Usuario> usuarios = new ArrayList();
        ArrayList edificios = new ArrayList();

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
                            + "\nListar Casas/Edificios/Solares"
                            + "\nModificar Casas/Edificios/Solares"
                            + "\nBorrar Casas/Edificios/Solares"
                            + "\nComprar Casas/Edificios/Solares"
                            + "\nIngrese que opcion desea: ";
                    System.out.println(opciones);
                    int op = leer.nextInt();

                }//Fin case 1
                break;

                case 2: {

                }//Fin case 2
                break;

                case 3: {
                    int resp = 0;
                    do {
                        String men = "Bienvenido al menu de usuarios"
                                + "\n1 -> Crear Usuario"
                                + "\n2 -> Iniciar Sesion"
                                + "\n3 -> Salir";
                        System.out.println(men);
                        resp = leer.nextInt();

                      switch (resp){
                          case 1: {
                              
                          }//Fin case 1
                          break;
                          
                          case 2: {
                              
                          }//Fin case 2
                          break;
                          
                          default:
                              System.out.println("Regresando al menu principal...");
                      }//Fin switch 
                    } while (resp != 3);
                }//Fin case 3
                break;

                default:
                    System.out.println("Saliendo...");

            }//Fin del switch
        } while (opcion != 4);
    }//Fin del main 

    public boolean verifUsuario(ArrayList<Usuario> lista, String username, String contra) {
        boolean esta = false;
        for (int i = 0; i < lista.size(); i++) {
            if (contra.equals(lista.get(i).getPassword()) && username.equals(lista.get(i).getUser())) {
                esta = true;
            } else {
                esta = false;
            }

        }
        return esta;
    }//
}//Fin de la clase
