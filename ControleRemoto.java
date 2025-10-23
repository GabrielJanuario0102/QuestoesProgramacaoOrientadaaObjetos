public class ControleRemoto {
    private Televisor televisor;

    public ControleRemoto(Televisor televisor) {
        this.televisor = televisor;
    }
    

    public void ligar() {
        televisor.ligar();
    }

    public void desligar() {
        televisor.desligar();
    }

    public void aumentarVolume() {
        televisor.aumentarVolume();
    }

    public void diminuirVolume() {
        televisor.diminuirVolume();
    }

    public void trocarCanal(int canal) {
        televisor.trocarCanal(canal);
    }

    public String toString() {
        return toString();
    }
}
