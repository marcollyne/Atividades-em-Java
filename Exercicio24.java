
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author karol
 */
public class Exercicio24 {

    public static void main(String[] args) {
        int n;
        int a;
        int ss;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        n = s.nextInt();
        a = n - 1;
        ss = n + 1;
        System.out.println("Antecessor: " + a);
        System.out.println("Número: " + n);
        System.out.println("Sucessor: " + ss);
    }
}
