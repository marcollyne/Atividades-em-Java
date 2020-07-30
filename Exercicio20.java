/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor 
unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor 
unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem, lembrando de deixar um espaço após os dois pontos
e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.


 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String valores1, valores2;
        double total, valor1, valor2;
        int quantidade1, quantidade2;

        System.out.println("Digite o codigo do produto, quantidade de produtos e "
                + "o valor unitário: ");
        valores1 = s.nextLine();
        System.out.println("Digite o codigo do produto, quantidade de produtos e "
                + "o valor unitário: ");
        valores2 = s.nextLine();

        String arrayvalores1[] = valores1.split(" ");
        String arrayvalores2[] = valores2.split(" ");

       // codigo1 = Integer.parseInt(arrayvalores1[0]);
        quantidade1 = Integer.parseInt(arrayvalores1[1]);
        valor1 = Double.parseDouble(arrayvalores1[2]);

        //codigo2 = Integer.parseInt(arrayvalores2[0]);
        quantidade2 = Integer.parseInt(arrayvalores2[1]);
        valor2 = Double.parseDouble(arrayvalores2[2]);

        total = (quantidade1 * valor1) + (quantidade2 * valor2);

        System.out.println("VALOR A PAGAR: R$ " + df.format(total));
    }
}
