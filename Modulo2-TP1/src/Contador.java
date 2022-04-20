
public class Contador {

//	attributes
	private int cont;
	
	
//	methods
	
	public Contador() {
		// TODO Auto-generated constructor stub
	}
	
	public Contador(int cont) {
		if (cont <= 0) {
			this.cont = 0;
		}
		this.cont = cont;
	}
	
	
//	setter
	
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	
//	getter
	public int getCont() {
		return cont;
	}
	
	
	public void incrementar() {
		
		this.cont++;
	}
	
	public void decrementar() {
		
		if (cont <= 0) {
			this.cont = 0;
		} else {
			this.cont--;
		}
	}
	
}
