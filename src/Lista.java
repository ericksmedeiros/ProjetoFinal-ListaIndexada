import java.util.ArrayList;

public class Lista {
	private Node primeiro = null;
	private Node ultimo = null;	

	public void setPrimeiro(Node primeiro) {
		this.primeiro = primeiro;
	}
	public Node getPrimeiro() {
		return primeiro;
	}
	public void setUltimo(Node ultimo) {
		this.ultimo = ultimo;
	}

	public Node getUltimo() {
		return ultimo;
	}
	//Percorre os nós da lista atribuindo os valores de cada nó em um ArrayList enquanto o próximo nó não for nulo.
	public ArrayList<String> Listar() {
		ArrayList<String> lista = new ArrayList<String>();		
		if(primeiro == null)
			System.out.println("A lista esta vazia!");		
		else{
			Node aux = getPrimeiro();			
			while(aux != null){
				String valor = aux.getValor(); 
				lista.add(valor);
				aux = aux.getProximo();
			}
		}
		return lista;		
	}
	//Percorre os nós da lista comparando os valores de cada nó com o valor passado por parametro enquanto o próximo nó não for nulo.
	public boolean Procura(String valor){
		Node aux = getPrimeiro();
		while(aux != null){
			if(valor.equals(aux.getValor())){
				return true;
			}
		//Lista Indexada
			aux = aux.getProximo();
		}
		return false;
	}
	//Insere valor passado por parametro no inicio da lista, se o valor não existir na lista.
	public void Insere_Inicio(String valor){		
		boolean procura = false;		
		procura = Procura(valor);		
		if (procura == false){		
			Node novo = new Node();			
			if (primeiro == null){
				novo.setValor(valor);
				setPrimeiro(novo);
				setUltimo(novo);
			}			
			else{
				primeiro.setAnterior(novo);
				novo.setValor(valor);
				novo.setProximo(primeiro);
				setPrimeiro(novo);				
			}
		}
		else{
			System.out.println("Valor já existe na lista!");
		}
	}
	//Insere valor passado por parametro no fim da lista, se o valor não existir na lista.
	public void Insere_Fim(String valor) {
		Node novo = new Node();		
		boolean procura = false;		
		procura = Procura(valor);		
		if(procura == true)
			System.out.println("Valor já existe na lista!");		
		else{
			if(ultimo == null){			
				novo.setValor(valor);
				primeiro = novo;
				ultimo = novo;			
			}
			else{
				ultimo.setProximo(novo);
				novo.setValor(valor);
				ultimo = novo;
			}
		}
	}	
}
