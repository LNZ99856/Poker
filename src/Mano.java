import java.util.Arrays;

public class Mano {
	private Carta[] cartas;
	private String nombreMano;
	private int indice;
	private int numeroCartas;

	// Creamos constructor con parámetros
	public Mano(String nombreMano, int tamanioMano) {
		this.cartas = cartas;
		this.nombreMano = nombreMano;
		this.indice = indice;
		this.numeroCartas = tamanioMano;
	}

	private void cogerCarta(Carta cartaRobada) {

	}

	// getters, setters y toString
	public Carta[] getCartas() {
		return cartas;
	}

	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}

	public String getNombreMano() {
		return nombreMano;
	}

	public void setNombreMano(String nombreMano) {
		this.nombreMano = nombreMano;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public int getNumeroCartas() {
		return numeroCartas;
	}

	public void setNumeroCartas(int numeroCartas) {
		this.numeroCartas = numeroCartas;
	}

	@Override
	public String toString() {
		return "Mano [cartas=" + Arrays.toString(cartas) + ", nombreMano=" + nombreMano + ", indice=" + indice
				+ ", numeroCartas=" + numeroCartas + "]";
	}

}
