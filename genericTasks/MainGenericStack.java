package genericTasks;

public class MainGenericStack {
    public static void main(String[] args) {
        GenericStack<Integer> nums = new GenericStack<>();

        //isEmpty
        if (nums.isEmpty()) {
            //push
            for (int i = 0; i < 5; i++) {
                nums.push(i + 5);
            }
        }
        //peek
        System.out.println(nums.peek());

        for (int i = 0; i < 5; i++) {
            System.out.println(nums.pop());
        }
    }
}
