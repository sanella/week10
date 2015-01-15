package day1;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;

public class Vjezba {

	private int[] array;
	private int count;
	final int INIT_SIZE = 5;
	private int length;

	public Vjezba() {
		this.array = new int[INIT_SIZE];
		this.count = 0;
	}

	public Vjezba(int size) {
		this.array = new int[size];
		this.count = 0;
	}

	public int getSize() {
		return count;
	}

	public void add(int newElement) {
		array[count] = newElement;
		count++;
		if (count == array.length) {
			resize();
		}
	}

	private void resize() {

		int newSize = this.array.length * 2;
		int[] temp = new int[newSize];

		for (int i = 0; i < count; i++) {
			temp[i] = this.array[i];

		}
		this.array = temp;

	}

	public int getAt(int index) {
		if (index < 0 || index >= count) {
			throw new IndexOutOfBoundsException("Unio si pogresan index");
		}

		return array[index];

	}

	public void removeAt(int index) {
		for (int i = index; i < count - 1; i++) {
			array[i] = array[i + 1];
			count--;

		}

	}

	public int[] toArray() {
		int[] noviArray = new int[count];

		for (int i = 0; i < noviArray.length; i++) {
			noviArray[i] = array[i];
		}
		return noviArray;
	}

	public boolean contains(int value){
		for (int i = 0; i < array.length; i++) {
			if(array[i] == value)
				return true;
		}
		return false;
	}
	
	
	
//-----------------------------------------------------------------------
	public static void main(String[] args) {
		Vjezbe test = new Vjezbe(2);
		int newElement1 = 1;
		test.add(newElement1);
		int newElement2 = 2;
		test.add(newElement2);
		int newElement3 = 3;
		test.add(newElement3);
		int newElement4 = 4;
		test.add(newElement4);

		System.out.println(test.getAt(1));
		//test.removeAt(1);
		System.out.println(test.getAt(1));
		System.out.println("contains: " + test.contains(7));
		System.out.println("velicina niza je'" + test.getSize());
		int[] noviArray = test.toArray();
		for (int i = 0; i < noviArray.length; i++) {
			System.out.print(noviArray[i] + ", ");
		}

	}

}