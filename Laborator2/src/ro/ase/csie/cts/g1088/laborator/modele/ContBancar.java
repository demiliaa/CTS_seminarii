package ro.ase.csie.cts.g1088.laborator.modele;

public abstract class ContBancar extends Cont {
	protected double balanta;
	protected String iban;

	public ContBancar(double balanta, String iban) {
		this.balanta = balanta; // sau balanta = balanta;
		this.iban = iban; // sau iban = iban;
	}

	// supradefinire metoda balanta
	@Override
	public double getBalanta() {
		return this.balanta;
	}

	// sau source -> override methods

}
