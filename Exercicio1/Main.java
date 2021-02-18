package Ex01;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int maior = num1;
		int menor =num1;
		
		int num2 = scan.nextInt();
		if (maior<num2) 
			maior = num2;
		if (menor>num2)
			menor = num2;
		
		int num3 = scan.nextInt();
		if (maior<num3)
			maior = num3;
		if (menor>num3)
			menor = num3;
		
		if(num1 == num2 && num2==num3)
			System.out.println("Os três números são iguais");
		else {
			System.out.printf("O maior número é: %d\n", maior);
			System.out.printf("O menornúmero é: %d\n", menor);
		} 
	}
	

}

