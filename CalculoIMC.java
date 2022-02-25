import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o seu peso:");
		double peso = scanner.nextDouble();
		System.out.println("Digite o sua altura:");
		double altura = scanner.nextDouble();
		double imc = peso/(altura*altura);
		System.out.format("Seu imc é: %.2f", imc);
		scanner.close();
	
	}
	

}
