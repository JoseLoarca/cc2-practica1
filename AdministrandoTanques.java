//José Loarca - 17001087
public class AdministrandoTanques {
	public static void main(String[] args) throws Exception {
		/* 
			SU IMPLEMENTACIÓN AQUÍ
		*/
		
		System.out.println("**** José Loarca - 17001087 - Práctica 1 ****");
		System.out.println("************ Ejercicio #2 ***********");
		
		Tanque tanque1 = new Tanque("Agua Siempre", 15.00, 10.00);
		System.out.println(tanque1.toString());
		
		Tanque tanque2 = new Tanque("Tanques Pro", 20.00);
		System.out.println(tanque2.toString());
		
		Tanque tanque3 = new Tanque(5.00);
		System.out.println(tanque3.toString());
		
		tanque1.llenar();
		tanque2.vaciar();
		tanque3.agregar(3.00);
		
		System.out.println(tanque1);
		System.out.println(tanque2);
		System.out.println(tanque3);
		
		//Línea comentada para evitar excepciones
		//tanque1.agregar(2.00);
		
		tanque2.trasladarContenidoAlTanque(tanque1);
		tanque1.trasladarContenidoAlTanque(tanque3);
		
		System.out.println(tanque1.toString());
		
		//Línea comentada para evitar excepciones
		//tanque3.eliminar(6.00);
	}
}
