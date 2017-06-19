package array;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int [] nombres;
		int [][] matrice;
		
		int [] initNombres = {21,20,3,49,5,65};
		int [][] initMatrice = {{0,1},{1,1}}; 
		int [] copieInitNombres1;
		int [] copieInitNombres2;
		
		
		nombres = new int[12];
		matrice = new int[3][3];
		
		nombres[0] = 12;
		matrice[0][0] = 1;
		
		System.out.println("Utilisation des tableaux dans java :");
		System.out.println();
		System.out.println("Valeur du tableau nombres a l'index 0 ; " + nombres[0]);
		System.out.println("Valeur du tableau matrice a l'index 0,0 ; " + matrice[0][0]);
		System.out.println();
		System.out.println("Longeur du tableau initNombres : " + initNombres.length);
		System.out.println("Nombre de case du tableau initMatrice : " + initMatrice.length*initMatrice[0].length);
		System.out.println();
		System.out.println("Valeur du tableau initNombres : " + Arrays.toString(initNombres));
		System.out.println("Valeur du tableau initMatrice : " + Arrays.deepToString(initMatrice));
		System.out.println();
		Arrays.sort(initNombres);
		System.out.println("Valeur du tableau initNombres apres tri : " + Arrays.toString(initNombres));
		System.out.println();
		System.out.println("Recherche de l'index de la valeur 20 dans le tableau initNombres : " 
				+ Arrays.binarySearch(initNombres, 20));
		System.out.println();
		copieInitNombres1 = Arrays.copyOf(initNombres, 12);
		System.out.println("Copie de initNombres avce 6 cases de plus : " + Arrays.toString(copieInitNombres1));
		System.out.println();
		copieInitNombres2 = Arrays.copyOfRange(initNombres, 0, 3);
		System.out.println("Copie des 3 premières cases de initNombres : " + Arrays.toString(copieInitNombres2));
		System.out.println();
		Arrays.fill(initNombres, 99);
		System.out.println("Le tableau initNombres remplis de la valeur 99 : " + Arrays.toString(initNombres));
	}

}
