
public class CanastaMatera extends Canasta{
	private int paquetesDeYerba;
	
	//Getters, Setters y construcctores
	public CanastaMatera() {

	}
	public CanastaMatera(int agua, int paquetesDeYerba) {
		super(agua);
		this.paquetesDeYerba = paquetesDeYerba;
	}
	
	public int getPaquetesDeYerba() {
		return paquetesDeYerba;
	}
	public void setPaquetesDeYerba(int paquetesDeYerba) {
		this.paquetesDeYerba = paquetesDeYerba;
	}
	//Metodos
}