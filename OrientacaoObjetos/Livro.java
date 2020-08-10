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
    String nomeAutor;
    String emailAutor;
    String cpfAutor;
    
    public void mostrarDetalhes() {
        String mensagem = "Mostrando detalhes do livro: ";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("--");

    }

}
