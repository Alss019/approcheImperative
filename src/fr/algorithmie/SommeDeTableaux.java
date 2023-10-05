package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8,-1};

		int total1 = 0;
		int total2 = 0;
		
		//Boucle pour additionner tout les elements des tableau
		for(int i=0 ; i<array1.length; i++) {
			total1 = total1 + array1[i];
			total2 = total2 + array2[i];
		}
		
		int[] array3 = new int[] {total1 + total2};				
		System.out.println(array3[0]);
	}

}
