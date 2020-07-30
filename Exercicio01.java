/*
Crie um algoritmo que controle a liberação de atendimentos preferenciais para
idosos em um banco, onde só será permitido o atendimento prioritário caso a
pessoa tenha idade maior ou igual a 60 anos. O programa deve receber a
idade de uma pessoa, e caso ela tenha idade maior ou igual a 60, então o
programa deve informar que a pessoa é idosa, e que pode receber
atendimento prioritário. Caso contrário, deve informar que a pessoa deve
aguardar na fila junto com as demais pessoas.
 */


import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age;

        System.out.println("Digite a sua idade: ");
        age = s.nextInt();
        System.out.println(" ");
        System.out.println((age >= 60) ? "Direcione - se ao atendimento prioritário." : "Aguarde na fila, por favor.");
        System.out.println(" ");
    }

}
