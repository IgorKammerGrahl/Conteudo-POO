package DiagramaDeClasse;

public class PessoaMain {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Igor");
		p.setEndereco("Boa Vista");
		p.setEndereco("");
		
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Igor");
		pf.setEndereco("Vereador Paulo Felber");
		pf.setCpf("145.804.849-75");
		pf.setEstadoCivil("Solteiro");
		
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("Kali Linux");
		pj.setEndereco("American");
		pj.setCnpj("12.134.345/0001-09");
		pj.setTipoDeEmpresa("SA");
		System.out.println(pj);
	}

}
