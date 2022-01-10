/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karol
 */
public class Exercicio25 {

    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        int c = 9;
        int d = 4;
        int e = 5;
        int f = 6;

        double m1;
        double m2;
        double m3;
        double soma;

        m1 = (a + b + c) / 3;
        m2 = (d + e + f) / 3;

        soma = m1 + m2;

        m3 = soma / 2;

        System.out.println("media 1: " + m1);
        System.out.println("media 2: " + m2);
        System.out.println("soma das medias: " + soma);
        System.out.println("media da media: " + m3);

    }
}
