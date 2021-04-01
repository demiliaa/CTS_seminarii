package ro.ase.csie.cts.g1088.dp.factory;

public class CaracterDisney extends CaracterAbstract {
	String culoare;
	boolean okPentruCopiiMici;

	@Override
	public void alearga() {
		System.out.println("Alearga...");
		
	}

	@Override
	public void sare() {
		System.out.println("Sare...");
		
	}

	public CaracterDisney(String nume, String culoare) {
		this.nume=nume;
		this.culoare = culoare;
	}
	
	

}
