package Check;

import java.util.Random;

@SuppressWarnings("unused")
public class BiShiTi {

	public static void main(String[] args) {
		int i = new Random().nextInt(21);
		int j = new Random().nextInt(21);
		if (i + j >= 0 && i + j <= 20) {

			System.out.println(i + "+" + j + "=()");
		}
		if (i - j >= 0&& i + j <= 20) {

			System.out.println(i + "-" + j + "=()");
		}
		
	}

}
