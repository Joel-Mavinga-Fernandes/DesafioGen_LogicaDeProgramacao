import java.util.Scanner;

public class GenExercicios1 {

	public static void main(String[] args) {
		
			
			Scanner sis = new Scanner (System.in);
			
			int n1, n2, n3; 
			
			System.out.println(" Digite o primeiro n�mero: ");
			n1 = sis.nextInt();
			
			System.out.println(" Digite o segundo n�mero: ");
			n2 = sis.nextInt();
			
			System.out.println(" Digite o terceiro n�mero: ");
			n3 = sis.nextInt();
			
			if(n1>n2 && n2>n3){
			System.out.println(" O primeiro n�mero � o maior");
			}
			
			else if(n2>n1 && n1>n3){
				System.out.println("o segundo n�mero � o maior");
			}
			
			else if(n3>n2 && n2>n1){
				System.out.println("o terceiro n�mero � o maior");
			}
			
			}
			
			
		

		

	}


