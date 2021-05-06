import java.util.Scanner;

public class GenExercicios3 {

	public static void main(String[] args) {
		Scanner sis = new Scanner (System.in);
		
		int idade; 
		
		System.out.println(" Digite a idade: ");
		idade = sis.nextInt();
		
		if(idade>=10 && idade<14){
			System.out.println(" categoria infantil ");
			}
			
			else if(idade>14 && idade<=17){
				System.out.println(" categoria Juvenil");
			}
			
			else if(idade>=18 && idade<25) {
				System.out.println("categoria adulto");
				
			}
	
	}
	}


