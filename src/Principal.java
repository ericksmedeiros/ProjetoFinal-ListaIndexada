import java.util.ArrayList;
import java.util.Scanner;


public class Principal {	
	public static void main(String[] args) {				
		Lista lista = new Lista();		
		String valor = null;
		
		for (int i = 1; i <= 2000; i++) {
			lista.Insere_Fim(Integer.toString(i));	
		}
		
		while(true){
		System.out.println("1 - Inserir no Inicio \n2 - Inserir no Final\n3 - Pesquisa Valores \n4 - Listar Lista");

		switch (digita("Escolha uma opção: ")) {
		case "1":
			valor = (digita("Digite um valor: "));
			//Insere no inicio da lista.
				lista.Insere_Inicio(valor);
			break;
		case "2":
			valor = (digita("Digite um valor: "));
			//Insere no final da lista.
				lista.Insere_Fim(valor);
			break;
		case "3":
			valor = (digita("Digite um valor: "));
			//Pesquisa por valores na lista.
			if(lista.Procura(valor) == true)
				System.out.println("Valor existe na lista!");
			else
				System.out.println("Valor nÃo existe na lista!");				
			break;
		case "4":
			ArrayList<String> listar = new ArrayList<String>();
			//Imprime

				 listar = lista.Listar();
			
			for(String elemento : listar){
				System.out.print(elemento + " \n");
			}
			break;			
		default:
			System.out.println("Opção Inválida");
				break;
				}
			}
	}
	private static String digita(String mens) {
		Scanner sc = new Scanner(System.in);		
		System.out.println(mens);
		return sc.next();
	}
}



