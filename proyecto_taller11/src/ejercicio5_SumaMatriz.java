/***
 * Problema 05
 * Generar las funciones/métodos que devuelvan las suma, resta y multiplicación de un arreglo 
 * bidimensional cuadrado; mismo que se lo recibe como parámetro.
 * @author hp
 */
import java.util.Scanner;
public class ejercicio5_SumaMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas1, filas2, columnas1, columnas2;
        int matriz1[][] = null;
        int matriz2[][] = null;
        int suma[][] = null;
        int multiplicacion[][] = null;
        int resta[][] = null;
        while (true) {
            System.out.print("Ingrese el numero de filas de la matriz 1: ");
            filas1 = teclado.nextInt();
            System.out.print("Ingrese el numero de columnas de la matriz 1: ");
            columnas1 = teclado.nextInt();
            matriz1 = new int[filas1][columnas1];
            System.out.print("Ingrese el numero de filas de la matriz 2: ");
            filas2 = teclado.nextInt();
            System.out.print("Ingrese el numero de columnas de la matriz 2: ");
            columnas2 = teclado.nextInt();
            matriz2 = new int[filas2][columnas2];
            
            if (filas1 != filas2 || columnas1 != columnas2) {
                System.out.println("No se puede sumar o multiplicar. Las matrices deben tener las mismas dimensiones. Intente nuevamente.");
                continue;
            }
            break;
        }
        generarMatriz(matriz1);
        System.out.println("Matriz 1 generada");
        presentarMatriz(matriz1);
        generarMatriz(matriz2);
        System.out.println("Matriz 2 generada");
        presentarMatriz(matriz2);
        suma = generarSuma(matriz1, matriz2);
        System.out.println("La suma de matrices");
        presentarMatriz(suma);
        multiplicacion = generarMultiplicacion(matriz1, matriz2);
        System.out.println("La multiplicacion de matrices");
        presentarMatriz(multiplicacion);
        resta = generarResta(matriz1, matriz2);
        System.out.println("La resta de matrices");
        presentarMatriz(resta);
    }
    public static void generarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static void presentarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int[][] generarSuma(int matriz1[][], int matriz2[][]){
        int suma[][] = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return suma;
    }
    public static int[][] generarMultiplicacion(int matriz1[][], int matriz2[][]){
        int [][] multiplicacion = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                multiplicacion[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        return multiplicacion;
    }
    public static int[][] generarResta(int matriz1[][], int matriz2[][]){
        int resta[][] = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                resta[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return resta;
    }
}
/***
 * run:
 * Ingrese el numero de filas de la matriz 1: 3
 * Ingrese el numero de columnas de la matriz 1: 3
 * Ingrese el numero de filas de la matriz 2: 3
 * Ingrese el numero de columnas de la matriz 2: 3
 * Matriz 1 generada
 * 7 1 9 
 * 1 9 0 
 * 6 0 1 
 * Matriz 2 generada
 * 6 9 1 
 * 2 3 2 
 * 9 9 5 
 * La suma de matrices
 * 13 10 10 
 * 3 12 2 
 * 15 9 6 
 * La multiplicacion de matrices
 * 42 9 9 
 * 2 27 0 
 * 54 0 5 
 * La resta de matrices
 * 1 -8 8 
 * -1 6 -2 
 * -3 -9 -4 
 */