
public class Persona {
//	attributes	
	 private String nombre;
	 private String apellido;
	 private int dni;
	 private String domicilio;
	 
	 
//	 methods	 
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String nombre, String apellido, int dni, String domicilio) {
		this.nombre    = nombre;
		this.apellido  = apellido;
		this.dni       = dni;
		this.domicilio = domicilio;
	}
	 
	public void mostrarInfoPersona() {
		
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("DNI: " + this.dni);
		System.out.println("Domicilio: " + this.domicilio);
	}
	 
	 
}
