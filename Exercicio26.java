
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
public class Exercicio26 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double valor;
        double rendimento;
        double valorF;

        System.out.println("Digite o valor: ");
        valor = s.nextDouble();

        rendimento = valor * 0.01;
        valorF = valor + rendimento;

        System.out.println("Valor com juros: " + valorF);
    }
}
