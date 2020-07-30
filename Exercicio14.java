/*
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores
e atribua esta operação à variável PROD. A seguir mostre a variável PROD com 
mensagem correspondente.   

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um 
espaço em branco antes e depois da igualdade.
 */

import java.util.Scanner;

public class Exercicio14{
 
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        int A, B, PROD;
        
        System.out.println("Digite dois números para multiplicar: ");
            A = s.nextInt();
            B = s.nextInt ();

            PROD = A * B;

        System.out.println("PROD = " + PROD);
    
        
    }
 
}