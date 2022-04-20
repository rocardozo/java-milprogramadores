import java.util.ArrayList;

/**
 * Crea una clase DirectorCine con los atributos nombre (String), apellido(String) y edad (int). 
 * Crea los m�todos get y set para los atributos. 
 * Crea el m�todo constructor que tenga como par�metros cada uno de sus atributos. 
 * Luego crea otra clase llamada testEjercicio ( yo lo llame Ejercicio06) con el m�todo main y sigue los siguientes pasos:
 * 1) En el main, crea tres objetos DirectorCine que tengan como atributos respectivamente:
 *  Pedro, G�mez, 31.
 *  Juan, Su�rez, 55.
 *  Elena, Albucar, 29.
 * 2) Crea un ArrayList de objetos DirectorCine.
 * 3) A�ade los tres objetos DirectorCine al ArrayList usando el m�todo add
 *
 * @author RODRIGO CARDOZO
 *
 */
public class Ejercicio06 {

	public static void main(String[] args) {
		
		DirectorCine objDirector1 = new DirectorCine("Pedro", "G�mez", 31);
		DirectorCine objDirector2 = new DirectorCine("Juan", "Su�rez", 55);
		DirectorCine objDirector3 = new DirectorCine("Elena", "Albucar", 29);
		
		ArrayList<DirectorCine> lista = new ArrayList<DirectorCine>();
		
		lista.add(objDirector1);
		lista.add(objDirector2);
		lista.add(objDirector3);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Nombre: " + lista.get(i).getName());
			System.out.println("Apellido: " + lista.get(i).getLastName());
			System.out.println("Edad: " + lista.get(i).getAge());
			System.out.println("---------------------------------");
		}

	}

}
