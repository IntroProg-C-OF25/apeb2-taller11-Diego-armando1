
/**
 * Problema 04
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble.
 * Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de kilowatios del mes.
 * Y se genera en pantalla el siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10
 * En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2%
 * del valor del inmueble. Y se genera el siguiente reporte:
 * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.
 * En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se  llama al procedimiento
 * calcularPredio. Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.
 *
 * @author hp
 */
import java.util.Scanner;
public class ejercicio4_PlanillaLuz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorKilovatio, kilovatiosConsumidos, valorInmueble;
        int opcion;
        String nombre = null, cedula = null;
        System.out.println("Seleccione una opcion: ");
        System.out.println("1. Calcular el valor de la planilla de luz");
        System.out.println("2. Calcular el valor del predio");
        opcion = teclado.nextInt();
        teclado.nextLine();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese su nombre y apellido: ");
                nombre = teclado.nextLine();
                System.out.print("Ingrese su cedula de identidad: ");
                cedula = teclado.nextLine();
                System.out.print("Ingrese el valor del kilovatio: ");
                valorKilovatio = teclado.nextDouble();
                System.out.print("Ingrese el valor del kilovatio consumido por mes: ");
                kilovatiosConsumidos = teclado.nextInt();
                System.out.printf("Cliente %s con cédula %s debe cancelar el valor de %.2f\n", nombre, cedula, planillaLuz(valorKilovatio, kilovatiosConsumidos));
                break;
            case 2:
                if (nombre == null && cedula == null) {
                    System.out.print("Ingrese su nombre y apellido: ");
                    nombre = teclado.nextLine();
                    System.out.print("Ingrese su cedula de identidad: ");
                    cedula = teclado.nextLine();
                    System.out.print("Ingrese el valor del inmueble: ");
                    valorInmueble = teclado.nextDouble();
                    System.out.printf("Cliente %s con cédula %s tiene un bien inmueble valorado en $%s y tiene que pagar de predio $%.2f\n", nombre, cedula, valorInmueble, precioPredio(valorInmueble));
                    break;
                }
            default:
                System.out.println("Opcion no valida");
        }
    }
    public static double planillaLuz(double valorKilovatio, double kilovatiosConsumidos) {
        return valorKilovatio * kilovatiosConsumidos;
    }
    public static double precioPredio(double valorInmueble) {
        return valorInmueble * 0.02;
    }
}
/***
 * run:
 * Seleccione una opcion: 
 * 1. Calcular el valor de la planilla de luz
 * 2. Calcular el valor del predio
 * 1
 * Ingrese su nombre y apellido: Diego Guaman
 * Ingrese su cedula de identidad: 1950768903
 * Ingrese el valor del kilovatio: 9
 * Ingrese el valor del kilovatio consumido por mes: 3
 * Cliente Diego Guaman con c�dula 1950768903 debe cancelar el valor de 27,00
 */