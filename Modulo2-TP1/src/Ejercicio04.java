/**
 * Crea una clase llamada Contador que contenga un �nico atributo entero llamado
 * cont. La clase tendr� los siguientes constructores: Constructor por defecto
 * Constructor con par�metros para inicializar el contador con un valor no negativo. Si
 * el valor inicial que se recibe es negativo el contador tomar� el valor cero como valor
 * inicial. Constructor copia. Adem�s de los m�todos getter y setter, la clase contendr�
 * los m�todos: incrementar: incrementa el contador en una unidad. decrementar:
 * decrementa el contador en una unidad. El contador nunca podr� tener un valor
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
