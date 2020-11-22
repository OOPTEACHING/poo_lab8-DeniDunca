package numeric;


public class Main {

	public static void main(String[] args) {
		Complex val0 = new Complex(2, 1);
		Complex val1 = new Complex(1, 3);
		Complex val2 = new Complex(4, 2);
		Complex val3 = new Complex(2, 3);
		
		Matrice matrice = new Matrice(2, 2, new Complex[] { val0, val1, val2, val3 });


		Matrice rezultatAdunare = matrice.adunareMatrici(matrice);
		rezultatAdunare.afisare();

		Matrice rezultatScadere = matrice.scadereMatrici(matrice);
		rezultatScadere.afisare();

		Matrice rezultatInmultireScalar = matrice.inmultireCuScalarMatrici(matrice);
		rezultatInmultireScalar.afisare();
		
		
		Fractie val4 = new Fractie(2, 1);
		Fractie val5 = new Fractie(1, 3);
		Fractie val6 = new Fractie(4, 2);
		Fractie val7 = new Fractie(2, 3);
		
		MatriceCuFractii matricef = new MatriceCuFractii(2,2,new Fractie[] {val4,val5,val6,val7});
		
		MatriceCuFractii rezFractii = matricef.adunareMatriciFractie(matricef);
		rezFractii.afisareFractii();
		
	}

}
