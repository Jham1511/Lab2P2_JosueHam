package lab2p2_josueham;

import java.awt.Color;
import java.util.*;
import javax.swing.JColorChooser;

public class Lab2P2_JosueHam {

    static Scanner leer = new Scanner(System.in);
    static ArrayList edificios = new ArrayList();
    static ArrayList<Usuario> usuarios = new ArrayList();
    static Usuario admin = new Usuario("Administrador", "admin", "admin1234", 20);
    static int x = 0;

    public static void main(String[] args) {
        usuarios.add(admin);
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
                    int op = 0;
                    do {
                        String opciones = "Bienvenido al menu de registro"
                                + "\n1 -> Crear Casas/Edificios/Solares(Admin Only)"
                                + "\n2 -> Listar Casas/Edificios/Solares"
                                + "\n3 -> Modificar Casas/Edificios/Solares(Admin Only)"
                                + "\n4 -> Borrar Casas/Edificios/Solares(Admin Only)"
                                + "\n5 -> Comprar Casas/Edificios/Solares"
                                + "\n6 -> Salir"
                                + "\nIngrese que opcion desea: ";
                        System.out.println(opciones);
                        op = leer.nextInt();

                        switch (op) {
                            case 1: {
                                if (x == 0) {
                                    System.out.println("Submenu para crear inmobiliaria");
                                    System.out.println("1 -> Crear Casas");
                                    System.out.println("2 -> Crear Edificios");
                                    System.out.println("3 -> Crear Solares");
                                    System.out.println("Ingrese la opcion que desea: ");
                                    int p = leer.nextInt();

                                    switch (p) {
                                        case 1: {
                                            System.out.println("Ingrese el numero de casa: ");
                                            int NumCasa = leer.nextInt();
                                            System.out.println("Ingrese el numero de Bloque: ");
                                            int bloque = leer.nextInt();
                                            System.out.println("Ingrese el numero de Baños: ");
                                            int banio = leer.nextInt();
                                            System.out.println("Ingrese el numero de cuartos: ");
                                            int cuartos = leer.nextInt();

                                            Color color = JColorChooser.showDialog(null, "Seleccione el color", Color.yellow);

                                            System.out.println("Ingrese el ancho: ");
                                            double ancho = leer.nextDouble();

                                            System.out.println("Ingrese el largo: ");
                                            double largo = leer.nextDouble();

                                            System.out.println("Ingrese el estado: ");
                                            System.out.println("Estados: Lista, En Construcción, Construcción en Espera, En Espera de Demolición");
                                            leer.nextLine();
                                            String estado = leer.next();

                                            edificios.add(new Casa(NumCasa, bloque, banio, cuartos, color, ancho, largo, estado, "N/A"));
                                        }//Fin case 1
                                        break;
                                        case 2: {
                                            System.out.println("Ingrese el numero de pisos: ");
                                            int NumPisos = leer.nextInt();
                                            System.out.println("Ingrese el numero de locales: ");
                                            int locales = leer.nextInt();

                                            System.out.println("Ingrese la direccion: ");
                                            leer.nextLine();
                                            String direccion = leer.next();

                                            System.out.println("Ingrese el estado: ");
                                            System.out.println("Estados: Lista, En Construcción, Construcción en Espera, En Espera de Demolición");
                                            leer.nextLine();
                                            String estado = leer.next();

                                            edificios.add(new Edificio(NumPisos, locales, direccion, estado, "N/A"));

                                        }//Fin case 2
                                        break;

                                        case 3: {
                                            System.out.println("Ingrese el ancho: ");
                                            double ancho = leer.nextInt();
                                            System.out.println("Ingrese el largo: ");
                                            double largo = leer.nextInt();

                                            double area = ancho*largo;
                                            
                                            edificios.add(new SolarBal(ancho,largo,area,"N/A"));
                                            
                                        }//Fin case 3
                                    }//Fin 
                                } else {
                                    System.out.println("Opcion solo disponible para el admin");
                                }//
                            }//Fin case 1
                            break;
                        }//Fin switch
                    } while (op != 6);

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
                                + "\n3 -> Log Out"
                                + "\n4 -> Salir";
                        System.out.println(men);
                        resp = leer.nextInt();

                        switch (resp) {
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
                                System.out.println("Ingrese la contraseña: ");
                                leer.nextLine();
                                String contra = leer.next();
                                System.out.println("Sesion iniciada correctamente");

                            }//Fin case 2
                            break;

                            case 3: {
                                x--;
                                System.out.println("Sesion Cerrada");
                            }//Fin case 3
                            break;

                            default:
                                System.out.println("Regresando al menu principal...");
                        }//Fin switch 
                    } while (resp != 4);
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
            if (contra.equals(lista.get(0).getPassword()) && username.equals(lista.get(0).getUser())) {
                encontrado = true;
                x = 0;
                break;
            } else {
                x++;
                encontrado = false;
            }

        }
        return encontrado;
    }//Fin del metodo para validar el log in 

}//Fin de la clase
