import Classes.ContaCorrente;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem-vindo(a) ao sistema bancário!");


        ContaCorrente objContaCorrente = new ContaCorrente(1, 1, 1, 1000, "Gustavo Caruso dos Santos");
        objContaCorrente.setSaldo(1000);
        System.out.println("Saldo: R$" + objContaCorrente.getSaldo());
        objContaCorrente.depositar(1500);
        objContaCorrente.sacar(500);
        System.out.println("Correntista: " + objContaCorrente.getCorrentista() + "\n" + "Saldo atual: R$" + objContaCorrente.getSaldo());



    }
}
