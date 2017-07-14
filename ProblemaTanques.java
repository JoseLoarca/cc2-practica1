//José Loarca - 17001087
public class ProblemaTanques {
	public static void main(String[] args) {
		/*
			SU IMPLEMENTACIÓN AQÚI
		*/
		
		System.out.println("**** José Loarca - 17001087 - Práctica 1 ****");
		System.out.println("************ Ejercicio #3 ***********");
		
		Tanque contenedor = new Tanque("Contenedor", 50.00, 50.00);
		
		Tanque residuo = new Tanque("Residuo", 30.00, 0.00);
		
		contenedor.trasladarContenidoAlTanque(residuo);
		
		residuo.vaciar();
		
		contenedor.trasladarContenidoAlTanque(residuo);
		
		contenedor.llenar();
		
		contenedor.trasladarContenidoAlTanque(residuo);
		
		System.out.println("Resultado del tanque marca 'Contenedor': " + contenedor.toString());
	}
}
