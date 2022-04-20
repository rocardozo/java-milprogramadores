
public class Cuenta {

//	attributes
	
	private String clientName;
	private String accountNumber;
	private double interestType;
	private double balance;
	
	
// 	methods
	
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}
	
	public Cuenta(String clientName, String accountNumber, double interestType, double balance) {
		
		this.clientName    = clientName;
		this.accountNumber = accountNumber;
		this.interestType  = interestType;
		this.balance       = balance;
	}
	
	
//	getters
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getClientName() {
		return clientName;
	}
	
	public double getInterestType() {
		return interestType;
	}
	
	
//	setters
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public void setInterestType(double interestType) {
		this.interestType = interestType;
	}
	
	
	public boolean ingreso(double amount) {
		if (amount >= 0 ) {
			this.balance += amount;
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean reintegro(double amount) {
		if ( (amount >= 0) && (this.balance >= amount)) {
			this.balance -= amount;
			return true;
		} else {
			return false;
		}
	}
	
	public void trasferencia(Cuenta cuentaDestino, double amount) {
		if (this.balance >= amount) {
			if (this.reintegro(amount)) {
				cuentaDestino.ingreso(amount);
			} else {
				System.out.println("Algo Salio mal al intentar la trasferencia");
			}			
		} else {
			System.out.println("No tiene saldo disponible para realizar la tranferencia...");
		}
	}
	
	
	
}
