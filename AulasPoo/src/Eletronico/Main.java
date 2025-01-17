package Eletronico;

public class Main {
	public static void main(String[] args) {
		EquipamentoEletronico ee = new EquipamentoEletronico();
		ee.setConsumo(100);
		ee.setTensao(220);
		System.out.println(ee);
		
		SistemaEletronico ss = new SistemaEletronico();
		ss.setConsumo(100);
		ss.setTensao(220);
		ss.setMarca("Sony");
		ss.setModelo("S3");
		System.out.println(ss);
		
		SistemaDeVideo sv = new SistemaDeVideo();
		sv.setConsumo(100);
		sv.setTensao(220);
		sv.setMarca("Antigo");
		sv.setModelo("LG 578");
		sv.setTipo("Amoled");
		sv.setResolucap("4K Ultrawild");
		System.out.println(sv);
		
		HomeTheater ht = new HomeTheater();
		ht.setSom(ss);
		ht.setVideo(sv);
		ht.video.setMarca("Novo");
		System.out.println(ht);
		
		sv = null;
		
	}
	
}
