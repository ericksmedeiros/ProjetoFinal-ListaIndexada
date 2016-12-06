/*import java.util.Scanner;

public class Testes {

	static int valorDigitado = 0;
	static int node = 0;
	static int tail = 0;
	static int head = 0;
	
	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		int lista[] = new int[2000];
		
		for (int i = 0; i < 2000; i++) {
			lista[i] = i;
			if(head == 0) head = i;
			tail = i;
		}
		
		while(true){
		
		System.out.println("1 - Pesquisar Valor"); // \n2 - Inserir no Final\n3 - Inserir no Inicio\n4 - Listar Lista");

		switch (digita("Escolha uma opção: ")) {
		case 1:
			valorDigitado = digita("Digite um Valor: ");
			busca();
		break;
	/*	case 2:
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

	private static void busca() {
		int buscaOtimizada = 0;
		int buscaNaoOtimizada = 0;
		int salto500 = 500, salto100 = 100, salto10 = 10;
		int atual = 0;
		
		while(true){
			if (atual == 0) atual = salto500;
			
			if (atual > valorDigitado){
				if(atual < valorDigitado){
					if(atual > valorDigitado){
						if(atual == valorDigitado){
							System.out.println("ok");
						}else atual--;
					}else atual += salto10;
				}else atual -= salto100;
			}else atual += salto500;
		}
	}

	private static int digita(String mens) {
		Scanner sc = new Scanner(System.in);		
		System.out.println(mens);
		return sc.nextInt();
	}
}*/
