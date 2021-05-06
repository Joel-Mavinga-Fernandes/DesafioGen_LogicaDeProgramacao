import java.util.Scanner;

public class GenExercicios1 {

	public static void main(String[] args) {
		
			
			Scanner sis = new Scanner (System.in);
			
			int n1, n2, n3; 
			
			System.out.println(" Digite o primeiro número: ");
			n1 = sis.nextInt();
			
			System.out.println(" Digite o segundo número: ");
			n2 = sis.nextInt();
			
			System.out.println(" Digite o terceiro número: ");
			n3 = sis.nextInt();
			
			if(n1>n2 && n2>n3){
			System.out.println(" O primeiro número é o maior");
			}
			
			else if(n2>n1 && n1>n3){
				System.out.println("o segundo número é o maior");
			}
			
			else if(n3>n2 && n2>n1){
				System.out.println("o terceiro número é o maior");
			}
			
			}
			
			
		

		

	}


