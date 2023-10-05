package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creation du tableaux
		int[] array = {};
		// creation et initialisation de la variable bool a false
		boolean bool = false;
		// Si la longueur du tableau est egale ou superieur a 1
		if(array.length >=1) {
			// boucle qui parcour le tableau
			for(int i=0; i<array.length; i++) {
				// condition si le premier et le dernier élément du tableau ont la même valeur
				if(array[0] == array[array.length-1]) {
					// La valeur de la variable bool passe a true 
					bool= true;
				}
			}
		}
		System.out.println(bool);
	}

}


