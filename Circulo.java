package QuestoesPOO;

public class Circulo {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public float calcularArea() {
        return ( 3.141516f * raio * raio);
    }

    public double calcularPerimetro() {
        return (2*3.141516f * raio);
    }

    public void imprimir() {
        System.out.println("raio: " + raio );
        System.out.println("area: " + calcularArea());
        System.out.println("perimetro: " + calcularPerimetro() );
    }
}