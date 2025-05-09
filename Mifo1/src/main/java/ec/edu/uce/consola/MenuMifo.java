package ec.edu.uce.consola;
import java.util.Scanner;
public class MenuMifo {
    private Scanner datos = new Scanner(System.in);
    /*private SubMenuIngresarSistema subMenuIngresarSistema;
    private SubMenuGestionarMovimiento subMenuGestionarMovimiento;
    private SubMenuGestionarObjetivosFinancieros subMenuGestionarObjetivosFinancieros;
    private SubMenuGestionarEducacionFinanciera subMenuGestionarEducacionFinanciera;
    private SubMenuGestionarPresupuesto subMenuGestionarPresupuesto;
    private Usuario usuario;

    public MenuMifo(Usuario usuario) throws FinFitException.MovimientoInvalidoException {
        this.usuario = usuario;
        this.subMenuIngresarSistema = new SubMenuIngresarSistema(usuario);
        this.subMenuGestionarObjetivosFinancieros = new SubMenuGestionarObjetivosFinancieros();
        this.subMenuGestionarEducacionFinanciera = new SubMenuGestionarEducacionFinanciera();
        this.subMenuGestionarPresupuesto = new SubMenuGestionarPresupuesto(datos);
        this.subMenuGestionarMovimiento = new SubMenuGestionarMovimiento(usuario);
        menuMifo();
    }
    */

    public void menuMifo() {
        int opcion = 0;
        do {
            mostrarMenuMifo();
            while (!datos.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                datos.next();
                mostrarMenuMifo();
            }
            opcion = datos.nextInt();
            procesarOpcionMenuMifo(opcion);
        } while (opcion != 6);
    }

    private void mostrarMenuMifo() {
        System.out.println("");
        System.out.println("******************************************");
        System.out.println("*                 MIFO                   *");
        System.out.println("*          Mis Finanzas Foráneas         *");
        System.out.println("*          BIENVENIDO AL MENU            *");
        System.out.println("******************************************");
        System.out.println("*                                        *");
        System.out.println("*  1. Ingresar al Sistema                *");
        System.out.println("*  2. Gestionar Presupuesto              *");
        System.out.println("*  3. Gestionar Educación Financiera     *");
        System.out.println("*  4. Gestionar Objetivos Financieros    *");
        System.out.println("*  5. Gestionar Movimiento               *");
        System.out.println("*  6. Salir                              *");
        System.out.println("*                                        *");
        System.out.println("******************************************");
        System.out.println("");
        System.out.print("Ingrese la opción que desee: ");
    }

    private void procesarOpcionMenuMifo(int opcion) {
        switch (opcion) {
            case 1:
                // subMenuIngresarSistema.menuIngresarSistema();
                System.out.println("Ingresando al sistema...");
                break;
            case 2:
                // subMenuGestionarPresupuesto.menuGestionarPresupuesto(usuario);
                System.out.println("Gestionando presupuesto...");
                break;
            case 3:
                // subMenuGestionarEducacionFinanciera.menuGestionarEducacionFinanciera();
                System.out.println("Educación financiera...");
                break;
            case 4:
                // subMenuGestionarObjetivosFinancieros.menuGestionarObjetivosFinancieros();
                System.out.println("Gestionando objetivos financieros...");
                break;
            case 5:
                // subMenuGestionarMovimiento.menuGestionarMovimiento();
                System.out.println("Gestionando movimientos...");
                break;
            case 6:
                System.out.println("\nSaliendo del programa.");
                System.out.println("------------------------------------");
                System.out.println("Gracias por utilizar Mifo :)");
                break;
            default:
                System.out.println("¡Error! Opción no válida. Inténtalo de nuevo.");
                break;
        }
    }

    /*
    public static void main(String[] args) throws FinFitException.MovimientoInvalidoException {
        Usuario usuario = new Usuario("usuario", "contraseña", "correo", 0);
        new MenuMifo(usuario);
    }
    */
}
