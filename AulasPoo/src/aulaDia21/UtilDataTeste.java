package aulaDia21;
import java.util.Date;

public class UtilDataTeste {

	public static void main(String[] args) {
		
		int ano = 2005;
		int mes = 1;
		int dia = 14;
		int hora = 10;
		int min = 35;
		int sec = 20;
		
		Date AnoMesDia = UtilData.criarData(ano, mes, dia);
		System.out.println("Aqui está: " + AnoMesDia);
		
		System.out.println("-----------------------------------------------------------");
		Date AnoMesDiaUpgrade = UtilData.criarDataUpgrade(ano, mes, dia, hora, min, sec);
		System.out.println("Aqui está o upgrade: " + AnoMesDiaUpgrade);

	}

}
