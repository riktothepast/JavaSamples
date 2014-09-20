
public class Node {
	private Node next = null;
	private int data;

	/**
	 * @param data
	 */
	public Node(int data) {
		this.setData(data);
		this.setNext(null);
	}

	/**
	 * Sets the pointer to the next node, when used as a node in a linked list.
	 * 
	 * @see LinkedList
	 * 
	 * @param next
	 *            an instance of LinkedListNode that will be pointed to by the
	 *            this instance
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * Returns the next node object
	 * 
	 * @return 	the next node
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param data
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return
	 */
	public int getData() {
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Integer.toString(this.getData());
	}

}