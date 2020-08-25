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
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");

        Livro livro = new Livro();
        livro.setNome("java 8 prático");
        livro.setDescricao("novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");
        livro.setAutor(autor);
        livro.detalhesLivro();
        

        Autor outroautor = new Autor();
        outroautor.setNome("Paulo Silveira");
        outroautor.setEmail("paulo.silveira@caelum.com.br");
        outroautor.setCpf("123.456.789.10");

        Livro outroLivro = new Livro();
        outroLivro.setNome("Logica de programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("978-85-66250-22-0");
        outroLivro.setAutor(outroautor);
        outroLivro.detalhesLivro();

        Livro livro3 = new Livro();
        livro3.setNome("Mundo de fanatsia");
        livro3.setDescricao("magia e ficção");
        livro3.setValor(59.90);
        livro3.setIsbn("978-85-66250-26-9");
        livro3.detalhesLivro();
    }
}
