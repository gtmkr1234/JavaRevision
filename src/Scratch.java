import java.util.Scanner;
import java.util.Stack;

class Scratch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if(i != n/2)
                stack.push(sc.nextInt());
            else
                sc.nextInt();
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}