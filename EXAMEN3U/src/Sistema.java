import java.util.Locale;
import java.util.Scanner;

public class Sistema {
    static Cuenta cuentas[] = new Cuenta[100];
    static Scanner t = new Scanner(System.in);

    public static void cuentaAhorro() {
        System.out.println("Nombre del titular de la cuenta de ahorro: ");
        String nombre = t.nextLine();
        System.out.println("Ingrese numero de cuenta");
        String numero_de_Cuenta = t.next();
        System.out.println("Monto inicial para la cuenta");
        double monto = t.nextDouble();
        Cuenta c = new Cuenta(nombre, numero_de_Cuenta, monto);
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] == null) {
                cuentas[i] = c;
                System.out.println("Cuenta de ahorro dada de alta".toUpperCase());
                break;
            }
        }
    }
    public static void cuentaInversion() {
        System.out.println("Nombre del titular de la cuenta de Inversion: ");
        String nombre = t.nextLine();
        System.out.println("Ingrese numero de cuenta");
        String numero_de_Cuenta = t.next();
        System.out.println("Monto inicial para la cuenta");
        double monto = t.nextDouble();
        Cuenta c = new Cuenta(nombre, numero_de_Cuenta, monto);
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] == null) {
                cuentas[i] = c;
                System.out.println("Cuenta de inversion dada de alta".toUpperCase());
                break;
            }
        }

    }

    public static void retiro() {
        System.out.println("Indique el tipo de cuenta que tiene");
        System.out.println("(1) Cuenta de ahorro");
        System.out.println("(2) Cuenta de inversion");
        int opcion=t.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Para poder realizar su retiro ingrese el nombre del titular");
                for (int i = 0; i < cuentas.length ; i++) {
                    String nombre=t.nextLine();
                    if (cuentas[i].getNombreCliente().equals(nombre) ) {

                    }
                }
                System.out.println("¿que cantidad desea retirar?");
                double cantidad=t.nextDouble();
                for (int i = 0; i < cuentas.length ; i++) {

                    if (cuentas[i].getMonto() >=1000) {


                    } else if (cuentas[i].getMonto() <= 1000) {
                        System.out.println("*Saldo insuficiente*");

                    }
                }
                break;
            case 2:
                cuentaInversion();
                System.out.println("¿que cantidad desea retirar?");
                break;
        }





    }

    public static void deposito() {

    }

    private static int buscador() {
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                return i;
            }

        }
        return 0;
    }


}
