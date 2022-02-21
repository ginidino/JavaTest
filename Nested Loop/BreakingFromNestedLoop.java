package Nested_Loop;

// How to break from nested loop in Java. You can use labeled statement with break statement to break from nested loop.
public class BreakingFromNestedLoop {
	public static void main(String[] args) {
		// this is our outer loop
		outer:
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				// condition to break from nested loop
				if (i * j > 5) {
					System.out.println("Breaking from nested loop");
					break outer;
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("exited");
		// better way is to encapsulate nested loop in a method 
		// and use return to break from outer loop 
		breakFromNestedLoop();
	}
	
	// You can use return statement to return at any point from a method. 
	// This will help you to break from nested loop as well
	public static void breakFromNestedLoop() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 3; j++) {
				int product = i*j;
				if (product > 4) {
					System.out.println("breaking from nested loop using return");
                    return;
				}
			}
		}
		System.out.println("Done");
	}
}
