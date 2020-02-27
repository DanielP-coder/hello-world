package conta_bancaria;

public class ContaBanco {
	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//Métodos
	public void estadoAtual(){
		System.out.println("Conta: "+this.getNumConta());
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("Dono: "+this.getDono());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.getStatus());
	}
	public void abrirConta(String t){
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC"){
			this.setSaldo(50);
		}else if (t== "CP"){
			this.setSaldo (150);
		}
	}
	public void fecharConta(){
		if (this.getSaldo() > 0){
			System.out.println ("Conta não pode ser fechada porque ainda tem saldo");
		}else if (this.getSaldo()<0){
			System.out.println("Conta não pode ser fechada pois tem débito");
		}else{
			this.setStatus(false);
			System.out.println("Conta fechada");
		}
	}
	public void depositar(float v){
		if (this.getStatus()){
			this.setSaldo (this.getSaldo() + v);
			System.out.println("Deposito realizado na conta do(a) cliente "+ this.getDono());
		}else{
			System.out.println("Impossível depositar em conta fechada");
		}
	}
	public void sacar(float v){
		if (this.getStatus()){	
			if (this.getSaldo()>=v){
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de "+this.getDono());
			}else{
				System.out.println("Saldo insuficiente para saque");
			}
		}else{
			System.out.println("Impossível sacar de conta fechada!");
		}
	}
	public void pagarMensal(){
		int v = 0;
		if (this.getTipo() == "CC"){
			v = 12;
		}else if (this.getTipo() == "CP"){
			v = 20;
		}
		if (this.getStatus()){
			this.setSaldo(this.getSaldo()-v);
			System.out.println("Mensalidade paga com sucesso por "+this.getDono());
		}else{
			System.out.println("Impossível pagar uma conta fechada!");
		}
	}
	//Métodos Especiais
	
	public ContaBanco(){
		this.saldo = 0;
		this.status = false;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	private void setSaldo(float saldo) {
		this.saldo = saldo;
		
	}
	private float getSaldo(){
		return saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
