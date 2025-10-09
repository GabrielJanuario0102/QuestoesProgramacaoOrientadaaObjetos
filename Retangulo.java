package QuestoesPOO;
public class Retangulo {
    int comprimento;
    int largura;

    public Retangulo(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int calcularArea(int comprimento, int largura) {
        return comprimento * largura;
    }

    public int calcularPerimetro(int comprimento, int largura) {
        return (2*comprimento) + (2*largura);
    }

    public void imprimir() {
        System.out.println("largura: " + largura + ", comprimento: " + comprimento + ", area: " + calcularArea(largura, comprimento) + ", perimetro: " + calcularPerimetro(largura, comprimento) + ".");
    }

}
