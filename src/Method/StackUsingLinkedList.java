package Method;

public class StackUsingLinkedList<T> {

	class Node
	{
		T data;
		Node next;
		Node(T data)
		{
			this.data = data;
		}
	}
	
	Node head;
	
	public boolean push(T data) 
	{
		Node temp = head;
		Node newNode = new Node(data);
		if(head == null) 
		{
			head = newNode;
			return true;
		}
		else {
			while(temp.next != null) 
			{
				temp = temp.next;
			}
			temp.next = newNode;
			return true;
		}
	}
	
	
	public T pop() 
	{
		Node temp = head, Next;
		if(head == null) 
		{
			System.out.println("Stack is empty");
			return null;
		}
		else 
		{
			if(temp.next == null) 
			{
				head = null;
				return temp.data;
			}
			else
			{
				while(temp.next.next != null)
				{
					temp = temp.next;
				}
					
				Next = temp.next;
				temp.next = null;
				return Next.data;
			}
		}
	}
	
	
	public String toString()
	{
		Node temp = head;
		String string = "";
		while(temp != null) 
		{
			string = string + temp.data;
			if(temp.next != null)
			{
				string = string + ",";
			}
			temp = temp.next;
		}
		return string;
	}
	
	public int size()
	{
		Node temp = head;
		int count = 0;
		while(temp != null) 
		{
			count++;
			temp = temp.next;
		}
		return count;
	}
}
