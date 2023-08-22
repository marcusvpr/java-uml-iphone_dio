package desafio;

interface AparelhoTelefonico {
    //
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

interface NavegadorInternet {
    //
	void exibirPagina();
	void adicionarNovaAba();
	void atualizarPagina();
}

interface ReprodutorMusical {
    void tocar();
	void pausar();
	void selecionarMusica();
}

public class IPhone implements AparelhoTelefonico, NavegadorInternet,
                               ReprodutorMusical {
    //
    @Override
    public void ligar() {
        //
        System.out.println("AparelhoTelefonico.ligar()");
    }

    @Override
    public void atender() {
        //
        System.out.println("AparelhoTelefonico.atender()");
    }

    @Override
    public void iniciarCorreioVoz() {
        //
        System.out.println("AparelhoTelefonico.iniciarCorreioVoz()");
    }

    @Override
    public void tocar() {
        //
        System.out.println("ReprodutorMusical.tocar()");
    }

    @Override
    public void pausar() {
        //
        System.out.println("ReprodutorMusical.pausar()");
    }

    @Override
    public void selecionarMusica() {
        //
        System.out.println("ReprodutorMusical.selecionarMusica()");
    }

    @Override
    public void exibirPagina() {
        //
        System.out.println("NavegadorInternet.exibirPagina()");
    }

    @Override
    public void adicionarNovaAba() {
        //
        System.out.println("NavegadorInternet.adicionarNovaAba()");
    }

    @Override
    public void atualizarPagina() {
        //
        System.out.println("NavegadorInternet.atualizarPagina()");
    }
    
}
