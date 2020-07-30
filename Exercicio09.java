/*
Uma pesquisa foi realizada com um grupo de 7 alunos de uma universidade,
na qual se perguntou para cada aluno o número de vezes que utilizou o
restaurante da universidade no último mês. Construa um algoritmo que
determine:
a) O percentual de alunos que utilizaram menos que 10 vezes o restaurante;
b) O percentual de alunos que utilizaram entre 10 e 15 vezes;
c) O percentual de alunos que utilizaram o restaurante acima de 15 vezes.
Ex.: 6, 4, 12, 14, 15, 18, 20 = a) 28%; b) 42%; c) 28%
 */

import java.util.Scanner;

public class Exercicio09 {

    static int pesquisaMenor(int[] resp) {

        int qntMenor = 0;
        int percentual1;

        for (int i = 0; i < resp.length; i++) {

            if (resp[i] < 10) {
                qntMenor += 1;
            }
        }
        percentual1 = (qntMenor * 100) / resp.length;

        return percentual1;

    }

    static int pesquisaEntre(int[] resp) {

        int qntEntre = 0;
        int percentual2;

        for (int i = 0; i < resp.length; i++) {

            if (resp[i] >= 10 && resp[i] <= 15) {
                qntEntre += 1;
            }
        }
        percentual2 = (qntEntre * 100) / resp.length;

        return percentual2;

    }

    static int pesquisaMaior(int[] resp) {

        int qntMaior = 0;
        int percentual3;

        for (int i = 0; i < resp.length; i++) {

            if (resp[i] > 15) {
                qntMaior += 1;
            }
        }
        percentual3 = (qntMaior * 100) / resp.length;

        return percentual3;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int resp[] = new int[7], percentual1, percentual2, percentual3;

        for (int i = 0; i < resp.length; i++) {
            System.out.println("Digite quantas vezes você utilizou o restaurante da universidade esse mês: ");
            resp[i] = s.nextInt();

        }

        percentual1 = pesquisaMenor(resp);
        percentual2 = pesquisaEntre(resp);
        percentual3 = pesquisaMaior(resp);

        System.out.println("Percentual de menores que 10 vezes ao mês: " + percentual1 + "%");
        System.out.println("Percentual entre 10 e 15 vezes ao mês: " + percentual2 + "%");
        System.out.println("Percentual de maiores que 15 vezes ao mês: " + percentual3 + "%");
    }
}
