package Ex02;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de repetições: ");
		int vezes = scan.nextInt();
		
		for (int i=0; i<vezes; i++) {
			System.out.printf("Incomoda ");
		}
		System.out.printf("muito mais\n");
	}

}
