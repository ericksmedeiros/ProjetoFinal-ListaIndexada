import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		int lista[] = new int[2000];
		
		for (int i = 0; i < 2000; i++) {
			lista[i] = i;
			System.out.println(i);
		}
		while(true){
		int valorDigitado = 0;		
		
		System.out.println("1 - Inserir no Inicio\n2 - Inserir no Final\n3 - Pesquisar Valor\n4 - Listar Lista");
		
		switch (digita("Escolha uma opção: ")) {
		case 1:
			valorDigitado = digita("Digite um Valor: ");
		break;
		case 2:
			valorDigitado = digita("Digite um Valor: ");
			break;
		case 3:
			valorDigitado = digita("Digite um Valor: ");
		case 4:
			break;			
		default:
			System.out.println("Opção Inválida");
			break;
			}
		}
	}

	private static int digita(String mens) {
		Scanner sc = new Scanner(System.in);		
		System.out.println(mens);
		return sc.nextInt();
	}
}
