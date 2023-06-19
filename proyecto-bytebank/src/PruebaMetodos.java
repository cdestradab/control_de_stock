
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta cuentaDeCristian = new Cuenta();
		cuentaDeCristian.depositar(300);
		
		cuentaDeCristian.depositar(200);
		
		System.out.println(cuentaDeCristian.getSaldo());
		
		cuentaDeCristian.retirar(100);
		
		System.out.println(cuentaDeCristian.getSaldo());
		
		Cuenta cuentaDeMaria = new Cuenta();
		cuentaDeMaria.depositar(1000);
		cuentaDeMaria.transferir(400, cuentaDeCristian);
		
		System.out.println(cuentaDeMaria.getSaldo());
		System.out.println(cuentaDeCristian.getSaldo());
	}
}
