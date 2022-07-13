package allsolutions;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidParenthesisSolution {

	public static void main(String[] args) {
		String s = "()";
	      boolean check = isValid(s);
	          if(check){
	                System.out.println("The given string contains valid parentheses.");
	            }
	            else{
	                System.out.println("The given string contains invalid parentheses.");
	            }
	  }

	private static boolean isValid(String s) {
		if(s.length()%2 !=0)
		return false;
		else {
			Stack parStack = new Stack<Character>();
			parStack.push(s.charAt(0));
			char matchElement = getOppositeChar(s.charAt(0));
			
			for(int i=1;i<s.length();i++) {
				if(s.charAt(i)!=matchElement) {
					parStack.push(s.charAt(i));
					matchElement = getOppositeChar(s.charAt(i));
				}
				else {
					parStack.pop();
					if(!parStack.empty())
					matchElement = getOppositeChar( (char) parStack.peek());
					else
						matchElement = 0;	
				}
			}
			if(parStack.empty()) return true;
			return false;
	}
	}
	private static char getOppositeChar(char ch) {
		char oppChar = 0;
		if(ch=='{') oppChar = '}';
		if(ch=='(') oppChar = ')';
		if(ch=='[') oppChar = ']';
		return oppChar;
	}
}
