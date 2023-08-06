package model;

import java.util.Objects;

public class Lista<T> {

	private Object[] objects = new Object[10];
	private int total = 0;

	public void add(T e) {
		garantirArmazenamento();
		objects[total++] = e;
	}

	public void add(int index, T e) {
		if (index > total || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}

		garantirArmazenamento();

		for (int i = total + 1; i >= index; i--) {
			objects[i + 1] = objects[i];
		}

		objects[index] = e;
	}

	public void set(int index, T e) {
		if (index > total || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}

		objects[index] = e;
	}

	public void remove(int index) {
		if (index > total || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}

		for (int i = index; i <= total; i++) {
			objects[i] = objects[i + 1];
		}
	}

	public T get(int index) {
		if (index > objects.length || index > total) {
			throw new ArrayIndexOutOfBoundsException();
		}

		return (T) objects[index];
	}

	public boolean contem(Object o) {
		for (int i = 0; i < total; i++) {
			if (Objects.equals(o, get(i))) {
				return true;
			}
		}
		return false;
	}

	private boolean isListaCheia() {
		return total == objects.length;
	}

	private void garantirArmazenamento() {

		if (!isListaCheia()) {
			return;
		}

		Object[] newList = new Object[this.objects.length * 2];

		for (int i = 0; i < this.objects.length; i++) {
			newList[i] = this.get(i);
		}

		this.objects = newList;
	}

	@Override
	public String toString() {
		String result = "[";

		for (int i = 0; i < objects.length; i++) {
			if (!Objects.isNull(objects[i])) {
				result = result + objects[i] + ", ";
			}
		}

		return result.substring(0, result.lastIndexOf(",")) + "]";
	}

}
