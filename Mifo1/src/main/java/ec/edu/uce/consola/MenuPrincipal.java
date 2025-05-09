package ec.edu.uce.consola;
import java.util.Scanner;
public class MenuPrincipal {
    private Scanner datos = new Scanner(System.in);
  //  private Usuario[] usuarios = new Usuario[50];
    private int indiceUsuarios = 0;

    public void mostrarMenuPrincipal() {
        while (true) {
            System.out.println("***********************************************");
            System.out.println("*              MENU PRINCIPAL                 *");
            System.out.println("***********************************************");
            System.out.println("* 1. Crear Cuenta                             *");
            System.out.println("* 2. Ingresar al Sistema                      *");
            System.out.println("* 3. Salir                                    *");
            System.out.println("***********************************************");
            System.out.println("");
            System.out.print("Ingrese el número de la opción deseada: ");

            int opcion = 0;
            try {
                opcion = Integer.parseInt(datos.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    ingresarAlSistema();
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    System.out.println("Gracias por utilizar MIFO :)");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        }
    }

    private void ingresarAlSistema() {
        System.out.print("Ingrese su nombre: ");
        String nombre = datos.nextLine().trim();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = datos.nextLine().trim();

        //Usuario usuarioEncontrado = buscarUsuario(nombre, contrasena);
        /*if (usuarioEncontrado != null) {
            System.out.println("Ingreso exitoso. Bienvenido, " + nombre + "!");
            // Aquí puedes llamar al siguiente menú:
            // new MenuMifo(usuarioEncontrado).menuMifo();
        } else {
            System.out.println("Nombre o contraseña incorrectos. Inténtelo de nuevo.");
        }*/
    }

   /* private Usuario buscarUsuario(String nombre, String contrasena) {
        for (int i = 0; i < indiceUsuarios; i++) {
            Usuario u = usuarios[i];
            if (u.getNombre().equals(nombre) && u.getContrasena().equals(contrasena)) {
                return u;
            }
        }
        return null;
    }
*/
    private void crearCuenta() {
        String nombre;
        String contrasena;
        String correo;

        while (true) {
            System.out.print("Ingrese un nombre: ");
            nombre = datos.nextLine().trim();
            if (!nombre.matches("[a-zA-Z]+")) {
                System.out.println("El nombre solo puede contener letras.");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Ingrese una contraseña: ");
            contrasena = datos.nextLine().trim();
            if (!contrasena.matches("(?=.*[A-Za-z])(?=.*\\d).{8,}")) {
                System.out.println("La contraseña no cumple con los requisitos:");
                System.out.println("- Al menos una letra");
                System.out.println("- Al menos un dígito");
                System.out.println("- Mínimo 8 caracteres");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Ingrese un correo electrónico: ");
            correo = datos.nextLine().trim();
            if (!correo.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
                System.out.println("Correo no válido.");
            } else {
                break;
            }
        }

        //usuarios[indiceUsuarios++] = new Usuario(nombre, contrasena, correo);
        System.out.println("Cuenta creada exitosamente.");
    }

    public static void main(String[] args) {
        new MenuPrincipal().mostrarMenuPrincipal();
    }
}
