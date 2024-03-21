import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        int opcion;
        menu(salir, opcion);

    }

    public static void menu(boolean salir, int opcion) {
        Scanner sn = new Scanner(System.in);
        while (!salir) {
            System.out.println("Menu");
            System.out.println("1: Ingresar datos");
            System.out.println("2: Mostrar sismo de mayor magnitud");
            System.out.println("3: Contar sismos mayores o iguales a 5.0");
            System.out.println("4: Enviar SMS por cada sismo mayor o igual a 7.0");
            System.out.println("5: Salir (S/N)");

            try {
                System.out.println("Seleccione la opcion deseada: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        ingresarDatos();
                        break;
                    case 2:
                        buscarMayorSismo(double [] sismos);
                        break;
                    case 3:
                        contarSismos(double [] sismos);
                        break;
                    case 4:
                        enviarSMS(double [] sismos);
                        break;
                    case 5:
                        salir();
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 y 5");
                }
            }
        }
    }
}