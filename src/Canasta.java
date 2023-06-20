
public class Canasta {
	
	private int agua;
	
	//getters, setters y construcctores

	public Canasta() {
	}
	public Canasta(int agua) {
		this.agua = agua;
	}
	
	public int getAgua() {
		return agua;
	}
	public void setAgua(int agua) {
		this.agua = agua;
	}
	
	
	//Metodos
	public int nivelDeCache() {
		return 100;
	}
}
