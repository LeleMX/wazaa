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
        int opcion = t.nextInt();
        t.nextLine();
        switch (opcion){
            case 1:
                System.out.println("Para poder realizar su retiro ingrese el nombre del titular");
                String nombre = t.nextLine();
                for (int i = 0; i < cuentas.length ; i++) {
                    if (cuentas[i] != null) {
                        if (cuentas[i].getNombreCliente().equals(nombre) ) {
                            System.out.println("INGRESE MONTO A RETIRAR");
                            double monto = t.nextDouble();
                            double saldoCuenta = cuentas[i].getMonto();
                            double saldoNuevo = saldoCuenta - monto;
                            if (saldoNuevo >= 500) {
                                cuentas[i].setMonto(saldoNuevo);
                                System.out.println("SE ACTUALIZÓ EL MONTO DE LA CUENTA");
                                System.out.println("CUENTA: " + cuentas[i].getNombreCliente() +
                                        " MONTO VIEJO: " + saldoCuenta +
                                        " MONTO NUEVO: " + saldoNuevo);
                                break;
                            } else {
                                System.out.println("SALDO INSUFICIENTE");
                                break;
                            }
                        }
                        else {

                        }
                    }
                    else {
                        System.out.println("NO SE ENCONTRÓ LA CUENTA");
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("Para poder realizar su retiro ingrese el nombre del titular");
                String nombreCuenta = t.nextLine();
                for (int i = 0; i < cuentas.length ; i++) {
                    if (cuentas[i] != null) {
                        if (cuentas[i].getNombreCliente().equals(nombreCuenta) ) {
                            System.out.println("INGRESE MONTO A RETIRAR");
                            double monto = t.nextDouble();
                            double saldoCuenta = cuentas[i].getMonto();
                            double saldoNuevo = saldoCuenta - monto;
                            if (saldoNuevo >= 1000) {
                                cuentas[i].setMonto(saldoNuevo);
                                System.out.println("SE ACTUALIZÓ EL MONTO DE LA CUENTA");
                                System.out.println("CUENTA: " + cuentas[i].getNombreCliente() +
                                        " MONTO VIEJO: " + saldoCuenta +
                                        " MONTO NUEVO: " + saldoNuevo);
                                break;
                            } else {
                                System.out.println("SALDO INSUFICIENTE");
                                break;
                            }
                        }
                        else {

                        }
                    }
                    else {
                        System.out.println("NO SE ENCONTRÓ LA CUENTA");
                        break;
                    }
                }
                break;
        }
    }

    public static void deposito() {
        System.out.println("Indique el tipo de cuenta que tiene: ");
        System.out.println("(1) Cuenta de ahorro");
        System.out.println("(2) Cuenta de inversion");
        int opcion = t.nextInt();
        t.nextLine();
        switch (opcion){
            case 1:
                System.out.println("Para poder realizar su deposito ingrese el nombre del titular");
                String nombre=t.nextLine();
                for (int i = 0; i < cuentas.length ; i++) {
                    if (cuentas[i] != null) {
                        if (cuentas[i].getNombreCliente().equals(nombre) ) {
                            System.out.println("INGRESE MONTO A DEPOSITAR");
                            double monto = t.nextDouble();
                            double saldoCuenta = cuentas[i].getMonto();
                            double saldoNuevo = saldoCuenta + monto;

                            cuentas[i].setMonto(saldoNuevo);
                            System.out.println("SE ACTUALIZÓ EL MONTO DE LA CUENTA");
                            System.out.println("CUENTA: " + cuentas[i].getNombreCliente() +
                                    " MONTO VIEJO: " + saldoCuenta +
                                    " MONTO NUEVO: " + saldoNuevo);
                            break;
                        }
                        else {

                        }
                    }
                    else {
                        System.out.println("NO SE ENCONTRÓ LA CUENTA");
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("Para poder realizar su deposito ingrese el nombre del titular: ");
                String nombreCuenta = t.nextLine();
                for (int i = 0; i < cuentas.length ; i++) {
                    if (cuentas[i] != null) {
                        if (cuentas[i].getNombreCliente().equals(nombreCuenta) ) {
                            System.out.println("INGRESE MONTO A DEPOSITAR");
                            double monto = t.nextDouble();
                            double saldoCuenta = cuentas[i].getMonto();
                            double saldoNuevo = saldoCuenta + monto;

                            cuentas[i].setMonto(saldoNuevo);
                            System.out.println("SE ACTUALIZÓ EL MONTO DE LA CUENTA");
                            System.out.println("CUENTA: " + cuentas[i].getNombreCliente() +
                                    " MONTO VIEJO: " + saldoCuenta +
                                    " MONTO NUEVO: " + saldoNuevo);
                            break;
                        }
                        else {

                        }
                    }
                    else {
                        System.out.println("NO SE ENCONTRÓ LA CUENTA");
                        break;
                    }
                }
                break;
        }
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
