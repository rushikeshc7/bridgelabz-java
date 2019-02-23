package Method;

public class LinkedList<T extends Comparable<T>> {

	class Node{
		T data;
		Node next;
		Node(T newData)
		{
			data = newData;
			next = null;
		}
	}
	Node head;
	
	public void add(T newData)
	{
		// Create the Node & put in the data
		Node newNode = new Node( newData);
		//Make the next of newNode as head
		newNode.next = head;
		//Move the head to point to newNode
		head = newNode;
    }
	
	public void insertAfter(Node prevNode, T newData) 
	{ 
	    /* 1. Check if the given Node is null */
	    if (prevNode == null) 
	    { 
	        System.out.println("The given previous node cannot be null"); 
	        return; 
	    } 
	  
	    /* 2. Allocate the Node & 
	       3. Put in the data*/
	    Node newNode = new Node(newData); 
	  
	    /* 4. Make next of new Node as next of prev_node */
	    newNode.next = prevNode.next; 
	  
	    /* 5. make next of prev_node as new_node */
	    prevNode.next = newNode; 
	} 
	

	public void remove(T data)
	{
	    Node temp = head;
	    Node prev = temp;

	    if(((T)temp.data).equals(data)) // if head contain key
	    {
	       //head = null; 
	        head=temp.next;//change head
	        return;
	     }
	     while(temp.next != null )
	     {
	         prev = temp;
	         temp =temp.next;
	         if(((T)temp.data).equals(data))
	         {
		         prev.next = temp.next;
	             return;
	          }
	      }
	      if(temp.next == null)            // If key is not present in linked list 
	      {
	           return;	
	      }
	}
	
	public void deleteNode(int position) 
    { 
        //if linked list is empty 
        if(head == null) 
            return; 
        Node temp = head; 
  
        //if head needs to be removed 
        if(position == 0) 
        { 
            head = temp.next;   
            return; 
        } 
  
        //find previous node of the node to be deleted 
        for(int i=0; i<position-1; i++) 
        {
            temp = temp.next; 
        }
        
        //if position is more than number of nodes 
        if(temp == null || temp.next == null) 
        {
            return; 
        }
        
         
        //store pointer to the next of temp.next node as temp.next is node to be deleted
        Node next_1 = temp.next.next; 
  
        //unlink the deleted node from list 
        temp.next = next_1;  
    } 
	
	 public boolean search(T x) 
	    { 
	        Node current = head;   
	        while (current != null) 
	        { 
	            if (current.data.equals(x)) 
	                return true;    //data found
	            
	            current = current.next; 
	        } 
	        
	        //data not found 
	        return false;   
	    }
	    
	    public void printMiddle() 
	    { 
	        Node firstPtr = head; 
	        Node secondPtr = head; 
	        if (head != null) 
	        { 
	            while (secondPtr != null && secondPtr.next != null) 
	            { 
	            	secondPtr = secondPtr.next.next; 
	                firstPtr = firstPtr.next; 
	            } 
	            System.out.println("The middle element is " + 
	            		firstPtr.data); 
	        } 
	    }
	    
	    public boolean isEmpty()
	    {
	    	if(head == null)
	    	{
	    		return false;
	    	}
	    	return true;
	    }
	    
	   
	    public int size() 
	    { 
	    	 Node temp = head; 
	    	 int count = 0; 
	    	 while (temp != null) 
	    	 { 
	    	     count++; 
	    	     temp = temp.next; 
	    	  } 
	      return count; 
	    }
	    
	    public void printList() 
	    { 
	        Node pnode = head; 
	        while (pnode != null) 
	        { 
	            System.out.print(pnode.data+" "); 
	            pnode = pnode.next; 
	        } 
	    }
	    
	    public int index(T data) {
			
			Node n = head;
			for(int i = 0 ; i < size() ; i++) {
	    		if(n.data.equals(data)) {
	    			return i ;
	    		}
	    		n = n.next;
	    	}
			return -1;

		}
	    
	    public void sort()
	  	{
	  		Node temp;
	  		temp = head;
	  		int p = size();
	  		while(p > 0) 
	  		{
	  			temp = head;
	  			while(temp.next != null)
	  			{
	  				if((temp.data).compareTo(temp.next.data) > 0)
	  				{
	  					T t = temp.data;
	  					temp.data = temp.next.data;
	  					temp.next.data = t;
	  				}
	  				temp = temp.next;
	  			}
	  			p--;
	  		}
	  		
	  	}
	    
}
