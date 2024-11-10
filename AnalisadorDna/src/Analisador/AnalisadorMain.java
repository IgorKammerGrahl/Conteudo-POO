package Analisador;

import java.io.IOException;
import java.io.*;

public class AnalisadorMain {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Igor Kammer Grahl\\eclipse-workspace\\AnalisadorDna\\src\\Analisador\\ExercícioPrático-FitaDNA-fitaDNA.txt");
		Analisador analise = new Analisador(file);
		
		analise.AnaliseDna();
		analise.substituicao();
		analise.Invalido();

	}
}
