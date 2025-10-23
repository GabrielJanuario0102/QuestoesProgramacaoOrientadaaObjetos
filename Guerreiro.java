import java.util.Random;


public class Guerreiro {
    private int codigo;
    private String nome;
    private int energia;

    public Guerreiro(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.energia = 5;
    }

    public int getEnergia() {
        return this.energia;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void incremento() {
        if (this.energia < 5) {
            this.energia += 1;
        } else {
            System.out.println("Impossivel incrementar mais, ja possui 5.");
        }
    }

    public void decremento() {
        if (this.energia > 0) {
            this.energia -= 1;
        } else {
            System.out.println("Impossivel decrementar mais, nao possui energia.");
        }
    }

    public void alimentarse() {
        incremento();
    }

    public int atacar() {
        Random gerador = new Random();
        return gerador.nextInt(2);

    }

    public void lutar(Guerreiro rival) {
        while ((this.energia > 0) && (rival.getEnergia() > 0)) {
            int chanceAtaque1 = atacar();
                if (chanceAtaque1 == 1) {
                    rival.decremento();
                    System.out.println(String.format("%s ATACOU %s e ACERTOU.", this.nome, rival.getNome()));
                    System.out.println(this.toString());
                    System.out.println(rival.toString());
                    System.out.println("--------------------------");
                } else {
                    System.out.println(String.format("%s ATACOU %s e ERROU.", this.nome, rival.getNome()));
                    System.out.println(this.toString());
                    System.out.println(rival.toString());
                    System.out.println("--------------------------");
                }

                if (rival.getEnergia() == 0) {
                    System.out.println("A luta acabou.");
                    System.out.println(this.toString());
                    System.out.println(rival.toString());
                    System.out.println("--------------------------");
                    break;
                }
            
            
            int chanceAtaque2 = rival.atacar();
            if (chanceAtaque2 == 1) {
                    decremento();
                    System.out.println(String.format("%s ATACOU %s e ACERTOU.", rival.getNome(), this.nome));
                    System.out.println(this.toString());
                    System.out.println(rival.toString());
                    System.out.println("--------------------------");
                } else {
                    System.out.println(String.format("%s ATACOU %s e ERROU.", rival.getNome(), this.nome));
                    System.out.println(this.toString());
                    System.out.println(rival.toString());
                    System.out.println("--------------------------");
                }
        }
                System.out.println("A luta acabou.");
                System.out.println(this.toString());
                System.out.println(rival.toString());
                System.out.println("--------------------------");
    }

    public String toString() {
        return String.format("%d, %s, energia: %d", this.codigo, this.nome, this.energia);
    }


}
