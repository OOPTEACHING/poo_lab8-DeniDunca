package numeric;


public class Matrice  {
	public Complex[][] elementeComplex;
	private int linii;
	private int coloane;
	
	public Matrice(int linii, int coloane, Complex[] elementeComplex) {
		this.linii = linii;
		this.coloane = coloane;
		this.elementeComplex = new Complex[linii][coloane];
		this.elementeComplex[0][0] = elementeComplex[0];
		this.elementeComplex[0][1] = elementeComplex[1];
		this.elementeComplex[1][0] = elementeComplex[2];
		this.elementeComplex[1][1] = elementeComplex[3];

	}
	
	public Matrice(int linii, int coloane) {
		this.linii = linii;
		this.coloane = coloane;
		this.elementeComplex = new Complex[linii][coloane];
	}
	
	public int getLinii() {
		return this.linii;
	}

	public void setLinii(int linii) {
		this.linii = linii;
	}

	public int getColoane() {
		return this.coloane;
	}

	public void setColoane(int coloane) {
		this.coloane = coloane;
	}
	public Matrice() {

		this(2, 2, new Complex[4]);
	}
	

	public Matrice adunareMatrici(Matrice matrice2) {
		Matrice sumaMat = new Matrice();
		sumaMat.elementeComplex[0][0].adunare(matrice2.elementeComplex[0][0].getReal(),matrice2.elementeComplex[0][0].getImaginar());
		sumaMat.elementeComplex[0][1].adunare(matrice2.elementeComplex[0][1].getReal(),matrice2.elementeComplex[0][1].getImaginar());
		sumaMat.elementeComplex[1][0].adunare(matrice2.elementeComplex[1][0].getReal(),matrice2.elementeComplex[1][0].getImaginar());
		sumaMat.elementeComplex[1][1].adunare(matrice2.elementeComplex[1][1].getReal(),matrice2.elementeComplex[1][1].getImaginar());
		return sumaMat;
	}

	public Matrice scadereMatrici(Matrice matrice2) {
		Matrice difMat = new Matrice();
		difMat.elementeComplex[0][0].scadere(matrice2.elementeComplex[0][0].getReal(),matrice2.elementeComplex[0][0].getImaginar());
		difMat.elementeComplex[0][1].scadere(matrice2.elementeComplex[0][1].getReal(),matrice2.elementeComplex[0][1].getImaginar());
		difMat.elementeComplex[1][0].scadere(matrice2.elementeComplex[1][0].getReal(),matrice2.elementeComplex[1][0].getImaginar());
		difMat.elementeComplex[1][1].scadere(matrice2.elementeComplex[1][1].getReal(),matrice2.elementeComplex[1][1].getImaginar());
		return difMat;
	}
	
	public Matrice inmultireCuScalarMatrici(Matrice matrice2) {
		Matrice inmultireCuScalarMat = new Matrice();
		inmultireCuScalarMat.elementeComplex[0][0].inmultire(3,0);
		inmultireCuScalarMat.elementeComplex[0][1].inmultire(3,0);
		inmultireCuScalarMat.elementeComplex[1][0].inmultire(3,0);
		inmultireCuScalarMat.elementeComplex[1][1].inmultire(3,0);

		return inmultireCuScalarMat;
	}
	public void afisare() {
		for (int i = 0; i < this.linii; i++) {
			for (int j = 0; j < this.coloane; j++) {
				System.out.print(this.elementeComplex[i][j].getReal() + " " + this.elementeComplex[i][j].getImaginar() + " ");
			}
			System.out.println(" ");
		}
	}
}
 