
import java.text.DecimalFormat;

/*
/*
 Exercicios simples de introdução de java acompanhando o livro "Desbravando Java
 e Orientação a Objetos".

 Usando loopings
 */
/**
 *
 * @author karol
 */
public class Exercicio22 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        double soma = 0;
        int i = 0;

        System.out.println("usando while");
        while (i < 35) {
            double valorDoLivro = 59.90;
            soma += valorDoLivro;
            i++;
        }
        System.out.println("O total em estoque é: " + df.format(soma));

        if (soma < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma >= 2000) {
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está bom (y)");
        }
        
        
        System.out.println("");
        System.out.println("usando for");
    }

}
