import java.util.ArrayList;
import java.util.EmptyStackException;

public class Lista {
	private Node 	first 	= null
				, 	last 	= null;
		//		,	value	= null;
	
	public void setFirst(Node first) {
		this.first = first;
	}
	public Node getFirst() {
		return first;
	}
	public void setLast(Node last) {
		this.last = last;
	}
	public Node getLast() {
		return last;
	}
	public ArrayList<int> Listar(){
		ArrayList<int> lista = new ArrayList<int>();		
		Node aux = getFirst();			
		while(aux != null){
			int vl = aux.getValue(); 
			lista.add(vl);
			aux = aux.getLast();
		}
		return lista;
	}		
	public boolean Procura(int value){
		Node aux = getFirst();		
		while(aux != null){
			if(value == aux.getValue()){
				return true;
			}
			aux = aux.getFirst();
		}
		return false;
	}
	public void Insere_Inicio(int value){		
		boolean procura = false;		
		procura = Procura(value);		
		if (procura == false){		
			Node novo = new Node();			
			if (first == null){
				novo.setValue(value);
				setFirst(novo);
				setLast(novo);
			}			
			else{
				first.setFirst(novo);
				novo.setValue(value);
				novo.setLast(first);
				setFirst(novo);				
			}
		}
		else{
			System.out.println("Valor já existe na lista!");
		}
	}
	public void Insere_Fim(String value) {
		Node novo = new Node();		
		boolean procura = false;		
		procura = Procura(value);		
		if(last == null){			
			novo.setValue(value);
			first = novo;
			last = novo;			
		}
		else{
			last.setFirst(novo);
			novo.setValue(value);
			first = novo;
		}
	}
}	

