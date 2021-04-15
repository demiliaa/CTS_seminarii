package ro.ase.csie.cts.g1088.dp.decorator;

public class DecoratorEsteRanit extends DecoratorErouAbstract{

	private static final int NIVEL_CRITIC = 0;

	public DecoratorEsteRanit(SuperErou erou) {
		super(erou);
		
	}

	@Override
	public void alearga() {
		if(this.erou.puncteViata<NIVEL_CRITIC) {
			System.out.println("Eroul nu mai poate alerga, este ranit");
		}
		else {
			erou.alearga();
		}
	}

	
}
