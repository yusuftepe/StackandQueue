package taskscheduler;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyQueue<T> {
	private LinkedList<T> items;

	public  MyQueue() {
		items = new LinkedList<>();
	}
	
	public void enqueue(T item) {
		items.add(item);
	}
	
	public T dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException("THE QUEUE IS EMPTY, DEQUUE CANNOT BE DONE.");
		}	
		return items.removeFirst();
	}
		
	public T peek() {
		if(isEmpty()) {
			throw new NoSuchElementException("THE QUEUE IS EMPTY, PEEK CANNOT BE DONE.");
		}
		return items.getFirst();
	}
	
	public boolean isEmpty() {
		return items.isEmpty();
	}
	
	public int size() {
		return items.size();
	
	}
}
