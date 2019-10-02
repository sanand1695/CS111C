import java.util.ArrayList;

/***********************************************************************************************************
 * 
 * @author Sruthi Anand 
 * Fall 2019 - CS 111C 
 * Project A - Generics 
 * Due Date - 9/16/2019
 * @param <T>
 */

public class Trio<T> {

	// Declaring instance data variables

	private T item1;
	private T item2;
	private T item3;

	// Defining two constructors:

	// Constructor 1: This takes three items as parameters

	ArrayList<T> trioList = new ArrayList<T>();

	public Trio(T item1, T item2, T item3) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;

	}

	// Constructor 2: This takes a single item as parameter and all three is filled
	// in Trio with that item

	public Trio(T items) {
		this.item1 = items;
		this.item2 = items;
		this.item3 = items;

	}

	// Getters and Setters for each item in the Trio

	public T getItem1() {

		return this.item1;
	}

	public T getItem2() {
		return this.item2;
	}

	public T getItem3() {
		return this.item3;
	}

	public void setItem1(T item1) {
		this.item1 = item1;

	}

	public void setItem2(T item2) {
		this.item2 = item2;
	}

	public void setItem3(T item3) {
		this.item3 = item3;
	}

	// toString method that returns text representation of the Trio

	@Override
	public String toString() {
		return "The Trio is " + getItem1() + ", " + getItem2() + ", " + getItem3();
	}

	// Reset method : takes one item from the Trio and modifies Trio to have three
	// copies of that item
	public int resetTrio(T resetValue) {

		trioList.clear();
		this.setItem1(resetValue);
		this.setItem2(resetValue);
		this.setItem3(resetValue);

		return 0;
	}

	// Count method: that returns a count of how many times an item is in the Trio

	public int count(T item) {

		int count = 0; // Initialize count to 0

		if (item1.equals(item)) {

			count++;
		}
		if (item2.equals(item)) {

			count++;
		}
		if (item3.equals(item)) {
			count++;
		}

		return count;

	}

	// hasDuplicates method : that returns true if at least two items within the
	// Trio are the same as each other

	public boolean hasDuplicates() {

		if ((item1).equals(item2) || (item1).equals(item3) || (item2).equals(item3)) {
			return true;
		} else {
			return false;
		}

	}

	// equals method: Overrides equals method of the Object class.
	@Override
	public boolean equals(Object other) {
		if (other instanceof Trio<?>) {
			Trio<?> otherTrio = (Trio<?>) other;

			if (item1.equals(otherTrio.getItem1())) {
				if (item2.equals(otherTrio.getItem2())) {
					if (item3.equals(otherTrio.getItem3())) {
						return true;
					}
				} else if (item2.equals(otherTrio.getItem3())) {
					if (item3.equals(otherTrio.getItem2())) {
						return true;
					}
				}
			} else if (item1.equals(otherTrio.getItem2())) {
				if (item2.equals(otherTrio.getItem3())) {
					if (item3.equals(otherTrio.getItem1())) {
						return true;
					}
				} else if (item2.equals(otherTrio.getItem1())) {
					if (item3.equals(otherTrio.getItem3())) {
						return true;
					}
				}
			} else if (item1.equals(otherTrio.getItem3())) {
				if (item2.equals(otherTrio.getItem1())) {
					if (item3.equals(otherTrio.getItem2())) {
						return true;
					}
				} else if (item2.equals(otherTrio.getItem2())) {
					if (item3.equals(otherTrio.getItem1())) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
