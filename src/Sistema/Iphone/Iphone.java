package Sistema.Iphone;

import Sistema.Iphone.Aparelho.AparelhoTelefonico;
import Sistema.Iphone.Navegador.NavegadorInternet;
import Sistema.Iphone.Reprodutor.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    public void atender() {
        System.out.println("Atendendo a chamada");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz");
    }
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }
        public void tocar() {
        System.out.println("Tocando musica");
    }
    public void pausar() {
        System.out.println("Pausando musica");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica " + musica);
    }  
    
}
