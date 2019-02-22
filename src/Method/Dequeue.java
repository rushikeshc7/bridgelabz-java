package Method;

import java.util.Deque;

import utility.Utility;

public class Dequeue<T> {
		
		int n;
		int rear = -1;
		int front = -1;
		Object deque[];
		public Dequeue(int n) {
			this.n = n;
			deque = new Object[n];
		}


		public boolean addRear(T data) {
			if(rear == n - 1 || rear+1 == front) {
				System.out.println("Deque is full");
				return false;
			}
			else {
				deque[++rear] = data;
				if(front == -1) {
					front = 0;
				}
				return true;
			}
		}
		
		
		public T removeFront() {
			T temp;
			if(front == -1) {
				System.out.println("Deque is empty");
				return null;
			}
			else {
				if(front == n) {
					temp = (T) deque[front];
					front = 0;
				}
				else {
					temp = (T) deque[front];
					deque[front] = null;
					front++;
					if(front == rear + 1) {
						front = -1;
						rear = -1;
					}
				}
				return temp;
			}
		}
		
		
		public T removeRear() {
			T temp;
			if(rear == -1) {
				System.out.println("Deque is empty");
				return null;
			}
			else {
				temp = (T) deque[rear];
				deque[rear] = null;
				rear--;
				if(rear == -1 && front == 0 ) {
					rear = -1;
					front = -1;
				}
				return temp;
			}
		}
		
		
		public boolean addFront(T data ) {
			if(front == rear + 1) {
				System.out.println("Deque is full");
				return false;
			}
			else {
			if(front == -1) {
				deque[++front] = data ;
				rear = 0;
				return true;
			}
			else {
				if(front == 0) {
					front = n - 1;
					deque[front] = data ;
				}
				else {
					deque[--front] = data ;
				}
				return true;
			}
			}
		}
		
	
		public String toString() {
			String str = "";
			if(front != -1) {
				
				if(front > rear) {
					for(int i=front; i<n; i++)
						str = str + deque[i] + ",";
					front = 0;
				}
				if(front <= rear) {
					for(int i=front; i<=rear; i++) {
						str = str + deque[i];
						if(i < rear)
							str = str + ",";
					}
				}
			}
			return str;
		}
		
		
		public boolean isEmpty() {
			if(front == -1 && rear == -1)
				return true;
			else
				return false;
		}
		
		
		public int size() {
			int count = 0;
			if(front != -1) {
				
				if(front > rear) {
					for(int i=front; i<n; i++)
						count++;
					front = 0;
				}
				if(front <= rear) {
					for(int i=front; i<=rear; i++) {
						count++;
					}
				}
			}
			return count;
	}
  
}

