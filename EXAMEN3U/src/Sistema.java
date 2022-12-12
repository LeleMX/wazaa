import java.util.Scanner;

public class Sistema {
    static Ahorro cuentaAhorro[] = new Ahorro[100];
    static Inversion cuentaInversion[] = new Inversion[100];
    static Scanner t = new Scanner(System.in);

    public static void cuentaAhorro() {
        System.out.println("Nombre del titular de la cuenta de ahorro: ");
        String nombre = t.nextLine();
        System.out.println("Ingrese numero de cuenta");
        String numero_de_Cuenta = t.next();
        System.out.println("Monto inicial para la cuenta");
        double monto = t.nextDouble();
        t.nextLine();
        Ahorro c = new Ahorro(nombre, numero_de_Cuenta, monto);
        for (int i = 0; i < cuentaAhorro.length; i++) {
            if (cuentaAhorro[i] == null) {
                cuentaAhorro[i] = c;
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
        t.nextLine();
        Inversion c = new Inversion(nombre, numero_de_Cuenta, monto);
        for (int i = 0; i < cuentaInversion.length; i++) {
            if (cuentaInversion[i] == null) {
                cuentaInversion[i] = c;
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
                for (int i = 0; i < cuentaAhorro.length ; i++) {
                    if (cuentaAhorro[i] != null) {
                        if (cuentaAhorro[i].getNombreCliente().equals(nombre) ) {
                            System.out.println("INGRESE MONTO A RETIRAR");
                            double monto = t.nextDouble();
                            double saldoCuenta = cuentaAhorro[i].getMonto();
                            double saldoNuevo = saldoCuenta - monto;
                            if (saldoNuevo >= 500) {
                                cuentaAhorro[i].setMonto(saldoNuevo);
                                System.out.println("SE ACTUALIZÓ EL MONTO DE LA CUENTA");
                                System.out.println("CUENTA: " + cuentaAhorro[i].getNombreCliente() +
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
                for (int i = 0; i < cuentaInversion.length ; i++) {
                    if (cuentaInversion[i] != null) {
                        if (cuentaInversion[i].getNombreCliente().equals(nombreCuenta) ) {
                            System.out.println("INGRESE MONTO A RETIRAR");
                            double monto = t.nextDouble();
                            double saldoCuenta = cuentaInversion[i].getMonto();
                            double saldoNuevo = saldoCuenta - monto;
                            if (saldoNuevo >= 1000) {
                                cuentaInversion[i].setMonto(saldoNuevo);
                                System.out.println("SE ACTUALIZÓ EL MONTO DE LA CUENTA");
                                System.out.println("CUENTA: " + cuentaInversion[i].getNombreCliente() +
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
                for (int i = 0; i < cuentaAhorro.length ; i++) {
                    if (cuentaAhorro[i] != null) {
                        if (cuentaAhorro[i].getNombreCliente().equals(nombre) ) {
                            System.out.println("INGRESE MONTO A DEPOSITAR");
                            double monto = t.nextDouble();
                            double saldoCuenta = cuentaAhorro[i].getMonto();
                            double saldoNuevo = saldoCuenta + monto;

                            cuentaAhorro[i].setMonto(saldoNuevo);
                            System.out.println("SE ACTUALIZÓ EL MONTO DE LA CUENTA");
                            System.out.println("CUENTA: " + cuentaAhorro[i].getNombreCliente() +
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
                for (int i = 0; i < cuentaInversion.length ; i++) {
                    if (cuentaInversion[i] != null) {
                        if (cuentaInversion[i].getNombreCliente().equals(nombreCuenta) ) {
                            System.out.println("INGRESE MONTO A DEPOSITAR");
                            double monto = t.nextDouble();
                            double saldoCuenta = cuentaInversion[i].getMonto();
                            double saldoNuevo = saldoCuenta + monto;

                            cuentaInversion[i].setMonto(saldoNuevo);
                            System.out.println("SE ACTUALIZÓ EL MONTO DE LA CUENTA");
                            System.out.println("CUENTA: " + cuentaInversion[i].getNombreCliente() +
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

    private static void buscador() {
        System.out.println("Indique el tipo de cuenta que tiene: ");
        System.out.println("(1) Cuenta de ahorro");
        System.out.println("(2) Cuenta de inversion");
        int opcion = t.nextInt();
        t.nextLine();
        switch (opcion){
            case 1:
                System.out.println("INDIQUE EL NOMBRE DEL TITULAR A BUSCAR: ");
                String nombre = t.nextLine();
                for (int i = 0; i < cuentaAhorro.length ; i++) {
                    if (cuentaAhorro[i] != null) {
                        if (cuentaAhorro[i].getNombreCliente().equals(nombre) ) {
                            System.out.println("CUENTA: " + cuentaAhorro[i].getNombreCliente() +
                                    " MONTO: " + cuentaAhorro[i].getMonto() +
                                    " ");
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
                System.out.println("INDIQUE NOMBRE DE TITULAR A BUSCAR: ");
                String nombreCuenta = t.nextLine();
                for (int i = 0; i < cuentaInversion.length ; i++) {
                    if (cuentaInversion[i] != null) {
                        if (cuentaInversion[i].getNombreCliente().equals(nombreCuenta) ) {
                            System.out.println("CUENTA: " + cuentaInversion[i].getNombreCliente() +
                                    " MONTO: " + cuentaInversion[i].getMonto() +
                                    " ");
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
}
