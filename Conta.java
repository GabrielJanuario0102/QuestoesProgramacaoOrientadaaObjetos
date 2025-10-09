package QuestoesPOO;

public class Conta {
    private int numeroConta;
    private String nomeCliente;
    private float saldo;
    private Boolean ativa;

    public Conta(String nomeCliente, int numeroConta) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.ativa = true;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setNomeCLiente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }


    public int getNumeroConta() {
        return this.numeroConta;
    }
    public String getNomeCliente() {
        return this.nomeCliente;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public Boolean getAtiva() {
        return this.ativa;
    }




    public void depositar(float valorDeposito) {
        if (valorDeposito >= 0 && getAtiva() == false) {
            System.out.println("Impossivel depositar, valor menor igual a 0, ou conta desativada.");
        }else{
            setSaldo(valorDeposito);
            System.out.println("Foi depositado: " +valorDeposito+ " na Conta.");
        }
    }

    public void sacar(float valorSaque) {
        if (valorSaque <=0 || getAtiva() == false) {
            System.out.println("Impossivel sacar, valor de saque baixo ou conta desativada.");
        } else if (valorSaque > getSaldo()) {
            System.out.println("Impossivel sacar, pois o valor de saque é maior que o valor em saldo.");
        } else {
            setSaldo(valorSaque);
            System.out.println("Foi sacado: " +valorSaque+ " na Conta.");
        }
    } 

    public void desativar() {
        if (getAtiva() == false) {
            System.out.println("Impossivel desativar, pois conta ja está desativada.");
        }else {
            setAtiva(false);
            System.out.println("Conta foi desativada.");
        }
    }

    public void ativar() {
        if (getAtiva() == true) {
            System.out.println("Impossivel ativar, conta ja está ativa.");
        } else {
            setAtiva(true);
            System.out.println("Conta foi ativada.");
        }
    }

    public String toString(){
        return String.format("Nome do cliente: %s, Numero da conta: %d, Saldo: %.2f, Ativa: %b.", nomeCliente, numeroConta, saldo, ativa);
    }
    public void exibir() {
        System.out.println(toString());
    }
}
