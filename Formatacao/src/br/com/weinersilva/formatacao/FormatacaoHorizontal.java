package br.com.weinersilva.formatacao;

public class FormatacaoHorizontal {
	public boolean possuiEspacamentoEContinuidadeHorizontal(){
		String declaracao = "espa�ada da inicializa��o da vari�vel";
		String modoIncorreto="dificil de ler o c�digo";

		double a = 1, b = 2, c = 4;
		double determinante = b*b - 4*a*c;
		boolean espacamentoPorOrdemDosOperadores = "conta".equals("bem leg�vel");

		String linhaBemGrande = "cuidado para n�o esticar horizontalmente a linha";
		String resultado;
		if (linhaBemGrande.length() <= 100){
			resultado = "aceitavel";
		}
		else{
			resultado = "possivel problema com a linha";
		}

		return espacamentoPorOrdemDosOperadores && resultado.equals("aceitavel");
	}

	public boolean possuiBoaIndenta��o(){
		int tamanhoIndentacaoAqui = 4;
		int tamanhoIndentacaoEmOutrosLugares = 4;
		boolean naoImportaONumero = (tamanhoIndentacaoAqui == tamanhoIndentacaoEmOutrosLugares);

		String legibibilidade;
		if ("implemento".equals("condi��o")){
			String devo = "Abrir e fechar {}, e indentar";
			legibibilidade = "boa";
		}


		if ("implemento condi��o".equals("sem {}"))
			legibibilidade = "comprometida";

		String evitar = "c�digo dummy scope (mostrado abaixo)";
		String buffer = "";
		while (ler(buffer) != -1)
			;

		if ("c�digo".equals("segue padr�es acima")){
			return true;
		}

		return false;
	}

	private int ler(String buffer){
		if (buffer.equals("posso ler mais")){
			buffer += "++";
			return 1;
		}
		else{
			return -1;
		}
	}

}
