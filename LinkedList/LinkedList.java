

public class LinkedList {
	// este nodo nos servira para llevar el control del resto de nodos que agreguemos
	private Node head;

	/**
	 * retorna el noco inicial de la lista
	 */
	public Node getHead() {
		return head;
	}

	/*
	* recorre los apuntadores del nodo head hasta encontrar el ultimo, este es la cola.
	 */
	public Node getTail() {
		if (this.getHead() == null) {
			return null;
		}

		Node current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}

		return current;
	}

	/**
	 * Agrega un nodo al inicio de la lista
	 * 
	 */
	public void addToHead(Node newNode) {
		Node current = head;
		if (newNode != null) {
			head = newNode;
			head.setNext(current);
		}
	}

	/**
	 * Agrega un nodo al final de la lista
	 * 
	 */
	public void addToTail(Node newNode) {
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;

			while (current.getNext() != null) {
				current = current.getNext();
			}

			current.setNext(newNode);
		}
	}

	/**
	 * Elimina los elementos de la lista
	 */
	public void clear(){
		head = null;
	}


	/**
	 * Regresa el total de elementos de la lista
	 * 
	 */
	public int size() {
		int count = 0;
		Node current = head;

		while (current != null) {
			current = current.getNext();
			count++;
		}
		return count;
	}

}