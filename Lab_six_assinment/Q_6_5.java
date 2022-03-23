package lab_six.Lab_six_assinment;
import java.util.Stack;
public class Q_6_5 {
    public static Stack <Integer>popAllRecursive(Stack stack) {

        if(stack.isEmpty()) {

            return null;
        }
        stack.pop();  // remove one stack element

        popAllRecursive(stack); // recursive invocation of your method
        return stack;
    }
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<Integer>();
        for (int i = 0; i <5 ; i++) {
            stack.push(i);
        }
        System.out.println("Stack Before popped:"+stack);
        System.out.println("Stack Elements are popped:"+popAllRecursive(stack));

    }
}
