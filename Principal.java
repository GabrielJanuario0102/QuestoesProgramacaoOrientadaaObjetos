package QuestoesPOO;
public class Principal {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Ronaldo", 123);
        Conta conta2 = new Conta("Berinjela", 456);
        Conta conta3 = new Conta("Elpepe", 789);
        

        conta1.exibir();
        System.out.println("-----------------------------");
        conta2.exibir();
        System.out.println("-----------------------------");
        conta3.exibir();
        System.out.println("-----------------------------");

        conta1.depositar(10);
        conta2.depositar(20);
        conta3.depositar(30);
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");



        conta1.exibir();
        System.out.println("-----------------------------");
        conta2.exibir();
        System.out.println("-----------------------------");
        conta3.exibir();
        System.out.println("-----------------------------");


        conta1.setNomeCLiente("Renan");
        conta2.setNomeCLiente("Caveira");
        conta3.setNomeCLiente("Games");

        conta1.sacar(5);
        conta2.sacar(10);
        conta3.sacar(15);
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");

        conta1.exibir();
        conta2.exibir();
        conta3.exibir();
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");

        conta1.desativar();
        conta2.desativar();
        conta3.desativar();

        conta1.exibir();
        conta2.exibir();
        conta3.exibir();
    }
}
