/**
 * The SRPN class implements all operations
 * for the reverse polish notation
 *
 * @author 
 * @version 1.0
 * @since 2019-09-30
 */
package bathassg1;

import java.util.*;
import java.util.regex.*;

public class SRPN {

    //stack to hold numbers for operations    
    private static Stack<String> stack = new Stack<String>();

    //numbers for operations
    long number_1;
    long number_2;

    /**
     * stackUnderflow method
     *
     * @param stack
     * @return boolean value
     */
    public static boolean stackUnderflow(Stack stack) {

        //if stack = 0 or if stack = 1
        if (stack.size() <= 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * stackUnderflow method
     *
     * @param stack
     * @return boolean value
     */
    public static boolean stackOverflow(Stack stack) {

        //max size for stack
        if (stack.size() >= 100) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * display stack method
     *
     */
    private void d() {

        if (stack.size() < 1) {
            System.out.println(-2147483648);
        } else {
            for (String str : stack) {
                //filter out zero
                if (!str.equals("0")) {
                    System.out.println(str);
                }

            }
        }

    }

    /**
     * generate random number method
     *
     * @param stackOverflow
     *
     */
    private void r(boolean stackOverflow) {

        if (!stackOverflow) {

            Random random = new Random();
            //generate random number and push it to stack    
            stack.push(String.valueOf(random.listRandomNum()));

        } else {
            System.err.println("Stack Overflow");
        }

    }

    /**
     * generate random number method for multiple random number input such as
     * 'rrr'
     *
     * @param input
     * @param stackOverflow
     *
     */
//    private void r(String input, boolean stackOverflow) {
//
//        if (!stackOverflow) {
//            if (input.length() > 1) {
//                for (int i = 0; i < input.length(); i++) {
//
//                    if (input.charAt(i) == 'r') {
//                        Random random = new Random();
//
//                        stack.push(String.valueOf(random.listRandomNum()));
//
//                    } else if (input.charAt(i) == 'd') {
//                        this.d();
//                    }
//                }
//            }
//        } else {
//            System.err.println("Stack Overflow");
//        }
//
//    }

    /**
     * add operation method
     *
     * @param input
     * @param stackUnderflow
     *
     */
    private void add(String input, boolean stackUnderflow) {

        try {
            if (!stackUnderflow) {
                input = stack.pop();
                number_1 = Long.parseLong(input);
                input = stack.pop();
                number_2 = Long.parseLong(input);

                //check if inout is max/min integer
                if (number_2 + number_1 > Integer.MAX_VALUE) {
                    stack.push((String.valueOf(Integer.MAX_VALUE)));
                } else if (number_2 + number_1 < Integer.MIN_VALUE) {
                    stack.push(String.valueOf(Integer.MIN_VALUE));
                } else {

                    stack.push(String.valueOf(number_2 + number_1));
                }
            } else {
                System.err.println("Stack underflow");

            }
        } //catch
        catch (NumberFormatException ex) {
        }

    }

    /**
     * minus operation method
     *
     * @param input
     * @param stackUnderflow
     *
     */
    private void minus(String input, boolean stackUnderflow) {
        try {
            if (!stackUnderflow) {
                input = stack.pop();
                number_1 = Long.parseLong(input);
                input = stack.pop();
                number_2 = Long.parseLong(input);
                //check if inout is max/min integer
                if (number_2 - number_1 > Integer.MAX_VALUE) {
                    stack.push((String.valueOf(Integer.MAX_VALUE)));
                } else if (number_2 - number_1 < Integer.MIN_VALUE) {
                    stack.push(String.valueOf(Integer.MIN_VALUE));
                } else {
                    stack.push(String.valueOf(number_2 - number_1));
                }
            } else {
                System.err.println("Stack underflow");

            }
        } //catch
        catch (NumberFormatException ex) {
        }
    }

    /**
     * multiply operation method
     *
     * @param input
     * @param stackUnderflow
     *
     */
    private void mult(String input, boolean stackUnderflow) {
        try {
            if (!stackUnderflow) {
                input = stack.pop();
                number_1 = Long.parseLong(input);
                input = stack.pop();
                number_2 = Long.parseLong(input);
                //check if inout is max/min integer
                if (number_2 * number_1 > Integer.MAX_VALUE) {
                    stack.push((String.valueOf(Integer.MAX_VALUE)));
                } else if (number_2 * number_1 < Integer.MIN_VALUE) {

                    stack.push(String.valueOf(Integer.MIN_VALUE));
                } else {

                    stack.push(String.valueOf(number_2 * number_1));
                }
            } else {
                System.err.println("Stack underflow");

            }
        } catch (NumberFormatException ex) {
        }
    }

    /**
     * divide operation method
     *
     * @param input
     * @param stackUnderflow
     *
     */
    private void divide(String input, boolean stackUnderflow) {

        try {
            if (!stackUnderflow) {

                input = stack.pop();
                number_1 = Long.parseLong(input);
                input = stack.pop();
                number_2 = Long.parseLong(input);
                //check if inout is max/min integer

                if (number_1 > 0) {
                    if (number_2 / number_1 > Integer.MAX_VALUE) {
                        stack.push((String.valueOf(Integer.MAX_VALUE)));
                    } else if (number_2 / number_1 < Integer.MIN_VALUE) {
                        stack.push(String.valueOf(Integer.MIN_VALUE));
                    } else {

                        stack.push(String.valueOf(number_2 / number_1));

                    }
                } else {
                    System.out.print("Divide by 0 not possible!");
                    //System.exit(0);
                }
            } else {
                System.err.println("Stack underflow");
                //System.exit(0);
            }
        } catch (NumberFormatException ex) {
        }
    }

    /**
     * modulus operation method
     *
     * @param input
     * @param stackUnderflow
     *
     */
    private void mod(String input, boolean stackUnderflow) {
        try {
            if (!stackUnderflow) {
                input = stack.pop();
                number_1 = Long.parseLong(input);
                input = stack.pop();
                number_2 = Long.parseLong(input);
                //check if inout is max/min integer
                if (number_2 % number_1 > Integer.MAX_VALUE) {
                    stack.push((String.valueOf(Integer.MAX_VALUE)));
                } else if (number_2 % number_1 < Integer.MIN_VALUE) {
                    stack.push(String.valueOf(Integer.MIN_VALUE));
                } else {
                    stack.push(String.valueOf(number_2 % number_1));
                }
            } else {
                System.err.println("Stack underflow");
                //System.exit(0);
            }
        } catch (NumberFormatException ex) {
        }
    }

    /**
     * check for comment method
     *
     * @param command
     *
     * @exception EmptyStackException
     * @see EmptyStackException
     */
    private void comment(String command) {

        int start = command.indexOf("#");
        int end = command.lastIndexOf("#");
        //check if input has numeric value    
//        Pattern p = Pattern.compile("\\d+");
//        Matcher m = p.matcher(command);
//        while (m.find()) {
//            System.out.println(m.group());
//
//        }

        try {

            for (int i = start; i <= end; i++) {
                if (command.charAt(i) == ' ') {
                    continue;
                }
                System.out.println("Unknow operator :" + command.charAt(i));
            }
        } catch (EmptyStackException e) {
        } catch (NumberFormatException e) {
        }

    }

    /**
     * equal operator method
     *
     * @param input
     * @param stackOverflow
     *
     */
    private void equal(String input, boolean stackOverflow) {

        String result = stack.pop();

        if (!stackOverflow) {
            System.out.println(result);

            //pushes back the result so the user can see the all the results when typing d
            stack.push(result);
        } else {
            System.err.println("Stack overflow.");
        }

    }

    /**
     * normal arithmatic operation method
     *
     * @param input
     * @param stackOverflow
     * @returns string
     */
    private boolean isNumeric(String strNum) {
        try {
            Integer d = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }

        return true;
    }

    private String convertInfix(String command, boolean stackOverflow) {

        Stack<String> operators = new Stack();
        Stack<String> operands = new Stack();
        for (int i = 0; i < command.length(); i++) {

            if (!stackOverflow) {
                if (command.charAt(i) == '+') {

                    operators.push("+");
                } else if (command.charAt(i) == '-') {

                    operators.push("-");
                } else if (command.charAt(i) == '/') {

                    operators.push("/");
                } else if (command.charAt(i) == '*') {

                    operators.push("*");
                } else if (command.charAt(i) == '%') {

                    operators.push("%");
                } else if (command.charAt(i) == ' ' || command.charAt(i) == '#') {
                    continue;
                } else if (command.charAt(i) == 'r') {

                    Random random = new Random();

                    operands.push("r");

                } else if (command.charAt(i) == 'd') {

                     operands.push("d");

                }

               

            } else {
                System.out.println("Stack Overflow");
            }
        }
         //get all numbers
                Pattern p = Pattern.compile("\\d+");
                Matcher m = p.matcher(command);
                while (m.find()) {
                    String num = m.group();
                    //System.out.println(m.group());
                    operands.push(num);
                }
        operands.addAll(operators);
        operands.add("=");
       

        return operands.toString().replace("[", "").replace("]", "").replace(",", " ");
    }

    /**
     * process user command method
     *
     * @param s
     *
     */
    public void processCommand(String s) {

        boolean stackOverflow = stackOverflow(stack);

        //check format of input i.e infix or mix of infix postfix or single input
        if (!isNumeric(s) && s.length() > 1) {
            if (!s.contains("#")) {
                
                s = convertInfix(s, stackOverflow);
                 
            }
        }

        //if reverse polish notation input filter input
        for (String input : s.split("\\n+|\\s+")) {

            //check command type operand or operator
            if (!input.equals("+") && !input.equals("-") && !input.equals("*") && !input.equals("/") && !input.equals("%") && !input.equals("r") && !input.contains("r") && !input.equals("d") && !input.equals("#") && !input.contains("#") && !input.equals("=") && !input.startsWith("^")) {
                //if operand
                //check if stack overflow
                stackOverflow = stackOverflow(stack);

                if (!stackOverflow) {

                    stack.push(input);

                } else {

                    System.out.println("Stack overflow");

                }

            } //perform normal operation 
            //if operator +
            else if (input.equals("+")) {
                //perform operation add by popping from stack then add //result to stack
                boolean stackUnderflow = stackUnderflow(stack);
                this.add(input, stackUnderflow);

            } //if operator -
            else if (input.equals("-")) {
                //perform operation add by popping from stack then add //result to stack
                boolean stackUnderflow = stackUnderflow(stack);
                this.minus(input, stackUnderflow);
            } //if operator *
            else if (input.equals("*")) {
                //perform operation add by popping from stack then add //result to stack
                boolean stackUnderflow = stackUnderflow(stack);
                this.mult(input, stackUnderflow);
            } //if operator /
            else if (input.equals("/")) {
                //perform operation add by popping from stack then add //result to stack
                boolean stackUnderflow = stackUnderflow(stack);
                this.divide(input, stackUnderflow);
            } //if operator %
            else if (input.equals("%")) {
                //perform operation add by popping from stack then add //result to stack
                boolean stackUnderflow = stackUnderflow(stack);
                this.mod(input, stackUnderflow);
            } //If an "=" is received, print result always
            else if (input.equals("=")) {

                stackOverflow = stackOverflow(stack);

                this.equal(input, stackOverflow);
            } //if operator d
            else if (input.equals("d")) {
                this.d();
            } //if operator r
            else if (input.equals("r")) {
                stackOverflow = stackOverflow(stack);
                this.r(stackOverflow);

            } else if (s.contains("#")) {
                comment(s);
                break; //show once only
            }
//            else {
//                //if sequential random number input
//
//                this.r(s, stackOverflow);
//            }

        }
    }

}
