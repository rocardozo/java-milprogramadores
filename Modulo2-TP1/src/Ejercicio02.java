import java.util.Scanner;

/**
 * Crear una clase llamada serie con los atributos: titulo, n�meros de temporadas,
 * g�nero y creador. Con los siguientes m�todos: Constructor, mostrar todos los
 * atributos, sobrescribir todos los atributos
 * 
 * @author RODRIGO CARDOZO
 *
 */
public class Ejercicio02 {

	public static void main(String[] args) {
//		attributes
		String title, gender, creator;
		int seasons;
		Scanner teclado = new Scanner(System.in);
		
//		I create my first serie object
		Serie objSerie = new Serie("Game of Thrones", 8, "Fantas�a\r\n" + "Drama\r\n" + "Acci�n\r\n" + "Aventura\r\n" + "Terror\r\n" + "Humor negro", "David Benioff & D. B. Weiss");
		
//		show data
		System.out.println("Primera Serie: ");
		objSerie.show();
		System.out.println("-----------------------------------------------------------------------");
		
//		overwrite serie object
		System.out.println("Ingrese un nuevo t�tulo: ");
		title = teclado.nextLine();
		
		System.out.println("Ingrese un nuevo g�nero: ");
		gender = teclado.nextLine();
		
		System.out.println("Ingrese un nuevo creador: ");
		creator = teclado.nextLine();
		
		System.out.println("Ingrese un nuevo n�mero de temporadas: ");
		seasons = teclado.nextInt();
		
		objSerie.setTitle(title);
		objSerie.setSeasons(seasons);
		objSerie.setGender(gender);
		objSerie.setCreator(creator);
		
//		show overwrite serie object
		objSerie.show();
		
		teclado.close();
		
	}

}
