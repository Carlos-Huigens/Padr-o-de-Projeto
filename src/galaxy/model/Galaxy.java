package galaxy.model;

public abstract class Galaxy {

	public abstract void getPecas();
	
	public void montar() {
		System.out.println("Montagem de todas as peças");
	}
	
	public void testar() {
		System.out.println("Realizando todos os testes");
	}
	
	public void embalar() {
		System.out.println("Embalando o dispositivo");
	}
}
