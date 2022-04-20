
public class NumeroEntero {

//	attributes
	private int value;
	
//	methods
	public NumeroEntero() {
		// TODO Auto-generated constructor stub
	}
	
	public NumeroEntero(int value) {
		
		this.value = value;
	}
	
//	setter
	
	public void setValue(int value) {
		this.value = value;
	}
	
	
//	getter
	
	public int getValue() {
		return value;
	}
	
	public int suma(NumeroEntero num) {
		
		return this.value + num.value;
	}
	
	public int resta(NumeroEntero num) {
		
		return this.value - num.value;
	}
	
	public int multiplicacion(NumeroEntero num) {
		
		return this.value * num.value;
	}
	
	public double division(NumeroEntero num) {
		try {
			return this.value / num.value;
		} catch (Exception e) {
			System.out.println("No se puede dividir por cero, " + e);
			return 0;
		}
		
	}
}
