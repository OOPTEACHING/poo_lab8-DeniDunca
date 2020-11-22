 package numeric;

public class Fractie implements Numeric {
	private int numitor;
	private int numarator;

	public Fractie(int numitor, int numarator) {
		this.numitor = numitor;
		this.numarator = numarator;
	}
	
	public int getNumitor() {
		return this.numitor;
	}

	public void setNumitor(int numitor) {
		this.numitor = numitor;
	}
	public int getNumarator() {
		return this.numarator;
	}

	public void setNumarator(int numarator) {
		this.numarator = numarator      ;
	}

	@Override
	public void adunare(int x, int y) {
		int numitor1, numarator1;
		numitor1 = this.numitor * x;
		numarator1 = this.numarator * x + this.numitor * y;
		System.out.println(numarator1 + "/" + numitor1);
	}

	@Override
	public void scadere(int x, int y) {
		int numitor1, numarator1;
		numitor1 = this.numitor * x;
		numarator1 = this.numarator * x - this.numitor * y;
		System.out.println(numarator1 + "/" + numitor1);

	}

	@Override
	public void inmultire(int x, int y) {
		int numitor1, numarator1;
		numitor1 = this.numitor * x;
		numarator1 = this.numarator * y;
		System.out.println(numarator1 + "/" + numitor1);

	}
}
