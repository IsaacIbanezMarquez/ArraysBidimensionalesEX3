

import java.util.Random;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        // 3. Fer un programa que llegeixi una taula bidimensional quadrada numèrica real i escrigui la seva traça. La traça és la suma dels elements de la diagonal principal.
        Scanner entrada = new Scanner(System.in);

        //primer array, amplitud
        int fila;
        System.out.println("Introduce amplitud del array");
        fila = entrada.nextInt();

        int col;
        System.out.println("Introduce amplitud del array");
        col = entrada.nextInt();

        int[][] numeros = new int[fila][col];

        // valores del primer arrray
        Random r = new Random();

        int suma = 0;

        for (int i = 0; i < fila;i++ ){
            for(int j = 0; j < col; j++){
                numeros[i][j] = r.nextInt(5);
                System.out.print(numeros[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < fila;i++ ) suma = suma + numeros[i][i];

        System.out.println("La traça es igual a "+suma);

    }
}
