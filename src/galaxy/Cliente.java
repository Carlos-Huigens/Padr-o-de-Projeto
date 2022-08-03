package galaxy;

import galaxy.factory.GalaxySimpleFactory;
import galaxy.model.Galaxy;

public class Cliente {

	public static void main(String[] args) {
		
		System.out.println(">>>> Encomendar um Galaxy S22 <<<<");
		Galaxy galaxy = GalaxySimpleFactory.pedidoGalaxy("S", "avançado");
		System.out.println(galaxy);
		
		System.out.println(">>>> Encomendar um Galaxy ZFold3 <<<<");
		Galaxy galaxy4 = GalaxySimpleFactory.pedidoGalaxy("Z", "ultra avançado");
		System.out.println(galaxy4);
	}
}

