package Ex03;

public class Soma extends Operacao{
	
	public void efetuarOperacao() {
		double resposta = getNumeroX() + getNumeroY();
		System.out.println(resposta);
	}
}