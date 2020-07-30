/*
Crie um algoritmo que leia 6 nomes de pessoas e os armazene em um vetor
de 6 posições, imprimindo na tela o conteúdo do vetor após informado o
último nome. Troque, a seguir, o 1o elemento com o último, o 2o com o
penúltimo etc. até o 3o com o 4o elemento, imprimindo o vetor modificado na
tela ao final do algoritmo.

nomes : Ana, Rafael, Paulo, Carolina, João, Camila.
 */

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nome[] = new String[6], j;
        int k = nome.length - 1;

        System.out.println("Digite " + nome.length + " nomes: ");

        for (int i = 0; i < nome.length; i++) {
            nome[i] = s.next();
        }
        System.out.println(" ");

        for (String i : nome) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < (nome.length / 2); i++) {

            j = nome[i];
            nome[i] = nome[(k - i)];
            nome[(k - i)] = j;
        }
        System.out.println(" ");

        for (String i : nome) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

    }
}
