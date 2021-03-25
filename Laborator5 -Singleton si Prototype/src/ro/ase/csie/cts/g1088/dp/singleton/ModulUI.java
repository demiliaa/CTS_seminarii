package ro.ase.csie.cts.g1088.dp.singleton;

public class ModulUI {
	public ModulUI() {
		//ConexiuneDB conexiune=new ConexiuneDB("10.0.0.1", "superGame");
		ConexiuneDB conexiune=ConexiuneDB.getConexiune();
	} 
}
