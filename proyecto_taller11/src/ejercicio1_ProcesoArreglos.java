/**
 * Problema 01
Generar los procedimientos y/o funciones que impriman los valor pares, 
* impares y el promedio de un arreglo bidimensional. El (los) procedimiento(s) 
* o método(s) deben ser invocados desde el método principal (quien es el único 
* responsable de gestionar las entradas/salidas); además el método debe recibir 
* como parámetro un arreglo bidimensional.
 * @author hp
 */
import java.util.Scanner;
public class ejercicio1_ProcesoArreglos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas = 0, columnas = 0;
        System.out.print("Dame el limite de filas: ");
        filas = teclado.nextInt();
        System.out.print("Dame el limite de columnas: ");
        columnas = teclado.nextInt();
        int matriz[][] = new int[filas][columnas];
        generarMatriz(matriz);
        System.out.println("Matriz generada");
        presentarMatriz(matriz);
        presentarParImparMatriz(matriz);
        presentarPromedioMatriz(matriz);
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
    public static void presentarParImparMatriz(int matriz[][]){
        System.out.println("Elementos pares de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j]%2 == 0) ? matriz[i][j] + (" ") : " ");
                /*if ((matriz[i][j]%2) == 0)
                System.out.print(matriz[i][j] + " ");*/
            }
            System.out.println("");
        }
        System.out.println("Elementos impares");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j]%2 != 0) ? matriz[i][j] + (" ") : " ");
                /*if ((matriz[i][j]%2) != 0)
                System.out.print(matriz[i][j] + " ");*/
            }
            System.out.println("");
        }
    }
    public static void presentarPromedioMatriz(int matriz[][]){
        int sumaMatriz = 0, promedioMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaMatriz += matriz[i][j];
            }
        }
        promedioMatriz = sumaMatriz / (matriz.length * matriz[0].length);
        System.out.println("Promedio matriz: " + promedioMatriz);
    }
}
/***
 * run:
 * Dame el limite de filas: 3
 * Dame el limite de columnas: 3
 * Matriz generada
 * 6 8 1 
 * 3 6 8 
 * 3 0 1 
 * Elementos pares de la matriz
 * 6 8  
 * 6 8 
 * 0  
 * Elementos impares
 *  1 
 * 3   
 * 3  1 
 * Promedio matriz: 4
 */