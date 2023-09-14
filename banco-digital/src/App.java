public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Celio Nora Junior");
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(500);
        cc.sacar(50);
        cc.transferir(500, cp);

        System.out.println(cc.toString());
        System.out.println(cp.toString());
    }
}
