package galaxy.factory;

import galaxy.model.Galaxy;
import galaxy.model.GalaxyS22;
import galaxy.model.GalaxyS22Ultra;
import galaxy.model.GalaxyZFlip3;
import galaxy.model.GalaxyZFold3;

public class GalaxySimpleFactory {

	public static Galaxy pedidoGalaxy(String linha, String nivel) {
		Galaxy dispositivo = null;
		
		if(linha.equals("S")) {
			if(nivel.equals("avançado")) {
				dispositivo = new GalaxyS22();
			} else if(nivel.equals("ultra avançado")) {
				dispositivo = new GalaxyS22Ultra();
			}
		} else if(linha.equals("Z")) {
			if(nivel.equals("avançado")) {
				dispositivo = new GalaxyZFlip3();
			} else if(nivel.equals("ultra avançado")) {
				dispositivo = new GalaxyZFold3();
			}
		}
		
		dispositivo.getPecas();
		dispositivo.montar();
		dispositivo.testar();
		dispositivo.embalar();
		
		return dispositivo;
	}
}
