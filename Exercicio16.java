/*
 Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B
tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0,
sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão 
(double).

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 
dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. 
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio16 {
 
    public static void main(String[] args){
 
        Scanner s = new Scanner (System.in);
        DecimalFormat d = new DecimalFormat("0.0");
        double A, B, C, MEDIA;

            System.out.println("Digite as notas do aluno: ");
                A = s.nextDouble();
                B = s.nextDouble();
                C = s.nextDouble();

                MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;

             System.out.println("MEDIA = " + d.format(MEDIA));
 
    }
 
}