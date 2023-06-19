public class CrearCuenta {

    public static void main(String[] args) {

        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.depositar(200);
        System.out.println(primeraCuenta.getSaldo());

        primeraCuenta.depositar(200);
        System.out.println(primeraCuenta.getSaldo());

        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.depositar(50);

        System.out.println("primera cuenta tiene " + primeraCuenta.getSaldo());
        System.out.println("segunda cuenta tiene " + segundaCuenta.getSaldo());

    }
}