
import java.util.Stack;
import javafx.util.Pair; // Se utiliza para representar las ternas de números

        public class StackManipulation {
            public static Pair<Stack<Integer>, Stack<Integer>> manipulateStacks(Pair<Integer, Integer>[] operations) {
                Stack<Integer> stack1 = new Stack<>();
                Stack<Integer> stack2 = new Stack<>();

                for (Pair<Integer, Integer> op : operations) {
                    int i = op.getKey();
                    int j = op.getValue();

                    if (i == 0) {
                        break; // Terminar el proceso
                    }

                    if (i > 0) {
                        stack1.push(j); // Insertar elemento j en la Pila i
                    } else {
                        stack2.push(j); // Insertar elemento j en la Pila -i
                    }
                }

                return new Pair<>(stack1, stack2);
            }

            public static void main(String[] args) {
                Pair<Integer, Integer>[] input = new Pair[]{
                        new Pair<>(1, 5),
                        new Pair<>(-2, 8),
                        new Pair<>(1, 3),
                        new Pair<>(-1, 0),
                        new Pair<>(0, 0)
                };

                Pair<Stack<Integer>, Stack<Integer>> result = manipulateStacks(input);
                System.out.println("Stack 1: " + result.getKey());
                System.out.println("Stack 2: " + result.getValue());
            }
        }




