/*
Crie uma função que receba uma matriz como parâmetro e retorne o menor elemento
da sua diagonal secundária.
 */

import java.util.Scanner;

public class Exercicio07 {

    static int menor_valor(int matriz[][]) {
        int j = 0;
        int menor = matriz[matriz.length - 1][j];

        for (int i = matriz.length - 1; i >= 0; i--) {

            if (menor > matriz[i][j]) {
                menor = matriz[i][j];
            }
            j++;
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("Digite números pra preencher o quadro: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = s.nextInt();
            }
        }

        System.out.println("Menor elemento da diagonal secundária: " + (menor_valor(matriz)));
    }
}
