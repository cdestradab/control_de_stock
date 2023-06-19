
public class PruebaConstructor {
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(-4);
		Cuenta cuenta2 = new Cuenta(44);
		Cuenta cuenta3 = new Cuenta(55);
		
		System.out.println(Cuenta.getTotal());
		System.out.println(Cuenta.getTotal());
	}
}
