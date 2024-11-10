package Analisador;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.*;


public class Analisador {

	Scanner entrada = null; 
	private File lista;
	private String linha = "";
	private int countInvalidos = 0;
	private int countValidos = 0;
	private boolean invalido = 	false;
	public String getLinha() {
		return linha;
	}
	public void setLinha(String linha) {
		this.linha = linha;
	}
	public int getCountInvalidos() {
		return countInvalidos;
	}
	public void setCountInvalidos(int countInvalidos) {
		this.countInvalidos = countInvalidos;
	}
	public int getCountValidos() {
		return countValidos;
	}
	public void setCountValidos(int countValidos) {
		this.countValidos = countValidos;
	}
	public boolean isInvalido() {
		return invalido;
	}
	public void setInvalido(boolean invalido) {
		this.invalido = invalido;
	}

	public File getLista() {
		return lista;
	}

	public void setLista(File lista) {
		this.lista = lista;
	}

	public Analisador(File lista) {
		setLista(lista);
	}


	public void AnaliseDna() throws IOException {
		int count = 0;
		OutputStream os = new FileOutputStream("C:\\Users\\Igor Kammer Grahl\\eclipse-workspace\\AnalisadorDna\\src\\Analisador\\Resultado.txt");
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter br = new BufferedWriter(wr);

		try {
			entrada = new Scanner(this.lista);

			while(entrada.hasNextLine()) {
				linha = entrada.nextLine();
				count++;
				System.out.println(linha);
			}
			System.out.println(linha);
			br.close();

		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {

			if (entrada != null) {
				entrada.close(); 
			}    
		}
		System.out.println("O total de fitas é " + count);
		System.out.println();
	}

	public void Invalido() throws IOException{
		final int INI = 0;
		int countInvalidos = 0;
		int count = 0;
		List<Integer> linhasInvalidas = new ArrayList<Integer>();
		OutputStream os = new FileOutputStream("C:\\Users\\Igor Kammer Grahl\\eclipse-workspace\\AnalisadorDna\\src\\Analisador\\ResultadoInvalidos.txt");
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter br = new BufferedWriter(wr);

		try {
			entrada = new Scanner(this.lista);

			while(entrada.hasNextLine()) {
				linha = entrada.nextLine();
				count++;
				for (int i = INI; i < linha.length(); i++) {
					if(linha.charAt(i) != 'A' && linha.charAt(i) != 'C' && linha.charAt(i) != 'G' && linha.charAt(i) != 'T') {
						countInvalidos++;	
						linhasInvalidas.add(count);
						invalido = true;
						System.out.println(linha);
						break;
					}else {
						invalido = false;
					}
				}
				System.out.println(linha);
			}
			br.close();

		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {

			if (entrada != null) {
				entrada.close(); 
			}    
		}
		System.out.println("O total de fitas inválidas é " + countInvalidos);
		System.out.println("As linhas inválidas são " + linhasInvalidas);
	}

	public void substituicao() throws IOException{
		int count = 0;
		int countInvalidos = 0;
		final int INI = 0;
		OutputStream os = new FileOutputStream("C:\\Users\\Igor Kammer Grahl\\eclipse-workspace\\AnalisadorDna\\src\\Analisador\\Resultado.txt");
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter br = new BufferedWriter(wr);

		try {
			entrada = new Scanner(this.lista);

			while(entrada.hasNextLine()){
				linha = entrada.nextLine();
				count++;
				for (int i = INI; i < linha.length(); i++) {
					if(linha.charAt(i) != 'A' && linha.charAt(i) != 'C' && linha.charAt(i) != 'G' && linha.charAt(i) != 'T') {
						countInvalidos++;	
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
				System.out.println(linha);
			}
			}
			br.close();					
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {	

			if (entrada != null) {
				entrada.close(); 
			}    
		}
		countValidos = count - countInvalidos;
		System.out.println("O total de fitas válidas é " + countValidos);

	}
}
