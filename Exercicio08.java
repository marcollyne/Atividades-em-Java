/*
Um hotel com 40 quartos cobra R$ 100,00 por diária e mais uma taxa de
serviços. A taxa de serviços é de:

• R$ 4,00 por diária, se o número de diárias for < 15;
• R$ 3,60 por diária, se o número de diárias for = 15;
• R$ 3,00 por diária, se o número de diárias for > 15.

Construa um algoritmo que peça para o usuário informar o número de diárias
de um determinado hóspede. O valor informado deverá ser passado por
parâmetro para um método que calculará e retornará o valor total a ser pago
pelo hóspede por sua estadia. Ao final, o algoritmo deve imprimir na tela o
valor devido.
 */

import java.util.Scanner;

public class Exercicio08 {

    static double Conta(double dias) {
        double taxa = 0;
        if (dias < 15) {
            taxa = dias * (100 + 4.00);
        } else if (dias == 15) {
            taxa = dias * (100 + 3.60);
        } else if (dias > 15) {
            taxa = dias * (100 + 3.00);
        }
        return taxa;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double dias;
        System.out.println("Digite a quantidade de dias que ficou hospedado para gerar sua conta: ");
        dias = s.nextInt();

        double result = Conta(dias);

        System.out.println(" ");
        System.out.println("O valor a pagar é: " + result + " reais");
        System.out.println(" ");
    }

}
