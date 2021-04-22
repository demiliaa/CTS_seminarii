package ro.ase.csie.cts.g1988.dp.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyLogin implements InterfataLogin {
	
	InterfataLogin modulOficial;
	public static int NR_MAXIM = 3;
	Map<String, Integer> utilizatori = new HashMap<>();

	@Override
	public boolean login(String user, String password) {
		Integer nrIncercari = utilizatori.get(user);
		if (nrIncercari == null) {
			utilizatori.put(user, 0);
			nrIncercari = 0;
		}
		if (nrIncercari >= NR_MAXIM) {
			return false;
		}
		if (modulOficial.login(user, password)) {
			utilizatori.put(user, 0);
			return true;
		} else {
			nrIncercari += 1;
			utilizatori.put(user, nrIncercari);
			if (nrIncercari == NR_MAXIM) {
				System.out.println("Blocare cont");
			}
			return false;
		}
	}

	@Override
	public boolean verificaStatusServer() {
		return modulOficial.verificaStatusServer();
	}

}
