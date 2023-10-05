package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creation du tableaux
		int[] array = {12,2,45,66};
		// variable qui contient la dernier valeur du tableau
		int dernier = array[array.length-1];
		// Boucle qui change d'index chaque valeur
		for(int i=array.length-1; i>0; i--) {
			array[i] = array[i-1];
		}
		// Ajout de la dernier valeur a 'lindex 0
		array[0] = dernier;
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		
	}

}
