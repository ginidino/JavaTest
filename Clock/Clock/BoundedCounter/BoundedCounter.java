package BoundedCounter;

public class BoundedCounter {
	private int value;
	private int upperLimit;
	
	public BoundedCounter(int upperLimit) {
		this.upperLimit = upperLimit;
		this.value = 0;
	}

	public void next() {
		if (this.value == this.upperLimit) {
			this.value = 0;
		} else {
			this.value++;
		}
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		if (value < 0 || value > this.upperLimit) {
			return;
		}
		this.value = value;
	}
	
	public String toString() {
		String initial = "0";
		if (this.value > 9) {
			initial = "";
		}
        return initial + this.value;
    }
}
