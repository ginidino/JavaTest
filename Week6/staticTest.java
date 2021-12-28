package test;

public class staticTest {
	public static void main(String[] args) {
		Counters c1 = new Counters();
        Counters c2 = new Counters();
        
        System.out.println(Counters.getCount());
	}
}
class Counters {
	static int count = 0;
	Counters() {
		this.count++;
		System.out.println(this.count);
	}
	public static int getCount() {
		return count;
	}
}
