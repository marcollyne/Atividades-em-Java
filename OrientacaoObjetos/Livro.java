/*
iniciando orientação a objetos com o livro Desbravando Java e Orientação a Objetos
 */
package OrientacaoObjetos;

/**
 *
 * @author karol
 */
public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    public Livro() {
    }

    public void detalhesLivro() {
        System.out.println("Mostrando detalhes do livro: ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if (this.temAutor()) {
            autor.detalhesAutor();
        }
        System.out.println("--");

    }

    public void aplicarDesconto(double porcentagem) {
        this.valor -= this.valor * porcentagem;
    }

    public boolean temAutor() {
        return this.autor != null;
    }
}
