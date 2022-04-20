/**
 * Escribe una clase Cuenta para representar una cuenta bancaria. Los datos de la
 * cuenta son: nombre del cliente (String), n�mero de cuenta (String), tipo de inter�s
 * (double) y saldo (double). La clase contendr� los siguientes m�todos: Constructor
 * por defecto y Constructor con todos los par�metros Constructor copia. 
 * M�todos
 * setters/getters para asignar y obtener los datos de la cuenta. 
 * M�todos ingreso y reintegro. 
 * Un ingreso consiste en aumentar el saldo en la cantidad que se indique. Esa cantidad no puede ser negativa. 
 * Un reintegro consiste en disminuir el saldo en una cantidad pero antes se debe comprobar que hay saldo suficiente. La cantidad no
 * puede ser negativa. 
 * Los m�todos ingreso y reintegro devuelve true si la operaci�n se ha podido realizar o false en caso contrario. 
 * M�todo de transferencia que permita pasar dinero de una cuenta a otra siempre que en la cuenta de origen haya dinero suficiente para poder hacerla. 
 * Ejemplo de uso del m�todo transferencia:
 * cuentaOrigen.transferencia(cuentaDestino, importe); que indica que queremos hacer
 * una transferencia desde cuentaOrigen a cuentaDestino del importe indicado
 *
 * @author RODRIGO CARDOZO
 *
 */
public class Ejercicio05 {

	public static void main(String[] args) {
//	    double amount = -1;
		double amount = 120000;
		
		String clientNameOrigin   = "Rodrigo Cardozo";
		String accountTypeOrigin  = "";
		double interestTypeOrigin = 0;
		double balanceOrigin      = 180000;
		
		String clientNameDestination   = "Rodrigo Cardozo";
		String accountTypeDestination  = "";
		double interestTypeDestination = 0;
		double balanceDestination      = 320000;
		
		Cuenta cuentaOrigen  = new Cuenta(clientNameOrigin, accountTypeOrigin, interestTypeOrigin, balanceOrigin);
		Cuenta cuentaDestino = new Cuenta(clientNameDestination, accountTypeDestination, interestTypeDestination, balanceDestination);
		
		cuentaOrigen.trasferencia(cuentaDestino, amount);
		
		System.out.println(cuentaOrigen.getBalance());
		System.out.println(cuentaDestino.getBalance());
	}

}
