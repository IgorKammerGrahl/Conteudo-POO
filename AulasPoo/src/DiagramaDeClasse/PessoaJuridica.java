package DiagramaDeClasse;

public class PessoaJuridica extends Pessoa{

	private String cnpj;
	private String tipoDeEmpresa;

	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		if(cnpj.length() > 0) {
			this.cnpj = cnpj;
		}
	}
	public String getTipoDeEmpresa() {
		return tipoDeEmpresa;
	}
	public void setTipoDeEmpresa(String tipoDeEmpresa) {
		if(tipoDeEmpresa.length() > 0) {
			this.tipoDeEmpresa = tipoDeEmpresa;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaJuridica [cnpj=");
		builder.append(cnpj);
		builder.append(", tipoDeEmpresa=");
		builder.append(tipoDeEmpresa);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
