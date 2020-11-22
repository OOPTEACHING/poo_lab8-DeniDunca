package shallow;

public class MainMasina {
	public static void main(String[] args) {

		Masina masina1 = new Masina("Audi", "Alb");
		Student student = new Student("Ana", "Pop", masina1);

		Student student2 = null;
		try {
			student2 = (Student) student.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(student.masina.culoare);
		System.out.println(student2.masina.culoare);

		student2.masina.revopsire("Negru");
		System.out.println(student.masina.culoare);
		System.out.println(student2.masina.culoare);

		MasinaDeep masina2 = new MasinaDeep("Audi", "Alb");
		StudentDeep student3 = new StudentDeep("Ana", "Pop", masina2);

		StudentDeep student4 = null;
		try {
			student4 = (StudentDeep) student3.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(student.masina.culoare);
		System.out.println(student2.masina.culoare);

		student4.masina.revopsire("Negru");
		System.out.println(student.masina.culoare);
		System.out.println(student2.masina.culoare);

	}
}