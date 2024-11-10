package Atv28Part2;

public class ContaSimples extends Conta{

	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
		boolean podeDepositar = true;
		if(valor < 0) {
			podeDepositar = false;
			System.out.println("Você não pode depositar");
		}else {
			saldoPoupanca = saldoPoupanca + valor;
		}
		return podeDepositar;
	}
	
	public boolean saquePoupanca(double valor) {
		boolean podeSacar = true;
		if(valor < 0) {
			podeSacar = false;
			System.out.println("Você não pode sacar");
		}else {
			saldoPoupanca = saldoPoupanca - valor;
		}
		return podeSacar;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
