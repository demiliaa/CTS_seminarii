package ro.ase.csie.cts.g1088.dp.singleton.versiune.statica;

public class ConexiuneDB {
	String ip;
	String denumire;
	
	public static final ConexiuneDB conexiune;
	
	static {
		//preluare date conexiune din alte surse -fisiere de configurare
		String ip = "127.0.0.1";
		String denumire="dbtest";
		conexiune=new ConexiuneDB(ip, denumire);
		
	}

	private ConexiuneDB(String ip, String denumire) {
		super();
		this.ip = ip;
		this.denumire = denumire;
	}
	
	
}
