package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Création du tableau array
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.println("\n======================\n");
		
		// Rechercher le plus petit élément du tableau 
		int minNum = array[0];
		
		for(int i=1 ; i<array.length; i++) {
			if(array[i] < minNum){
				minNum = array[i];
			}
		}
		System.out.println(minNum);

	}

}
