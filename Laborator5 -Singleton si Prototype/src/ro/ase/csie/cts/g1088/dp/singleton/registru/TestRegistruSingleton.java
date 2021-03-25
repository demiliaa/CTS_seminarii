package ro.ase.csie.cts.g1088.dp.singleton.registru;

public class TestRegistruSingleton {
	public static void main(String[] args) {
		ConexiuneDB conexiune1=ConexiuneDB.getConexiune("10.0.01", "CTS");
		ConexiuneDB conexiune2=ConexiuneDB.getConexiune("10.0.01", "CTS");
		ConexiuneDB conexiune3=ConexiuneDB.getConexiune("127.0.01", "TEST");
		
		if(conexiune1==conexiune2) {
			System.out.println("cele 2 conexiuni sunt identice");
		}
		else
		{
			System.out.println(" cele 2 conexiuni sunt diferite");
			
		}
		if(conexiune1==conexiune3) {
			System.out.println("cele 2 conexiuni sunt identice");
		}
		else
		{
			System.out.println("cele 2 conexiuni sunt diferite");
			
		}
	}

}
