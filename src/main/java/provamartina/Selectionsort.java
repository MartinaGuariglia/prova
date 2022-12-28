package provamartina;

import java.util.Arrays;

/**
 * 
 * per ogni posizione cerca quale elemento ha il valore minimo da quel punto in
 * poi scambia l'elemento corrente e quello di valore minimo trovato al passo
 * precendente
 * 
 * 
 * @author martina
 *
 */

public class Selectionsort {
	public static void main(String[] args) {

		int[] dati = { 90, 17, -5, 1, -28, -6, 56, 27 };

		System.out.println(Arrays.toString(dati));
		sort(dati);
		System.out.println(Arrays.toString(dati));

	}

	public static void sort(int[] dati) {
		for (int j = 0; j < dati.length; ++j) {

			int imin = j;

			for (int i = j + 1; i < dati.length; ++i) {
				if (dati[i] < dati[imin]) {
					imin = i;
				}
			}

			int copia = dati[j];
			dati[j] = dati[imin];
			dati[imin] = copia;
		}
	}
}
