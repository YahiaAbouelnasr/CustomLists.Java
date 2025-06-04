//Yahia Abouelnasr 40297607


package comp352_A2;

public class MyArrayList<E> {
	private Object[] data;
	private int size;
	
	public MyArrayList() {
		data = new Object[10];
		size = 0;
	}
	
	private void ensureCapacity() {
		if (size == data.length) {
			Object[] newData = new Object[data.length * 2];
			System.arraycopy(data, 0, newData, 0, data.length);
			data = newData;
		}
		else if ((size < (data.length / 4)) && data.length > 10) {
			int newCapacity = Math.max(10, data.length / 2);
			Object[] newData = new Object[newCapacity];
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
		
	}
	
	public boolean add(E e) {
		ensureCapacity();
		data[size++] = e;
		return true;
		
	}
	
	public void add(int index, E element) {
		if (index < 0 || index > size) throw new IndexOutOfBoundsException();
		ensureCapacity();
		System.arraycopy(data, index, data, index + 1, size - index);
		data[index] = element;
		size++;
	}
	
	public void clear() {
		data = new Object[10];
		size = 0;
	}
	
	public E remove(int index) {
		if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
		E removedElement = (E) data[index];
		System.arraycopy(data, index + 1, data, index, size - index - 1);
		data[--size] = null;
		ensureCapacity();
		return removedElement;
	}
	
	public boolean remove(Object o) {
		if (o == null) {
			return false;
		}
		for (int i = 0; i < size; i++) {
			if (data[i].equals(o)) {
				remove(i);
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			sb.append(data[i]);
			if (i < size -1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
