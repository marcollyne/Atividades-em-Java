/*
iniciando orientação a objetos com o livro Desbravando Java e Orientação a Objetos
 */
package OrientacaoObjetos;

/**
 *
 * @author karol
 */
public class Livro {

    private String nome;
    private String isbn;
    private String descricao;
    private double valor;
    private Autor autor;
    private boolean impresso;

//    public Livro() {
//
//    }
    public Livro(Autor autor) {
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        this.impresso = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
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

    public boolean aplicarDesconto(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        } else if (!this.impresso && porcentagem > 0.15) {
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }

    public boolean temAutor() {
        return this.autor != null;
    }
}
