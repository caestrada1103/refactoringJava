package refactored;

import java.util.List;

public class Cliente {
	private String NameClient;
	private String LastNameClient1;
	private String LastNameClient2;
	private String Identification;
	
	public Cliente() {
		this.NameClient = "Antonio";
		this.LastNameClient1 = "Zapata";
		this.LastNameClient2 = "Restrepo";
		this.Identification = "123456789";
	}
	
	List<Compras> cmp; // Compras is an object, only for example
	
	private void DetailClient(String Name, String LastName1, String LastName2, String Identification) {
		System.out.println("Nombre: "+Name);
		System.out.println("Apellido 1: "+LastName1);
		System.out.println("Apellido 2: "+LastName2);
		System.out.println("Numero de documento: "+Identification);
	}
	public void impInfoPersonalCliente() {
		DetailClient(NameClient, LastNameClient1,LastNameClient2,Identification);
	}
	public void impTodaInfoCliente() {
		DetailClient(NameClient, LastNameClient1,LastNameClient2,Identification);
		
		for (Compras cmpLocal : cmp) {
			System.out.println(cmpLocal);
		}
	}
}
