
public class CanastaSofisticada extends Canasta{
	private int jamonCrudo;

	//Getters, Setters y Construcctores
	public CanastaSofisticada() {
		
	}
	public CanastaSofisticada(int agua, int jamonCrudo) {
		super(agua);
		this.jamonCrudo = jamonCrudo;
	}
	
	public int getJamonCrudo() {
		return jamonCrudo;
	}
	public void setJamonCrudo(int jamonCrudo) {
		this.jamonCrudo = jamonCrudo;
	}

	//Metodos
	public int niveDeCache() {
		return 100 - getAgua() * jamonCrudo;
	}
}