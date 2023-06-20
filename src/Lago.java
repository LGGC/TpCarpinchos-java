import java.util.ArrayList;
import java.util.Iterator;

public class Lago {
	private static final int limiteCache = 100;
	private ArrayList<Carpincho> lago = new ArrayList<Carpincho>();

	// Getters, Setters y Construcctores
	public Lago() {
	}

	public ArrayList<Carpincho> getLago() {
		return lago;
	}

	public void setLago(ArrayList<Carpincho> lago) {
		this.lago = lago;
	}

	public void agregarCarpincho(Carpincho carpincho) {
		lago.add(carpincho);
	}

	// Metodos
	public int numeroTotalDeCache() {
		int totalCache = 0;
		for (Carpincho carpincho : lago) {
			totalCache += carpincho.cacheDeCanastas();
		}
		return totalCache;
	}

	public boolean estamosEnLaBrisol() {
		return numeroTotalDeCache() / lago.size() > limiteCache * 0.8;
	}
}