package com.company.stack;

import java.util.Stack;

public class BalancedParentheses {


    private Stack<String> stack = new Stack<>();

    public boolean CheckBalancedParentheses(String expression){
        String[] expArray = expression.split("");

        for (String c:expArray) {
            if(c.equals("(") || c.equals("[") || c.equals("{"))
                stack.push(c);
            else if(c.equals(")") || c.equals("]") || c.equals("}")){
                if(!checkClosing(stack.pop(), c))
                    return false;
            }
        }
        return stack.empty();
    }

    private boolean checkClosing(String bracket1, String bracket2) {
        if (bracket1.equals("(") && bracket2.equals(")"))
            return true;
        else if (bracket1.equals("[") && bracket2.equals("]"))
            return true;
        else if (bracket1.equals("{") && bracket2.equals("}"))
            return true;

        return false;
    }




}
