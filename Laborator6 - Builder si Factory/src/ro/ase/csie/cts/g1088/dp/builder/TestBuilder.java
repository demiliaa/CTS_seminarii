package ro.ase.csie.cts.g1088.dp.builder;

public class TestBuilder {
	public static void main(String[] args) {
		//1. creare
		//SuperErou superErou = new SuperErou();
		//2. initializare
		//... -> datorie tehnica
		
		//superErou.nume="SuperMan";
		//SuperErou superErou2=new SuperErou("SuperMan", 100, false, false, new Arma(), null, new Laser(), null);
		
		SuperErou superman=new SuperErou.SuperErouBuilder("SuperMan", 100).build();
		SuperErou joker=new SuperErou.SuperErouBuilder("Joker", 200)
				.esteNegativ()
				.esteRanit()
				.setArmaDreapta(new Arma())
				.build();
		
		
		
	} 

}
