import java.util.Scanner;
public class ContaDoChurrasco {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		System.out.println("Valor do quilo: ");
		double e = s.nextDouble();
		System.out.println("Quilos consumidos: ");
		double a = c.nextDouble();
		System.out.println("Valor a ser pago "+(e*a));
	}

}
