import java.util.Scanner;

public class CalcularTroco {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("Digite o valor do produtor: ");
		
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o valor do dinheiro fornecido: ");
		
		Double valorFornecido = scanner.nextDouble();
		
		Double troco = valorFornecido -  valorProduto;
		
		System.out.println("Valor do troco: " + troco);
		
		scanner.close();

	}

}
