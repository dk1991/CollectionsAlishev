import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // 5 <- 3 <- 1 LastInFirstOut

        stack.push(10); // поместить в стек
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(5);
        stack.push(4);

        System.out.println(stack.peek()); // посмотреть первый элемент на извлечение
        System.out.println(stack.pop()); // извлечь из стека
        System.out.println(stack);

        while (!stack.empty()) { // emprty возвращает true, если стек пуст
            System.out.println(stack.pop());
        }
    }
}
