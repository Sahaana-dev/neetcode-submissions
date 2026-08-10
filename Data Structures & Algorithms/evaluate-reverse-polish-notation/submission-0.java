class Solution {
    public int evalRPN(String[] strs) {
        /*
        1. if operator, then pop two operands, perform add/sub/mul/div according to the operator
        2. if operand, then push it into the stack
        */
        Stack<Integer> st = new Stack<>();
        for(String str : strs)
        {
            if(!st.isEmpty() && (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")))
            {
                int n1 = st.pop();
                int n2 = st.pop();
                if(str.equals("+"))
                {
                    st.push(n2+n1);
                }
                else if(str.equals("-"))
                {
                    st.push(n2-n1);
                }
                else if(str.equals("*"))
                {
                    st.push(n1*n2);
                }
                else if(str.equals("/"))
                {
                    st.push(n2/n1);
                }
            }
            else
            {
                int n = Integer.parseInt(str);
                st.push(n);
            }
        }
        return st.peek();
    }
}
