package ro.ase.csie.cts.g1088.dp.singleton;

public class ConexiuneDB {
	String ip;
	String denumire;
	
	//Versiune EAGER
	//private static ConexiuneDB conexiune=new ConexiuneDB("10.0.0.1", "CTS");
	
	private static ConexiuneDB conexiune=null;
	
	private ConexiuneDB() {
		
	}

//am modif constr in private
	private ConexiuneDB(String ip, String denumire) {
		System.out.println("apel constructor");
		this.ip = ip;
		this.denumire = denumire;
	}
	
	
	//versiune LAZY
	public static synchronized ConexiuneDB getConexiune() {
		if(conexiune==null) {
		//datele se pot prelua din fisiere de configurare
		conexiune=new ConexiuneDB("10.0.0.1", "cts");
	}
	return conexiune;
	}

}
