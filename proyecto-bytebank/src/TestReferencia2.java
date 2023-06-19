
public class TestReferencia2 {
	
	public static void main(String[] args) {
		Cliente cristian = new Cliente();
		
		cristian.nombre = "Cristian";
		cristian.documento = "32423424";
		cristian.telefono = "234234234";
		
		Cuenta cuentaDeCristian = new Cuenta();
		cuentaDeCristian.agencia = 1;
		cuentaDeCristian.titular = cristian;
		
		System.out.println(cuentaDeCristian.titular.documento);
	}
}
