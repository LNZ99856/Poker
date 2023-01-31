import java.util.Arrays;



public class Baraja {
	private Carta[] cartas;

	public void generarBaraja() {
		this.cartas = new Carta[54];
		String[] valores = { "Ac", "2c", "3c", "4c", "5c", "6c", "7c", "8c", "9c", "10c", "Jc", "Qc", "Kc", "Ap", "2p",
				"3p", "4p", "5p", "6p", "7p", "8p", "9p", "10p", "Jp", "Qp", "Kp", "At", "2t", "3t", "4t", "5t", "6t",
				"7t", "8t", "9t", "10t", "Jt", "Qt", "Kt", "Ad", "2d", "3d", "4d", "5d", "6d", "7d", "8d", "9d", "10d",
				"Jd", "Qd", "Kd", "J1", "J2" };
		for (int i = 0; i < valores.length; i++) {
			this.cartas[i] = new Carta(valores[i], true);
		}
	}

	private Carta darCarta() {
		Carta devolver = new Carta();
		devolver.getValor();
		return devolver;

	}

	// getters, setters y toString
	public Carta[] getCartas() {
		return cartas;
	}

	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}

	@Override
	public String toString() {
		String devolver = "[";
		for (int i = 0; i < cartas.length; i++) {
			devolver += cartas[i] + ",";
		}
		devolver += "]";
		return devolver;
	}

}
