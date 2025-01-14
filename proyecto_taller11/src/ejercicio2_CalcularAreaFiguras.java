/***
 * Problema 02
 * Generar una solución que implemente 3 procedimientos. Que permitan calcular el 
 * área de un cuadrado, área de un triángulo y área de un rectángulo. Cada 
 * procedimiento/función debe recibir los datos necesarios y generar el valor 
 * correspondiente. Se debe invocar a los procedimientos desde un método principal; 
 * Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama 
 * al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 */
import java.util.Scanner;
public class ejercicio2_CalcularAreaFiguras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado, alturaTri, baseTri, alturaRec, baseRec;
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = teclado.nextInt();
        System.out.println("El area del circulo es " + areaCuadrado(lado));
        System.out.print("Ingrese la altura del triangulo: ");
        alturaTri = teclado.nextInt();
        System.out.print("Ingrese la base del triangulo: ");
        baseTri = teclado.nextInt();
        System.out.println("El area del triangulo es " + areaTriangulo(alturaTri, baseTri));
        System.out.print("Ingrese la altura del rectangulo: ");
        alturaRec = teclado.nextInt();
        System.out.print("Ingrese la base del rectangulo: ");
        baseRec = teclado.nextInt();
        System.out.println("El area del rectangulo es " + areaRectangulo(alturaRec, baseRec));
    }
   public static int areaCuadrado(int lado){
       return lado * lado;
   }
   public static int areaTriangulo(int alturaTri, int baseTri){
       return (alturaTri * baseTri) / 2;
   }
   public static int areaRectangulo(int alturaRec, int baseRec){
       return alturaRec * baseRec;
   }
}
/***
 * run:
 * Ingrese el lado del cuadrado: 4
 * El area del circulo es 16
 * Ingrese la altura del triangulo: 5
 * Ingrese la base del triangulo: 4
 * El area del triangulo es 10
 * Ingrese la altura del rectangulo: 4
 * Ingrese la base del rectangulo: 6
 * El area del rectangulo es 24
 */
