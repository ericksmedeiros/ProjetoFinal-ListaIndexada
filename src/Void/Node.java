package Void;

public class Node {
	private Node anterior;		
	private Node proximo;
	private String valor;		

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}

	public Node getAnterior() {
		return anterior;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
	
	public Node getProximo() {
		return proximo;
	}
}
