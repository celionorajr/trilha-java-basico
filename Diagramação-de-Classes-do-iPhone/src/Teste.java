import iphone.App;

public class Teste {
    public static void main(String[] args) {
        
        App iphone = new App();

        //TESTE LIGACAO
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();
        //TESTE REPRODUTOR MUSICAL 
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        //TESTE NAVEGADOR
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    }
}
