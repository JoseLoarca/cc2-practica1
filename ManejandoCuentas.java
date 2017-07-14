//José Loarca - 17001087
public class ManejandoCuentas {
	public static void main(String[] args) {
		/*
			SU IMPLEMENTACIÓN AQUÍ
		*/
		
		System.out.println("**** José Loarca - 17001087 - Práctica 1 ****");
		System.out.println("************ Ejercicio #1 ***********");
		
		CuentaBancaria cuenta1 = new CuentaBancaria("Rolando Andrade", "45612-4");
		
		System.out.println(cuenta1.toString());
		
		CuentaBancaria cuenta2;
		
		//System.out.println(cuenta2.toString());
		
		CuentaBancaria cuenta3 = null;
		
		//System.out.println(cuenta3);
		
		cuenta2 = new CuentaBancaria("Daniela Reyes", "93267-1", 100, 0.03);
		
		System.out.println(cuenta2.toString());
		
		cuenta1.abonar(250.00);
		System.out.println(cuenta1.toString());
		
		cuenta2.retirar(10.00);
		System.out.println(cuenta2.toString());
		
		cuenta3 = new CuentaBancaria("José Loarca", "12345-6");
		
		cuenta3.tasaInteres = 0.05;
		
		cuenta3.abonar(1000.00);
		
		System.out.println(cuenta3.toString());
		
		double a = cuenta1.calcularInteres();
		double b = cuenta2.calcularInteres();
		double c = cuenta3.calcularInteres();
		
		System.out.println("Interés cuenta1: " + a);
		System.out.println("Interés cuenta2: " + b);
		System.out.println("Interés cuenta3: " + c);
	}
}
