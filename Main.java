import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        int opcion = 0;
        double [] sismos;
        menu(salir,opcion);

    }

    public static void menu(boolean salir, int opcion) {
        Scanner sn = new Scanner(System.in);
        while (!salir) {
            System.out.println("Menu");
            System.out.println("1: Ingresar datos");
            System.out.println("2: Mostrar sismo de mayor magnitud");
            System.out.println("3: Contar sismos mayores o iguales a 5.0");
            System.out.println("4: Enviar SMS por cada sismo mayor o igual a 7.0");
            System.out.println("5: Salir");

            try {
                System.out.println("Seleccione la opcion deseada: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1 -> {
                        ingresarDatos( double[] sismos;
                    } case 2 -> {
                        buscarMayorSismo( double[] sismos;
                    } case 3 -> {
                        contarSismos( double[] sismos;
                    } case 4 -> {
                        enviarSMS( double[] sismos;
                    } case 5 -> salir = true;
                    default -> System.out.println("Las opciones son entre 1 y 5");
                }
            }
            catch(InputMismatchException e){
                System.out.println("Debes seleccionar un numero de opción");
                sn.next();
            }
        }

        System.out.println("Gracias por utilizar el sistema, hasta luego... ");
    }
    public static double[] ingresarDatos(double [] sismos){
        double valor;
        for(byte a = 0; a < sismos.length; a++) {
            valor = getRandom(0.1,9.9);
            sismos[a] = valor;
            ;
        return sismos;
        }
    public static double getRandom(double valorMinimo,double valorMaximo){
            Random rand = new Random();
            return new double[]{valorMinimo + (valorMaximo - valorMinimo) * rand.nextDouble()};
        }
}
    private static double getRandom(double v, double v1) {
        return v;
    }
}