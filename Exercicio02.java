/*
Crie um algoritmo que receba como entrada três valores inteiros diferentes e
os imprima em ordem crescente.
 */

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int value1, value2, value3;

        System.out.println("Digite três valores inteiros: ");
        value1 = s.nextInt();
        value2 = s.nextInt();
        value3 = s.nextInt();

        if (value1 < value2 && value1 < value3) {
            if (value2 < value3) {
                System.out.println(value1 + " " + value2 + " " + value3);
            } else if (value2 > value3) {
                System.out.println(value1 + " " + value3 + " " + value2);
            }

        }

        if (value2 < value1 && value2 < value3) {
            if (value1 < value3) {
                System.out.println(value2 + " " + value1 + " " + value3);
            } else if (value1 > value3) {
                System.out.println(value2 + " " + value3 + " " + value1);
            }
        }

        if (value3 < value1 && value3 < value2) {
            if (value1 < value2) {
                System.out.println(value3 + " " + value1 + " " + value2);
            } else if (value1 > value2) {
                System.out.println(value3 + " " + value2 + " " + value1);
            }
        }

        if (value1 == value2 && value1 == value3) {
            System.out.println("os valores são iguais");
            System.out.println(value1 + " " + value2 + " " + value3);
        }

        if (value1 == value2 && value1 < value3) {
            System.out.println(value1 + " " + value2 + " " + value3);
        }

        if (value1 == value3 && value1 < value2) {
            System.out.println(value1 + " " + value3 + " " + value2);
        }
        if (value1 == value2 && value1 > value3) {
            System.out.println(value3 + " " + value1 + " " + value2);
        }

        if (value1 == value3 && value1 > value2) {
            System.out.println(value2 + " " + value1 + " " + value3);
        }

        if (value2 == value3 && value2 > value1) {
            System.out.println(value1 + " " + value2 + " " + value3);
        }
        if (value2 == value3 && value2 < value1) {
            System.out.println(value2 + " " + value3 + " " + value1);
        }

    }
}
