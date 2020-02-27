import java.util.Scanner;  
  
  
public class Calculadora {
	static double resultado;

	public static void main(String[] args) {
   
		Scanner sc=new Scanner(System.in);
		System.out.println ("Digite o número 01: ");
		double num1=sc.nextDouble();
		System.out.print ("Escolha uma das opções: \n 01: Somar \n 02: Subtrair \n 03: Multiplicar  \n 04: Dividir: \n Opção escolhida: ");
		int operacao= sc.nextInt();
		System.out.println ("Digite o número 02: ");
		double num2=sc.nextDouble();

		switch (operacao){
			case 1:
				resultado = num1+num2;
				break;
			case 2:
				resultado = num1-num2;
				break;
			case 3:
				resultado = num1*num2;
				break;
			default:
				resultado = num1/num2;
				break;
		}
		System.out.println ("O Resultado da conta é: "+resultado);
	}
}
