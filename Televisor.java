public class Televisor {
    private int canal;
    private int volume;
    private Boolean ligado;

    public Televisor() {
        this.canal = 0;
        this.volume = 80;
        this.ligado = false;
    }

    public int getCanal() {
        return this.canal;
    }
    public int getVolume() {
        return this.volume;
    }
    public Boolean getLigado() {
        return this.ligado;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }
    

    public void ligar() {
        if (this.ligado == false) {
            this.ligado = true;
        } else {
            System.out.println("A televisão já está ligada.");
        }
    }

    public void desligar() {
        if (this.ligado == true) {
            this.ligado = false;
        } else {
            System.out.println("A televisão já está desligada.");
        }
    }

    public void aumentarVolume() {
        if ((this.volume + 5) < 101 && this.ligado == true) {
            this.volume = this.volume + 5;
        } else if (this.ligado == false) {
            System.out.println("Impossivel aumentar volume, televisor está desligado.");
        } else {
            System.out.println("Impossivel aumentar o volume, já está no máximo.");
        }
    }

    public void diminuirVolume() {
        if ((this.volume - 5 >= 0) && this.ligado == true) {
            this.volume = this.volume - 5;
        } else if (this.ligado == false) {
            System.out.println("Impossivel diminuir volume, televisor está desligado.");
        } else if (this.volume - 5 < 0 && this.ligado == true) {
            System.out.println("Impossivel diminuir o volume, já está no mínimo.");
        }
    }

    public void trocarCanal(int canal) {
        this.canal = canal;
    }

    public String toString() {
        return String.format("Canal: %d, Volume: %d, Ligado: %b.", canal, volume, ligado);
    }
}
