/*Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A 
e B atribuindo o seu resultado na variável X.

Entrada
A entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo 
final de linha. Cuide para que tenha um espaço antes e depois do sinal de igualdade.
 */

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int A = 0, B = 0, X, key;
        

        do {
            try {
                key = 0;
                System.out.println("Digite o 1º valor: ");
                A = s.nextInt();

            } catch (Exception e) {System.out.println("Ação inválida, digite um número inteiro: "); key = 1; s.nextLine();}
        } while (key != 0);

        do {
            try {
                key = 0;
                System.out.println("Digite o 2º valor: ");
                B = s.nextInt();

            } catch (Exception e){System.out.println("Ação inválida, digite um número inteiro: "); key = 1; s.nextLine();}
        } while (key != 0);

        X = A + B;

        System.out.println("X = " + X);
    }

}
