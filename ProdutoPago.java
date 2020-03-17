import java.util.Scanner;
public class ProdutoPago {
	public static void main (String[] args){
	Scanner pro = new Scanner(System.in);
	Scanner pag = new Scanner(System.in);
	
	System.out.println("Valor do produto: ");
	double m = pro.nextDouble();
	System.out.println("Valor pago: ");
	double u = pag.nextDouble();
	
	System.out.println("O valor do troco é "+(m-u));
	}
}