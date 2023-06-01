package Cinema;

public class Sala {
	private int id;
	private int filas;
	private int cadeirasFila;
	
	public Sala(int id, int filas, int cadeirasFila) {
		this.id = id;
		this.filas = filas;
		this.cadeirasFila = cadeirasFila;
	}

	public int getId() {
		return id;
	}

	public int getFilas() {
		return filas;
	}

	public int getCadeirasFila() {
		return cadeirasFila;
	}
}
