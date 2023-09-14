public class ContaPoupanca extends Conta {

    
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String toString() {
        String s  = "***ContaPoupanca***\n";
        s += super.toString();
        return s;
    }

       
}