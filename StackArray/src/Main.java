import java.util.Stack;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int[] arr ={9,1,2,3,5,7} ;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println(stack.size());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("---------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\t"+arr[i]);
        }
        String string = "ABC DEF GHI";
        String[] arrString = string.split(" ");
        Stack<String> stackString = new Stack<>();
        for (int i = 0; i < arrString.length; i++) {
            stackString.push(arrString[i]);
        }
        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = stackString.pop();
        }
        string = String.join("-",arrString);
        System.out.println(string);
    }
}