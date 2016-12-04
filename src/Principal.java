import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		menu();
	}

	private static void menu() {
		System.out.println("1 - Inserir no Inicio");
		System.out.println("2 - Inserir no Final");
		System.out.println("3 - Pesquisar Valor");
		System.out.println("4 - Listar Lista ");
		switch (digita("Escolha uma opção: ")) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;			
		default:
			break;
		}
		
	}

	private static int digita(String mens) {
		Scanner e = new Scanner(System.in);		
		System.out.println(mens);
		return e.nextInt();
	}

}
