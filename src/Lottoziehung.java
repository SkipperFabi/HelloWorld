
public class Lottoziehung {

	public static void main(String[] args) {

		boolean[] lottozahlen = new boolean[49];
		int ziehung;

		for (int i = 0; i < 6; i++) {
			do {
				ziehung = (int) (Math.random() * 48) + 1;
			} while (lottozahlen[ziehung] == true);

			lottozahlen[ziehung] = true;
		}

		for (int i = 0; i < lottozahlen.length; i++) {
			if (lottozahlen[i]) {
				System.out.print(i + " ");
			}
		}
	}
}
