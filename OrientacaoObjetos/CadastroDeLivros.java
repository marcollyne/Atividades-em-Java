/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrientacaoObjetos;

/**
 *
 * @author karol
 */
public class CadastroDeLivros {

    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.nome = "java 8 prático";
        livro.descricao = "novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";

        System.out.println("Nome: " + livro.nome);
        System.out.println("Descrição: " + livro.descricao);
        System.out.println("Valor: " + livro.valor);
        System.out.println("ISBN: " + livro.isbn);
        
        System.out.println(" ");
        Livro outroLivro = new Livro();
        
        outroLivro.nome = "Logica de programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";
        
        System.out.println("Nome: " + outroLivro.nome);
        System.out.println("Descrição: " + outroLivro.descricao);
        System.out.println("Valor: " + outroLivro.valor);
        System.out.println("ISBN: " + outroLivro.isbn);
    }
}
