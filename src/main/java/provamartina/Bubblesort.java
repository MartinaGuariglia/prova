package provamartina;

import java.util.Arrays;

public class Bubblesort{
	public static void main (String[] args) {
		
		//confronta ogni elemento con il suo vicino di destra,
		//se non sono in ordine scambiali
		
	
	int[] dati= {90,17,-5,1,-28,-6,56,27,-180};
	
	//ripeti n-1 volte l'operazione (si può interrompere
	//quando non si trovano elementi fuori ordine)
	
	for (int j=0; j<dati.length-1 ;++j) {
		boolean verifica=true;
		
		for (int i=0; i<dati.length-1;++i) {
			if(dati[i]>dati[i+1]) {
				
				verifica=false;
				int copia=dati[i];
				dati[i]=dati[i+1];
				dati[i+1]=copia;
			}
		}
		
		if (verifica==true) {
			break;
		}
		
	}
	
	System.out.println(Arrays.toString(dati));

	}
}