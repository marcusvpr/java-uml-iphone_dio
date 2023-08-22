package desafio;

public class Main {
    //
	public static void main(String[] args) {
        //
		IPhone iphone = new IPhone();
		
        System.out.println("IPhone.... AparelhoTelefonico() !");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("IPhone.... NavegadorInternet !");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
//
        System.out.println("IPhone.... ReprodutorMusicalX !");
        iphone.tocar();
        //pausar();
        //selecionarMusica();
    }
    
}
