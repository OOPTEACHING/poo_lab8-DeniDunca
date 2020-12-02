package shallow;

public class Masina {
	public String marca;
	public String culoare;

	public Masina(String marca, String culoare) {
		this.marca = marca;
		this.culoare = culoare;
	}

	public void revopsire(String culoare) {
		this.culoare = culoare;
	}

}
