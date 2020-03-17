import java.util.Scanner;
public class parImpar {

	public static void main(String[] args) {
		System.out.println("Qual o número? ");
		Scanner kp = new Scanner(System.in);
		float input = kp.nextFloat();
		if (input % 2 != 0){
			System.out.println ("O número digitado: "+ input+ " é ímpar.");
		}else{
			System.out.println("O número digitado: "+input+" é par.");
		}
	}

}
