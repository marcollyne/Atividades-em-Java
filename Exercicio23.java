

/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de
Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente
“Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem 
"Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 
dígitos após o ponto.
 */
/**
 *
 * @author karol
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        double A, B, C, delta, r1 = 0, r2 = 0;

        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");

        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();

        delta = (B * B) - (4 * A * C);

        
        if (delta < 0 || A == 0){
            System.out.println("Impossivel calcular");
           
        } else {
            r1 = (-B + (Math.sqrt(delta))) / (2 * A);
            r2 = (-B - (Math.sqrt(delta))) / (2 * A);
            
            System.out.println("R1 = " + df.format(r1));
            System.out.println("R2 = " + df.format(r2));
        }
    }
}
