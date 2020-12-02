package numeric;

public class MatriceCuFractii {
	public Fractie[][] elementeFractie;
	private int linii;
	private int coloane;
	
	public MatriceCuFractii(int linii, int coloane, Fractie[] elementeFractie) {
		this.linii = linii;
		this.coloane = coloane;
		this.elementeFractie = new Fractie[linii][coloane];
		this.elementeFractie[0][0] = elementeFractie[0];
		this.elementeFractie[0][1] = elementeFractie[1];
		this.elementeFractie[1][0] = elementeFractie[2];
		this.elementeFractie[1][1] = elementeFractie[3];

	}
	
	public MatriceCuFractii(int linii, int coloane) {
		this.linii = linii;
		this.coloane = coloane;
		this.elementeFractie = new Fractie[linii][coloane];
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
	public MatriceCuFractii() {

		this(2, 2, new Fractie[4]);
	}
	public MatriceCuFractii adunareMatriciFractie(MatriceCuFractii matrice2) {
		MatriceCuFractii sumaMat = new MatriceCuFractii();
		sumaMat.elementeFractie[0][0].adunare(matrice2.elementeFractie[0][0].getNumitor(),matrice2.elementeFractie[0][0].getNumarator());
		sumaMat.elementeFractie[0][1].adunare(matrice2.elementeFractie[0][1].getNumitor(),matrice2.elementeFractie[0][1].getNumarator());
		sumaMat.elementeFractie[1][0].adunare(matrice2.elementeFractie[1][0].getNumitor(),matrice2.elementeFractie[1][0].getNumarator());
		sumaMat.elementeFractie[1][1].adunare(matrice2.elementeFractie[1][1].getNumitor(),matrice2.elementeFractie[1][1].getNumarator());
		return sumaMat;
	}
	
	public MatriceCuFractii scadereMatriciFractie(MatriceCuFractii matrice2) {
		MatriceCuFractii difMat = new MatriceCuFractii();
		difMat.elementeFractie[0][0].scadere(matrice2.elementeFractie[0][0].getNumitor(),matrice2.elementeFractie[0][0].getNumarator());
		difMat.elementeFractie[0][1].scadere(matrice2.elementeFractie[0][1].getNumitor(),matrice2.elementeFractie[0][1].getNumarator());
		difMat.elementeFractie[1][0].scadere(matrice2.elementeFractie[1][0].getNumitor(),matrice2.elementeFractie[1][0].getNumarator());
		difMat.elementeFractie[1][1].scadere(matrice2.elementeFractie[1][1].getNumitor(),matrice2.elementeFractie[1][1].getNumarator());
		return difMat;
	}
	
	public MatriceCuFractii inmultireCuScalarMatriciFractii(MatriceCuFractii matrice2) {
		MatriceCuFractii inmultireCuScalarMat = new MatriceCuFractii();
		inmultireCuScalarMat.elementeFractie[0][0].inmultire(3,0);
		inmultireCuScalarMat.elementeFractie[0][1].inmultire(3,0);
		inmultireCuScalarMat.elementeFractie[1][0].inmultire(3,0);
		inmultireCuScalarMat.elementeFractie[1][1].inmultire(3,0);

		return inmultireCuScalarMat;
	}
	
	public void afisareFractii() {
		for (int i = 0; i < this.linii; i++) {
			for (int j = 0; j < this.coloane; j++) {
				System.out.print(this.elementeFractie[i][j].getNumitor() + "/" + this.elementeFractie[i][j].getNumarator() + " ");
			}
			System.out.println(" ");
		}
	}
}
