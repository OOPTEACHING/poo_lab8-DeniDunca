package shallow;

public class StudentDeep implements Cloneable {
	public String nume;
	public String prenume;
	public MasinaDeep masina;

	public StudentDeep(String nume, String prenume, MasinaDeep masina) {
		this.nume = nume;
		this.prenume = prenume;
		this.masina = masina;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		StudentDeep student = (StudentDeep) super.clone();
		student.masina = (MasinaDeep) masina.clone();
		return student;
	}

}
