
public class TestReferencia3 {
	
	public static void main(String[] args) {
		Cuenta cuentaDeCristian = new Cuenta();
		Cliente cliente = new Cliente();
		cuentaDeCristian.titular = cliente;
		
		System.out.println(cuentaDeCristian.titular.nombre);
	}
}
