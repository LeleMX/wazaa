import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        do {
            Scanner t = new Scanner(System.in);
            System.out.println("BIENVENIDO AL SISTEMA DEL BANCO");
            System.out.println("Pulse el numero correspondiente de la opcion");
            System.out.println("1. Crear un nuevo titular de cuenta de ahorro ");
            System.out.println("2. Crear un nuevo titular de cuenta de inversion ");
            System.out.println("3. Realizar un Retiro ");
            System.out.println("4. Realizar un Deposito ");
            System.out.println("5. Salir");
            System.out.println("Ingrese el numero de la opcion a la que desea ingresar");
             opcion = t.nextInt();
            switch (opcion) {
                case 1:
                    Sistema.cuentaAhorro();
                    break;
                case 2:
                    Sistema.cuentaInversion();
                    break;
                case 3:
                    Sistema.retiro();
                    break;
                case 4:
                    Sistema.deposito();
                    break;
            }

        } while (opcion != 5);

    }

}
