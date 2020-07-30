

/*
Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a 
soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco
antes e depois da igualdade seguido pelo valor correspondente à soma de A e B.
 */

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner (System.in);

    int A, B, SOMA;
        
        System.out.println("Digite dois números para somar: ");
            A = s.nextInt();
            B = s.nextInt ();

            SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
    }
    
    
}
