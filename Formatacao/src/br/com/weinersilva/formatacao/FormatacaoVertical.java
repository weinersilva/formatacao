package br.com.weinersilva.formatacao;

public class FormatacaoVertical {
	private String variavelDeInstancia = "deve seguir um padr�o (neste caso, sempre ao topo)";
	private String outraVariavel = "apenas para exemplificar";

	public boolean possuiEspacamentoVertical(){
		String objeto = "c�digo";
		if (objeto.contains("espa�amento entre blocos de c�digo com diferentes conceitos")){
			return true;
		}

		return false;
	}

	public boolean possuiContinuidadeVertical(){
		String bloco = "";
		boolean possuiOMesmoConceito = true;
		do{
			bloco += "linhas de c�digo de mesmo conceito";
		}while(possuiOMesmoConceito);

		String objeto = "c�digo";
		if (objeto.contains("espa�amento entre blocos de c�digo com mesmo conceitos")){
			return false;
		}

		return true;
	}

	public boolean respeitaDistanciaVertical(){
		String iniciar = "um bloco de c�digo";
		for (int i = 0; i < iniciar.length(); i++){
			iniciar += iniciar.substring(i, i + 1);
		}
		String finalizandoBlocoCom = funcaoASerChamada();

		String objeto = "c�digo"; // Vari�vel declarada pr�xima de seu uso
		if (objeto.contains("respeito entre distancias de vari�veis e fun��es dependentes")){
			return true;
		}

		return false;
	}

	private String funcaoASerChamada(){
		String condicao = "deve ficar abaixo da fun��o que a chama, quando � possivel";
		String importante = "n�o devem ficar verticalmente distantes";
		return condicao + " e " + importante;
	}

}
