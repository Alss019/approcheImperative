package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Création du tableau array
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		double moyenne = 0;
		//Boucle pour additionner tout les elements du tableau
		for(int i=0 ; i<array.length; i++) {
			moyenne = moyenne + array[i];
		}
		//total des éléments diviser par la longueur du tableau
		moyenne = moyenne/array.length;
		System.out.println(moyenne);
	}

}
