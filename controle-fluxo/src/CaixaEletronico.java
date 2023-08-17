public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 1000;
        double valorSolicitado = 552.25;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }else{
            System.out.println("Saldo insuficiente");
        }
        

        
    }
}
