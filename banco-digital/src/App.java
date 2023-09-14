public class App {
    public static void main(String[] args) {
        
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(500);
        cc.sacar(50);
        cc.transferir(500, cp);

        System.out.println(cc.toString());
        System.out.println(cp.toString());
    }
}
