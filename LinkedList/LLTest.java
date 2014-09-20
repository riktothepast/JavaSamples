

public class LLTest {
	private LinkedList list;
	private Node node1;
	private Node node2;
	private Node node3;

	public static void main(String args[])
	{
		//creamos una nueva instancia y corremos los tests
		LLTest test = new LLTest();
		test.setUp();
		test.testSize();
		test.testAddToHead();
		test.testSize();
		test.testAddToTail();
		test.testSize();
	}

	public void setUp() {
		list = new LinkedList();
		node1 = new Node(4);
		node2 = new Node(7);
		node3 = new Node(5);

		list.addToHead(node1); // List is 4
		list.addToHead(node2); // List is 7->4
		list.addToHead(node3); // List is 5->7->4
	}

	public void testSize() {
		System.out.println("total de elementos : "+list.size());
	}

	
	public void testAddToHead() {
		Node node = new Node(3);
		list.addToHead(node);
	}

	public void testAddToTail() {
		Node node = new Node(3);
		list.addToTail(node);
	}

}