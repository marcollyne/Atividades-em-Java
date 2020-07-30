/*
Crie um algoritmo que imprima todos os números pares que forem
encontrados entre 10 números inteiros informados pelo usuário.
 */

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num[] = new int[10];

        System.out.println("Digite dez números: ");

        for (int i = 0; i < 10; i++) {
            num[i] = s.nextInt();
        }
        System.out.println(" ");
        System.out.println("Os números pares são: ");

        for (int i = 0; i < 10; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
        }
    }
}
