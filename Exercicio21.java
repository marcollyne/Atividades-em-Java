
import java.text.DecimalFormat;

/*
 Exercicios simples de introdução de java acompanhando o livro "Desbravando Java
 e Orientação a Objetos".
 */
/**
 *
 * @author karol
 */

/*2.2 Declaração e atribuição de variáveis
Vamos criar uma nova classe Java cujo objetivo será calcular o valor
total de livros do nosso estoque na livraria usando as operações de soma, 
subtração, multiplicação e divisão.
 */
public class Exercicio21 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        double livroJava8 = 89.90;
        double livroTDD = 59.90;
        double soma = livroJava8 + livroTDD;
        double sub = livroJava8 - livroTDD;
        double mult = livroJava8 * livroTDD;
        double div = livroJava8 / livroTDD;

        System.out.println("Soma: " + df.format(soma));
        System.out.println("Subtração: " + df.format(sub));
        System.out.println("Multiplicação: " + df.format(mult));
        System.out.println("Divisão: " + df.format(div));

        if (soma < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma >= 2000) {
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está bom (y)");
        }
    }

    //operador ternario
    /*
    double valor = v1 > v2 ? 100 : 0;
     */
}
