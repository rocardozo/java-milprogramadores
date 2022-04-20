/**
 * Crea una clase llamada Contador que contenga un único atributo entero llamado
 * cont. La clase tendrá los siguientes constructores: Constructor por defecto
 * Constructor con parámetros para inicializar el contador con un valor no negativo. Si
 * el valor inicial que se recibe es negativo el contador tomará el valor cero como valor
 * inicial. Constructor copia. Además de los métodos getter y setter, la clase contendrá
 * los métodos: incrementar: incrementa el contador en una unidad. decrementar:
 * decrementa el contador en una unidad. El contador nunca podrá tener un valor
 * negativo. Si al decrementar se alcanza un valor negativo el contador toma el valor
 * cero.
 *
 * @author RODRIGO CARDOZO
 *
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		
		int cont = 4;
		
		Contador objContador = new Contador(cont);
		
//		the counter is never less than zero
		System.out.println("Si el contador es igual a 4, y lo decremento 5 veces, nunca es menor a 0");
		for (int i = 0; i < 5; i++) {
			objContador.decrementar();
			System.out.println("Contador: " + objContador.getCont());
		}
		System.out.println("-------------------------------------------");
		
		objContador.setCont(4);
		System.out.println("Si el contador es igual a 4 y lo incrmento 5 veces es igual a 9");
		for (int j = 0; j < 5; j++) {
			objContador.incrementar();
			System.out.println("contador: " + objContador.getCont());
		}
		
		

	}

}
