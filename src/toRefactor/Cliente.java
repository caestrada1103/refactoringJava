package toRefactor;

import java.util.List;

public class Cliente {
	List<Compras> cmp; // Compras is an object, only for example
	
	public void impInfoPersonalCliente() {
		System.out.println("Nombre: "+"Antonio");
		System.out.println("Apellido 1: "+"Zapata");
		System.out.println("Apellido 2: "+"Restrepo");
		System.out.println("Numero de documento: "+"123456789");
	}
	public void impTodaInfoCliente() {
		System.out.println("Nombre: "+"Antonio");
		System.out.println("Apellido 1: "+"Zapata");
		System.out.println("Apellido 2: "+"Restrepo");
		System.out.println("Numero de documento: "+"123456789");
		
		for (Compras cmpLocal : cmp) {
			System.out.println(cmpLocal);
		}
	}
}
