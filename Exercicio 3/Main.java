package Ex03;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de x: ");
		double X = scan.nextDouble();
		
		System.out.println("Digite o valor de y: ");
		double Y = scan.nextDouble();
	
		Operacao soma = new Soma();
		soma.setNumeroX(X);
		soma.setNumeroY(Y);
		
		Operacao subtracao = new Subtracao();
		subtracao.setNumeroX(X);
		subtracao.setNumeroY(Y);
		
		Operacao multiplicacao = new Multiplicacao();
		multiplicacao.setNumeroX(X);
		multiplicacao.setNumeroY(Y);
		
		Operacao divisao = new Divisao();
		divisao.setNumeroX(X);
		divisao.setNumeroY(Y);
		
		soma.efetuarOperacao();
		subtracao.efetuarOperacao();
		multiplicacao.efetuarOperacao();
		divisao.efetuarOperacao();
	}

}
