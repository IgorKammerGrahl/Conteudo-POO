	package Dia0710;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class AnalizadorDNA {

	public static void main(String[] args) throws IOException {
		Scanner entrada = null;
		List<Integer> linhasInvalidas = new ArrayList<Integer>();
		
		final int INI = 0;
		String linha = "";
		int count = 0;
		int countInvalidos = 0;
		int countValidos = 0;
		boolean invalido = false;

		File file = new File("C:\\Users\\alunos\\Desktop\\Java-BCC-ViniciusFloriano\\AulaJava\\src\\Dia0710\\ExercícioPrático-FitaDNA-fitaDNA.txt");

		OutputStream os = new FileOutputStream("C:\\\\Users\\\\alunos\\\\Desktop\\\\Java-BCC-ViniciusFloriano\\\\AulaJava\\\\src\\\\Dia0710\\\\resultado.txt");
        Writer wr = new OutputStreamWriter(os);
        BufferedWriter br = new BufferedWriter(wr);
		
		try {
			entrada = new Scanner(file);

			while(entrada.hasNextLine()){
				linha = entrada.nextLine();
				count++;
				for (int i = INI; i < linha.length(); i++) {
					if(linha.charAt(i) != 'A' && linha.charAt(i) != 'C' && linha.charAt(i) != 'G' && linha.charAt(i) != 'T') {
						countInvalidos++;	
						linhasInvalidas.add(count);
						invalido = true;
						break;
					}else {
						invalido = false;
					}
				}
				
				if (invalido == true) {
					br.write("***FITA INVALIDA - " + linha);
					br.newLine();
				} else {
					for (int i = INI; i < linha.length(); i++) {
						if(linha.charAt(i) == 'A') {
							br.write("T");
						} else if(linha.charAt(i) == 'T') {
							br.write("A");
						} else if(linha.charAt(i) == 'G') {
							br.write("C");
						} else if(linha.charAt(i) == 'C') {
							br.write("G");
						}
					}
					br.newLine();					
				}
				System.out.println(linha);
			}
			br.close();
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			
			if (entrada != null) {
				entrada.close(); 
			}    
		}
		
		countValidos = count - countInvalidos;
		
		System.out.println("O total de fitas é " + count);
		System.out.println("O total de fitas válidas é " + countValidos);
		System.out.println("O total de fitas inválidas é " + countInvalidos);
		System.out.println("As linhas inválidas são " + linhasInvalidas);
		
		
	}
}
