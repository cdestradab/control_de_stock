
class Cuenta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	private static int total = 0;
	
	//public Cuenta() {}
	
	public Cuenta(int agencia) {
		if (agencia <= 0) {
			System.out.println("Ingrese un código de agencia correcto");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		System.out.println("Se creó la cuenta #" + total);
		
		total = total + 1;
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	
	public void setAgencia(int nuevaAgencia){
		if (agencia > 0) {
			this.agencia = nuevaAgencia;
		} else {
			System.out.println("No están permitidos valores negativos");
		}
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Cuenta.total;
	}

	
	
}