import java.util.Scanner;

/**
 * Crear una clase NumerosEnteros y redefinir las operaciones elementales (+, -, *, /).
 * Esta clase tendr� los m�todos suma (), resta(), multiplicaci�n() y divisi�n() que
 * recibir�n como par�metros otro objeto de la misma clase NumerosEnteros.
 *
 * @author RODRIGO CARDOZO
 *
 */
public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner keyword = new Scanner(System.in);
		int number, otherNumber;
		NumeroEntero objNumber   = new NumeroEntero();  
		NumeroEntero objOtherNumber = new NumeroEntero();
		
		System.out.println("ingrese el primer n�mero: ");
		number = keyword.nextInt();
		objNumber.setValue(number);
		
		System.out.println("ingrese el segundo n�mero: ");
		otherNumber = keyword.nextInt();
		objOtherNumber.setValue(otherNumber);
		
		
		System.out.println("Suma: " + objNumber.suma(objOtherNumber));
		System.out.println("Resta: " + objNumber.resta(objOtherNumber));
		System.out.println("Multiplicaci�n: " + objNumber.multiplicacion(objOtherNumber));
		System.out.println("Division: " + objNumber.division(objOtherNumber));
		
		keyword.close();
	}

}
