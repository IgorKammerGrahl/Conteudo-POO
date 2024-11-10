package AtvDia28;

public class ItemMain {

	public static void main(String[] args) {
		Item i = new Item();
		
		i.setCodigo(123);
		i.setDescricao("porra");
		
		System.out.println(i);

		Livro l = new Livro();
		l.setAutor("Paulo");
		l.setCodigo(123434);
		l.setDescricao("Pourra");
		
		System.out.println(l);
		
		
		
	}

}
