package shallow;

public class Student implements Cloneable {
	public String nume;
	public String prenume;
	public Masina masina;

	public Student(String nume, String prenume, Masina masina) {
		this.nume = nume;
		this.prenume = prenume;
		this.masina = masina;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
