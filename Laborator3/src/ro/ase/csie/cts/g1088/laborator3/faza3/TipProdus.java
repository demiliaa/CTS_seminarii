package ro.ase.csie.cts.g1088.laborator3.faza3;

public enum TipProdus {
	NOU(0),DISCOUNT(0.1f),STOC_LIMITAT(0.25f),VECHI(0.35f);
	
	private final float discount; //obiecte imuabile-nu isi poate schimba valoarea (immutable)
	
	private TipProdus(float discount) {
		this.discount = discount;
	}
	
	public float getDiscount() {
		return this.discount;
	}
}
