package Aulas;

public class Quadrado {
	
	private int lado = 2;
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		if(lado > 0)
		this.lado = lado;
	}

	public Quadrado(int lado) {
		setLado(lado);
	}
	
	public int perimetro() {
		return 4*lado;
	}
	
	public double area() {
		return lado*lado;
	}
	
}
