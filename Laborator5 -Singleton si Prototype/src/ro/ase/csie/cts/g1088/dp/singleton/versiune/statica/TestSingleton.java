package ro.ase.csie.cts.g1088.dp.singleton.versiune.statica;

public class TestSingleton {

	public static void main(String[] args) {
		ConexiuneDB conexiune1=ConexiuneDB.conexiune;
		ConexiuneDB conexiune2=ConexiuneDB.conexiune;
		
		if(conexiune1==conexiune2) {
			System.out.println("cele 2 conexiuni sunt identice");
		}
	}

}
