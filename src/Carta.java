
public class Carta {
	private String valor;
	private boolean enBaraja;
	//Creamos constructor con parámetros
	public Carta(String valor, boolean enBaraja) {
		this.valor = valor;
		this.enBaraja = true;
	}
	//Creamos constructor copia
	public Carta() {
		this.valor = valor;
		this.enBaraja = true;
	}

	// getters, setters y toString
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public boolean getEnBaraja() {
		return enBaraja;
	}

	public void setEnBaraja(boolean enBaraja) {
		this.enBaraja = enBaraja;
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", enBaraja=" + enBaraja + "]";
	}

}
