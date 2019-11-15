import java.util.Arrays;

public class PrimzahlenSieb {

	static int length = 100000;

	public static void main(String[] args) {

		/* final long startTime = System.nanoTime();
		boolean[] primzahlen = erastothenes(erzeugeArray(length));
		erastothenes(primzahlen);
		ausgabe(primzahlen);

		final long duration = System.nanoTime() - startTime;
		System.out.println("Laufzeit des Programms:" + duration / 1000000 + "ms"); */
		long timeprobe;
		long timeerasto;
		long timeStart = System.currentTimeMillis();
		boolean[] primzahlen = probedivision(erzeugeArray(length));
		long timeEnd = System.currentTimeMillis();
		timeprobe = timeEnd - timeStart;
		timeStart = System.currentTimeMillis();
		primzahlen = erastothenes(erzeugeArray(length));
		timeEnd = System.currentTimeMillis();
		timeerasto = timeEnd - timeStart;
		
		
		System.out.println("Laufzeit Erastothenes: " + (timeerasto) + " Millisek.");
		System.out.println("Laufzeit Probedivision: " + (timeprobe) + " Millisek.");
		
	}
	 

	private static boolean[] erzeugeArray(int length) {
		boolean[] primzahlen = new boolean[length + 1];
		Arrays.fill(primzahlen, Boolean.TRUE);
		primzahlen[0] = false;
		primzahlen[1] = false;
		return primzahlen;
	}

	private static boolean[] erastothenes(boolean[] primzahlen) {
		for (int i = 2; i <= length; i++) {

			if (primzahlen[i]) {
				for (int j = i; j <= length; j = j + i) {

					primzahlen[j] = false;

				}

			}

		}
		return primzahlen;

	}
	private static boolean[] probedivision (boolean[] primzahlen){
		
		for(int number = 2; number<=length; number++){
			
			for(int i = 2; i<=number/2 && primzahlen[number]; i++){
				
				if(number%i==0){
					
					primzahlen[number]=false;
				}
			
		   }
		}
			return primzahlen;
	}

	private static boolean[] ausgabe(boolean[] primzahlen) {
		for (int i = 1; i <= length; i++) {
			if (primzahlen[i]) {
				System.out.println(i);
				}
			}
		return primzahlen;

	}

	/*
	 * for (int i = 2; i <= length; i++) {
	 * 
	 * if (primzahlen[i]) { for (int j = i; j <= length; j = j + i) {
	 * 
	 * primzahlen[j] = false;
	 * 
	 * } System.out.println(i); }
	 * 
	 * } final long duration = System.nanoTime() - startTime;
	 * System.out.println("Laufzeit des Programms:" + duration / 1000000 +
	 * "ms");
	 * 
	 * }
	 */
}