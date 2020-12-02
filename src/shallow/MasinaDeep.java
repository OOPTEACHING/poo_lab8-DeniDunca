package shallow;

public class MasinaDeep implements Cloneable {
	public String marca;
	public String culoare;

	public MasinaDeep(String marca, String culoare) {
		this.marca = marca;
		this.culoare = culoare;
	}

	public void revopsire(String culoare) {
		this.culoare = culoare;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
