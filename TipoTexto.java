import java.util.Scanner;

public class TipoTexto {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite o seu primeiro nome:");
		String nome = scanner.nextLine();
		System.out.println("Digite o seu sobrenome:");
		String sobrenome = scanner.nextLine();
		System.out.println("Ol? "+ nome + " " + sobrenome +"!");
		scanner.close();
	}

}
