package linkedList;

public class LinkedList {
	Node root;
	int size;
	
	//Constr
	public LinkedList() {
		root = new Node();
		size = 0;
	}
	
	//Test code
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		System.out.println(ll.getSize());
		ll.add(8);
		System.out.println(ll.getSize());
		ll.add(17);
		ll.add(5);
		ll.add(10);
		System.out.println(ll.find(17).getData());
		ll.remove(5);
		System.out.println(ll.getSize());
		System.out.println(ll.find(5));
	}//main
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public Node add(int data) {
		Node newNode = new Node(data, root);
		this.root = newNode;
		this.size++;
		return newNode;
	}
	
	public Node find(int data) {
		Node thisNode = this.root;
		
		while(thisNode != null) {
			if(thisNode.getData() == data)
				return thisNode;
			thisNode = thisNode.getNextNode();
		}
		return null;
	}
	
	public boolean remove(int data) {
		Node thisNode = this.root;
		Node previousNode = null;
		while(thisNode != null) {
			if(thisNode.getData() == data) {
				previousNode.setNextNode(thisNode.getNextNode());
				this.setSize(this.getSize()-1);
				return true;
			}
			previousNode = thisNode;
			thisNode= thisNode.getNextNode();
		}
		return false;
	}
	
	
}
