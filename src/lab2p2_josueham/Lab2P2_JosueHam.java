package lab2p2_josueham;

import java.util.*;

public class Lab2P2_JosueHam {

    static Scanner leer = new Scanner(System.in);
    static ArrayList edificios = new ArrayList();
    static ArrayList<Usuario> usuarios = new ArrayList();
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
                              System.out.println("Ingrese su nombre: ");
                              leer.nextLine();
                              String nombre = leer.next();
                              
                              System.out.println("Ingrese el nombre de usuario: ");
                              leer.nextLine();
                              String usuario = leer.next();
                              
                              System.out.println("Ingrese su contraseña: ");
                              leer.nextLine();
                              String contra = leer.next();
                              
                              System.out.println("Ingrese la edad del usuario: ");
                              int edad = leer.nextInt();
                              
                              usuarios.add(new Usuario(nombre, usuario, contra, edad));
                          }//Fin case 1
                          break;
                          
                          case 2: {
                              System.out.println("Ingrese el nombre de usuario: ");
                              leer.nextLine();
                              String user = leer.next();
                              System.out.println("Ingrese el nombre de usuario: ");
                              leer.nextLine();
                              String contra = leer.next();
                              verifUsuario(usuarios, user, contra);
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

    public static boolean verifUsuario(ArrayList<Usuario> lista, String username, String contra) {
        boolean encontrado = false;
        for (int i = 0; i < lista.size(); i++) {
            if (contra.equals(lista.get(i).getPassword()) && username.equals(lista.get(i).getUser())) {
                encontrado = true;
                break;
            } else {
                encontrado = false;
            }

        }
        return encontrado;
    }//
}//Fin de la clase
