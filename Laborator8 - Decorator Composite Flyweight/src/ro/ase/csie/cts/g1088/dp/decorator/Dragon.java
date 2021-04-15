package ro.ase.csie.cts.g1088.dp.decorator;

public class Dragon {

	@Override
	public void alearga() {
		System.out.println("zboara catre o noua destinatie");
	}

	@Override
	public void esteLovit(int puncte) {
		System.out.println(String.format("%s este lovit si pierde %d puncte", this.nume, puncte));
		this.puncteViata -= puncte;
	}

	@Override
	public void seVindeca(int puncte) {
		System.out.println(String.format("%s este lovit si recupereaza %d puncte", this.nume, puncte));
		this.puncteViata += puncte;
	}
}
