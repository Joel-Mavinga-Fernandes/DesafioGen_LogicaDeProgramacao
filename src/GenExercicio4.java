import java.util.Scanner;

public class GenExercicio4 {

	public static void main(String[] args) {
		Scanner sis = new Scanner (System.in);
		
		double n1, r, q;
		
		System.out.println(" Digite o valor: ");
		n1 = sis.nextInt();
		
		if(n1%2==0) {
			System.out.println("O número é par");
			
			r = Math.sqrt(n1);
			
			System.out.println("\nA raiz quadrada " + r);

			
			
		}else {
			System.out.println("O número é impar");
			q = Math.pow(n1, 2);
			
			System.out.println("\nA raiz quadrada " + q);
			
			
		}

	}

}
