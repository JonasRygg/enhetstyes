package no.hvl.dat100.prosjekt.modell;

import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.kontroll.Kort;



import java.util.Random;
import java.util.Arrays;




public class KortUtils {


	//Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.

	//@see Kort
	//@param samling
	//samling av kort som skal sorteres. *//

	public static void sorter(KortSamling samling) {

		Kort[] kortArray = samling.getSamling();
		Arrays.sort(kortArray);
	}




	//Stokkar en kortsamling.
	//@param samling//
	//samling av kort som skal stokkes.
			//
	public static void stokk(KortSamling samling) {
		Kort[] kortArray = samling.getSamling();
		Random random = new Random();

		for (int i = kortArray.length - 1; i > 0; i--) {
			int j = random.nextInt(i + 1);
			// Bytt plass på kortArray[i] og kortArray[j]
			Kort temp = kortArray[i];
			kortArray[i] = kortArray[j];
			kortArray[j] = temp;
		}
	}
}