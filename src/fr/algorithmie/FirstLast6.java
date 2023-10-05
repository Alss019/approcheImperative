package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creation du tableaux
		int[] array = {6,3,3,3,3,3,3,3,3};
		// creation et initialisation de la variable bool a false
		boolean bool = false;
		// si le tableau n'est pas nul
		if(array != null) {
			// boucle qui parcour le tableau
			for(int i=0; i<array.length; i++) {
				// condition si le premier élément ou le dernier élément vaut 6.
				if(array[0] == 6 || array[array.length-1] == 6) {	
					// La valeur de la variable bool passe a true 
					bool = true;
				}
				
			}
		}
		System.out.println(bool);
	}

}
