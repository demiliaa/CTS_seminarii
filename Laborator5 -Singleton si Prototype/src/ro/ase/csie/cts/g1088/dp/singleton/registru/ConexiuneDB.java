package ro.ase.csie.cts.g1088.dp.singleton.registru;

import java.util.Hashtable;

public class ConexiuneDB {

	String ip;
	String denumire;
	
	private static Hashtable<String, ConexiuneDB> conexiuni=new Hashtable<>();

	private ConexiuneDB(String ip, String denumire) {
		super();
		this.ip = ip;
		this.denumire = denumire;
	}
	
	public static ConexiuneDB getConexiune(String ip, String denumire) {
		ConexiuneDB conexiune=conexiuni.get(ip);
		if(conexiune==null) {
			conexiune=new ConexiuneDB(ip, denumire);
			conexiuni.put(ip, conexiune);
		}
		return conexiune;
	}
}
