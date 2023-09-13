package telefone;

public class NokiaTijolao implements AparelhoTelefonico{

    @Override
    public void ligar() {
        System.out.println("ligar");
    }

    @Override
    public void atender() {
        System.out.println("atender");
    }

    @Override
    public void iniciarCorreioVoz() {
         System.out.println("iniciarCorreioVoz");
    }
    
}
