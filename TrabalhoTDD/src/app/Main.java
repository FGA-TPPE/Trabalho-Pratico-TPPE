package app;


import java.io.IOException;

import java.util.Scanner;

import exceptions.ArquivoNaoEncontradoException;
import exceptions.EscritaNaoPermitidaException;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		LerArquivoAnalysisTime analysisTime = new LerArquivoAnalysisTime();
		LerArquivoAnalysisMemory analysisMemory = new LerArquivoAnalysisMemory();
		EscritaArquivo escritaArquivo = new EscritaArquivo();
		NumeroAnalises numeroAnalysisTime = new NumeroAnalises();
		NumeroAnalises numeroAanalysisMemory = new NumeroAnalises();



		System.out.print("Digite o delimitador que deseja usar no arquivo de saída: ");
		String delimitador = scanner.nextLine();
		escritaArquivo.definirDelimitador(delimitador);

		System.out.print("Digite o caminho do diretório para salvar o arquivo de saída: ");
		String caminhoArquivoSaida = scanner.nextLine();
		escritaArquivo.setCaminhoSaida(caminhoArquivoSaida);
		

		System.out.print("Escolha o formato de saída linhas ou colunas: ");
		String formatoArquivoSaida = scanner.nextLine();
		escritaArquivo.setFormato(formatoArquivoSaida);
		//escritaArquivo.getFormato();
		switch (formatoArquivoSaida) {
		case "linhas":
			escritaArquivo.escreverAnalysisTimeLinha();
			escritaArquivo.escreverAnalysisMemoryLinha();
		
		}	
		
				
		numeroAnalysisTime.getNumeroAnalysisTime();
		numeroAanalysisMemory.getNumeroAnalysisMemory();
		
		


		scanner.close();
	}

}