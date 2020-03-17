import java.util.Scanner;
public class codigo {

	public static void main(String[] args) {
		String cod;
		
		System.out.println("Insira o código do produto: ");
		System.out.println("001 ");
		System.out.println("002 ");
		System.out.println("003 ");
		System.out.println("004 ");
		
		Scanner key = new Scanner(System.in);
		int cod1 = key.nextInt();
		
		switch (cod1){
			case 001: System.out.print("Parafuso");
			break;
			case 002: System.out.print("Prego");
			break;
			case 003: System.out.print("Porca");
			break;
			case 004: System.out.print("diversos");
			break;
			default: System.out.print("Código inexistente");
			
		
		}
	}

}
