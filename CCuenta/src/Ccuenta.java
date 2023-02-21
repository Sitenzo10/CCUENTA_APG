
public class Ccuenta {

	// Atributos de cuenta
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	public Ccuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
		this.nombre=nombre;
		this.cuenta = cuenta;
		this.saldo = saldo;
		this.tipoInteres=tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	// Para probar Junit
	public void ingresar(double cantidad) {
		if (cantidad < 0)
			System.out.println("Cantidad negativa");
		saldo = saldo + cantidad;
	}

	// Para probar JUnit
	public void retirar(double cantidad) {
		if (cantidad < 0)
			System.out.println("Cantidad Negativa");
		if (this.getSaldo() < cantidad)
			System.out.println("Saldo insuficiente");
		saldo = saldo - cantidad;
	}

	// Método que me devuelve el número de cuenta
	public String getCuenta() {
		return cuenta;
	}
	public String getNombre(){
		return nombre;
	}
}
