/*
Crie um algoritmo que leia um conjunto de números inteiros (X) e imprima
sua soma e sua média. A cada número informado, peça para o usuário se ele
deseja informar outro número ou finalizar a execução mostrando os valores
da soma e média dos números informados.
 */

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double media;
        int num, soma = 0, quant = 0;
        char resp = 's';

        while (resp == 's') {
            System.out.println("Digite um número para somar: ");
            num = s.nextInt();
            quant = quant + 1;
            soma = soma + num;
            System.out.println("Deseja continuar somando? s/n");
            resp = s.next().charAt(0);
        }
        media = soma / quant;

        System.out.println("Dos números informados a soma é: " + soma + " e a media é: " + media);

    }
}
