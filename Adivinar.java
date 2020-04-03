import java.util.Scanner;

public class Adivinar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		int aleatorio = (int)(Math.random()*10000);
		
		int numero;
		
		int intentos=0;
		
		do {
			
			System.out.println("Adivina un numero");
			
			numero = entrada.nextInt();
			
			intentos ++;
			
			if(numero > aleatorio) {
				
      		System.out.println("El numero es menor");
      		
			}else if(numero <aleatorio) {
		      System.out.println("El numero es mayor");
			}
			
			 
		}while(numero != aleatorio);
		
		System.out.println("Acertaste el numero era: " + aleatorio);
		System.out.println("Lo conseguiste en " + intentos + " intentos");
	}

}
