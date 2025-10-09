package QuestoesPOO;
public class Helicoptero {
     private int capacidade;
     private Boolean ligado;
     private int quantidadePessoas;
     private int altitude;
    
     public Helicoptero(int capacidade) {
        this.capacidade = capacidade;
        this.ligado = false;
        this.quantidadePessoas = 0;
        this.altitude = 0;
     }
    
     public int getCapacidade() {
        return capacidade;
     }
     public Boolean getDesliago() {
        return ligado;
     }
     public int getQuantidadePessoas() {
        return quantidadePessoas;
     }
     public int getAltitude() {
        return altitude;
     }

     public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
     }
     public void setDesligado(Boolean LigadoOuDesligado) {
        this.ligado = LigadoOuDesligado;
     }
     public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
     }
     public void setAltitude(int altitude) {
        this.altitude = altitude;
     }


    public void Entra() {
        if (this.capacidade <= this.quantidadePessoas || this.altitude != 0) {
            System.out.println("Impossivel adicionar mais pessoas, Helicoptero cheio ou voando.");
        } else {
            this.quantidadePessoas = this.quantidadePessoas + 1;
            System.out.println("Adicionado 1 pessoa ao Helicoptero, possuindo agora: " +quantidadePessoas+ " pessoas.");
        }
    }

    public void Sai() {
        if (this.quantidadePessoas <= 0 || this.altitude !=0) {
            System.out.println("Impossivel remover mais pessoas, Helicoptero vazio ou voando.");
        } else {
            this.quantidadePessoas = this.quantidadePessoas - 1;
            System.out.println("Removido 1 pessoa ao Helicoptero, possuindo agora: " +quantidadePessoas+ " pessoas.");
        }
    }

    public void Ligar() {
        if (this.ligado == true) {
            System.out.println("Impossivel ligar o Helicoptero, pois já está LIGADO.");
        } else {
            this.ligado = true;
            System.out.println("Helicóptero agora está LIGADO.");
        }
    }

    public void Desligar() {
        if (this.ligado == false  && this.altitude >= 1) {
            System.out.println("Impossivel desligar o Helicoptero, pois já está DESLIGADO ou está voando.");
        } else {
            this.ligado = false;
            System.out.println("Helicóptero agora está DESLIGADO.");
        }
    }

    public void Aterrisar() {
        if (altitude > 0) {
            System.out.println("Impossivel aterrisar, pois NÃO está no chão.");
        } else {
            this.altitude = 0;
            System.out.println("O Helicoptero pousou.");
        }
    }

    public String toString() {
        return String.format("Capacidade: %d, Ligado: %b, Quantidade de Pessoas: %d, Altitude: %d.", capacidade, ligado, quantidadePessoas, altitude);
    }
     
}
