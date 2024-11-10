package aulaDia21;

public class ExFamilia {

	public static void main(String[] args) {
		
		Familia igor = new Familia();
		igor.setNome("Igor");
		Familia.setSobrenome("Kammer Grahl");
		
		Familia iolanda = new Familia();
		iolanda.setNome("Iolanda");
		Familia.setSobrenome("Farias");
		
		System.out.println(igor.getNome() + " " + Familia.getSobrenome());
		System.out.println(iolanda.getNome() + " " + Familia.getSobrenome());
	}

}
