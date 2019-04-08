public class Solution {
	public int braces(String a) {
	    Stack<Character> stack = new Stack<Character>();
	    for(int i = 0; i < a.length(); i++) {
	        if(a.charAt(i) == '(' || a.charAt(i) == '+' || a.charAt(i) == '-' || a.charAt(i) == '*' || a.charAt(i) == '/') {
	            stack.push(a.charAt(i));
	        } else if (a.charAt(i) == ')') 
	        {
	            int flag = 0;
	             while(stack.peek() != '(')
	             {
	                flag = 1;
	                stack.pop();	           
	             }
	            if(flag==0) 
	            	return 1;
	            stack.pop();
	        }
	    }
	    return 0;
	}
}
