package study;

import java.util.Scanner;
import java.util.Stack;

import javax.sql.rowset.serial.SerialArray;
import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;

public class Hashset {

	public int solution(String s)
    {
		Stack<Character> stack = new Stack<Character>();
		for (char a:s.toCharArray()) {
			if (!stack.isEmpty() && stack.peek()==a)stack.pop(); 
				
			else 
				stack.push(a);
			
		}
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("Hello Java");

        return stack.isEmpty()?1:0;
    }
	

}
