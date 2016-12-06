import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		ArrayList<integer> listar = new ArrayList<integer>();
		while(true){
		int value = 0;
		Lista lista = new Lista();		
		
		System.out.println("1 - Inserir no Inicio\n2 - Inserir no Final\n3 - Pesquisar Valor\n4 - Listar Lista");
		switch (digita("Escolha uma opção: ")) {
		case 1:
			value = digita("Digite um Valor: ");
		break;
		case 2:
			value = digita("Digite um Valor: ");
			break;
		case 3:
			value = digita("Digite um Valor: ");
			if(lista.Procura(value) == true)
				System.out.println("Valor existe na lista!");
			else
				System.out.println("Valor não existe na lista!");	
			break;
		case 4:
/*			ArrayList<String> listar = new ArrayList<String>();
				 listar = lista.Listar();
				 for(String elemento : listar){
						System.out.print(elemento + " ");
					}*/
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
