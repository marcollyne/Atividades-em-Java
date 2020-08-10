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

        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789.10";

        Livro livro = new Livro();
        livro.nome = "java 8 prático";
        livro.descricao = "novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";
        livro.autor = autor;
        livro.detalhesLivro();

        Autor outroautor = new Autor();
        outroautor.nome = "Paulo Silveira";
        outroautor.email = "paulo.silveira@caelum.com.br";
        outroautor.cpf = "123.456.789.10";

        Livro outroLivro = new Livro();
        outroLivro.nome = "Logica de programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";
        outroLivro.autor = outroautor;
        outroLivro.detalhesLivro();

    }
}
