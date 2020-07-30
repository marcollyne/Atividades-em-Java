
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
total de livros do nosso estoque na livraria
*/

public class Exercicio21 {
    
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("0.00");
        double livroJava8 = 89.90;
        double livroTDD = 59.90;
        double soma = livroJava8 + livroTDD;
        double sub = livroJava8 - livroTDD;
        double mult = livroJava8 * livroTDD;
        //double div = livroJava8 / livroTDD;
        
        System.out.println("Soma: " + df.format(soma));
        System.out.println("Subtração: " + df.format(sub));
        System.out.println("Multiplicação: " + df.format(mult));
        //System.out.println("Divisão: " + df.format(div));
        
    }
        
    }
    

