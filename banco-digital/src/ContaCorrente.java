public class ContaCorrente extends Conta {
    
    
    public ContaCorrente(Cliente cliente) {
        super(cliente);

    }

    @Override
    public String toString() {
        String s  = "***ContaCorrente***\n";
        s += super.toString();
        return s;
    }
}