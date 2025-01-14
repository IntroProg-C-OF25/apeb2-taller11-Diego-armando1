/**
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros.
 * Si el promedio es: De 0 a 5 el promedio cualitativo es Regular
 * De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente.
 * A la función se la debe llamar desde un método principal.
 * Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 */
import java.util.Scanner;
public class ejercicio3_PromedioCualitativo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;
        System.out.print("Ingrese la nota 1: ");
        nota1 = teclado.nextDouble();
        System.out.print("Ingrese la nota 2: ");
        nota2 = teclado.nextDouble();
        System.out.print("Ingrese la nota 3: ");
        nota3 = teclado.nextDouble();
        System.out.print("Ingrese la nota 4: ");
        nota4 = teclado.nextDouble();
        System.out.println("El promedio es " + promedioCualitativo(nota1, nota2, nota3, nota4));
    }
    public static String promedioCualitativo(double nota1, double nota2, double nota3, double nota4) {
        double promedio;
        promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else 
            if (promedio > 5 && promedio <= 8) {
                return "Bueno";
        } else 
                if (promedio > 8 && promedio <= 9) {
                    return "Muy bueno";
        } else 
                    if (promedio > 9 && promedio <= 10) {
                       return "Sobresaliente";
        }
        return "Promedio fuera de rango";
    }
}
/**
 * run:
 * Ingrese la nota 1: 8
 * Ingrese la nota 2: 7
 * Ingrese la nota 3: 6
 * Ingrese la nota 4: 9
 * El promedio es Bueno
 */