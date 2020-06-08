import java.util.InputMismatchException;
import java.util.Scanner;

public class Adivinar {

	public static void main(String[] args) {

		int random = (int) (Math.random() * 10000);
		int counter = 0;
		counter = guessMyNumber(random);

		System.out.println("¡Acertaste! El numero era: " + random);
		System.out.println("Lo conseguiste en " + counter + " intentos");
	}

	private static int guessMyNumber(int random) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		int counter = 0;
		while (number != random) {
			System.out.println("Adivina un numero");
			try {
				number = scan.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Por favor, introduce un numero.");
				guessMyNumber(random);
			}
			counter++;
			if (number > random) {
				System.out.println("El numero es menor");
				System.out.println();
				System.out.println();
				System.out.println();
			} else if (number < random) {
				System.out.println("El numero es mayor");
				System.out.println();
				System.out.println();
				System.out.println();
			}
		}
		return counter;
	}


}