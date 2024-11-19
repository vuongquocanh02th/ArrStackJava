public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println("Size of stack after push: " + stack.size());
        System.out.println("Pop element: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Size of stack after pop: " + stack.size());
    }
}
