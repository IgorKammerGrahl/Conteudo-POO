package Atv28Part2;

public class ContaMain {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		
		c.setSaldo(1500);
		c.setBanco("Bradesco");
		c.setAgencia(123);
		c.setNumeroconta(1234);
		
		c.deposito(500);
		c.saque(2000);
		c.saque(200);
		
		System.out.println(c);

	}

}
