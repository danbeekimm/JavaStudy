package study;

import java.util.ArrayList;

public class Og {

	public int[] solution(int []arr) {
        ArrayList<Integer>arrayList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
			if (i==0) {
				arrayList.add(arr[i]);
			}else {
				if (arr[i] != arrayList.get(arrayList.size()-1)) {
					arrayList.add(arr[i]);
				}
			}
		}
        int[] answer = new int[arrayList.size()];        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for (int i = 0; i < answer.length; i++) {
			answer[i] = arrayList.get(i);
		}
       
        return answer;
    }
}
