import java.util.Arrays;

public class PrimzahlenSieb {

	static int length = 1000;
	public static void main(String[] args) {
        final long startTime = System.nanoTime();
		boolean[] primzahlen = new boolean[length +1 ];

		Arrays.fill(primzahlen, Boolean.TRUE);

		for (int i = 0; i <= length; i++) {
			

			if (primzahlen[i]) {
				for (int j = i; j <= length; j = j + 1) {

					primzahlen[j] = false;

				}
				System.out.println(i);
			}

		}
		final long duration = System.nanoTime() - startTime;
		System.out.println(duration/1000);
	}
}