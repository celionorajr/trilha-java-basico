package musica;

public class MediaPlayer implements ReprodutorMidia {

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA");
    }
    
}
