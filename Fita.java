package QuestoesPOO;
public class Fita {
    private String titulo;
    private int preco;

    public Fita(String titulo, int preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPreco() {
        return preco;
    }

    public int getValorAluguel(int numeroDiasAlugado) {
        return preco * numeroDiasAlugado;
    }

    public String toString() {
        return String.format("Titulo: %S, Preco: %d", titulo, preco);
    }
}
