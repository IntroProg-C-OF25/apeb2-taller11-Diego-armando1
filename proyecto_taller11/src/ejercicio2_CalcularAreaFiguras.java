
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
