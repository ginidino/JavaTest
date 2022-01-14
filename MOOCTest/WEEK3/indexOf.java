package test;

public class indexOf {
	public static void main(String[] args) {
		String str = "hello Java";
		// indexOf(String str)
		System.out.println(str.indexOf("he"));    // print 0
		System.out.println(str.indexOf("Java"));  // print 6
		System.out.println(str.indexOf("java"));  // print -1
		System.out.println(str.indexOf(" "));     // print 5
		System.out.println(str.indexOf("av"));    // print 7
		System.out.println();
		// indexOf(int ch)
		System.out.println(str.indexOf('l'));     // print 2
		System.out.println();
		// indexOf(int ch, int fromIndex)
		System.out.println(str.indexOf('l', 3));  // print 3
		System.out.println(str.indexOf('l', 4));  // print -1
		//출처: https://hianna.tistory.com/539 [어제 오늘 내일]
	}
}
