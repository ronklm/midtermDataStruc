public class Trique
{

    //• push back x - insert the element x into the back of the trique.
    //• push front x - insert the element x into the front of the trique.
    //• push mid x - insert the element x into the middle of the trique. The inserted element
    // x will be the new middle of the trique. If n is the size of the trique before inserting, the
    // location for x is
    // n + 1
    // 2
    // • get i - prints out the value at the i
    // th index


    //Nodes
    class Node<E> {

	    E data;
	    Node<E> next;
	    Node<E> prev;
	
	     Node(E data) 
        {
		    this.data = data;
		    this.prev = null;
		    this.next = null;
	    }
	
    }
    private Node<E> head;
    private Node<E> middle;
	private Node<E> tail;
	private int size;
	
	public Trique() {
		this.head = null;
        this.middle = null;
		this.tail = null;
		this.size = 0;
	}
    
    //Used 2440 code to start off my code
    public void pushFront(E value)
    {
		Node<E> newNode = new Node<E>(value);
		newNode.next = head; 

		if (head != null)
        {
			head.prev = newNode;
		}
		head = newNode;
		size++;

		if (head.next == null) 
        {
			tail = head;
            //figure out how to alter middle here
		}

	}
    public void pushBack(E value) 
    {
		Node<E> newNode = new Node<E>(value);

		if (size == 0) 
        {
			addFirst(value);
			return;
		}

		tail.next = newNode;
		newNode.prev = tail;
        //figure out how to adjust middle here
		tail = newNode;
		size++;
	}

    //figure out how to do middle list logic
    public boolean pushMid(E value)
    {
		addLast(value);
        //adjust middle value
		return true;
	}

    // helper method to use pushMid properly
    public void addLast(E value)
    {
		Node<E> newNode = new Node<E>(value);

		if (size == 0)
        {
			addFirst(value);
			return;
		}

		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		size++;
        //how to adjust middle
	}
    
    //printing the element at i
    public E get(int i)
    {
		return search(i).data;
	}

    //needs a static main as a Driver
    public static void main(String[] args)
    {
        System.out.println("Hello World");
    }
}