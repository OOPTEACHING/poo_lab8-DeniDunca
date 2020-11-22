package numeric;

public class Complex implements Numeric{

	private int real;
	private int imaginar;

	public Complex(int real, int imaginar) {
		this.real = real;
		this.imaginar = imaginar;
	}
	public int getReal() {
		return this.real;
	}

	public void setReal(int real) {
		this.real = real;
	}
	public int getImaginar() {
		return this.imaginar;
	}

	public void setImaginar(int imaginar) {
		this.imaginar = imaginar;
	}
	
	@Override
	public void adunare(int x, int y) {
		this.real = this.real + x;
		this.real = this.imaginar + y;
		
	}

	@Override
	public void scadere(int x, int y) {
		this.real = this.real - x;
		this.real = this.imaginar - y;
		}

	@Override
	public void inmultire(int x, int y) {
		this.real = this.real * x - this.imaginar * y;
		this.imaginar = this.real + y + this.imaginar * x;		
	}

}
