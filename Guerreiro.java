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

    public void setENergia(int energia) {
        this.energia = energia;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void decrementoCritico() {
        if (this.energia > 1) {
            this.energia -= 2;
        } else if (this.energia == 1) {
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

    public int atacarCritico() {
        Random geradorCritico = new Random();
        return geradorCritico.nextInt(10);
    }

    public void lutarLaco(Guerreiro rival) {
        while ((this.energia > 0) && (rival.getEnergia() > 0)) {
            int chanceAtaque1 = atacar();
            if (chanceAtaque1 == 1) {
                int chanceCritico1 = atacarCritico();
                if (chanceCritico1 == 9) {
                    rival.decrementoCritico();
                    System.out.println(String.format("%s ATACOU %s e ACERTOU UM CRITICO.", this.nome, rival.getNome()));
                } else {
                    rival.decremento();
                    System.out.println(String.format("%s ATACOU %s e ACERTOU.", this.nome, rival.getNome()));
                }
            } else {
                System.out.println(String.format("%s ATACOU %s e ERROU.", this.nome, rival.getNome()));
            }
            System.out.println(this.toString());
            System.out.println(rival.toString());
            System.out.println("--------------------------");

            if (rival.getEnergia() <= 0) {
                break;
            }

            int chanceAtaque2 = rival.atacar();
            if (chanceAtaque2 == 1) {
                int chanceCritico2 = rival.atacarCritico();
                if (chanceCritico2 == 9) {
                    decrementoCritico();
                    System.out.println(String.format("%s ATACOU %s e ACERTOU UM CRITICO.", rival.getNome(), this.nome));
                } else {
                    decremento();
                    System.out.println(String.format("%s ATACOU %s e ACERTOU.", rival.getNome(), this.nome));
                }
            } else {
                System.out.println(String.format("%s ATACOU %s e ERROU.", rival.getNome(), this.nome));
            }
            System.out.println(this.toString());
            System.out.println(rival.toString());
            System.out.println("--------------------------");
        }
        System.out.println("A luta acabou.");
        System.out.println(this.toString());
        System.out.println(rival.toString());
        System.out.println("--------------------------");
        if (this.energia != 0) {
            System.out.println("Guerreiro vencedor: " + this.nome + ".");
        } else {
            System.out.println("Guerreiro vencedor: " + rival.nome + ".");
        }
    }

    public void lutarRecursao(Guerreiro rival) {
        if (this.energia > 0 && rival.energia > 0) {
            int chanceAtaque1 = atacar();
            if (chanceAtaque1 == 1) {
                int chanceCritico1 = atacarCritico();
                if (chanceCritico1 == 9) {
                    rival.decrementoCritico();
                    System.out.println(String.format("%s ATACOU %s e ACERTOU UM CRITICO.", this.nome, rival.getNome()));
                } else {
                    rival.decremento();
                    System.out.println(String.format("%s ATACOU %s e ACERTOU.", this.nome, rival.getNome()));
                }
            } else {
                System.out.println(String.format("%s ATACOU %s e ERROU.", this.nome, rival.getNome()));
            }
            System.out.println(this.toString());
            System.out.println(rival.toString());
            System.out.println("--------------------------");

            if (rival.getEnergia() == 0) {
                System.out.println("A luta acabou.");
            System.out.println(this.toString());
            System.out.println(rival.toString());
            System.out.println("--------------------------");
            if (this.energia != 0) {
                System.out.println("Guerreiro vencedor: " + this.nome + ".");
            } else {
                System.out.println("Guerreiro vencedor: " + rival.nome + ".");
            }
                return;
            }

            int chanceAtaque2 = rival.atacar();
            if (chanceAtaque2 == 1) {
                int chanceCritico2 = rival.atacarCritico();
                if (chanceCritico2 == 9) {
                    decrementoCritico();
                    System.out.println(String.format("%s ATACOU %s e ACERTOU UM CRITICO.", rival.getNome(), this.nome));
                } else {
                    decremento();
                    System.out.println(String.format("%s ATACOU %s e ACERTOU.", rival.getNome(), this.nome));
                }
            } else {
                System.out.println(String.format("%s ATACOU %s e ERROU.", rival.getNome(), this.nome));
            }
            System.out.println(this.toString());
            System.out.println(rival.toString());
            System.out.println("--------------------------");

            lutarRecursao(rival);

        } else {
            System.out.println("A luta acabou.");
        System.out.println(this.toString());
        System.out.println(rival.toString());
        System.out.println("--------------------------");
        if (this.energia != 0) {
            System.out.println("Guerreiro vencedor: " + this.nome + ".");
        } else {
            System.out.println("Guerreiro vencedor: " + rival.nome + ".");
        }
            return;
        }
    }

    public String toString() {
        return String.format("%d, %s, energia: %d", this.codigo, this.nome, this.energia);
    }

}
