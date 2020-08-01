
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
        double soma1 = 0;
        double soma2 = 0;
        int i = 0;

        System.out.println("usando while");
        while (i < 35) {
            double valorDoLivro = 59.90;
            soma1 += valorDoLivro;
            i++;
        }
        System.out.println("O total em estoque é: " + df.format(soma1));

        if (soma1 < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma1 >= 2000) {
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está bom (y)");
        }

        System.out.println("");
        System.out.println("usando for");

        for (int j = 0; j < 35; j++) {
            double valorDoLivro = 59.90;
            soma2 += valorDoLivro;
        }

        System.out.println("O total em estoque é: " + df.format(soma2));

        if (soma2 < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma2 >= 2000) {
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está bom (y)");
        }
        
        
        //usando break e continue no looping
        
        System.out.println("");
        System.out.println("Usando continue");
        for (int j = 0; j < 10; j++) {
            if(j == 7){
                continue;
            }
            System.out.println(j);
        }
         System.out.println("");
         System.out.println("Usando break");
         
         for (int j = 0; j < 10; j++) {
            if(j == 7){
                break;
            }
            System.out.println(j);
        }
    }

}
