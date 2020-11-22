package persoana;

public class Persoana implements Comparable<Persoana> {
	public String nume;
	public String prenume;
	public int varsta;

	public Persoana(String nume, String prenume, int varsta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
	}

	@Override
	public int compareTo(Persoana persoana) {

		// return this.nume.compareTo(persoana.nume);
		if (this.varsta < persoana.varsta) {
			return -1;
		} else if (this.varsta > persoana.varsta) {
			return 1;
		} else {
			return 0;
		}

	}

}
