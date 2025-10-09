package QuestoesPOO;

public class Quadrado {
    private int lado;


    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int calcularArea() {
        return lado * lado;
    }

    public int calcularPerimetro() {
        return 4* lado;
    }

    public void imprimir() {
        System.out.println("lado: " + lado + ", area: " + calcularArea() + ", perimetro: " + calcularPerimetro() + ".");
    }
}


