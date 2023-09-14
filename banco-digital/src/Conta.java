public abstract class Conta  implements IConta{
    private static  int SEQUENCIAL = 1;
    private static  int AGENCIA_PADRAO = 1;
   
    protected int numConta;
    protected int numAgencia;
    protected double saldo;

    
    public Conta() {
        this.numConta = SEQUENCIAL++;
        this.numAgencia = Conta.AGENCIA_PADRAO;
    }
    public int getNumConta() {
        return numConta;
    }
    public int getNumAgencia() {
        return numAgencia;
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public boolean sacar(double valor) {
       
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }
        
        System.out.println("Limite insuficinte.");
        return false;
             
        
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta conta) {
        if(sacar(valor)){
            conta.depositar(valor);
        }

    }
    @Override
    public String toString() {
        return "Conta [numConta=" + numConta + ", numAgencia=" + numAgencia + ", saldo=" + saldo + "]";
    }
    
    


    
}
