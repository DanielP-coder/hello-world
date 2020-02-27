package conta_bancaria;
public class ContaBancaria {

	
	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1245);
		p1.setDono("Daniel");
		p1.abrirConta("CC");
		
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(1244);
		p2.setDono("Bambietta");
		p2.abrirConta("CP");
		
		
		
		
		p1.estadoAtual();
		System.out.println("--------------------------------------");
		p2.estadoAtual();
		
		p1.depositar(8000);
		p2.depositar(500);
		
		System.out.println("--------------------------------------");
		p1.estadoAtual();
		System.out.println("--------------------------------------");
		p2.estadoAtual();
	}

}
