import java.util.ArrayList;

public class Carpincho {
	private String nombre;
	private int indiceDeAgradoDelMate;
	private ArrayList<Canasta> canastas = new ArrayList<Canasta>();
	
	public Carpincho() {}

	//Getters, Setters y Construcctores
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIndiceDeAgradoDelMate() {
		return indiceDeAgradoDelMate;
	}
	public void setIndiceDeAgradoDelMate(int indiceDeAgradoDelMate) {
		this.indiceDeAgradoDelMate = indiceDeAgradoDelMate;
	}
	public ArrayList<Canasta> getCanastas() {
		return canastas;
	}
	public void setCanastas(ArrayList<Canasta> canastas) {
		this.canastas = canastas;
	}
	
	public void agregarCanasta(Canasta canasta) {
		canastas.add(canasta);
	}

	//Metodos
	public int cacheDeCanastas() {
		int nivelCache = 0;
		for (Canasta canasta : canastas) {
			nivelCache += canasta.nivelDeCache();
		}
		return nivelCache;
	}
}