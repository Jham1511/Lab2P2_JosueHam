package lab2p2_josueham;

import java.awt.Color;
import java.util.*;
import javax.swing.JColorChooser;

public class Lab2P2_JosueHam {

    static Scanner leer = new Scanner(System.in);
    static ArrayList edificios = new ArrayList();
    static ArrayList<Usuario> usuarios = new ArrayList();
    static Usuario admin = new Usuario("Administrador", "admin", "admin1234", 20);
    static int x;

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
                                    System.out.println("4 -> Salir");
                                    System.out.println("Ingrese la opcion que desea: ");
                                    int p = leer.nextInt();

                                    switch (p) {
                                        case 1: { //Agregar
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

                                            double area = ancho * largo;

                                            edificios.add(new SolarBal(ancho, largo, area, "N/A"));

                                        }//Fin case 3

                                        default:
                                            System.out.println("Regresando al menu principal...");
                                    }//Fin switch
                                } else {
                                    System.out.println("Opcion solo disponible para el administrador");
                                }//
                            }//Fin case 1 de agregar
                            break;

                            case 2: { //Listar
                                System.out.println("Submenu para listar inmobiliaria");
                                System.out.println("1 -> Listar Casas");
                                System.out.println("2 -> Listar Edificios");
                                System.out.println("3 -> Listar Solares");
                                System.out.println("4 -> Salir");
                                System.out.println("Ingrese la opcion que desea: ");
                                int p = leer.nextInt();

                                switch (p) {
                                    case 1: {
                                        String cadena = "";
                                        for (Object o : edificios) {
                                            if (o instanceof Casa) {
                                                cadena += edificios.indexOf(o) + "- " + o + "\n";
                                            }
                                        }
                                        System.out.println(cadena);
                                    }//Fin case 1
                                    break;

                                    case 2: {
                                        String cadena = "";
                                        for (Object o : edificios) {
                                            if (o instanceof Edificio) {
                                                cadena += edificios.indexOf(o) + "- " + o + "\n";
                                            }
                                        }
                                        System.out.println(cadena);
                                    }//Fin case 2
                                    break;

                                    case 3: {
                                        String cadena = "";
                                        for (Object o : edificios) {
                                            if (o instanceof SolarBal) {
                                                cadena += edificios.indexOf(o) + "- " + o + "\n";
                                            }
                                        }
                                        System.out.println(cadena);
                                    }//Fin case 3
                                    break;

                                    default:
                                        System.out.println("Regresando...");

                                }//Fin switch
                            }//Fin case 2 menu de registro
                            break;

                            case 3: {
                                if (x == 0) {
                                    System.out.println("Submenu para modificar inmobiliaria");
                                    System.out.println("1 -> Modificar Casas");
                                    System.out.println("2 -> Modificar Edificios");
                                    System.out.println("3 -> Modificar Solares");
                                    System.out.println("4 -> Salir");
                                    System.out.println("Ingrese la opcion que desea: ");
                                    int p = leer.nextInt();

                                    switch (p) {
                                        case 1: {
                                            System.out.println("Ingrese la posicion que desea modificar");
                                            int pos = leer.nextInt();

                                            if (pos >= 0 && pos <= edificios.size()) {
                                                if (edificios.get(pos) instanceof Casa) {

                                                    System.out.println("Submenu para modificar casas");
                                                    System.out.println("1 -> Numero de Casa");
                                                    System.out.println("2 -> Numero de Bloque");
                                                    System.out.println("3 -> Numero de Baños");
                                                    System.out.println("4 -> Numero de Cuartos");
                                                    System.out.println("5 -> Color");
                                                    System.out.println("6 -> Ancho");
                                                    System.out.println("7 -> Largo");
                                                    System.out.println("8 -> Salir");
                                                    System.out.println("Ingrese la opcion que desea: ");
                                                    int respuesta = leer.nextInt();
                                                    switch (respuesta) {
                                                        case 1: {
                                                            System.out.println("Ingrese el nuevo numero de casa: ");
                                                            int casa = leer.nextInt();

                                                            ((Casa) edificios.get(pos)).setNumCasa(casa);
                                                        }//Fin case 1
                                                        break;

                                                        case 2: {
                                                            System.out.println("Ingrese el nuevo numero de bloque: ");
                                                            int bloque = leer.nextInt();

                                                            ((Casa) edificios.get(pos)).setNumBloque(bloque);
                                                        }
                                                        break;

                                                        case 3: {
                                                            System.out.println("Ingrese el nuevo numero de baños: ");
                                                            int bans = leer.nextInt();

                                                            ((Casa) edificios.get(pos)).setNumBloque(bans);
                                                        }//Fin case 3
                                                        break;

                                                        case 4: {
                                                            System.out.println("Ingrese el nuevo numero de cuartos: ");
                                                            int cuartos = leer.nextInt();

                                                            ((Casa) edificios.get(pos)).setNumBloque(cuartos);
                                                        }//
                                                        break;

                                                        case 5: {
                                                            System.out.println("Ingrese el nuevo color: ");
                                                            Color nue = JColorChooser.showDialog(null, "Seleccione el color nuevo", Color.yellow);

                                                            ((Casa) edificios.get(pos)).setColor(nue);
                                                        }//
                                                        break;

                                                        case 6: {
                                                            System.out.println("Ingrese el nuevo numero de bloque: ");
                                                            double anch = leer.nextInt();

                                                            ((Casa) edificios.get(pos)).setAncho(anch);
                                                        }// 
                                                        break;

                                                        case 7: {
                                                            System.out.println("Ingrese el nuevo numero de bloque: ");
                                                            double larg = leer.nextInt();

                                                            ((Casa) edificios.get(pos)).setLargo(larg);
                                                        }//fin case 7

                                                        default:
                                                            System.out.println("Regresando...");
                                                            break;
                                                    }//Fin switch
                                                } else {
                                                    System.out.println("\nEl edificio en el indice ingresado no es valido.\n");
                                                }
                                            } else {
                                                System.out.println("\nIndice invalido.\n");
                                            }

                                        }//Fin case modif casas
                                        break;

                                        case 2: {
                                            System.out.println("Ingrese la posicion que desea modificar");
                                            int pos = leer.nextInt();

                                            if (pos >= 0 && pos <= edificios.size()) {
                                                if (edificios.get(pos) instanceof Casa) {

                                                    System.out.println("Submenu para modificar casas");
                                                    System.out.println("1 -> Numero de Casa");
                                                    System.out.println("2 -> Numero de Locales");
                                                    System.out.println("3 -> Direccion");
                                                    System.out.println("4 -> Salir");
                                                    System.out.println("Ingrese la opcion que desea: ");
                                                    int respuesta = leer.nextInt();
                                                    switch (respuesta) {
                                                        case 1: {
                                                            System.out.println("Ingrese el nuevo numero de pisos: ");
                                                            int pisos = leer.nextInt();

                                                            ((Edificio) edificios.get(pos)).setNumPisos(pisos);
                                                        }//Fin case 1
                                                        break;

                                                        case 2: {
                                                            System.out.println("Ingrese el nuevo numero de pisos: ");
                                                            int pisos = leer.nextInt();

                                                            ((Edificio) edificios.get(pos)).setNumPisos(pisos);
                                                        }
                                                        break;

                                                        case 3: {
                                                            System.out.println("Ingrese el nuevo numero de baños: ");
                                                            String direc = leer.next();

                                                            ((Edificio) edificios.get(pos)).setDireccion(direc);
                                                        }//Fin case 3
                                                        break;

                                                        default:
                                                            System.out.println("Regresando...");
                                                    }//Fin switch
                                                } else {
                                                    System.out.println("\nEl edificio en el indice ingresado no es valido.\n");
                                                }
                                            } else {
                                                System.out.println("\nIndice invalido.\n");
                                            }
                                        }//Fin case modif edificios
                                        break;

                                        case 3: {
                                            System.out.println("Ingrese la posicion que desea modificar");
                                            int pos = leer.nextInt();

                                            if (pos >= 0 && pos <= edificios.size()) {
                                                if (edificios.get(pos) instanceof Casa) {

                                                    System.out.println("Submenu para modificar casas");
                                                    System.out.println("1 -> Ancho");
                                                    System.out.println("2 -> Largo");
                                                    System.out.println("3 -> Salir");
                                                    System.out.println("Ingrese la opcion que desea: ");
                                                    int respuesta = leer.nextInt();
                                                    switch (respuesta) {
                                                        case 1: {
                                                            System.out.println("Ingrese el nuevo numero de pisos: ");
                                                            double ancho = leer.nextDouble();

                                                            ((SolarBal) edificios.get(pos)).setAncho(ancho);
                                                            
                                                        }//Fin case 1
                                                        break;

                                                        case 2: {
                                                            System.out.println("Ingrese el nuevo numero de pisos: ");
                                                            double largo = leer.nextDouble();

                                                            ((SolarBal) edificios.get(pos)).setLargo(largo);
                                                        }
                                                        break;
                                                        

                                                        default:
                                                            System.out.println("Regresando...");
                                                    }//Fin switch
                                                } else {
                                                    System.out.println("\nEl edificio en el indice ingresado no es valido.\n");
                                                }
                                            } else {
                                                System.out.println("\nIndice invalido.\n");
                                            }
                                        }//Fin case modif solares
                                        break;

                                        default:
                                            System.out.println("Regresando...");
                                    }//Fin switch

                                } else {
                                    System.out.println("Opcion solo valida para el administrador");
                                }

                            }//Fin case 3 menu de registro
                            break;

                            case 4: { //Borrar
                                if (x == 0) {
                                    System.out.println("Submenu para borrar inmobiliaria");
                                    System.out.println("1 -> Borrar Casas");
                                    System.out.println("2 -> Borrar Edificios");
                                    System.out.println("3 -> Borrar Solares");
                                    System.out.println("4 -> Salir");
                                    System.out.println("Ingrese la opcion que desea: ");
                                    int p = leer.nextInt();

                                    switch (p) {

                                        case 1: {
                                            System.out.println("Ingrese la posicion que desea eliminar: ");
                                            int pos = leer.nextInt();

                                            if (pos >= 0 && pos <= edificios.size()) {
                                                if (edificios.get(pos) instanceof Casa) {
                                                    edificios.remove(pos);
                                                } else {
                                                    System.out.println("\nEl edificio en el indice ingresado no es una casa.\n");
                                                }
                                            } else {
                                                System.out.println("\nIndice invalido.\n");
                                            }
                                            System.out.println("Casa eliminada exitosamente");

                                        }//Fin case 1 borrar casas
                                        break;

                                        case 2: {
                                            System.out.println("Ingrese la posicion que desea eliminar: ");
                                            int pos = leer.nextInt();

                                            if (pos >= 0 && pos <= edificios.size()) {
                                                if (edificios.get(pos) instanceof Edificio) {
                                                    edificios.remove(pos);
                                                } else {
                                                    System.out.println("\nEl edificio en el indice ingresado no es valido.\n");
                                                }
                                            } else {
                                                System.out.println("\nIndice invalido.\n");
                                            }
                                            System.out.println("Edificio eliminada exitosamente");
                                        }//Fin case 2 borrar edificios
                                        break;

                                        case 3: {
                                            System.out.println("Ingrese la posicion que desea eliminar: ");
                                            int pos = leer.nextInt();

                                            if (pos >= 0 && pos <= edificios.size()) {
                                                if (edificios.get(pos) instanceof SolarBal) {
                                                    edificios.remove(pos);
                                                } else {
                                                    System.out.println("\nEl edificio en el indice ingresado no es un Solar Baldio.\n");
                                                }
                                            } else {
                                                System.out.println("\nIndice invalido.\n");
                                            }
                                            System.out.println("Solar Baldio eliminada exitosamente");
                                        }//Fin case 3 borrar solares
                                        break;

                                        default:
                                            System.out.println("Regresando al menu anterior...");
                                    }//Fin del switch 
                                } else {
                                    System.out.println("Opcion solo valida para el administrador");
                                }//Fin else 
                            }//Fin case 4 menu de registro
                            break;

                            case 5: { //Comprar
                                System.out.println("Submenu para comprar inmobiliaria");
                                System.out.println("1 -> Comprar Casas");
                                System.out.println("2 -> Comprar Edificios");
                                System.out.println("3 -> Comprar Solares");
                                System.out.println("4 -> Salir");
                                System.out.println("Ingrese la opcion que desea: ");
                                int p = leer.nextInt();

                                switch (p) {
                                    case 1: {
                                        System.out.println("Ingrese la posicion que desea comprar: ");
                                        int pos = leer.nextInt();

                                        if (pos >= 0 && pos <= edificios.size()) {
                                            if (edificios.get(pos) instanceof Casa) {
                                                System.out.println("Ingrese el nuevo dueño: ");
                                                leer.nextLine();
                                                String due = leer.next();

                                                ((Casa) edificios.get(pos)).setDueno(due);
                                                ((Casa) edificios.get(pos)).setEstado("Casa Comprada");
                                                System.out.println("Compra exitosa");
                                            } else {
                                                System.out.println("\nEl edificio en el indice ingresado no es un Solar Baldio.\n");
                                            }
                                        } else {
                                            System.out.println("\nIndice invalido.\n");
                                        }
                                    }//Fin case 1 comprar casas
                                    break;

                                    case 2: {
                                        System.out.println("Ingrese la posicion que desea comprar: ");
                                        int pos = leer.nextInt();

                                        if (pos >= 0 && pos <= edificios.size()) {
                                            if (edificios.get(pos) instanceof Edificio) {
                                                System.out.println("Ingrese el nuevo dueño: ");
                                                leer.nextLine();
                                                String due = leer.next();

                                                ((Edificio) edificios.get(pos)).setDueno(due);
                                                ((Edificio) edificios.get(pos)).setEstado("Edificio Comprado");
                                                System.out.println("Compra exitosa");

                                            } else {
                                                System.out.println("\nEl edificio en el indice ingresado no es un Solar Baldio.\n");
                                            }
                                        } else {
                                            System.out.println("\nIndice invalido.\n");
                                        }
                                    }//Fin case 2 comprar edificios
                                    break;

                                    case 3: {
                                        System.out.println("Ingrese la posicion que desea comprar: ");
                                        int pos = leer.nextInt();

                                        if (pos >= 0 && pos <= edificios.size()) {
                                            if (edificios.get(pos) instanceof SolarBal) {
                                                System.out.println("Ingrese el nuevo dueño: ");
                                                leer.nextLine();
                                                String due = leer.next();

                                                ((SolarBal) edificios.get(pos)).setDueno(due);

                                                System.out.println("Compra exitosa");
                                            } else {
                                                System.out.println("\nEl edificio en el indice ingresado no es un Solar Baldio.\n");
                                            }
                                        } else {
                                            System.out.println("\nIndice invalido.\n");
                                        }

                                    }//Fin case 3 comprar solarbaldio
                                    break;

                                    default:
                                        System.out.println("Regresando...");
                                }//Fin switch de comprar 
                            }//Fin case 5 menu de registro
                            break;

                        }//Fin switch
                    } while (op != 6);

                }//Fin case 1
                break;

                case 2: {
                    System.out.println("Bienvenido al menu para modificar estados");
                    System.out.println("\n1 -> Modificar Estados Casas"
                            + "\n2 -> Modificar Estados Edificios (Admin Only)"
                            + "\n3 -> Salir"
                            + "\nIngrese que opcion desea: ");

                    int p = leer.nextInt();

                    switch (p) {
                        case 1: {
                            System.out.println("Ingrese la posicion que desea modificar el estado: ");
                            int pos = leer.nextInt();

                            if (pos >= 0 && pos <= edificios.size()) {
                                if (edificios.get(pos) instanceof Casa) {
                                    System.out.println("Ingrese el nuevo estado: ");
                                    System.out.println("Estados: Lista, En Construcción, Construcción en Espera, En Espera de Demolición");
                                    leer.nextLine();
                                    String state = leer.next();

                                    ((Casa) edificios.get(pos)).setEstado(state);

                                    System.out.println("Compra exitosa");
                                } else {
                                    System.out.println("\nEl edificio en el indice ingresado no es un Solar Baldio.\n");
                                }
                            } else {
                                System.out.println("\nIndice invalido.\n");
                            }
                        }//Fin case 1
                        break;

                        case 2: {
                            System.out.println("Ingrese la posicion que desea modificar el estado: ");
                            int pos = leer.nextInt();

                            if (pos >= 0 && pos <= edificios.size()) {
                                if (edificios.get(pos) instanceof Casa) {
                                    System.out.println("Ingrese el nuevo estado: ");
                                    System.out.println("Estados: Lista, En Construcción, Construcción en Espera, En Espera de Demolición");
                                    leer.nextLine();
                                    String state = leer.next();

                                    ((Edificio) edificios.get(pos)).setEstado(state);

                                    System.out.println("Compra exitosa");
                                } else {
                                    System.out.println("\nEl edificio en el indice ingresado no es un Solar Baldio.\n");
                                }
                            } else {
                                System.out.println("\nIndice invalido.\n");
                            }
                        }//Case 2
                        break;

                        default:
                            System.out.println("Regresando...");
                    }
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

                                verifUsuario(usuarios, user, contra);
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
