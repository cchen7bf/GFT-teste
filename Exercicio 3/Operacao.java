package Ex03;

public abstract class Operacao {
	private double numeroX;
	private double numeroY;
	
	public Operacao() {
	}
	
	public Operacao(double numeroX, double numeroY) {
		this.numeroX = numeroX;
		this.numeroY = numeroY;
	}
	
		
	public double getNumeroX() {
		return numeroX;
	}

	public void setNumeroX(double numeroX) {
		this.numeroX = numeroX;
	}

	public double getNumeroY() {
		return numeroY;
	}

	public void setNumeroY(double numeroY) {
		this.numeroY = numeroY;
	}

	public void efetuarOperacao() {	}
}
