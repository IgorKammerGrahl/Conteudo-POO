package aulaDia21;
import java.util.Calendar;
import java.util.Date;

public class UtilData {

	public static Date criarData(int ano, int mes, int dia) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.YEAR, ano);
		calendario.set(Calendar.MONTH, mes);
		calendario.set(Calendar.DAY_OF_MONTH, dia);
		Date dt = calendario.getTime();
		return dt;
		
	}
	
	public static Date criarDataUpgrade(int ano, int mes, int dia, int hora, int min, int sec) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.YEAR, ano);
		calendario.set(Calendar.MONTH, mes);
		calendario.set(Calendar.DAY_OF_MONTH, dia);
		calendario.set(Calendar.HOUR, hora);
		calendario.set(Calendar.MINUTE, min);
		calendario.set(Calendar.SECOND, sec);
		Date dtUpgrade = calendario.getTime();
		return dtUpgrade;
		
	}
}
