//Java program solution to Valid Partenthesis problem
/* An input string is valid if:
  ->Open brackets must be closed by the same type of brackets.
  ->Open brackets must be closed in the correct order.
  ->Every close bracket has a corresponding open bracket of the same type.

  Eg. s = "()" --> return Output: true
      s = "(]" --> return Output: false
*/

import java.util.Scanner;

public class Main
{
   public static char complement(char ch){
        if(ch==')')
        return '(';

        else if(ch==']')
        return '[';

        else if(ch=='}')
        return'{';

        return ' ';
    }
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' ||ch=='['||ch=='{')
            stack.push(ch);

            else if(stack.isEmpty() || stack.pop()!=complement(ch)){
                return false;
            }
        }
        return stack.isEmpty();
    }

  
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    String str= sc.nextLine();
     
      if(isValid(str)){
        System.out.println("Parenthesis are valid");
      }

      else{
        System.out.println("Parenthesis are not valid");
      }
	    
	}
}
