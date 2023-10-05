package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Création du tableau array
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Creation d'un nouveau tableau arrayCopy
		int[] arrayCopy = new int[array.length];
		
		System.out.println("\n======================\nAffichage du tableau arrayCopy\n");
		// copier tous les éléments de array dans arrayCopy
		for (int i=arrayCopy.length-1; i>-1; i--) {
			arrayCopy[i] = array[i];
			System.out.println(arrayCopy[i]);
		}
		System.out.println("\n======================\nAffichage du tableau array\n");
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
