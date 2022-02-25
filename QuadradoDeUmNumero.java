import java.util.Scanner;

public class QuadradoDeUmNumero {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite um numero para saber o seu quadrado:");
		Integer quadrado = scanner.nextInt();
		Integer x = (quadrado*quadrado);
		System.out.println("valor ao quadrado de " + quadrado +" é: " + x);
		scanner.close();
	
	}

}
