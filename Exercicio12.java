/*
 A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

Entrada
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

Saída
Apresentar a mensagem "A = " seguido pelo valor da variável area, conforme exemplo abaixo,
com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double).

Exemplos de Entrada
2.00

Exemplos de Saída
A = 12.5664
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.0000");
        double raio, pi = 3.14159, area;
        System.out.println("Digite o valor do raio: ");
        raio = s.nextDouble();

        area = (raio * raio) * pi;

        System.out.println("Area = " + decimal.format(area));

    }
}
