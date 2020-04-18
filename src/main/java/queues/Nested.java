package queues;

import java.util.Stack;

/**
 * Created by Pritesh on 08/11/2019.
 */
public class Nested {

    public static int solution(String s){
        Stack stack = new Stack<Character>();
        char[] cs =  s.toCharArray();

        for(char c:cs){
            if(c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return 0;
                }
            char corresponding = (char) stack.pop();

            if(c == ')' && corresponding != '(') {
            return 0;
            }

            if(c == ']' && corresponding != '[') {
                return 0;
            }

            if(c == '}' && corresponding != '{') {
                return 0;
            }

            }




        }
    return 1;

    }



    public static void main(String[] args) {



    }
}
