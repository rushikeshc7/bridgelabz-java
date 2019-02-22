package Method;

public class Stack<T>{


	   int max;
	   int top; 
	   Object a[];  
	    
	   public Stack(int max) 
	   { 
	      top = -1; 
	      this.max = max;
	      a = new Object[max];
	   } 
        
	 

	public boolean isEmpty() 
	   { 
	       if(top == -1)
	          return true;
	       else
			  return false;
	   }
	    
	   public boolean push(T x) 
	   { 
	       if (top == (max-1)) 
	       { 
//               System.out.println("Stack Overflow"); 
	           return false; 
	       } 
	       else
	       { 
	           a[++top] = x; 
	           return true; 
	       } 
	   } 
	  
	   public T pop() 
	   { 
	       if (top == -1) 
	       { 
//	            System.out.println("Stack Underflow"); 
	            return null; 
	       } 
	       else
	       {
	            return (T)a[top--]; 
	       } 
	   } 

	 
	   public String toString() {
		  String str = "";
		  for(int i = 0; i <= top; i++) {
			  str = str + a[i];
			  if(i < top)
			    	str = str + ",";
		  } 
		  return str;
        }    
	
	   public T peek() {
		  
		   return (T)a[top];  	
	    }
	
	   public int size() {
		return top + 1;
	    }
	 
}





