package JavaTutor;

public class PrimeNumber {

	public static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				return false;
			}

		}
		return true;

	}

	public static void NumberofPrime(int num) {

		for (int i = 2; i <= num; i++) {

			if (isPrime(i)) {

				System.out.print(i + " ");

			}

		}

	}

	public static void main(String[] args) {

		/*
		 * boolean output = isPrime(2);
		 * 
		 * System.out.println(output);
		 */

		NumberofPrime(300);

	}

}
