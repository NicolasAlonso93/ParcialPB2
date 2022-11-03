package Dominio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Sistema {

	private List <Transaccion> transacciones;
	private Set<Denunciable> listaNegra;
	
	public Sistema () {

		this.transacciones=new ArrayList<Transaccion>();
		this.listaNegra = new HashSet<Denunciable>();
		
	}
	
	public Boolean registrarTransaccion(Transaccion nueva) throws FraudeException{
		transacciones.add(nueva);
		
		return null;
	}
	
	

}
