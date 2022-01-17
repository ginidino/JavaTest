package Sort;

import java.util.*;

public class SortTest1 {
	public static void main(String[] args) {
		String[] example = {"Nice", "to", "meet", "you"};
		List<String> list = Arrays.asList(example);
		Collections.sort(list); // 리스트 정렬
		System.out.println(list);
	}
}
// print [Nice, meet, to, you]
// to와 meet의 위치가 바껴서 출력 -> 알파벳 순으로 출력하기 때
