import javax.swing.*;
import java.util.Scanner;
import java.util.Stack;

class Scratch_1 {

    public static boolean isOperator(char x) {
        return switch (x) {
            case '+', '-', '*', '/' -> true;
            default -> false;
        };
    }

    public static String isConvert(String s) {
        Stack<String> stack = new Stack<>();
        int l = s.length();
        for (int i = l-1; i >=0 ; i--) {
            char c = s.charAt(i);
            if(isOperator(c)) {
                String op1 = stack.pop();
                String op2 = stack.pop();

                String temp = "(" + op1 + c + op2 + ")";
                stack.push(temp);
            }
            else {
                stack.push(c+"");
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> operator = new Stack<>();
        String prefix = sc.next();
        System.out.println(isConvert(prefix));
    }
}