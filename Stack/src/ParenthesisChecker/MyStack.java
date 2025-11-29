package ParenthesisChecker;

import java.util.ArrayList;

public class MyStack<T> {
	
	private ArrayList<T> items;
	
	public MyStack() {
		items = new ArrayList<>();
	}
	
	public void push(T item) {
		items.add(item);
	}
	
	public T pop() {
		if (items.isEmpty()) {
			throw new java.util.EmptyStackException();
		}
		return items.remove(items.size() - 1);
	}
	
	public T peek() {
		if (items.isEmpty()) {
			throw new java.util.EmptyStackException();
		}
		return items.get(items.size() - 1);
	}
	public boolean isEmpty() {
        return items.isEmpty();
	}

}
