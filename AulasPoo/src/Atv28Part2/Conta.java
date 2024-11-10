package Atv28Part2;

public class Conta {

	private String banco;
	private int agencia;
	private int numeroconta;
	private double saldo;

	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroconta() {
		return numeroconta;
	}
	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean deposito(double valor) {
		boolean podeDepositar = true;
		if(valor < 0) {
			podeDepositar = false;
			System.out.println("Você não pode depositar");
		}else {
			saldo = saldo + valor;
		}
		return podeDepositar;
	}

	public boolean saque(double valor) {
		boolean podeSacar = true;
		if(valor < 0) {
			podeSacar = false;
			System.out.println("Você não pode depositar");
		}else {
			saldo = saldo - valor;
		}
		return podeSacar;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
}





