import java.util.Scanner;

/**
 * Crear una clase llamada Persona con los atributos: Nombre, Apellido, DNI, Domicilio.
 * Con los métodos: Constructor y un método que permita mostrar la información de la
 * persona.
 *
 * @author RODRIGO CARDOZO
 *
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nombre, apellido, domicilio;
		int dni;
		
		System.out.println("ingrese su nombre: ");
		nombre = teclado.nextLine();
		
		System.out.println("Ingrese su apellido: ");
		apellido = teclado.nextLine();
		
		System.out.println("Ingrese su domicilio: ");
		domicilio = teclado.nextLine();
		
		System.out.println("Ingrese su dni: ");
		dni = teclado.nextInt();		
		
		Persona objPersona = new Persona(nombre, apellido, dni, domicilio);
		
		objPersona.mostrarInfoPersona();
		
		teclado.close();
	}

}
