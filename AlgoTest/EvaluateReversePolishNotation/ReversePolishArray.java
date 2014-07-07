/**
 * 
 */
package EvaluateReversePolishNotation;

import java.util.Stack;

/**
 * @author lams Evaluate the value of an arithmetic express in Reverse Polish
 *         Notation
 * 
 *         Valid Operation + ,*,-,/ Each operand mat be an integer or another
 *         expression
 * 
 */
public class ReversePolishArray {

	/**
	 * 
	 */
	private String[] tokens = null;
	private Stack<String> stack;

	public ReversePolishArray(String[] tokens) {
		// TODO Auto-generated constructor stub
		this.tokens = tokens;
		stack = new Stack<String>();

	}

	public String Solution(){
		String _operators ="+*-/";
		String result = "";
		if (tokens ==null && tokens.length <=0 ){
			return "";
		}
		
		for (String str:tokens){
			
		
			if (!_operators.contains(str)){
				stack.push(str);
			}else{
				int num1 = Integer.parseInt(stack.pop());
				int num2 = Integer.parseInt(stack.pop());
				
				switch(str)
				{
					
					
					case "+":
						stack.push(String.valueOf(num1+num2));
						break;				
					case "-":
						stack.push(String.valueOf(num1-num2));
						break;
					case "*":
						stack.push(String.valueOf(num1*num2));
						break;
					case "/":
						stack.push(String.valueOf(num1/num2));
						break;
					default:
						
						break;
					
				}
			}
		}
		result = stack.pop();
		
		return result;
		
	}
}
